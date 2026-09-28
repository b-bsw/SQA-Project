package org.apache.commons.compress.archivers.tar;

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
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        long long3 = tarArchiveOutputStream2.getBytesWritten();
        int int4 = tarArchiveOutputStream2.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 2, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, 2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream7.canWriteEntryData(archiveEntry10);
        int int12 = tarArchiveOutputStream7.getCount();
        int int13 = tarArchiveOutputStream7.getRecordSize();
        tarArchiveOutputStream7.setLongFileMode((int) (byte) -1);
        tarArchiveOutputStream7.setLongFileMode((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, (int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        tarArchiveOutputStream9.setLongFileMode((int) (byte) -1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream9.buffer;
        tarArchiveOutputStream9.setLongFileMode((int) (byte) 0);
        int int15 = tarArchiveOutputStream9.getRecordSize();
        int int16 = tarArchiveOutputStream9.getRecordSize();
        int int17 = tarArchiveOutputStream9.getCount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        tarArchiveOutputStream10.setBigNumberMode((int) '4');
        int int13 = tarArchiveOutputStream10.getCount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        int int6 = tarArchiveOutputStream1.getRecordSize();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7);
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry11);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream16.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = tarArchiveOutputStream16.buffer;
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream20);
        tarArchiveOutputStream21.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        boolean boolean25 = tarArchiveOutputStream21.canWriteEntryData(archiveEntry24);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = null;
        boolean boolean27 = tarArchiveOutputStream21.canWriteEntryData(archiveEntry26);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21, 100);
        java.io.OutputStream outputStream30 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream30);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer32 = tarArchiveOutputStream31.buffer;
        int int33 = tarArchiveOutputStream31.getRecordSize();
        byte[] byteArray34 = new byte[] {};
        tarArchiveOutputStream31.write(byteArray34);
        tarArchiveOutputStream29.write(byteArray34, 0, (int) (short) 0);
        tarArchiveOutputStream16.write(byteArray34);
        tarArchiveOutputStream1.write(byteArray34);
        int int41 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        long long43 = tarArchiveOutputStream1.getBytesWritten();
        int int44 = tarArchiveOutputStream1.getRecordSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tarBuffer19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tarBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 512 + "'", int33 == 512);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 512 + "'", int44 == 512);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, 1);
        int int13 = tarArchiveOutputStream10.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = tarArchiveOutputStream10.buffer;
        tarArchiveOutputStream10.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17, 10);
        tarArchiveOutputStream19.setBigNumberMode((int) 'a');
        int int22 = tarArchiveOutputStream19.getCount();
        byte[] byteArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream19.write(byteArray23, 52, 2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(tarBuffer14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        tarArchiveOutputStream9.setBigNumberMode(2);
        long long14 = tarArchiveOutputStream9.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry15);
        tarArchiveOutputStream9.setLongFileMode(0);
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19);
        tarArchiveOutputStream20.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = null;
        boolean boolean24 = tarArchiveOutputStream20.canWriteEntryData(archiveEntry23);
        int int25 = tarArchiveOutputStream20.getRecordSize();
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream26);
        tarArchiveOutputStream27.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = tarArchiveOutputStream27.canWriteEntryData(archiveEntry30);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = tarArchiveOutputStream27.canWriteEntryData(archiveEntry32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream27, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = null;
        boolean boolean37 = tarArchiveOutputStream35.canWriteEntryData(archiveEntry36);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer38 = tarArchiveOutputStream35.buffer;
        java.io.OutputStream outputStream39 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream39);
        tarArchiveOutputStream40.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry43 = null;
        boolean boolean44 = tarArchiveOutputStream40.canWriteEntryData(archiveEntry43);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry45 = null;
        boolean boolean46 = tarArchiveOutputStream40.canWriteEntryData(archiveEntry45);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream40, 100);
        java.io.OutputStream outputStream49 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream49);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer51 = tarArchiveOutputStream50.buffer;
        int int52 = tarArchiveOutputStream50.getRecordSize();
        byte[] byteArray53 = new byte[] {};
        tarArchiveOutputStream50.write(byteArray53);
        tarArchiveOutputStream48.write(byteArray53, 0, (int) (short) 0);
        tarArchiveOutputStream35.write(byteArray53);
        tarArchiveOutputStream20.write(byteArray53);
        java.io.OutputStream outputStream60 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream60);
        tarArchiveOutputStream61.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry64 = null;
        boolean boolean65 = tarArchiveOutputStream61.canWriteEntryData(archiveEntry64);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry66 = null;
        boolean boolean67 = tarArchiveOutputStream61.canWriteEntryData(archiveEntry66);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream69 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream61, 100);
        java.io.OutputStream outputStream70 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream71 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream70);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer72 = tarArchiveOutputStream71.buffer;
        int int73 = tarArchiveOutputStream71.getRecordSize();
        byte[] byteArray74 = new byte[] {};
        tarArchiveOutputStream71.write(byteArray74);
        tarArchiveOutputStream61.write(byteArray74);
        tarArchiveOutputStream20.write(byteArray74, (int) (byte) -1, 0);
        tarArchiveOutputStream9.write(byteArray74);
        tarArchiveOutputStream9.setLongFileMode(10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream84 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 1);
        int int85 = tarArchiveOutputStream84.getCount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(tarBuffer38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(tarBuffer51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 512 + "'", int52 == 512);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(tarBuffer72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 512 + "'", int73 == 512);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 512, 32);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 1, (int) (byte) 10);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        int int11 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setLongFileMode((int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 0, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int2 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 1);
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream5);
        tarArchiveOutputStream6.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = tarArchiveOutputStream6.canWriteEntryData(archiveEntry9);
        int int11 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = tarArchiveOutputStream6.canWriteEntryData(archiveEntry14);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16);
        tarArchiveOutputStream17.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream17.canWriteEntryData(archiveEntry20);
        int int22 = tarArchiveOutputStream17.getRecordSize();
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23);
        tarArchiveOutputStream24.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = null;
        boolean boolean28 = tarArchiveOutputStream24.canWriteEntryData(archiveEntry27);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = null;
        boolean boolean30 = tarArchiveOutputStream24.canWriteEntryData(archiveEntry29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream24, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        boolean boolean34 = tarArchiveOutputStream32.canWriteEntryData(archiveEntry33);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer35 = tarArchiveOutputStream32.buffer;
        java.io.OutputStream outputStream36 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream36);
        tarArchiveOutputStream37.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry40 = null;
        boolean boolean41 = tarArchiveOutputStream37.canWriteEntryData(archiveEntry40);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry42 = null;
        boolean boolean43 = tarArchiveOutputStream37.canWriteEntryData(archiveEntry42);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream37, 100);
        java.io.OutputStream outputStream46 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream46);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer48 = tarArchiveOutputStream47.buffer;
        int int49 = tarArchiveOutputStream47.getRecordSize();
        byte[] byteArray50 = new byte[] {};
        tarArchiveOutputStream47.write(byteArray50);
        tarArchiveOutputStream45.write(byteArray50, 0, (int) (short) 0);
        tarArchiveOutputStream32.write(byteArray50);
        tarArchiveOutputStream17.write(byteArray50);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer57 = tarArchiveOutputStream17.buffer;
        java.io.OutputStream outputStream58 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream58);
        tarArchiveOutputStream59.setAddPaxHeadersForNonAsciiNames(false);
        int int62 = tarArchiveOutputStream59.getRecordSize();
        java.io.OutputStream outputStream63 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream64 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream63);
        tarArchiveOutputStream64.setAddPaxHeadersForNonAsciiNames(false);
        java.io.OutputStream outputStream67 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream68 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream67);
        tarArchiveOutputStream68.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry71 = null;
        boolean boolean72 = tarArchiveOutputStream68.canWriteEntryData(archiveEntry71);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry73 = null;
        boolean boolean74 = tarArchiveOutputStream68.canWriteEntryData(archiveEntry73);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream76 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream68, 100);
        java.io.OutputStream outputStream77 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream78 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream77);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer79 = tarArchiveOutputStream78.buffer;
        int int80 = tarArchiveOutputStream78.getRecordSize();
        byte[] byteArray81 = new byte[] {};
        tarArchiveOutputStream78.write(byteArray81);
        tarArchiveOutputStream68.write(byteArray81);
        tarArchiveOutputStream64.write(byteArray81);
        tarArchiveOutputStream59.write(byteArray81);
        tarArchiveOutputStream17.write(byteArray81);
        tarArchiveOutputStream6.write(byteArray81, (int) ' ', (int) (byte) 0);
        tarArchiveOutputStream4.write(byteArray81);
        long long91 = tarArchiveOutputStream4.getBytesWritten();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 512 + "'", int2 == 512);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tarBuffer35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(tarBuffer48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 512 + "'", int49 == 512);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 512 + "'", int62 == 512);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(tarBuffer79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 512 + "'", int80 == 512);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] {});
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 0L + "'", long91 == 0L);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        int int10 = tarArchiveOutputStream9.getCount();
        tarArchiveOutputStream9.setLongFileMode((int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 100, (int) (byte) 100);
        tarArchiveOutputStream15.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) '#', (int) (short) 1);
        long long21 = tarArchiveOutputStream20.getBytesWritten();
        tarArchiveOutputStream20.setLongFileMode((int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20, (int) ' ', 10);
        int int27 = tarArchiveOutputStream26.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = tarArchiveOutputStream26.canWriteEntryData(archiveEntry28);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream26, (int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        tarArchiveOutputStream9.setBigNumberMode(0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (byte) 100);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(true);
        int int17 = tarArchiveOutputStream9.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = tarArchiveOutputStream18.buffer;
        tarArchiveOutputStream18.setLongFileMode(512);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream18.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(tarBuffer19);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 0);
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream8);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = tarArchiveOutputStream17.canWriteEntryData(archiveEntry18);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer20 = tarArchiveOutputStream17.buffer;
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21);
        tarArchiveOutputStream22.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = null;
        boolean boolean26 = tarArchiveOutputStream22.canWriteEntryData(archiveEntry25);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = null;
        boolean boolean28 = tarArchiveOutputStream22.canWriteEntryData(archiveEntry27);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, 100);
        java.io.OutputStream outputStream31 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream31);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer33 = tarArchiveOutputStream32.buffer;
        int int34 = tarArchiveOutputStream32.getRecordSize();
        byte[] byteArray35 = new byte[] {};
        tarArchiveOutputStream32.write(byteArray35);
        tarArchiveOutputStream30.write(byteArray35, 0, (int) (short) 0);
        tarArchiveOutputStream17.write(byteArray35);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17);
        java.io.OutputStream outputStream42 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream42);
        tarArchiveOutputStream43.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry46 = null;
        boolean boolean47 = tarArchiveOutputStream43.canWriteEntryData(archiveEntry46);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry48 = null;
        boolean boolean49 = tarArchiveOutputStream43.canWriteEntryData(archiveEntry48);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream43, 100);
        java.io.OutputStream outputStream52 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream52);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer54 = tarArchiveOutputStream53.buffer;
        int int55 = tarArchiveOutputStream53.getRecordSize();
        byte[] byteArray56 = new byte[] {};
        tarArchiveOutputStream53.write(byteArray56);
        tarArchiveOutputStream43.write(byteArray56);
        tarArchiveOutputStream41.write(byteArray56);
        tarArchiveOutputStream1.write(byteArray56);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream62 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) '#');
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(tarBuffer20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tarBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(tarBuffer54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 512 + "'", int55 == 512);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 512, (int) 'a');
        int int9 = tarArchiveOutputStream8.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        int int4 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream7.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = tarArchiveOutputStream7.canWriteEntryData(archiveEntry9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream12);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14);
        tarArchiveOutputStream15.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry18);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 100);
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream25.buffer;
        int int27 = tarArchiveOutputStream25.getRecordSize();
        byte[] byteArray28 = new byte[] {};
        tarArchiveOutputStream25.write(byteArray28);
        tarArchiveOutputStream23.write(byteArray28, 0, (int) (short) 0);
        tarArchiveOutputStream13.write(byteArray28);
        tarArchiveOutputStream11.write(byteArray28);
        tarArchiveOutputStream5.write(byteArray28);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, (int) (byte) 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream38, 2);
        tarArchiveOutputStream40.setBigNumberMode((-1));
        tarArchiveOutputStream40.setBigNumberMode((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream40, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tarBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        long long7 = tarArchiveOutputStream1.getBytesWritten();
        int int8 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 1, 100);
        int int12 = tarArchiveOutputStream11.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream11.canWriteEntryData(archiveEntry15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) ' ', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream14.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        int int3 = tarArchiveOutputStream2.getCount();
        long long4 = tarArchiveOutputStream2.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        long long11 = tarArchiveOutputStream10.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream10.write(1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        long long9 = tarArchiveOutputStream1.getBytesWritten();
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        tarArchiveOutputStream9.setBigNumberMode(2);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14);
        tarArchiveOutputStream15.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry18);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 100);
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream25.buffer;
        int int27 = tarArchiveOutputStream25.getRecordSize();
        byte[] byteArray28 = new byte[] {};
        tarArchiveOutputStream25.write(byteArray28);
        tarArchiveOutputStream15.write(byteArray28);
        tarArchiveOutputStream9.write(byteArray28);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry32);
        int int34 = tarArchiveOutputStream9.getRecordSize();
        long long35 = tarArchiveOutputStream9.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tarBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        int int9 = tarArchiveOutputStream8.getCount();
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        byte[] byteArray4 = new byte[] {};
        tarArchiveOutputStream1.write(byteArray4);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        int int8 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0);
        int int11 = tarArchiveOutputStream1.getRecordSize();
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        int int4 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, (int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, 52);
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertNotNull(tarBuffer5);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream1.buffer;
        int int6 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(tarBuffer4);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getCount();
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        int int10 = tarArchiveOutputStream1.getCount();
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11);
        tarArchiveOutputStream12.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream12.canWriteEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream12.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, 100);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer23 = tarArchiveOutputStream22.buffer;
        int int24 = tarArchiveOutputStream22.getRecordSize();
        byte[] byteArray25 = new byte[] {};
        tarArchiveOutputStream22.write(byteArray25);
        tarArchiveOutputStream20.write(byteArray25, 0, (int) (short) 0);
        tarArchiveOutputStream1.write(byteArray25);
        tarArchiveOutputStream1.setBigNumberMode(3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 100);
        tarArchiveOutputStream1.setBigNumberMode((int) '#');
        tarArchiveOutputStream1.setLongFileMode((int) (byte) -1);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream1.setLongFileMode((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 32, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tarBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        long long3 = tarArchiveOutputStream2.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, (int) 'a', 100);
        int int7 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.setLongFileMode((int) (short) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 32);
        tarArchiveOutputStream6.setBigNumberMode((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        tarArchiveOutputStream9.setBigNumberMode(2);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14);
        tarArchiveOutputStream15.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry18);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 100);
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream25.buffer;
        int int27 = tarArchiveOutputStream25.getRecordSize();
        byte[] byteArray28 = new byte[] {};
        tarArchiveOutputStream25.write(byteArray28);
        tarArchiveOutputStream15.write(byteArray28);
        tarArchiveOutputStream9.write(byteArray28);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer32 = tarArchiveOutputStream9.buffer;
        int int33 = tarArchiveOutputStream9.getRecordSize();
        tarArchiveOutputStream9.setBigNumberMode((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tarBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 512 + "'", int33 == 512);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        tarArchiveOutputStream9.setBigNumberMode(0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (byte) 100);
        long long15 = tarArchiveOutputStream9.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 32, 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream11.buffer;
        int int13 = tarArchiveOutputStream11.getRecordSize();
        byte[] byteArray14 = new byte[] {};
        tarArchiveOutputStream11.write(byteArray14);
        tarArchiveOutputStream1.write(byteArray14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = tarArchiveOutputStream17.buffer;
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19);
        tarArchiveOutputStream20.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = null;
        boolean boolean24 = tarArchiveOutputStream20.canWriteEntryData(archiveEntry23);
        int int25 = tarArchiveOutputStream20.getRecordSize();
        tarArchiveOutputStream20.setLongFileMode((int) (byte) 1);
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28);
        tarArchiveOutputStream29.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = tarArchiveOutputStream29.canWriteEntryData(archiveEntry32);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = null;
        boolean boolean35 = tarArchiveOutputStream29.canWriteEntryData(archiveEntry34);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream29, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry38 = null;
        boolean boolean39 = tarArchiveOutputStream37.canWriteEntryData(archiveEntry38);
        tarArchiveOutputStream37.setBigNumberMode(2);
        java.io.OutputStream outputStream42 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream42);
        tarArchiveOutputStream43.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry46 = null;
        boolean boolean47 = tarArchiveOutputStream43.canWriteEntryData(archiveEntry46);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry48 = null;
        boolean boolean49 = tarArchiveOutputStream43.canWriteEntryData(archiveEntry48);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream43, 100);
        java.io.OutputStream outputStream52 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream52);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer54 = tarArchiveOutputStream53.buffer;
        int int55 = tarArchiveOutputStream53.getRecordSize();
        byte[] byteArray56 = new byte[] {};
        tarArchiveOutputStream53.write(byteArray56);
        tarArchiveOutputStream43.write(byteArray56);
        tarArchiveOutputStream37.write(byteArray56);
        tarArchiveOutputStream20.write(byteArray56, (int) '#', (int) (short) -1);
        tarArchiveOutputStream17.write(byteArray56, (int) '#', (int) (byte) 0);
        tarArchiveOutputStream17.setLongFileMode((int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream69 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17, (int) (short) 0);
        long long70 = tarArchiveOutputStream17.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(tarBuffer54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 512 + "'", int55 == 512);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.putArchiveEntry(archiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, 1);
        int int13 = tarArchiveOutputStream10.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = tarArchiveOutputStream10.buffer;
        tarArchiveOutputStream10.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream10.writePaxHeaders("", strMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(tarBuffer14);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        int int4 = tarArchiveOutputStream1.getRecordSize();
        int int5 = tarArchiveOutputStream1.getCount();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '100' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        int int10 = tarArchiveOutputStream9.getCount();
        tarArchiveOutputStream9.setLongFileMode((int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 100, (int) (byte) 100);
        tarArchiveOutputStream15.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = tarArchiveOutputStream15.buffer;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream15.writePaxHeaders("hi!", strMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(tarBuffer18);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 2);
        tarArchiveOutputStream7.setLongFileMode((int) (short) -1);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        tarArchiveOutputStream11.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = tarArchiveOutputStream11.canWriteEntryData(archiveEntry14);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = tarArchiveOutputStream11.canWriteEntryData(archiveEntry16);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream19.canWriteEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer22 = tarArchiveOutputStream19.buffer;
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23);
        tarArchiveOutputStream24.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = null;
        boolean boolean28 = tarArchiveOutputStream24.canWriteEntryData(archiveEntry27);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = null;
        boolean boolean30 = tarArchiveOutputStream24.canWriteEntryData(archiveEntry29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream24, 100);
        java.io.OutputStream outputStream33 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream33);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer35 = tarArchiveOutputStream34.buffer;
        int int36 = tarArchiveOutputStream34.getRecordSize();
        byte[] byteArray37 = new byte[] {};
        tarArchiveOutputStream34.write(byteArray37);
        tarArchiveOutputStream32.write(byteArray37, 0, (int) (short) 0);
        tarArchiveOutputStream19.write(byteArray37);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19);
        java.io.OutputStream outputStream44 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream44);
        tarArchiveOutputStream45.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry48 = null;
        boolean boolean49 = tarArchiveOutputStream45.canWriteEntryData(archiveEntry48);
        tarArchiveOutputStream45.setBigNumberMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream45);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream54 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream45, 100);
        java.io.OutputStream outputStream55 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream56 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream55);
        tarArchiveOutputStream56.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry59 = null;
        boolean boolean60 = tarArchiveOutputStream56.canWriteEntryData(archiveEntry59);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry61 = null;
        boolean boolean62 = tarArchiveOutputStream56.canWriteEntryData(archiveEntry61);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream64 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream56, 100);
        java.io.OutputStream outputStream65 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream66 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream65);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer67 = tarArchiveOutputStream66.buffer;
        int int68 = tarArchiveOutputStream66.getRecordSize();
        byte[] byteArray69 = new byte[] {};
        tarArchiveOutputStream66.write(byteArray69);
        tarArchiveOutputStream64.write(byteArray69, 0, (int) (short) 0);
        tarArchiveOutputStream45.write(byteArray69, (int) (byte) 10, (int) (short) -1);
        tarArchiveOutputStream19.write(byteArray69);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.write(byteArray69, (int) (short) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '3' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tarBuffer22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tarBuffer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 512 + "'", int36 == 512);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(tarBuffer67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 512 + "'", int68 == 512);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] {});
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 10);
        long long11 = tarArchiveOutputStream10.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, (int) (byte) 1, 2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry18);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream14.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        long long4 = tarArchiveOutputStream1.getBytesWritten();
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        long long10 = tarArchiveOutputStream1.getBytesWritten();
        int int11 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        int int14 = tarArchiveOutputStream1.getRecordSize();
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream15);
        tarArchiveOutputStream16.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = tarArchiveOutputStream16.canWriteEntryData(archiveEntry19);
        int int21 = tarArchiveOutputStream16.getRecordSize();
        tarArchiveOutputStream16.setLongFileMode((int) (byte) 1);
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24);
        tarArchiveOutputStream25.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = tarArchiveOutputStream25.canWriteEntryData(archiveEntry28);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = tarArchiveOutputStream25.canWriteEntryData(archiveEntry30);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = null;
        boolean boolean35 = tarArchiveOutputStream33.canWriteEntryData(archiveEntry34);
        tarArchiveOutputStream33.setBigNumberMode(2);
        java.io.OutputStream outputStream38 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream38);
        tarArchiveOutputStream39.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry42 = null;
        boolean boolean43 = tarArchiveOutputStream39.canWriteEntryData(archiveEntry42);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry44 = null;
        boolean boolean45 = tarArchiveOutputStream39.canWriteEntryData(archiveEntry44);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream39, 100);
        java.io.OutputStream outputStream48 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream48);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer50 = tarArchiveOutputStream49.buffer;
        int int51 = tarArchiveOutputStream49.getRecordSize();
        byte[] byteArray52 = new byte[] {};
        tarArchiveOutputStream49.write(byteArray52);
        tarArchiveOutputStream39.write(byteArray52);
        tarArchiveOutputStream33.write(byteArray52);
        tarArchiveOutputStream16.write(byteArray52, (int) '#', (int) (short) -1);
        tarArchiveOutputStream1.write(byteArray52);
        int int60 = tarArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(tarBuffer50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 512 + "'", int51 == 512);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream24);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream28, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream30, 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 10);
        long long11 = tarArchiveOutputStream10.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream10.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream10.canWriteEntryData(archiveEntry13);
        long long15 = tarArchiveOutputStream10.getBytesWritten();
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16);
        tarArchiveOutputStream17.setAddPaxHeadersForNonAsciiNames(false);
        int int20 = tarArchiveOutputStream17.getRecordSize();
        tarArchiveOutputStream17.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17, (int) '#', 100);
        long long26 = tarArchiveOutputStream17.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17);
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28);
        tarArchiveOutputStream29.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = tarArchiveOutputStream29.canWriteEntryData(archiveEntry32);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = null;
        boolean boolean35 = tarArchiveOutputStream29.canWriteEntryData(archiveEntry34);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream29, 100);
        java.io.OutputStream outputStream38 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream38);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer40 = tarArchiveOutputStream39.buffer;
        int int41 = tarArchiveOutputStream39.getRecordSize();
        byte[] byteArray42 = new byte[] {};
        tarArchiveOutputStream39.write(byteArray42);
        tarArchiveOutputStream29.write(byteArray42);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream29, 3, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream29, 10);
        long long51 = tarArchiveOutputStream50.getBytesWritten();
        java.io.OutputStream outputStream52 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream52);
        tarArchiveOutputStream53.setAddPaxHeadersForNonAsciiNames(false);
        int int56 = tarArchiveOutputStream53.getRecordSize();
        java.io.OutputStream outputStream57 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream58 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream57);
        tarArchiveOutputStream58.setAddPaxHeadersForNonAsciiNames(false);
        java.io.OutputStream outputStream61 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream62 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream61);
        tarArchiveOutputStream62.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry65 = null;
        boolean boolean66 = tarArchiveOutputStream62.canWriteEntryData(archiveEntry65);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry67 = null;
        boolean boolean68 = tarArchiveOutputStream62.canWriteEntryData(archiveEntry67);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream70 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream62, 100);
        java.io.OutputStream outputStream71 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream72 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream71);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer73 = tarArchiveOutputStream72.buffer;
        int int74 = tarArchiveOutputStream72.getRecordSize();
        byte[] byteArray75 = new byte[] {};
        tarArchiveOutputStream72.write(byteArray75);
        tarArchiveOutputStream62.write(byteArray75);
        tarArchiveOutputStream58.write(byteArray75);
        tarArchiveOutputStream53.write(byteArray75);
        long long80 = tarArchiveOutputStream53.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry81 = null;
        boolean boolean82 = tarArchiveOutputStream53.canWriteEntryData(archiveEntry81);
        java.io.OutputStream outputStream83 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream84 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream83);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer85 = tarArchiveOutputStream84.buffer;
        int int86 = tarArchiveOutputStream84.getRecordSize();
        byte[] byteArray87 = new byte[] {};
        tarArchiveOutputStream84.write(byteArray87);
        tarArchiveOutputStream53.write(byteArray87);
        tarArchiveOutputStream50.write(byteArray87);
        tarArchiveOutputStream27.write(byteArray87);
        tarArchiveOutputStream10.write(byteArray87);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream93 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream96 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, 3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(tarBuffer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 512 + "'", int41 == 512);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 512 + "'", int56 == 512);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(tarBuffer73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 512 + "'", int74 == 512);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(tarBuffer85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 512 + "'", int86 == 512);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] {});
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        tarArchiveOutputStream1.setBigNumberMode((int) (short) 100);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 10);
        long long11 = tarArchiveOutputStream10.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream10.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream10.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = tarArchiveOutputStream17.buffer;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream17.writePaxHeaders("", strMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tarBuffer18);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream9.buffer;
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13);
        tarArchiveOutputStream14.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry19);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, 100);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = tarArchiveOutputStream24.buffer;
        int int26 = tarArchiveOutputStream24.getRecordSize();
        byte[] byteArray27 = new byte[] {};
        tarArchiveOutputStream24.write(byteArray27);
        tarArchiveOutputStream22.write(byteArray27, 0, (int) (short) 0);
        tarArchiveOutputStream9.write(byteArray27);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 100, (int) (short) 100);
        tarArchiveOutputStream9.setBigNumberMode((int) '#');
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream9.setLongFileMode((int) (byte) -1);
        tarArchiveOutputStream9.setBigNumberMode((int) '#');
        int int44 = tarArchiveOutputStream9.getRecordSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tarBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 512 + "'", int44 == 512);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        int int11 = tarArchiveOutputStream1.getRecordSize();
        int int12 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setLongFileMode(1);
        int int15 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = tarArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream5);
        tarArchiveOutputStream6.setAddPaxHeadersForNonAsciiNames(false);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9);
        tarArchiveOutputStream10.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream10.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream10.canWriteEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, 100);
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer21 = tarArchiveOutputStream20.buffer;
        int int22 = tarArchiveOutputStream20.getRecordSize();
        byte[] byteArray23 = new byte[] {};
        tarArchiveOutputStream20.write(byteArray23);
        tarArchiveOutputStream10.write(byteArray23);
        tarArchiveOutputStream6.write(byteArray23);
        tarArchiveOutputStream1.write(byteArray23);
        long long28 = tarArchiveOutputStream1.getBytesWritten();
        tarArchiveOutputStream1.setLongFileMode((-1));
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        tarArchiveOutputStream31.setLongFileMode(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tarBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        long long3 = tarArchiveOutputStream1.getBytesWritten();
        long long4 = tarArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        int int6 = tarArchiveOutputStream5.getCount();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7);
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry11);
        tarArchiveOutputStream8.setBigNumberMode(2);
        int int15 = tarArchiveOutputStream8.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, (int) (short) 10);
        tarArchiveOutputStream8.setBigNumberMode(0);
        long long20 = tarArchiveOutputStream8.getBytesWritten();
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21);
        tarArchiveOutputStream22.setAddPaxHeadersForNonAsciiNames(false);
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream25);
        tarArchiveOutputStream26.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = null;
        boolean boolean30 = tarArchiveOutputStream26.canWriteEntryData(archiveEntry29);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = tarArchiveOutputStream26.canWriteEntryData(archiveEntry31);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream26, 100);
        java.io.OutputStream outputStream35 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream35);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer37 = tarArchiveOutputStream36.buffer;
        int int38 = tarArchiveOutputStream36.getRecordSize();
        byte[] byteArray39 = new byte[] {};
        tarArchiveOutputStream36.write(byteArray39);
        tarArchiveOutputStream26.write(byteArray39);
        tarArchiveOutputStream22.write(byteArray39);
        tarArchiveOutputStream8.write(byteArray39, (int) 'a', (-1));
        tarArchiveOutputStream5.write(byteArray39);
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tarBuffer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 512 + "'", int38 == 512);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(tarBuffer4);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        long long7 = tarArchiveOutputStream1.getBytesWritten();
        int int8 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 1, 100);
        tarArchiveOutputStream11.setLongFileMode(100);
        tarArchiveOutputStream11.setLongFileMode((int) (short) 0);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16);
        tarArchiveOutputStream17.setAddPaxHeadersForNonAsciiNames(false);
        int int20 = tarArchiveOutputStream17.getRecordSize();
        tarArchiveOutputStream17.setAddPaxHeadersForNonAsciiNames(true);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23);
        tarArchiveOutputStream24.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = null;
        boolean boolean28 = tarArchiveOutputStream24.canWriteEntryData(archiveEntry27);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = null;
        boolean boolean30 = tarArchiveOutputStream24.canWriteEntryData(archiveEntry29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream24, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        boolean boolean34 = tarArchiveOutputStream32.canWriteEntryData(archiveEntry33);
        tarArchiveOutputStream32.setBigNumberMode(2);
        java.io.OutputStream outputStream37 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream37);
        tarArchiveOutputStream38.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry41 = null;
        boolean boolean42 = tarArchiveOutputStream38.canWriteEntryData(archiveEntry41);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry43 = null;
        boolean boolean44 = tarArchiveOutputStream38.canWriteEntryData(archiveEntry43);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream38, 100);
        java.io.OutputStream outputStream47 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream47);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer49 = tarArchiveOutputStream48.buffer;
        int int50 = tarArchiveOutputStream48.getRecordSize();
        byte[] byteArray51 = new byte[] {};
        tarArchiveOutputStream48.write(byteArray51);
        tarArchiveOutputStream38.write(byteArray51);
        tarArchiveOutputStream32.write(byteArray51);
        tarArchiveOutputStream17.write(byteArray51);
        tarArchiveOutputStream11.write(byteArray51);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream11.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tarBuffer49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 512 + "'", int50 == 512);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 512);
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13);
        tarArchiveOutputStream14.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry19);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = null;
        boolean boolean24 = tarArchiveOutputStream22.canWriteEntryData(archiveEntry23);
        tarArchiveOutputStream22.setBigNumberMode(2);
        java.io.OutputStream outputStream27 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream27);
        tarArchiveOutputStream28.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = tarArchiveOutputStream28.canWriteEntryData(archiveEntry31);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        boolean boolean34 = tarArchiveOutputStream28.canWriteEntryData(archiveEntry33);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream28, 100);
        java.io.OutputStream outputStream37 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream37);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer39 = tarArchiveOutputStream38.buffer;
        int int40 = tarArchiveOutputStream38.getRecordSize();
        byte[] byteArray41 = new byte[] {};
        tarArchiveOutputStream38.write(byteArray41);
        tarArchiveOutputStream28.write(byteArray41);
        tarArchiveOutputStream22.write(byteArray41);
        tarArchiveOutputStream1.write(byteArray41);
        tarArchiveOutputStream1.setBigNumberMode(97);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tarBuffer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 512 + "'", int40 == 512);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream11.buffer;
        int int13 = tarArchiveOutputStream11.getRecordSize();
        byte[] byteArray14 = new byte[] {};
        tarArchiveOutputStream11.write(byteArray14);
        tarArchiveOutputStream1.write(byteArray14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry18);
        tarArchiveOutputStream1.setLongFileMode(2);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        java.io.File file24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = tarArchiveOutputStream1.createArchiveEntry(file24, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7);
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry11);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, 100);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream17);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = tarArchiveOutputStream18.buffer;
        int int20 = tarArchiveOutputStream18.getRecordSize();
        byte[] byteArray21 = new byte[] {};
        tarArchiveOutputStream18.write(byteArray21);
        tarArchiveOutputStream8.write(byteArray21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = tarArchiveOutputStream24.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream24.buffer;
        java.io.OutputStream outputStream27 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream27);
        tarArchiveOutputStream28.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = tarArchiveOutputStream28.canWriteEntryData(archiveEntry31);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        boolean boolean34 = tarArchiveOutputStream28.canWriteEntryData(archiveEntry33);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream28, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = null;
        boolean boolean38 = tarArchiveOutputStream36.canWriteEntryData(archiveEntry37);
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream36.write(byteArray43, 100, (int) (byte) 0);
        tarArchiveOutputStream36.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream36.setLongFileMode((int) (short) 100);
        java.io.OutputStream outputStream51 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream51);
        tarArchiveOutputStream52.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry55 = null;
        boolean boolean56 = tarArchiveOutputStream52.canWriteEntryData(archiveEntry55);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry57 = null;
        boolean boolean58 = tarArchiveOutputStream52.canWriteEntryData(archiveEntry57);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream60 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream52, 100);
        java.io.OutputStream outputStream61 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream62 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream61);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer63 = tarArchiveOutputStream62.buffer;
        int int64 = tarArchiveOutputStream62.getRecordSize();
        byte[] byteArray65 = new byte[] {};
        tarArchiveOutputStream62.write(byteArray65);
        tarArchiveOutputStream60.write(byteArray65, 0, (int) (short) 0);
        tarArchiveOutputStream36.write(byteArray65);
        tarArchiveOutputStream24.write(byteArray65);
        tarArchiveOutputStream1.write(byteArray65);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream75 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream75.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tarBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer25);
        org.junit.Assert.assertNotNull(tarBuffer26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(tarBuffer63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 512 + "'", int64 == 512);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        byte[] byteArray4 = new byte[] {};
        tarArchiveOutputStream1.write(byteArray4);
        int int6 = tarArchiveOutputStream1.getRecordSize();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7);
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(false);
        int int11 = tarArchiveOutputStream8.getRecordSize();
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(true);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14);
        tarArchiveOutputStream15.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry18);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        boolean boolean25 = tarArchiveOutputStream23.canWriteEntryData(archiveEntry24);
        tarArchiveOutputStream23.setBigNumberMode(2);
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28);
        tarArchiveOutputStream29.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = tarArchiveOutputStream29.canWriteEntryData(archiveEntry32);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = null;
        boolean boolean35 = tarArchiveOutputStream29.canWriteEntryData(archiveEntry34);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream29, 100);
        java.io.OutputStream outputStream38 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream38);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer40 = tarArchiveOutputStream39.buffer;
        int int41 = tarArchiveOutputStream39.getRecordSize();
        byte[] byteArray42 = new byte[] {};
        tarArchiveOutputStream39.write(byteArray42);
        tarArchiveOutputStream29.write(byteArray42);
        tarArchiveOutputStream23.write(byteArray42);
        tarArchiveOutputStream8.write(byteArray42);
        tarArchiveOutputStream1.write(byteArray42);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer51 = tarArchiveOutputStream50.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream50);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream54 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream50, (int) '4');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry55 = null;
        boolean boolean56 = tarArchiveOutputStream50.canWriteEntryData(archiveEntry55);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream50, 1, 2);
        tarArchiveOutputStream59.setBigNumberMode(52);
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(tarBuffer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 512 + "'", int41 == 512);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        tarArchiveOutputStream9.setBigNumberMode(2);
        long long14 = tarArchiveOutputStream9.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18, 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        tarArchiveOutputStream9.setBigNumberMode(0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (byte) 100);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream15);
        tarArchiveOutputStream16.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = tarArchiveOutputStream16.canWriteEntryData(archiveEntry19);
        tarArchiveOutputStream16.setBigNumberMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16, 100);
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream26);
        tarArchiveOutputStream27.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = tarArchiveOutputStream27.canWriteEntryData(archiveEntry30);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = tarArchiveOutputStream27.canWriteEntryData(archiveEntry32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream27, 100);
        java.io.OutputStream outputStream36 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream36);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer38 = tarArchiveOutputStream37.buffer;
        int int39 = tarArchiveOutputStream37.getRecordSize();
        byte[] byteArray40 = new byte[] {};
        tarArchiveOutputStream37.write(byteArray40);
        tarArchiveOutputStream35.write(byteArray40, 0, (int) (short) 0);
        tarArchiveOutputStream16.write(byteArray40, (int) (byte) 10, (int) (short) -1);
        tarArchiveOutputStream14.write(byteArray40);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream14.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tarBuffer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 97);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) 'a', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream9.setLongFileMode((int) (short) 100);
        tarArchiveOutputStream9.setBigNumberMode(100);
        int int26 = tarArchiveOutputStream9.getCount();
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(true);
        long long29 = tarArchiveOutputStream9.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream9.buffer;
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13);
        tarArchiveOutputStream14.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry19);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, 100);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = tarArchiveOutputStream24.buffer;
        int int26 = tarArchiveOutputStream24.getRecordSize();
        byte[] byteArray27 = new byte[] {};
        tarArchiveOutputStream24.write(byteArray27);
        tarArchiveOutputStream22.write(byteArray27, 0, (int) (short) 0);
        tarArchiveOutputStream9.write(byteArray27);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 100, (int) (short) 100);
        tarArchiveOutputStream9.setBigNumberMode((int) '#');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer38 = tarArchiveOutputStream9.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) '4', 97);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '100' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tarBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer38);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        int int4 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream8.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream15);
        tarArchiveOutputStream16.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = tarArchiveOutputStream16.canWriteEntryData(archiveEntry19);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = null;
        boolean boolean22 = tarArchiveOutputStream16.canWriteEntryData(archiveEntry21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16, 100);
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream25);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer27 = tarArchiveOutputStream26.buffer;
        int int28 = tarArchiveOutputStream26.getRecordSize();
        byte[] byteArray29 = new byte[] {};
        tarArchiveOutputStream26.write(byteArray29);
        tarArchiveOutputStream24.write(byteArray29, 0, (int) (short) 0);
        tarArchiveOutputStream14.write(byteArray29);
        tarArchiveOutputStream12.write(byteArray29);
        tarArchiveOutputStream1.write(byteArray29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        int int38 = tarArchiveOutputStream1.getCount();
        java.util.Map<java.lang.String, java.lang.String> strMap40 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.writePaxHeaders("hi!", strMap40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tarBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream11.buffer;
        int int13 = tarArchiveOutputStream11.getRecordSize();
        byte[] byteArray14 = new byte[] {};
        tarArchiveOutputStream11.write(byteArray14);
        tarArchiveOutputStream1.write(byteArray14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = tarArchiveOutputStream17.buffer;
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19);
        tarArchiveOutputStream20.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = null;
        boolean boolean24 = tarArchiveOutputStream20.canWriteEntryData(archiveEntry23);
        int int25 = tarArchiveOutputStream20.getRecordSize();
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream26);
        tarArchiveOutputStream27.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = tarArchiveOutputStream27.canWriteEntryData(archiveEntry30);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = tarArchiveOutputStream27.canWriteEntryData(archiveEntry32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream27, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = null;
        boolean boolean37 = tarArchiveOutputStream35.canWriteEntryData(archiveEntry36);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer38 = tarArchiveOutputStream35.buffer;
        java.io.OutputStream outputStream39 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream39);
        tarArchiveOutputStream40.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry43 = null;
        boolean boolean44 = tarArchiveOutputStream40.canWriteEntryData(archiveEntry43);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry45 = null;
        boolean boolean46 = tarArchiveOutputStream40.canWriteEntryData(archiveEntry45);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream40, 100);
        java.io.OutputStream outputStream49 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream49);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer51 = tarArchiveOutputStream50.buffer;
        int int52 = tarArchiveOutputStream50.getRecordSize();
        byte[] byteArray53 = new byte[] {};
        tarArchiveOutputStream50.write(byteArray53);
        tarArchiveOutputStream48.write(byteArray53, 0, (int) (short) 0);
        tarArchiveOutputStream35.write(byteArray53);
        tarArchiveOutputStream20.write(byteArray53);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer60 = tarArchiveOutputStream20.buffer;
        java.io.OutputStream outputStream61 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream62 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream61);
        tarArchiveOutputStream62.setAddPaxHeadersForNonAsciiNames(false);
        int int65 = tarArchiveOutputStream62.getRecordSize();
        java.io.OutputStream outputStream66 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream67 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream66);
        tarArchiveOutputStream67.setAddPaxHeadersForNonAsciiNames(false);
        java.io.OutputStream outputStream70 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream71 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream70);
        tarArchiveOutputStream71.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry74 = null;
        boolean boolean75 = tarArchiveOutputStream71.canWriteEntryData(archiveEntry74);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry76 = null;
        boolean boolean77 = tarArchiveOutputStream71.canWriteEntryData(archiveEntry76);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream79 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream71, 100);
        java.io.OutputStream outputStream80 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream81 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream80);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer82 = tarArchiveOutputStream81.buffer;
        int int83 = tarArchiveOutputStream81.getRecordSize();
        byte[] byteArray84 = new byte[] {};
        tarArchiveOutputStream81.write(byteArray84);
        tarArchiveOutputStream71.write(byteArray84);
        tarArchiveOutputStream67.write(byteArray84);
        tarArchiveOutputStream62.write(byteArray84);
        tarArchiveOutputStream20.write(byteArray84);
        tarArchiveOutputStream17.write(byteArray84);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream17.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(tarBuffer38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(tarBuffer51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 512 + "'", int52 == 512);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 512 + "'", int65 == 512);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(tarBuffer82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 512 + "'", int83 == 512);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] {});
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        int int6 = tarArchiveOutputStream1.getRecordSize();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7);
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry11);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream16.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = tarArchiveOutputStream16.buffer;
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream20);
        tarArchiveOutputStream21.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        boolean boolean25 = tarArchiveOutputStream21.canWriteEntryData(archiveEntry24);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = null;
        boolean boolean27 = tarArchiveOutputStream21.canWriteEntryData(archiveEntry26);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21, 100);
        java.io.OutputStream outputStream30 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream30);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer32 = tarArchiveOutputStream31.buffer;
        int int33 = tarArchiveOutputStream31.getRecordSize();
        byte[] byteArray34 = new byte[] {};
        tarArchiveOutputStream31.write(byteArray34);
        tarArchiveOutputStream29.write(byteArray34, 0, (int) (short) 0);
        tarArchiveOutputStream16.write(byteArray34);
        tarArchiveOutputStream1.write(byteArray34);
        int int41 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer43 = tarArchiveOutputStream1.buffer;
        tarArchiveOutputStream1.setBigNumberMode((int) 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap47 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.writePaxHeaders("", strMap47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tarBuffer19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tarBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 512 + "'", int33 == 512);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(tarBuffer43);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        tarArchiveOutputStream1.setBigNumberMode(10);
        int int9 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13, (int) (byte) -1, (int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        tarArchiveOutputStream9.setLongFileMode((int) (byte) -1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream9.buffer;
        tarArchiveOutputStream9.setLongFileMode((int) (byte) 0);
        int int15 = tarArchiveOutputStream9.getRecordSize();
        int int16 = tarArchiveOutputStream9.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 10, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21, (int) '4');
        tarArchiveOutputStream23.setLongFileMode((int) (short) 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = null;
        boolean boolean27 = tarArchiveOutputStream23.canWriteEntryData(archiveEntry26);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer28 = tarArchiveOutputStream23.buffer;
        long long29 = tarArchiveOutputStream23.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tarBuffer28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        tarArchiveOutputStream9.setBigNumberMode(2);
        long long14 = tarArchiveOutputStream9.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry15);
        tarArchiveOutputStream9.setLongFileMode(0);
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19);
        tarArchiveOutputStream20.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = null;
        boolean boolean24 = tarArchiveOutputStream20.canWriteEntryData(archiveEntry23);
        int int25 = tarArchiveOutputStream20.getRecordSize();
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream26);
        tarArchiveOutputStream27.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = tarArchiveOutputStream27.canWriteEntryData(archiveEntry30);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = tarArchiveOutputStream27.canWriteEntryData(archiveEntry32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream27, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = null;
        boolean boolean37 = tarArchiveOutputStream35.canWriteEntryData(archiveEntry36);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer38 = tarArchiveOutputStream35.buffer;
        java.io.OutputStream outputStream39 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream39);
        tarArchiveOutputStream40.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry43 = null;
        boolean boolean44 = tarArchiveOutputStream40.canWriteEntryData(archiveEntry43);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry45 = null;
        boolean boolean46 = tarArchiveOutputStream40.canWriteEntryData(archiveEntry45);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream40, 100);
        java.io.OutputStream outputStream49 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream49);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer51 = tarArchiveOutputStream50.buffer;
        int int52 = tarArchiveOutputStream50.getRecordSize();
        byte[] byteArray53 = new byte[] {};
        tarArchiveOutputStream50.write(byteArray53);
        tarArchiveOutputStream48.write(byteArray53, 0, (int) (short) 0);
        tarArchiveOutputStream35.write(byteArray53);
        tarArchiveOutputStream20.write(byteArray53);
        java.io.OutputStream outputStream60 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream60);
        tarArchiveOutputStream61.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry64 = null;
        boolean boolean65 = tarArchiveOutputStream61.canWriteEntryData(archiveEntry64);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry66 = null;
        boolean boolean67 = tarArchiveOutputStream61.canWriteEntryData(archiveEntry66);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream69 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream61, 100);
        java.io.OutputStream outputStream70 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream71 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream70);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer72 = tarArchiveOutputStream71.buffer;
        int int73 = tarArchiveOutputStream71.getRecordSize();
        byte[] byteArray74 = new byte[] {};
        tarArchiveOutputStream71.write(byteArray74);
        tarArchiveOutputStream61.write(byteArray74);
        tarArchiveOutputStream20.write(byteArray74, (int) (byte) -1, 0);
        tarArchiveOutputStream9.write(byteArray74);
        tarArchiveOutputStream9.setLongFileMode(10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream84 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry85 = null;
        boolean boolean86 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry85);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream88 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream90 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(tarBuffer38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(tarBuffer51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 512 + "'", int52 == 512);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(tarBuffer72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 512 + "'", int73 == 512);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        int int10 = tarArchiveOutputStream1.getCount();
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11);
        tarArchiveOutputStream12.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream12.canWriteEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream12.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, 100);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer23 = tarArchiveOutputStream22.buffer;
        int int24 = tarArchiveOutputStream22.getRecordSize();
        byte[] byteArray25 = new byte[] {};
        tarArchiveOutputStream22.write(byteArray25);
        tarArchiveOutputStream20.write(byteArray25, 0, (int) (short) 0);
        tarArchiveOutputStream1.write(byteArray25);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 10);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer35 = tarArchiveOutputStream1.buffer;
        int int36 = tarArchiveOutputStream1.getRecordSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tarBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 512 + "'", int36 == 512);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(tarBuffer4);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        long long11 = tarArchiveOutputStream10.getBytesWritten();
        int int12 = tarArchiveOutputStream10.getRecordSize();
        int int13 = tarArchiveOutputStream10.getCount();
        tarArchiveOutputStream10.setBigNumberMode(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        long long12 = tarArchiveOutputStream9.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 0, 32);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18, 2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21);
        tarArchiveOutputStream22.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = null;
        boolean boolean26 = tarArchiveOutputStream22.canWriteEntryData(archiveEntry25);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = null;
        boolean boolean28 = tarArchiveOutputStream22.canWriteEntryData(archiveEntry27);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = tarArchiveOutputStream30.canWriteEntryData(archiveEntry31);
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream30.write(byteArray37, 100, (int) (byte) 0);
        tarArchiveOutputStream30.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream30.setLongFileMode((int) (short) 100);
        java.io.OutputStream outputStream45 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream45);
        tarArchiveOutputStream46.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry49 = null;
        boolean boolean50 = tarArchiveOutputStream46.canWriteEntryData(archiveEntry49);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry51 = null;
        boolean boolean52 = tarArchiveOutputStream46.canWriteEntryData(archiveEntry51);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream54 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream46, 100);
        java.io.OutputStream outputStream55 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream56 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream55);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer57 = tarArchiveOutputStream56.buffer;
        int int58 = tarArchiveOutputStream56.getRecordSize();
        byte[] byteArray59 = new byte[] {};
        tarArchiveOutputStream56.write(byteArray59);
        tarArchiveOutputStream54.write(byteArray59, 0, (int) (short) 0);
        tarArchiveOutputStream30.write(byteArray59);
        tarArchiveOutputStream18.write(byteArray59);
        tarArchiveOutputStream9.write(byteArray59);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tarBuffer57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 512 + "'", int58 == 512);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        long long7 = tarArchiveOutputStream1.getBytesWritten();
        int int8 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 1, 100);
        tarArchiveOutputStream11.setLongFileMode(100);
        tarArchiveOutputStream11.setLongFileMode((int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, (int) ' ');
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer20 = tarArchiveOutputStream19.buffer;
        int int21 = tarArchiveOutputStream19.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer22 = tarArchiveOutputStream19.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19, (int) (short) 1);
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream25);
        tarArchiveOutputStream26.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = null;
        boolean boolean30 = tarArchiveOutputStream26.canWriteEntryData(archiveEntry29);
        tarArchiveOutputStream26.setBigNumberMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream26);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream26, 100);
        java.io.OutputStream outputStream36 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream36);
        tarArchiveOutputStream37.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry40 = null;
        boolean boolean41 = tarArchiveOutputStream37.canWriteEntryData(archiveEntry40);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry42 = null;
        boolean boolean43 = tarArchiveOutputStream37.canWriteEntryData(archiveEntry42);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream37, 100);
        java.io.OutputStream outputStream46 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream46);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer48 = tarArchiveOutputStream47.buffer;
        int int49 = tarArchiveOutputStream47.getRecordSize();
        byte[] byteArray50 = new byte[] {};
        tarArchiveOutputStream47.write(byteArray50);
        tarArchiveOutputStream45.write(byteArray50, 0, (int) (short) 0);
        tarArchiveOutputStream26.write(byteArray50, (int) (byte) 10, (int) (short) -1);
        tarArchiveOutputStream24.write(byteArray50, (int) (short) 1, 0);
        tarArchiveOutputStream11.write(byteArray50);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(tarBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertNotNull(tarBuffer22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(tarBuffer48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 512 + "'", int49 == 512);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        tarArchiveOutputStream9.setBigNumberMode(2);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14);
        tarArchiveOutputStream15.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry18);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 100);
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream25.buffer;
        int int27 = tarArchiveOutputStream25.getRecordSize();
        byte[] byteArray28 = new byte[] {};
        tarArchiveOutputStream25.write(byteArray28);
        tarArchiveOutputStream15.write(byteArray28);
        tarArchiveOutputStream9.write(byteArray28);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 10);
        tarArchiveOutputStream35.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer38 = tarArchiveOutputStream35.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry39 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream35.putArchiveEntry(archiveEntry39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tarBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tarBuffer38);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) '4');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) 'a');
        tarArchiveOutputStream1.setLongFileMode(0);
        tarArchiveOutputStream1.setBigNumberMode(1);
        tarArchiveOutputStream1.setBigNumberMode((int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21, (int) (short) 100);
        tarArchiveOutputStream21.setBigNumberMode(10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        int int4 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        long long7 = tarArchiveOutputStream6.getBytesWritten();
        int int8 = tarArchiveOutputStream6.getCount();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.writePaxHeaders("", strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream11.buffer;
        int int13 = tarArchiveOutputStream11.getRecordSize();
        byte[] byteArray14 = new byte[] {};
        tarArchiveOutputStream11.write(byteArray14);
        tarArchiveOutputStream9.write(byteArray14, 0, (int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = tarArchiveOutputStream9.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer19);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        long long9 = tarArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        int int10 = tarArchiveOutputStream1.getCount();
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11);
        tarArchiveOutputStream12.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream12.canWriteEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream12.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, 100);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer23 = tarArchiveOutputStream22.buffer;
        int int24 = tarArchiveOutputStream22.getRecordSize();
        byte[] byteArray25 = new byte[] {};
        tarArchiveOutputStream22.write(byteArray25);
        tarArchiveOutputStream20.write(byteArray25, 0, (int) (short) 0);
        tarArchiveOutputStream1.write(byteArray25);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = null;
        boolean boolean37 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry36);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tarBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream9.setLongFileMode((int) (short) 100);
        tarArchiveOutputStream9.setBigNumberMode(100);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream9.buffer;
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(tarBuffer26);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 0, (int) (byte) 10);
        byte[] byteArray11 = null;
        tarArchiveOutputStream10.write(byteArray11, (int) (byte) 1, 0);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream15);
        tarArchiveOutputStream16.setAddPaxHeadersForNonAsciiNames(false);
        int int19 = tarArchiveOutputStream16.getRecordSize();
        tarArchiveOutputStream16.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16, (int) '#', 100);
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream25);
        tarArchiveOutputStream26.setAddPaxHeadersForNonAsciiNames(false);
        int int29 = tarArchiveOutputStream26.getRecordSize();
        java.io.OutputStream outputStream30 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream30);
        tarArchiveOutputStream31.setAddPaxHeadersForNonAsciiNames(false);
        java.io.OutputStream outputStream34 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream34);
        tarArchiveOutputStream35.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry38 = null;
        boolean boolean39 = tarArchiveOutputStream35.canWriteEntryData(archiveEntry38);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry40 = null;
        boolean boolean41 = tarArchiveOutputStream35.canWriteEntryData(archiveEntry40);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream35, 100);
        java.io.OutputStream outputStream44 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream44);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer46 = tarArchiveOutputStream45.buffer;
        int int47 = tarArchiveOutputStream45.getRecordSize();
        byte[] byteArray48 = new byte[] {};
        tarArchiveOutputStream45.write(byteArray48);
        tarArchiveOutputStream35.write(byteArray48);
        tarArchiveOutputStream31.write(byteArray48);
        tarArchiveOutputStream26.write(byteArray48);
        tarArchiveOutputStream24.write(byteArray48, (int) (byte) 0, (int) (byte) -1);
        tarArchiveOutputStream10.write(byteArray48);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, (int) (byte) 0, 10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer60 = tarArchiveOutputStream10.buffer;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream10.write(32);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(tarBuffer4);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tarBuffer46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 512 + "'", int47 == 512);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer60);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) '4');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) 'a');
        tarArchiveOutputStream1.setLongFileMode(0);
        tarArchiveOutputStream1.setBigNumberMode(1);
        tarArchiveOutputStream1.setBigNumberMode((int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 1, (int) '#');
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22);
        tarArchiveOutputStream23.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = null;
        boolean boolean27 = tarArchiveOutputStream23.canWriteEntryData(archiveEntry26);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = tarArchiveOutputStream23.canWriteEntryData(archiveEntry28);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 100);
        java.io.OutputStream outputStream32 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream32);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer34 = tarArchiveOutputStream33.buffer;
        int int35 = tarArchiveOutputStream33.getRecordSize();
        byte[] byteArray36 = new byte[] {};
        tarArchiveOutputStream33.write(byteArray36);
        tarArchiveOutputStream23.write(byteArray36);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer40 = tarArchiveOutputStream39.buffer;
        java.io.OutputStream outputStream41 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream41);
        tarArchiveOutputStream42.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry45 = null;
        boolean boolean46 = tarArchiveOutputStream42.canWriteEntryData(archiveEntry45);
        int int47 = tarArchiveOutputStream42.getRecordSize();
        tarArchiveOutputStream42.setLongFileMode((int) (byte) 1);
        java.io.OutputStream outputStream50 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream50);
        tarArchiveOutputStream51.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry54 = null;
        boolean boolean55 = tarArchiveOutputStream51.canWriteEntryData(archiveEntry54);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry56 = null;
        boolean boolean57 = tarArchiveOutputStream51.canWriteEntryData(archiveEntry56);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream51, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry60 = null;
        boolean boolean61 = tarArchiveOutputStream59.canWriteEntryData(archiveEntry60);
        tarArchiveOutputStream59.setBigNumberMode(2);
        java.io.OutputStream outputStream64 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream65 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream64);
        tarArchiveOutputStream65.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry68 = null;
        boolean boolean69 = tarArchiveOutputStream65.canWriteEntryData(archiveEntry68);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry70 = null;
        boolean boolean71 = tarArchiveOutputStream65.canWriteEntryData(archiveEntry70);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream73 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream65, 100);
        java.io.OutputStream outputStream74 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream75 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream74);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer76 = tarArchiveOutputStream75.buffer;
        int int77 = tarArchiveOutputStream75.getRecordSize();
        byte[] byteArray78 = new byte[] {};
        tarArchiveOutputStream75.write(byteArray78);
        tarArchiveOutputStream65.write(byteArray78);
        tarArchiveOutputStream59.write(byteArray78);
        tarArchiveOutputStream42.write(byteArray78, (int) '#', (int) (short) -1);
        tarArchiveOutputStream39.write(byteArray78, (int) '#', (int) (byte) 0);
        tarArchiveOutputStream21.write(byteArray78);
        tarArchiveOutputStream21.setBigNumberMode(0);
        tarArchiveOutputStream21.setLongFileMode((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tarBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 512 + "'", int35 == 512);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 512 + "'", int47 == 512);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(tarBuffer76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 512 + "'", int77 == 512);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] {});
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = tarArchiveOutputStream9.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(tarBuffer25);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream9.buffer;
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13);
        tarArchiveOutputStream14.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry19);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, 100);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = tarArchiveOutputStream24.buffer;
        int int26 = tarArchiveOutputStream24.getRecordSize();
        byte[] byteArray27 = new byte[] {};
        tarArchiveOutputStream24.write(byteArray27);
        tarArchiveOutputStream22.write(byteArray27, 0, (int) (short) 0);
        tarArchiveOutputStream9.write(byteArray27);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 100, (int) (short) 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = null;
        boolean boolean37 = tarArchiveOutputStream35.canWriteEntryData(archiveEntry36);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream35, 0);
        tarArchiveOutputStream35.setBigNumberMode((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream35.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tarBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream9.setLongFileMode((int) (short) 100);
        tarArchiveOutputStream9.setBigNumberMode(100);
        long long26 = tarArchiveOutputStream9.getBytesWritten();
        int int27 = tarArchiveOutputStream9.getRecordSize();
        int int28 = tarArchiveOutputStream9.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (byte) 0, 512);
        tarArchiveOutputStream9.setBigNumberMode((int) (byte) -1);
        int int34 = tarArchiveOutputStream9.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (byte) 0, (int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13, (int) (short) 1);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16);
        tarArchiveOutputStream17.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream17.canWriteEntryData(archiveEntry20);
        tarArchiveOutputStream17.setBigNumberMode(2);
        int int24 = tarArchiveOutputStream17.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17, (int) '4');
        tarArchiveOutputStream17.setLongFileMode(3);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream29);
        tarArchiveOutputStream30.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        boolean boolean34 = tarArchiveOutputStream30.canWriteEntryData(archiveEntry33);
        tarArchiveOutputStream30.setBigNumberMode(2);
        int int37 = tarArchiveOutputStream30.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream30, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream39, 1);
        int int42 = tarArchiveOutputStream39.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer43 = tarArchiveOutputStream39.buffer;
        tarArchiveOutputStream39.setAddPaxHeadersForNonAsciiNames(false);
        java.io.OutputStream outputStream46 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream46);
        tarArchiveOutputStream47.setAddPaxHeadersForNonAsciiNames(false);
        int int50 = tarArchiveOutputStream47.getRecordSize();
        tarArchiveOutputStream47.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream55 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream47, 0, (int) (short) 1);
        java.io.OutputStream outputStream56 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream56);
        tarArchiveOutputStream57.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry60 = null;
        boolean boolean61 = tarArchiveOutputStream57.canWriteEntryData(archiveEntry60);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry62 = null;
        boolean boolean63 = tarArchiveOutputStream57.canWriteEntryData(archiveEntry62);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream65 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream57, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry66 = null;
        boolean boolean67 = tarArchiveOutputStream65.canWriteEntryData(archiveEntry66);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer68 = tarArchiveOutputStream65.buffer;
        java.io.OutputStream outputStream69 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream70 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream69);
        tarArchiveOutputStream70.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry73 = null;
        boolean boolean74 = tarArchiveOutputStream70.canWriteEntryData(archiveEntry73);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry75 = null;
        boolean boolean76 = tarArchiveOutputStream70.canWriteEntryData(archiveEntry75);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream78 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream70, 100);
        java.io.OutputStream outputStream79 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream80 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream79);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer81 = tarArchiveOutputStream80.buffer;
        int int82 = tarArchiveOutputStream80.getRecordSize();
        byte[] byteArray83 = new byte[] {};
        tarArchiveOutputStream80.write(byteArray83);
        tarArchiveOutputStream78.write(byteArray83, 0, (int) (short) 0);
        tarArchiveOutputStream65.write(byteArray83);
        tarArchiveOutputStream55.write(byteArray83);
        tarArchiveOutputStream39.write(byteArray83, (int) (byte) -1, (-1));
        tarArchiveOutputStream17.write(byteArray83);
        tarArchiveOutputStream13.write(byteArray83, (-1), (int) (short) -1);
        int int97 = tarArchiveOutputStream13.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream99 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 512 + "'", int37 == 512);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(tarBuffer43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 512 + "'", int50 == 512);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(tarBuffer68);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(tarBuffer81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 512 + "'", int82 == 512);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] {});
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream11.buffer;
        int int13 = tarArchiveOutputStream11.getRecordSize();
        byte[] byteArray14 = new byte[] {};
        tarArchiveOutputStream11.write(byteArray14);
        tarArchiveOutputStream1.write(byteArray14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 3, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer23 = tarArchiveOutputStream22.buffer;
        tarArchiveOutputStream22.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = null;
        boolean boolean27 = tarArchiveOutputStream22.canWriteEntryData(archiveEntry26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        long long7 = tarArchiveOutputStream1.getBytesWritten();
        int int8 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 1, 100);
        int int12 = tarArchiveOutputStream11.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry15);
        tarArchiveOutputStream14.setBigNumberMode((int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = tarArchiveOutputStream14.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry20);
        int int22 = tarArchiveOutputStream14.getRecordSize();
        int int23 = tarArchiveOutputStream14.getRecordSize();
        java.io.File file24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = tarArchiveOutputStream14.createArchiveEntry(file24, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tarBuffer19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        tarArchiveOutputStream9.setBigNumberMode(2);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14);
        tarArchiveOutputStream15.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry18);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 100);
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream25.buffer;
        int int27 = tarArchiveOutputStream25.getRecordSize();
        byte[] byteArray28 = new byte[] {};
        tarArchiveOutputStream25.write(byteArray28);
        tarArchiveOutputStream15.write(byteArray28);
        tarArchiveOutputStream9.write(byteArray28);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer32 = tarArchiveOutputStream9.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        tarArchiveOutputStream9.setLongFileMode(0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        tarArchiveOutputStream36.setLongFileMode(0);
        byte[] byteArray39 = null;
        tarArchiveOutputStream36.write(byteArray39, (-1), (int) (short) -1);
        int int43 = tarArchiveOutputStream36.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer44 = tarArchiveOutputStream36.buffer;
        java.lang.Class<?> wildcardClass45 = tarBuffer44.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tarBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer32);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(tarBuffer44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream9.setLongFileMode((int) (short) 100);
        tarArchiveOutputStream9.setBigNumberMode(100);
        int int26 = tarArchiveOutputStream9.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        tarArchiveOutputStream27.setAddPaxHeadersForNonAsciiNames(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        int int4 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream8.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream15);
        tarArchiveOutputStream16.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = tarArchiveOutputStream16.canWriteEntryData(archiveEntry19);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = null;
        boolean boolean22 = tarArchiveOutputStream16.canWriteEntryData(archiveEntry21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16, 100);
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream25);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer27 = tarArchiveOutputStream26.buffer;
        int int28 = tarArchiveOutputStream26.getRecordSize();
        byte[] byteArray29 = new byte[] {};
        tarArchiveOutputStream26.write(byteArray29);
        tarArchiveOutputStream24.write(byteArray29, 0, (int) (short) 0);
        tarArchiveOutputStream14.write(byteArray29);
        tarArchiveOutputStream12.write(byteArray29);
        tarArchiveOutputStream1.write(byteArray29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        long long38 = tarArchiveOutputStream37.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream37, 100);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream40.write(97);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tarBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer3 = tarArchiveOutputStream2.buffer;
        int int4 = tarArchiveOutputStream2.getRecordSize();
        tarArchiveOutputStream2.setLongFileMode((int) (short) 100);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 10);
        org.junit.Assert.assertNotNull(tarBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertNotNull(tarBuffer7);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        tarArchiveOutputStream9.setBigNumberMode(2);
        tarArchiveOutputStream9.setLongFileMode((int) 'a');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 10);
        long long21 = tarArchiveOutputStream9.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, (int) (short) 10);
        tarArchiveOutputStream22.setLongFileMode(2);
        java.io.OutputStream outputStream27 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream27);
        tarArchiveOutputStream28.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = tarArchiveOutputStream28.canWriteEntryData(archiveEntry31);
        tarArchiveOutputStream28.setBigNumberMode(2);
        int int35 = tarArchiveOutputStream28.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream28, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream37, 1);
        int int40 = tarArchiveOutputStream37.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer41 = tarArchiveOutputStream37.buffer;
        tarArchiveOutputStream37.setAddPaxHeadersForNonAsciiNames(false);
        java.io.OutputStream outputStream44 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream44);
        tarArchiveOutputStream45.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry48 = null;
        boolean boolean49 = tarArchiveOutputStream45.canWriteEntryData(archiveEntry48);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry50 = null;
        boolean boolean51 = tarArchiveOutputStream45.canWriteEntryData(archiveEntry50);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream45, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry54 = null;
        boolean boolean55 = tarArchiveOutputStream53.canWriteEntryData(archiveEntry54);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer56 = tarArchiveOutputStream53.buffer;
        java.io.OutputStream outputStream57 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream58 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream57);
        tarArchiveOutputStream58.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry61 = null;
        boolean boolean62 = tarArchiveOutputStream58.canWriteEntryData(archiveEntry61);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry63 = null;
        boolean boolean64 = tarArchiveOutputStream58.canWriteEntryData(archiveEntry63);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream66 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream58, 100);
        java.io.OutputStream outputStream67 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream68 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream67);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer69 = tarArchiveOutputStream68.buffer;
        int int70 = tarArchiveOutputStream68.getRecordSize();
        byte[] byteArray71 = new byte[] {};
        tarArchiveOutputStream68.write(byteArray71);
        tarArchiveOutputStream66.write(byteArray71, 0, (int) (short) 0);
        tarArchiveOutputStream53.write(byteArray71);
        tarArchiveOutputStream37.write(byteArray71);
        tarArchiveOutputStream22.write(byteArray71, 512, (-1));
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream83 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, (int) 'a', 3);
        tarArchiveOutputStream22.setBigNumberMode((int) '4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 512 + "'", int35 == 512);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(tarBuffer41);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(tarBuffer56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(tarBuffer69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 512 + "'", int70 == 512);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] {});
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream9.buffer;
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13);
        tarArchiveOutputStream14.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry19);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, 100);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = tarArchiveOutputStream24.buffer;
        int int26 = tarArchiveOutputStream24.getRecordSize();
        byte[] byteArray27 = new byte[] {};
        tarArchiveOutputStream24.write(byteArray27);
        tarArchiveOutputStream22.write(byteArray27, 0, (int) (short) 0);
        tarArchiveOutputStream9.write(byteArray27);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        java.io.OutputStream outputStream34 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream34);
        tarArchiveOutputStream35.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry38 = null;
        boolean boolean39 = tarArchiveOutputStream35.canWriteEntryData(archiveEntry38);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry40 = null;
        boolean boolean41 = tarArchiveOutputStream35.canWriteEntryData(archiveEntry40);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream35, 100);
        java.io.OutputStream outputStream44 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream44);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer46 = tarArchiveOutputStream45.buffer;
        int int47 = tarArchiveOutputStream45.getRecordSize();
        byte[] byteArray48 = new byte[] {};
        tarArchiveOutputStream45.write(byteArray48);
        tarArchiveOutputStream35.write(byteArray48);
        tarArchiveOutputStream33.write(byteArray48);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream33, (int) (short) 10);
        tarArchiveOutputStream53.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream53.setLongFileMode(10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream53, (int) '4', 52, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tarBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tarBuffer46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 512 + "'", int47 == 512);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        long long10 = tarArchiveOutputStream1.getBytesWritten();
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11);
        tarArchiveOutputStream12.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream12.canWriteEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream12.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = null;
        boolean boolean22 = tarArchiveOutputStream20.canWriteEntryData(archiveEntry21);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream20.write(byteArray27, 100, (int) (byte) 0);
        tarArchiveOutputStream20.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream20.setLongFileMode((int) (short) 100);
        int int35 = tarArchiveOutputStream20.getCount();
        java.io.OutputStream outputStream36 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream36);
        tarArchiveOutputStream37.setAddPaxHeadersForNonAsciiNames(false);
        java.io.OutputStream outputStream40 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream40);
        tarArchiveOutputStream41.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry44 = null;
        boolean boolean45 = tarArchiveOutputStream41.canWriteEntryData(archiveEntry44);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry46 = null;
        boolean boolean47 = tarArchiveOutputStream41.canWriteEntryData(archiveEntry46);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream41, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry50 = null;
        boolean boolean51 = tarArchiveOutputStream49.canWriteEntryData(archiveEntry50);
        tarArchiveOutputStream49.setBigNumberMode(2);
        java.io.OutputStream outputStream54 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream55 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream54);
        tarArchiveOutputStream55.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry58 = null;
        boolean boolean59 = tarArchiveOutputStream55.canWriteEntryData(archiveEntry58);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry60 = null;
        boolean boolean61 = tarArchiveOutputStream55.canWriteEntryData(archiveEntry60);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream63 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream55, 100);
        java.io.OutputStream outputStream64 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream65 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream64);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer66 = tarArchiveOutputStream65.buffer;
        int int67 = tarArchiveOutputStream65.getRecordSize();
        byte[] byteArray68 = new byte[] {};
        tarArchiveOutputStream65.write(byteArray68);
        tarArchiveOutputStream55.write(byteArray68);
        tarArchiveOutputStream49.write(byteArray68);
        tarArchiveOutputStream37.write(byteArray68);
        tarArchiveOutputStream20.write(byteArray68);
        tarArchiveOutputStream1.write(byteArray68);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(tarBuffer66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 512 + "'", int67 == 512);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] {});
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream9.buffer;
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13);
        tarArchiveOutputStream14.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry19);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, 100);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = tarArchiveOutputStream24.buffer;
        int int26 = tarArchiveOutputStream24.getRecordSize();
        byte[] byteArray27 = new byte[] {};
        tarArchiveOutputStream24.write(byteArray27);
        tarArchiveOutputStream22.write(byteArray27, 0, (int) (short) 0);
        tarArchiveOutputStream9.write(byteArray27);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 100, (int) (short) 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = null;
        boolean boolean37 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry36);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer38 = tarArchiveOutputStream9.buffer;
        java.lang.Class<?> wildcardClass39 = tarBuffer38.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tarBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(tarBuffer38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        tarArchiveOutputStream1.setBigNumberMode(10);
        tarArchiveOutputStream1.setLongFileMode(1);
        int int11 = tarArchiveOutputStream1.getRecordSize();
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream12);
        tarArchiveOutputStream13.setAddPaxHeadersForNonAsciiNames(false);
        int int16 = tarArchiveOutputStream13.getRecordSize();
        tarArchiveOutputStream13.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13, 0, (int) (short) 1);
        int int22 = tarArchiveOutputStream21.getCount();
        tarArchiveOutputStream21.setLongFileMode((int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21, 100, (int) (byte) 100);
        int int28 = tarArchiveOutputStream21.getRecordSize();
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream29);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer31 = tarArchiveOutputStream30.buffer;
        int int32 = tarArchiveOutputStream30.getRecordSize();
        byte[] byteArray33 = new byte[] {};
        tarArchiveOutputStream30.write(byteArray33);
        int int35 = tarArchiveOutputStream30.getRecordSize();
        java.io.OutputStream outputStream36 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream36);
        tarArchiveOutputStream37.setAddPaxHeadersForNonAsciiNames(false);
        int int40 = tarArchiveOutputStream37.getRecordSize();
        tarArchiveOutputStream37.setAddPaxHeadersForNonAsciiNames(true);
        java.io.OutputStream outputStream43 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream43);
        tarArchiveOutputStream44.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry47 = null;
        boolean boolean48 = tarArchiveOutputStream44.canWriteEntryData(archiveEntry47);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry49 = null;
        boolean boolean50 = tarArchiveOutputStream44.canWriteEntryData(archiveEntry49);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream44, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry53 = null;
        boolean boolean54 = tarArchiveOutputStream52.canWriteEntryData(archiveEntry53);
        tarArchiveOutputStream52.setBigNumberMode(2);
        java.io.OutputStream outputStream57 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream58 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream57);
        tarArchiveOutputStream58.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry61 = null;
        boolean boolean62 = tarArchiveOutputStream58.canWriteEntryData(archiveEntry61);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry63 = null;
        boolean boolean64 = tarArchiveOutputStream58.canWriteEntryData(archiveEntry63);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream66 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream58, 100);
        java.io.OutputStream outputStream67 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream68 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream67);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer69 = tarArchiveOutputStream68.buffer;
        int int70 = tarArchiveOutputStream68.getRecordSize();
        byte[] byteArray71 = new byte[] {};
        tarArchiveOutputStream68.write(byteArray71);
        tarArchiveOutputStream58.write(byteArray71);
        tarArchiveOutputStream52.write(byteArray71);
        tarArchiveOutputStream37.write(byteArray71);
        tarArchiveOutputStream30.write(byteArray71);
        tarArchiveOutputStream21.write(byteArray71);
        tarArchiveOutputStream1.write(byteArray71);
        int int79 = tarArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(tarBuffer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 512 + "'", int32 == 512);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 512 + "'", int35 == 512);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 512 + "'", int40 == 512);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(tarBuffer69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 512 + "'", int70 == 512);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] {});
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        int int4 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream9.setLongFileMode((int) (short) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 0);
        tarArchiveOutputStream27.setBigNumberMode((int) (byte) 1);
        int int30 = tarArchiveOutputStream27.getCount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        tarArchiveOutputStream9.setBigNumberMode(2);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14);
        tarArchiveOutputStream15.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry18);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 100);
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream25.buffer;
        int int27 = tarArchiveOutputStream25.getRecordSize();
        byte[] byteArray28 = new byte[] {};
        tarArchiveOutputStream25.write(byteArray28);
        tarArchiveOutputStream15.write(byteArray28);
        tarArchiveOutputStream9.write(byteArray28);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer32 = tarArchiveOutputStream9.buffer;
        int int33 = tarArchiveOutputStream9.getRecordSize();
        tarArchiveOutputStream9.setBigNumberMode((int) ' ');
        tarArchiveOutputStream9.setBigNumberMode(10);
        int int38 = tarArchiveOutputStream9.getCount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tarBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 512 + "'", int33 == 512);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        int int10 = tarArchiveOutputStream9.getCount();
        tarArchiveOutputStream9.setLongFileMode((int) (byte) 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) 'a', 2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = tarArchiveOutputStream17.buffer;
        tarArchiveOutputStream17.setLongFileMode(512);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer21 = tarArchiveOutputStream17.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream23.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '52' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tarBuffer18);
        org.junit.Assert.assertNotNull(tarBuffer21);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, 1);
        int int13 = tarArchiveOutputStream10.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = tarArchiveOutputStream10.buffer;
        tarArchiveOutputStream10.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17, 10);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream17.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '10240' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(tarBuffer14);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        int int4 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 10, (int) (byte) 1);
        int int11 = tarArchiveOutputStream10.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = tarArchiveOutputStream10.canWriteEntryData(archiveEntry12);
        int int14 = tarArchiveOutputStream10.getCount();
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        int int10 = tarArchiveOutputStream9.getCount();
        tarArchiveOutputStream9.setLongFileMode((int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 100, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = tarArchiveOutputStream18.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream18.canWriteEntryData(archiveEntry20);
        java.io.File file22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = tarArchiveOutputStream18.createArchiveEntry(file22, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(tarBuffer19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        int int20 = tarArchiveOutputStream9.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = null;
        boolean boolean22 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry21);
        int int23 = tarArchiveOutputStream9.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer24 = tarArchiveOutputStream9.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        int int26 = tarArchiveOutputStream25.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream25.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(tarBuffer24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        int int10 = tarArchiveOutputStream9.getCount();
        tarArchiveOutputStream9.setLongFileMode((int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.writePaxHeaders("hi!", strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        tarArchiveOutputStream9.setBigNumberMode(0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 3, 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        int int10 = tarArchiveOutputStream1.getCount();
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11);
        tarArchiveOutputStream12.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream12.canWriteEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream12.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, 100);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer23 = tarArchiveOutputStream22.buffer;
        int int24 = tarArchiveOutputStream22.getRecordSize();
        byte[] byteArray25 = new byte[] {};
        tarArchiveOutputStream22.write(byteArray25);
        tarArchiveOutputStream20.write(byteArray25, 0, (int) (short) 0);
        tarArchiveOutputStream1.write(byteArray25);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 10);
        tarArchiveOutputStream1.setBigNumberMode(32);
        int int35 = tarArchiveOutputStream1.getRecordSize();
        java.io.OutputStream outputStream36 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream36);
        tarArchiveOutputStream37.setAddPaxHeadersForNonAsciiNames(false);
        java.io.OutputStream outputStream40 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream40);
        tarArchiveOutputStream41.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry44 = null;
        boolean boolean45 = tarArchiveOutputStream41.canWriteEntryData(archiveEntry44);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry46 = null;
        boolean boolean47 = tarArchiveOutputStream41.canWriteEntryData(archiveEntry46);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream41, 100);
        java.io.OutputStream outputStream50 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream50);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer52 = tarArchiveOutputStream51.buffer;
        int int53 = tarArchiveOutputStream51.getRecordSize();
        byte[] byteArray54 = new byte[] {};
        tarArchiveOutputStream51.write(byteArray54);
        tarArchiveOutputStream41.write(byteArray54);
        tarArchiveOutputStream37.write(byteArray54);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.write(byteArray54, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '32' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tarBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 512 + "'", int35 == 512);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tarBuffer52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 512 + "'", int53 == 512);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = tarArchiveOutputStream1.buffer;
        int int5 = tarArchiveOutputStream1.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(tarBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, 1);
        tarArchiveOutputStream12.setBigNumberMode((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7);
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry11);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream16.canWriteEntryData(archiveEntry17);
        tarArchiveOutputStream16.setBigNumberMode(2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21);
        tarArchiveOutputStream22.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = null;
        boolean boolean26 = tarArchiveOutputStream22.canWriteEntryData(archiveEntry25);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = null;
        boolean boolean28 = tarArchiveOutputStream22.canWriteEntryData(archiveEntry27);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, 100);
        java.io.OutputStream outputStream31 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream31);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer33 = tarArchiveOutputStream32.buffer;
        int int34 = tarArchiveOutputStream32.getRecordSize();
        byte[] byteArray35 = new byte[] {};
        tarArchiveOutputStream32.write(byteArray35);
        tarArchiveOutputStream22.write(byteArray35);
        tarArchiveOutputStream16.write(byteArray35);
        tarArchiveOutputStream1.write(byteArray35);
        tarArchiveOutputStream1.setLongFileMode((int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        tarArchiveOutputStream42.setBigNumberMode((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tarBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream8);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = tarArchiveOutputStream17.canWriteEntryData(archiveEntry18);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream17.write(byteArray24, 100, (int) (byte) 0);
        tarArchiveOutputStream17.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream17.setLongFileMode((int) (short) 100);
        java.io.OutputStream outputStream32 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream32);
        tarArchiveOutputStream33.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = null;
        boolean boolean37 = tarArchiveOutputStream33.canWriteEntryData(archiveEntry36);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry38 = null;
        boolean boolean39 = tarArchiveOutputStream33.canWriteEntryData(archiveEntry38);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream33, 100);
        java.io.OutputStream outputStream42 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream42);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer44 = tarArchiveOutputStream43.buffer;
        int int45 = tarArchiveOutputStream43.getRecordSize();
        byte[] byteArray46 = new byte[] {};
        tarArchiveOutputStream43.write(byteArray46);
        tarArchiveOutputStream41.write(byteArray46, 0, (int) (short) 0);
        tarArchiveOutputStream17.write(byteArray46);
        tarArchiveOutputStream1.write(byteArray46);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream55 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(tarBuffer44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 512 + "'", int45 == 512);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 10);
        int int11 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 10, (int) (short) 10);
        tarArchiveOutputStream1.setBigNumberMode((int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.putArchiveEntry(archiveEntry20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 1, (int) (byte) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        java.lang.Class<?> wildcardClass8 = tarArchiveOutputStream6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        int int10 = tarArchiveOutputStream9.getCount();
        tarArchiveOutputStream9.setLongFileMode((int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 100, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(true);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        int int11 = tarArchiveOutputStream10.getCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        long long4 = tarArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 512);
        int int7 = tarArchiveOutputStream6.getCount();
        int int8 = tarArchiveOutputStream6.getCount();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream11.buffer;
        int int13 = tarArchiveOutputStream11.getRecordSize();
        byte[] byteArray14 = new byte[] {};
        tarArchiveOutputStream11.write(byteArray14);
        tarArchiveOutputStream1.write(byteArray14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        int int18 = tarArchiveOutputStream1.getRecordSize();
        int int19 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream20.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream9.setLongFileMode((int) (short) 100);
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24);
        tarArchiveOutputStream25.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = tarArchiveOutputStream25.canWriteEntryData(archiveEntry28);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = tarArchiveOutputStream25.canWriteEntryData(archiveEntry30);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25, 100);
        java.io.OutputStream outputStream34 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream34);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer36 = tarArchiveOutputStream35.buffer;
        int int37 = tarArchiveOutputStream35.getRecordSize();
        byte[] byteArray38 = new byte[] {};
        tarArchiveOutputStream35.write(byteArray38);
        tarArchiveOutputStream33.write(byteArray38, 0, (int) (short) 0);
        tarArchiveOutputStream9.write(byteArray38);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(true);
        int int46 = tarArchiveOutputStream9.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry47 = null;
        boolean boolean48 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry47);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tarBuffer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 512 + "'", int37 == 512);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 512 + "'", int46 == 512);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        long long7 = tarArchiveOutputStream1.getBytesWritten();
        int int8 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 1, 100);
        tarArchiveOutputStream11.setLongFileMode(100);
        tarArchiveOutputStream11.setLongFileMode((int) (short) 0);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16);
        tarArchiveOutputStream17.setAddPaxHeadersForNonAsciiNames(false);
        int int20 = tarArchiveOutputStream17.getRecordSize();
        tarArchiveOutputStream17.setAddPaxHeadersForNonAsciiNames(true);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23);
        tarArchiveOutputStream24.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = null;
        boolean boolean28 = tarArchiveOutputStream24.canWriteEntryData(archiveEntry27);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = null;
        boolean boolean30 = tarArchiveOutputStream24.canWriteEntryData(archiveEntry29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream24, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        boolean boolean34 = tarArchiveOutputStream32.canWriteEntryData(archiveEntry33);
        tarArchiveOutputStream32.setBigNumberMode(2);
        java.io.OutputStream outputStream37 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream37);
        tarArchiveOutputStream38.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry41 = null;
        boolean boolean42 = tarArchiveOutputStream38.canWriteEntryData(archiveEntry41);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry43 = null;
        boolean boolean44 = tarArchiveOutputStream38.canWriteEntryData(archiveEntry43);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream38, 100);
        java.io.OutputStream outputStream47 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream47);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer49 = tarArchiveOutputStream48.buffer;
        int int50 = tarArchiveOutputStream48.getRecordSize();
        byte[] byteArray51 = new byte[] {};
        tarArchiveOutputStream48.write(byteArray51);
        tarArchiveOutputStream38.write(byteArray51);
        tarArchiveOutputStream32.write(byteArray51);
        tarArchiveOutputStream17.write(byteArray51);
        tarArchiveOutputStream11.write(byteArray51);
        byte[] byteArray57 = null;
        tarArchiveOutputStream11.write(byteArray57, 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream62 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tarBuffer49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 512 + "'", int50 == 512);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        tarArchiveOutputStream1.setBigNumberMode((int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 97, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        tarArchiveOutputStream9.setBigNumberMode(2);
        long long14 = tarArchiveOutputStream9.getBytesWritten();
        int int15 = tarArchiveOutputStream9.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18);
        tarArchiveOutputStream19.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = tarArchiveOutputStream19.canWriteEntryData(archiveEntry22);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        boolean boolean25 = tarArchiveOutputStream19.canWriteEntryData(archiveEntry24);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19, 100);
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer30 = tarArchiveOutputStream29.buffer;
        int int31 = tarArchiveOutputStream29.getRecordSize();
        byte[] byteArray32 = new byte[] {};
        tarArchiveOutputStream29.write(byteArray32);
        tarArchiveOutputStream19.write(byteArray32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream35, 0);
        java.io.OutputStream outputStream38 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream38);
        tarArchiveOutputStream39.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry42 = null;
        boolean boolean43 = tarArchiveOutputStream39.canWriteEntryData(archiveEntry42);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry44 = null;
        boolean boolean45 = tarArchiveOutputStream39.canWriteEntryData(archiveEntry44);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream39, 100);
        java.io.OutputStream outputStream48 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream48);
        tarArchiveOutputStream49.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry52 = null;
        boolean boolean53 = tarArchiveOutputStream49.canWriteEntryData(archiveEntry52);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry54 = null;
        boolean boolean55 = tarArchiveOutputStream49.canWriteEntryData(archiveEntry54);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream49, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry58 = null;
        boolean boolean59 = tarArchiveOutputStream57.canWriteEntryData(archiveEntry58);
        tarArchiveOutputStream57.setBigNumberMode(2);
        java.io.OutputStream outputStream62 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream63 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream62);
        tarArchiveOutputStream63.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry66 = null;
        boolean boolean67 = tarArchiveOutputStream63.canWriteEntryData(archiveEntry66);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry68 = null;
        boolean boolean69 = tarArchiveOutputStream63.canWriteEntryData(archiveEntry68);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream71 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream63, 100);
        java.io.OutputStream outputStream72 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream73 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream72);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer74 = tarArchiveOutputStream73.buffer;
        int int75 = tarArchiveOutputStream73.getRecordSize();
        byte[] byteArray76 = new byte[] {};
        tarArchiveOutputStream73.write(byteArray76);
        tarArchiveOutputStream63.write(byteArray76);
        tarArchiveOutputStream57.write(byteArray76);
        tarArchiveOutputStream39.write(byteArray76);
        tarArchiveOutputStream37.write(byteArray76, (int) (byte) -1, (int) (byte) 0);
        tarArchiveOutputStream17.write(byteArray76);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tarBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(tarBuffer74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 512 + "'", int75 == 512);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] {});
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream11.buffer;
        int int13 = tarArchiveOutputStream11.getRecordSize();
        byte[] byteArray14 = new byte[] {};
        tarArchiveOutputStream11.write(byteArray14);
        tarArchiveOutputStream1.write(byteArray14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 3, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 10);
        tarArchiveOutputStream22.setAddPaxHeadersForNonAsciiNames(true);
        java.lang.Class<?> wildcardClass25 = tarArchiveOutputStream22.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream9.buffer;
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13);
        tarArchiveOutputStream14.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry19);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, 100);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = tarArchiveOutputStream24.buffer;
        int int26 = tarArchiveOutputStream24.getRecordSize();
        byte[] byteArray27 = new byte[] {};
        tarArchiveOutputStream24.write(byteArray27);
        tarArchiveOutputStream22.write(byteArray27, 0, (int) (short) 0);
        tarArchiveOutputStream9.write(byteArray27);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        int int34 = tarArchiveOutputStream9.getRecordSize();
        tarArchiveOutputStream9.setLongFileMode((int) (byte) -1);
        int int37 = tarArchiveOutputStream9.getRecordSize();
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        long long40 = tarArchiveOutputStream9.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry41 = null;
        boolean boolean42 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry41);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tarBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 512 + "'", int37 == 512);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        long long7 = tarArchiveOutputStream1.getBytesWritten();
        int int8 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 1, 100);
        int int12 = tarArchiveOutputStream11.getCount();
        long long13 = tarArchiveOutputStream11.getBytesWritten();
        tarArchiveOutputStream11.setBigNumberMode(10);
        int int16 = tarArchiveOutputStream11.getCount();
        long long17 = tarArchiveOutputStream11.getBytesWritten();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream11.writePaxHeaders("", strMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9);
        tarArchiveOutputStream10.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream10.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream10.canWriteEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = tarArchiveOutputStream18.canWriteEntryData(archiveEntry19);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer21 = tarArchiveOutputStream18.buffer;
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22);
        tarArchiveOutputStream23.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = null;
        boolean boolean27 = tarArchiveOutputStream23.canWriteEntryData(archiveEntry26);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = tarArchiveOutputStream23.canWriteEntryData(archiveEntry28);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 100);
        java.io.OutputStream outputStream32 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream32);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer34 = tarArchiveOutputStream33.buffer;
        int int35 = tarArchiveOutputStream33.getRecordSize();
        byte[] byteArray36 = new byte[] {};
        tarArchiveOutputStream33.write(byteArray36);
        tarArchiveOutputStream31.write(byteArray36, 0, (int) (short) 0);
        tarArchiveOutputStream18.write(byteArray36);
        tarArchiveOutputStream1.write(byteArray36, (int) '4', (int) (short) -1);
        tarArchiveOutputStream1.setLongFileMode(97);
        java.io.File file47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry49 = tarArchiveOutputStream1.createArchiveEntry(file47, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tarBuffer21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tarBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 512 + "'", int35 == 512);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        int int11 = tarArchiveOutputStream9.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        tarArchiveOutputStream9.setBigNumberMode((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '100' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        long long9 = tarArchiveOutputStream8.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        long long11 = tarArchiveOutputStream8.getBytesWritten();
        long long12 = tarArchiveOutputStream8.getBytesWritten();
        int int13 = tarArchiveOutputStream8.getCount();
        long long14 = tarArchiveOutputStream8.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '10240' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, (int) '4', 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        long long8 = tarArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream12.putArchiveEntry(archiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        int int6 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setLongFileMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) ' ', 32);
        tarArchiveOutputStream1.setBigNumberMode(512);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9);
        tarArchiveOutputStream10.setAddPaxHeadersForNonAsciiNames(false);
        int int13 = tarArchiveOutputStream10.getRecordSize();
        tarArchiveOutputStream10.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, (int) '#', 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18, 10, (int) (short) 1);
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22);
        tarArchiveOutputStream23.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = null;
        boolean boolean27 = tarArchiveOutputStream23.canWriteEntryData(archiveEntry26);
        tarArchiveOutputStream23.setBigNumberMode(2);
        int int30 = tarArchiveOutputStream23.getCount();
        tarArchiveOutputStream23.setBigNumberMode((int) (short) -1);
        java.io.OutputStream outputStream33 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream33);
        tarArchiveOutputStream34.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = null;
        boolean boolean38 = tarArchiveOutputStream34.canWriteEntryData(archiveEntry37);
        tarArchiveOutputStream34.setBigNumberMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream34);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream34, 100);
        java.io.OutputStream outputStream44 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream44);
        tarArchiveOutputStream45.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry48 = null;
        boolean boolean49 = tarArchiveOutputStream45.canWriteEntryData(archiveEntry48);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry50 = null;
        boolean boolean51 = tarArchiveOutputStream45.canWriteEntryData(archiveEntry50);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream45, 100);
        java.io.OutputStream outputStream54 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream55 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream54);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer56 = tarArchiveOutputStream55.buffer;
        int int57 = tarArchiveOutputStream55.getRecordSize();
        byte[] byteArray58 = new byte[] {};
        tarArchiveOutputStream55.write(byteArray58);
        tarArchiveOutputStream53.write(byteArray58, 0, (int) (short) 0);
        tarArchiveOutputStream34.write(byteArray58, (int) (byte) 10, (int) (short) -1);
        tarArchiveOutputStream23.write(byteArray58);
        tarArchiveOutputStream18.write(byteArray58);
        tarArchiveOutputStream1.write(byteArray58);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(tarBuffer56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 512 + "'", int57 == 512);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7);
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry11);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream16.canWriteEntryData(archiveEntry17);
        tarArchiveOutputStream16.setBigNumberMode(2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21);
        tarArchiveOutputStream22.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = null;
        boolean boolean26 = tarArchiveOutputStream22.canWriteEntryData(archiveEntry25);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = null;
        boolean boolean28 = tarArchiveOutputStream22.canWriteEntryData(archiveEntry27);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, 100);
        java.io.OutputStream outputStream31 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream31);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer33 = tarArchiveOutputStream32.buffer;
        int int34 = tarArchiveOutputStream32.getRecordSize();
        byte[] byteArray35 = new byte[] {};
        tarArchiveOutputStream32.write(byteArray35);
        tarArchiveOutputStream22.write(byteArray35);
        tarArchiveOutputStream16.write(byteArray35);
        tarArchiveOutputStream1.write(byteArray35);
        tarArchiveOutputStream1.setLongFileMode((int) (byte) 100);
        tarArchiveOutputStream1.setLongFileMode(0);
        int int44 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tarBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 512 + "'", int44 == 512);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 52);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        long long9 = tarArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.write(10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2);
        tarArchiveOutputStream3.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream3.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = tarArchiveOutputStream3.canWriteEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, 100);
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream12);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = tarArchiveOutputStream13.buffer;
        int int15 = tarArchiveOutputStream13.getRecordSize();
        byte[] byteArray16 = new byte[] {};
        tarArchiveOutputStream13.write(byteArray16);
        tarArchiveOutputStream11.write(byteArray16, 0, (int) (short) 0);
        tarArchiveOutputStream1.write(byteArray16);
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer24 = tarArchiveOutputStream23.buffer;
        int int25 = tarArchiveOutputStream23.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream23.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer27 = tarArchiveOutputStream23.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = tarArchiveOutputStream23.canWriteEntryData(archiveEntry28);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, (int) (byte) 0, (int) (byte) 10);
        byte[] byteArray33 = null;
        tarArchiveOutputStream32.write(byteArray33, (int) (byte) 1, 0);
        java.io.OutputStream outputStream37 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream37);
        tarArchiveOutputStream38.setAddPaxHeadersForNonAsciiNames(false);
        int int41 = tarArchiveOutputStream38.getRecordSize();
        tarArchiveOutputStream38.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream38, (int) '#', 100);
        java.io.OutputStream outputStream47 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream47);
        tarArchiveOutputStream48.setAddPaxHeadersForNonAsciiNames(false);
        int int51 = tarArchiveOutputStream48.getRecordSize();
        java.io.OutputStream outputStream52 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream52);
        tarArchiveOutputStream53.setAddPaxHeadersForNonAsciiNames(false);
        java.io.OutputStream outputStream56 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream56);
        tarArchiveOutputStream57.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry60 = null;
        boolean boolean61 = tarArchiveOutputStream57.canWriteEntryData(archiveEntry60);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry62 = null;
        boolean boolean63 = tarArchiveOutputStream57.canWriteEntryData(archiveEntry62);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream65 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream57, 100);
        java.io.OutputStream outputStream66 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream67 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream66);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer68 = tarArchiveOutputStream67.buffer;
        int int69 = tarArchiveOutputStream67.getRecordSize();
        byte[] byteArray70 = new byte[] {};
        tarArchiveOutputStream67.write(byteArray70);
        tarArchiveOutputStream57.write(byteArray70);
        tarArchiveOutputStream53.write(byteArray70);
        tarArchiveOutputStream48.write(byteArray70);
        tarArchiveOutputStream46.write(byteArray70, (int) (byte) 0, (int) (byte) -1);
        tarArchiveOutputStream32.write(byteArray70);
        tarArchiveOutputStream1.write(byteArray70);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        int int82 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setLongFileMode((int) (byte) 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry85 = null;
        boolean boolean86 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry85);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tarBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertNotNull(tarBuffer26);
        org.junit.Assert.assertNotNull(tarBuffer27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 512 + "'", int41 == 512);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 512 + "'", int51 == 512);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(tarBuffer68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 512 + "'", int69 == 512);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] {});
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 512 + "'", int82 == 512);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        long long7 = tarArchiveOutputStream1.getBytesWritten();
        int int8 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 1, 100);
        tarArchiveOutputStream11.setLongFileMode(100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, (int) '#', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream16.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        byte[] byteArray4 = new byte[] {};
        tarArchiveOutputStream1.write(byteArray4);
        int int6 = tarArchiveOutputStream1.getRecordSize();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7);
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(false);
        int int11 = tarArchiveOutputStream8.getRecordSize();
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(true);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14);
        tarArchiveOutputStream15.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry18);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        boolean boolean25 = tarArchiveOutputStream23.canWriteEntryData(archiveEntry24);
        tarArchiveOutputStream23.setBigNumberMode(2);
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28);
        tarArchiveOutputStream29.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = tarArchiveOutputStream29.canWriteEntryData(archiveEntry32);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = null;
        boolean boolean35 = tarArchiveOutputStream29.canWriteEntryData(archiveEntry34);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream29, 100);
        java.io.OutputStream outputStream38 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream38);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer40 = tarArchiveOutputStream39.buffer;
        int int41 = tarArchiveOutputStream39.getRecordSize();
        byte[] byteArray42 = new byte[] {};
        tarArchiveOutputStream39.write(byteArray42);
        tarArchiveOutputStream29.write(byteArray42);
        tarArchiveOutputStream23.write(byteArray42);
        tarArchiveOutputStream8.write(byteArray42);
        tarArchiveOutputStream1.write(byteArray42);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer51 = tarArchiveOutputStream50.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream50);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream52);
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(tarBuffer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 512 + "'", int41 == 512);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer51);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry9);
        tarArchiveOutputStream1.setBigNumberMode((int) (byte) -1);
        int int13 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.putArchiveEntry(archiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        int int10 = tarArchiveOutputStream1.getCount();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.write((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        tarArchiveOutputStream9.setBigNumberMode(0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) ' ', 3);
        tarArchiveOutputStream9.setBigNumberMode((int) 'a');
        byte[] byteArray17 = null;
        tarArchiveOutputStream9.write(byteArray17, 512, (int) (byte) -1);
        tarArchiveOutputStream9.setBigNumberMode((int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        java.lang.Class<?> wildcardClass24 = tarArchiveOutputStream23.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        byte[] byteArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.write(byteArray8, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(tarBuffer4);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream1.buffer;
        long long10 = tarArchiveOutputStream1.getBytesWritten();
        tarArchiveOutputStream1.setBigNumberMode(0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 0, (int) (byte) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        tarArchiveOutputStream11.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = tarArchiveOutputStream11.canWriteEntryData(archiveEntry14);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16);
        tarArchiveOutputStream17.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream17.canWriteEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = tarArchiveOutputStream17.canWriteEntryData(archiveEntry22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17, 100);
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream26);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer28 = tarArchiveOutputStream27.buffer;
        int int29 = tarArchiveOutputStream27.getRecordSize();
        byte[] byteArray30 = new byte[] {};
        tarArchiveOutputStream27.write(byteArray30);
        tarArchiveOutputStream17.write(byteArray30);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17, 3, (int) 'a');
        java.io.OutputStream outputStream37 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream37);
        tarArchiveOutputStream38.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry41 = null;
        boolean boolean42 = tarArchiveOutputStream38.canWriteEntryData(archiveEntry41);
        tarArchiveOutputStream38.setBigNumberMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream38);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream38, 100);
        java.io.OutputStream outputStream48 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream48);
        tarArchiveOutputStream49.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry52 = null;
        boolean boolean53 = tarArchiveOutputStream49.canWriteEntryData(archiveEntry52);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry54 = null;
        boolean boolean55 = tarArchiveOutputStream49.canWriteEntryData(archiveEntry54);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream49, 100);
        java.io.OutputStream outputStream58 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream58);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer60 = tarArchiveOutputStream59.buffer;
        int int61 = tarArchiveOutputStream59.getRecordSize();
        byte[] byteArray62 = new byte[] {};
        tarArchiveOutputStream59.write(byteArray62);
        tarArchiveOutputStream57.write(byteArray62, 0, (int) (short) 0);
        tarArchiveOutputStream38.write(byteArray62, (int) (byte) 10, (int) (short) -1);
        tarArchiveOutputStream36.write(byteArray62);
        tarArchiveOutputStream11.write(byteArray62);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream11.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '10240' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(tarBuffer4);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tarBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(tarBuffer60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 512 + "'", int61 == 512);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] {});
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, 1);
        tarArchiveOutputStream10.setLongFileMode((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream10.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        tarArchiveOutputStream1.setBigNumberMode(10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 0);
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11);
        tarArchiveOutputStream12.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream12.canWriteEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream12.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = null;
        boolean boolean22 = tarArchiveOutputStream20.canWriteEntryData(archiveEntry21);
        tarArchiveOutputStream20.setBigNumberMode(2);
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream25);
        tarArchiveOutputStream26.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = null;
        boolean boolean30 = tarArchiveOutputStream26.canWriteEntryData(archiveEntry29);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = tarArchiveOutputStream26.canWriteEntryData(archiveEntry31);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream26, 100);
        java.io.OutputStream outputStream35 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream35);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer37 = tarArchiveOutputStream36.buffer;
        int int38 = tarArchiveOutputStream36.getRecordSize();
        byte[] byteArray39 = new byte[] {};
        tarArchiveOutputStream36.write(byteArray39);
        tarArchiveOutputStream26.write(byteArray39);
        tarArchiveOutputStream20.write(byteArray39);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry43 = null;
        boolean boolean44 = tarArchiveOutputStream20.canWriteEntryData(archiveEntry43);
        java.io.OutputStream outputStream45 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream45);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer47 = tarArchiveOutputStream46.buffer;
        int int48 = tarArchiveOutputStream46.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer49 = tarArchiveOutputStream46.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer50 = tarArchiveOutputStream46.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry51 = null;
        boolean boolean52 = tarArchiveOutputStream46.canWriteEntryData(archiveEntry51);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream55 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream46, (int) (byte) 0, (int) (byte) 10);
        java.io.OutputStream outputStream56 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream56);
        tarArchiveOutputStream57.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry60 = null;
        boolean boolean61 = tarArchiveOutputStream57.canWriteEntryData(archiveEntry60);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry62 = null;
        boolean boolean63 = tarArchiveOutputStream57.canWriteEntryData(archiveEntry62);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream65 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream57, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry66 = null;
        boolean boolean67 = tarArchiveOutputStream65.canWriteEntryData(archiveEntry66);
        tarArchiveOutputStream65.setBigNumberMode(2);
        java.io.OutputStream outputStream70 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream71 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream70);
        tarArchiveOutputStream71.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry74 = null;
        boolean boolean75 = tarArchiveOutputStream71.canWriteEntryData(archiveEntry74);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry76 = null;
        boolean boolean77 = tarArchiveOutputStream71.canWriteEntryData(archiveEntry76);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream79 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream71, 100);
        java.io.OutputStream outputStream80 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream81 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream80);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer82 = tarArchiveOutputStream81.buffer;
        int int83 = tarArchiveOutputStream81.getRecordSize();
        byte[] byteArray84 = new byte[] {};
        tarArchiveOutputStream81.write(byteArray84);
        tarArchiveOutputStream71.write(byteArray84);
        tarArchiveOutputStream65.write(byteArray84);
        tarArchiveOutputStream55.write(byteArray84, (int) (short) 0, (int) (short) -1);
        tarArchiveOutputStream20.write(byteArray84, (int) (short) 0, (int) (short) 0);
        tarArchiveOutputStream1.write(byteArray84);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream95 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream97 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tarBuffer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 512 + "'", int38 == 512);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tarBuffer47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 512 + "'", int48 == 512);
        org.junit.Assert.assertNotNull(tarBuffer49);
        org.junit.Assert.assertNotNull(tarBuffer50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(tarBuffer82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 512 + "'", int83 == 512);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] {});
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        long long8 = tarArchiveOutputStream1.getBytesWritten();
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        tarArchiveOutputStream1.setLongFileMode(1);
        int int13 = tarArchiveOutputStream1.getRecordSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream9.setLongFileMode((int) (short) 100);
        tarArchiveOutputStream9.setBigNumberMode(100);
        long long26 = tarArchiveOutputStream9.getBytesWritten();
        int int27 = tarArchiveOutputStream9.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 2, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32, 32, 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 10);
        tarArchiveOutputStream1.setBigNumberMode(0);
        long long13 = tarArchiveOutputStream1.getBytesWritten();
        tarArchiveOutputStream1.setLongFileMode(512);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry16);
        int int18 = tarArchiveOutputStream1.getRecordSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream11.buffer;
        int int13 = tarArchiveOutputStream11.getRecordSize();
        byte[] byteArray14 = new byte[] {};
        tarArchiveOutputStream11.write(byteArray14);
        tarArchiveOutputStream1.write(byteArray14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = tarArchiveOutputStream17.buffer;
        int int19 = tarArchiveOutputStream17.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream17.canWriteEntryData(archiveEntry20);
        tarArchiveOutputStream17.setLongFileMode((int) '#');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        boolean boolean25 = tarArchiveOutputStream17.canWriteEntryData(archiveEntry24);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17);
        tarArchiveOutputStream17.setBigNumberMode(2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        int int6 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream1.buffer;
        int int8 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) '4', (int) ' ');
        long long12 = tarArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        long long4 = tarArchiveOutputStream1.getBytesWritten();
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream8);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 100);
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer20 = tarArchiveOutputStream19.buffer;
        int int21 = tarArchiveOutputStream19.getRecordSize();
        byte[] byteArray22 = new byte[] {};
        tarArchiveOutputStream19.write(byteArray22);
        tarArchiveOutputStream9.write(byteArray22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 3, (int) 'a');
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream29);
        tarArchiveOutputStream30.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        boolean boolean34 = tarArchiveOutputStream30.canWriteEntryData(archiveEntry33);
        tarArchiveOutputStream30.setBigNumberMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream30);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream30, 100);
        java.io.OutputStream outputStream40 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream40);
        tarArchiveOutputStream41.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry44 = null;
        boolean boolean45 = tarArchiveOutputStream41.canWriteEntryData(archiveEntry44);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry46 = null;
        boolean boolean47 = tarArchiveOutputStream41.canWriteEntryData(archiveEntry46);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream41, 100);
        java.io.OutputStream outputStream50 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream50);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer52 = tarArchiveOutputStream51.buffer;
        int int53 = tarArchiveOutputStream51.getRecordSize();
        byte[] byteArray54 = new byte[] {};
        tarArchiveOutputStream51.write(byteArray54);
        tarArchiveOutputStream49.write(byteArray54, 0, (int) (short) 0);
        tarArchiveOutputStream30.write(byteArray54, (int) (byte) 10, (int) (short) -1);
        tarArchiveOutputStream28.write(byteArray54);
        tarArchiveOutputStream7.write(byteArray54);
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tarBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tarBuffer52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 512 + "'", int53 == 512);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        int int4 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream8.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream15);
        tarArchiveOutputStream16.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = tarArchiveOutputStream16.canWriteEntryData(archiveEntry19);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = null;
        boolean boolean22 = tarArchiveOutputStream16.canWriteEntryData(archiveEntry21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16, 100);
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream25);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer27 = tarArchiveOutputStream26.buffer;
        int int28 = tarArchiveOutputStream26.getRecordSize();
        byte[] byteArray29 = new byte[] {};
        tarArchiveOutputStream26.write(byteArray29);
        tarArchiveOutputStream24.write(byteArray29, 0, (int) (short) 0);
        tarArchiveOutputStream14.write(byteArray29);
        tarArchiveOutputStream12.write(byteArray29);
        tarArchiveOutputStream1.write(byteArray29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        int int38 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer39 = tarArchiveOutputStream1.buffer;
        tarArchiveOutputStream1.setLongFileMode((int) (short) 100);
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tarBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(tarBuffer39);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        int int4 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream7.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = tarArchiveOutputStream7.canWriteEntryData(archiveEntry9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7);
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream12);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14);
        tarArchiveOutputStream15.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry18);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 100);
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream25.buffer;
        int int27 = tarArchiveOutputStream25.getRecordSize();
        byte[] byteArray28 = new byte[] {};
        tarArchiveOutputStream25.write(byteArray28);
        tarArchiveOutputStream23.write(byteArray28, 0, (int) (short) 0);
        tarArchiveOutputStream13.write(byteArray28);
        tarArchiveOutputStream11.write(byteArray28);
        tarArchiveOutputStream5.write(byteArray28);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, (int) (byte) 0, (int) (byte) 1);
        tarArchiveOutputStream38.setBigNumberMode((int) (short) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry41 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream38.putArchiveEntry(archiveEntry41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tarBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 10);
        long long11 = tarArchiveOutputStream10.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream10.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, 3);
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = tarArchiveOutputStream14.createArchiveEntry(file15, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(tarBuffer12);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7);
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry11);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, 100);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream17);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = tarArchiveOutputStream18.buffer;
        int int20 = tarArchiveOutputStream18.getRecordSize();
        byte[] byteArray21 = new byte[] {};
        tarArchiveOutputStream18.write(byteArray21);
        tarArchiveOutputStream8.write(byteArray21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = tarArchiveOutputStream24.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream24.buffer;
        java.io.OutputStream outputStream27 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream27);
        tarArchiveOutputStream28.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = tarArchiveOutputStream28.canWriteEntryData(archiveEntry31);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        boolean boolean34 = tarArchiveOutputStream28.canWriteEntryData(archiveEntry33);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream28, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = null;
        boolean boolean38 = tarArchiveOutputStream36.canWriteEntryData(archiveEntry37);
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream36.write(byteArray43, 100, (int) (byte) 0);
        tarArchiveOutputStream36.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream36.setLongFileMode((int) (short) 100);
        java.io.OutputStream outputStream51 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream51);
        tarArchiveOutputStream52.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry55 = null;
        boolean boolean56 = tarArchiveOutputStream52.canWriteEntryData(archiveEntry55);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry57 = null;
        boolean boolean58 = tarArchiveOutputStream52.canWriteEntryData(archiveEntry57);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream60 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream52, 100);
        java.io.OutputStream outputStream61 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream62 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream61);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer63 = tarArchiveOutputStream62.buffer;
        int int64 = tarArchiveOutputStream62.getRecordSize();
        byte[] byteArray65 = new byte[] {};
        tarArchiveOutputStream62.write(byteArray65);
        tarArchiveOutputStream60.write(byteArray65, 0, (int) (short) 0);
        tarArchiveOutputStream36.write(byteArray65);
        tarArchiveOutputStream24.write(byteArray65);
        tarArchiveOutputStream1.write(byteArray65);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream74 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 100);
        int int75 = tarArchiveOutputStream74.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer76 = tarArchiveOutputStream74.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream77 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream74);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer78 = tarArchiveOutputStream77.buffer;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream77.write((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tarBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer25);
        org.junit.Assert.assertNotNull(tarBuffer26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(tarBuffer63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 512 + "'", int64 == 512);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 512 + "'", int75 == 512);
        org.junit.Assert.assertNotNull(tarBuffer76);
        org.junit.Assert.assertNotNull(tarBuffer78);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 1, (int) (byte) 10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        tarArchiveOutputStream9.setBigNumberMode(0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (byte) 100);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(true);
        int int17 = tarArchiveOutputStream9.getCount();
        tarArchiveOutputStream9.setLongFileMode((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        long long3 = tarArchiveOutputStream2.getBytesWritten();
        int int4 = tarArchiveOutputStream2.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream8.buffer;
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, (int) (short) 0, (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tarBuffer9);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        long long4 = tarArchiveOutputStream1.getBytesWritten();
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 3, (int) (byte) 100);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = tarArchiveOutputStream1.createArchiveEntry(file11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 512);
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13);
        tarArchiveOutputStream14.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry19);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = null;
        boolean boolean24 = tarArchiveOutputStream22.canWriteEntryData(archiveEntry23);
        tarArchiveOutputStream22.setBigNumberMode(2);
        java.io.OutputStream outputStream27 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream27);
        tarArchiveOutputStream28.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = tarArchiveOutputStream28.canWriteEntryData(archiveEntry31);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        boolean boolean34 = tarArchiveOutputStream28.canWriteEntryData(archiveEntry33);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream28, 100);
        java.io.OutputStream outputStream37 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream37);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer39 = tarArchiveOutputStream38.buffer;
        int int40 = tarArchiveOutputStream38.getRecordSize();
        byte[] byteArray41 = new byte[] {};
        tarArchiveOutputStream38.write(byteArray41);
        tarArchiveOutputStream28.write(byteArray41);
        tarArchiveOutputStream22.write(byteArray41);
        tarArchiveOutputStream1.write(byteArray41);
        tarArchiveOutputStream1.setBigNumberMode(97);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer48 = tarArchiveOutputStream1.buffer;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tarBuffer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 512 + "'", int40 == 512);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer48);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        long long11 = tarArchiveOutputStream10.getBytesWritten();
        int int12 = tarArchiveOutputStream10.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, 512);
        tarArchiveOutputStream14.setBigNumberMode((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        long long6 = tarArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream1.buffer;
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, (int) (byte) 1, 97, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(tarBuffer7);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6);
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream8);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 100);
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer20 = tarArchiveOutputStream19.buffer;
        int int21 = tarArchiveOutputStream19.getRecordSize();
        byte[] byteArray22 = new byte[] {};
        tarArchiveOutputStream19.write(byteArray22);
        tarArchiveOutputStream17.write(byteArray22, 0, (int) (short) 0);
        tarArchiveOutputStream7.write(byteArray22);
        tarArchiveOutputStream5.write(byteArray22);
        int int29 = tarArchiveOutputStream5.getCount();
        tarArchiveOutputStream5.setAddPaxHeadersForNonAsciiNames(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 10, 32, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tarBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = tarArchiveOutputStream2.canWriteEntryData(archiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getCount();
        tarArchiveOutputStream1.setBigNumberMode((int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        int int12 = tarArchiveOutputStream11.getCount();
        tarArchiveOutputStream11.setLongFileMode(52);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream11.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 10);
        long long11 = tarArchiveOutputStream10.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream10.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, 3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, 3, (int) (byte) 10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry18);
        tarArchiveOutputStream14.setBigNumberMode((int) '4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream1.setLongFileMode((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.write((int) '4');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(tarBuffer4);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        int int10 = tarArchiveOutputStream1.getCount();
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11);
        tarArchiveOutputStream12.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream12.canWriteEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream12.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, 100);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer23 = tarArchiveOutputStream22.buffer;
        int int24 = tarArchiveOutputStream22.getRecordSize();
        byte[] byteArray25 = new byte[] {};
        tarArchiveOutputStream22.write(byteArray25);
        tarArchiveOutputStream20.write(byteArray25, 0, (int) (short) 0);
        tarArchiveOutputStream1.write(byteArray25);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 10);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        java.lang.Class<?> wildcardClass35 = tarArchiveOutputStream1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tarBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        long long6 = tarArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream1.buffer;
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertNotNull(tarBuffer10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        tarArchiveOutputStream9.setBigNumberMode(0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream9.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream4);
        tarArchiveOutputStream5.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = tarArchiveOutputStream5.canWriteEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream5.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = tarArchiveOutputStream13.canWriteEntryData(archiveEntry14);
        tarArchiveOutputStream13.setBigNumberMode(2);
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18);
        tarArchiveOutputStream19.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = tarArchiveOutputStream19.canWriteEntryData(archiveEntry22);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        boolean boolean25 = tarArchiveOutputStream19.canWriteEntryData(archiveEntry24);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19, 100);
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer30 = tarArchiveOutputStream29.buffer;
        int int31 = tarArchiveOutputStream29.getRecordSize();
        byte[] byteArray32 = new byte[] {};
        tarArchiveOutputStream29.write(byteArray32);
        tarArchiveOutputStream19.write(byteArray32);
        tarArchiveOutputStream13.write(byteArray32);
        tarArchiveOutputStream1.write(byteArray32);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = null;
        boolean boolean38 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry37);
        java.io.File file39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry41 = tarArchiveOutputStream1.createArchiveEntry(file39, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tarBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 1, (int) (byte) 10);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        int int11 = tarArchiveOutputStream1.getRecordSize();
        int int12 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 0, 3);
        tarArchiveOutputStream17.setBigNumberMode((int) 'a');
        long long20 = tarArchiveOutputStream17.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = null;
        boolean boolean22 = tarArchiveOutputStream17.canWriteEntryData(archiveEntry21);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(tarBuffer13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        long long7 = tarArchiveOutputStream1.getBytesWritten();
        int int8 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 1, 100);
        tarArchiveOutputStream11.setLongFileMode(100);
        tarArchiveOutputStream11.setLongFileMode((int) (short) 0);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16);
        tarArchiveOutputStream17.setAddPaxHeadersForNonAsciiNames(false);
        int int20 = tarArchiveOutputStream17.getRecordSize();
        tarArchiveOutputStream17.setAddPaxHeadersForNonAsciiNames(true);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23);
        tarArchiveOutputStream24.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = null;
        boolean boolean28 = tarArchiveOutputStream24.canWriteEntryData(archiveEntry27);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = null;
        boolean boolean30 = tarArchiveOutputStream24.canWriteEntryData(archiveEntry29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream24, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        boolean boolean34 = tarArchiveOutputStream32.canWriteEntryData(archiveEntry33);
        tarArchiveOutputStream32.setBigNumberMode(2);
        java.io.OutputStream outputStream37 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream37);
        tarArchiveOutputStream38.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry41 = null;
        boolean boolean42 = tarArchiveOutputStream38.canWriteEntryData(archiveEntry41);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry43 = null;
        boolean boolean44 = tarArchiveOutputStream38.canWriteEntryData(archiveEntry43);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream38, 100);
        java.io.OutputStream outputStream47 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream47);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer49 = tarArchiveOutputStream48.buffer;
        int int50 = tarArchiveOutputStream48.getRecordSize();
        byte[] byteArray51 = new byte[] {};
        tarArchiveOutputStream48.write(byteArray51);
        tarArchiveOutputStream38.write(byteArray51);
        tarArchiveOutputStream32.write(byteArray51);
        tarArchiveOutputStream17.write(byteArray51);
        tarArchiveOutputStream11.write(byteArray51);
        tarArchiveOutputStream11.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream62 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream59, (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tarBuffer49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 512 + "'", int50 == 512);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        int int12 = tarArchiveOutputStream9.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7);
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry11);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream16.canWriteEntryData(archiveEntry17);
        tarArchiveOutputStream16.setBigNumberMode(2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21);
        tarArchiveOutputStream22.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = null;
        boolean boolean26 = tarArchiveOutputStream22.canWriteEntryData(archiveEntry25);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = null;
        boolean boolean28 = tarArchiveOutputStream22.canWriteEntryData(archiveEntry27);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, 100);
        java.io.OutputStream outputStream31 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream31);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer33 = tarArchiveOutputStream32.buffer;
        int int34 = tarArchiveOutputStream32.getRecordSize();
        byte[] byteArray35 = new byte[] {};
        tarArchiveOutputStream32.write(byteArray35);
        tarArchiveOutputStream22.write(byteArray35);
        tarArchiveOutputStream16.write(byteArray35);
        tarArchiveOutputStream1.write(byteArray35);
        tarArchiveOutputStream1.setLongFileMode((int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream42);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry44 = null;
        boolean boolean45 = tarArchiveOutputStream42.canWriteEntryData(archiveEntry44);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tarBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        int int10 = tarArchiveOutputStream9.getCount();
        tarArchiveOutputStream9.setLongFileMode((int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 100, (int) (byte) 100);
        tarArchiveOutputStream15.setAddPaxHeadersForNonAsciiNames(true);
        int int18 = tarArchiveOutputStream15.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        int int4 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream1.buffer;
        tarArchiveOutputStream1.setLongFileMode(100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 32, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 512, (int) (short) 1);
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertNotNull(tarBuffer5);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        int int10 = tarArchiveOutputStream9.getCount();
        tarArchiveOutputStream9.setLongFileMode((int) (byte) 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) 'a', 2);
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18);
        tarArchiveOutputStream19.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = tarArchiveOutputStream19.canWriteEntryData(archiveEntry22);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        boolean boolean25 = tarArchiveOutputStream19.canWriteEntryData(archiveEntry24);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19, 100);
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer30 = tarArchiveOutputStream29.buffer;
        int int31 = tarArchiveOutputStream29.getRecordSize();
        byte[] byteArray32 = new byte[] {};
        tarArchiveOutputStream29.write(byteArray32);
        tarArchiveOutputStream19.write(byteArray32);
        java.io.OutputStream outputStream35 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream35);
        tarArchiveOutputStream36.setAddPaxHeadersForNonAsciiNames(false);
        int int39 = tarArchiveOutputStream36.getRecordSize();
        tarArchiveOutputStream36.setAddPaxHeadersForNonAsciiNames(true);
        java.io.OutputStream outputStream42 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream42);
        tarArchiveOutputStream43.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry46 = null;
        boolean boolean47 = tarArchiveOutputStream43.canWriteEntryData(archiveEntry46);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry48 = null;
        boolean boolean49 = tarArchiveOutputStream43.canWriteEntryData(archiveEntry48);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream43, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry52 = null;
        boolean boolean53 = tarArchiveOutputStream51.canWriteEntryData(archiveEntry52);
        tarArchiveOutputStream51.setBigNumberMode(2);
        java.io.OutputStream outputStream56 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream56);
        tarArchiveOutputStream57.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry60 = null;
        boolean boolean61 = tarArchiveOutputStream57.canWriteEntryData(archiveEntry60);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry62 = null;
        boolean boolean63 = tarArchiveOutputStream57.canWriteEntryData(archiveEntry62);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream65 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream57, 100);
        java.io.OutputStream outputStream66 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream67 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream66);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer68 = tarArchiveOutputStream67.buffer;
        int int69 = tarArchiveOutputStream67.getRecordSize();
        byte[] byteArray70 = new byte[] {};
        tarArchiveOutputStream67.write(byteArray70);
        tarArchiveOutputStream57.write(byteArray70);
        tarArchiveOutputStream51.write(byteArray70);
        tarArchiveOutputStream36.write(byteArray70);
        tarArchiveOutputStream19.write(byteArray70);
        tarArchiveOutputStream9.write(byteArray70, (int) ' ', (-1));
        java.lang.Class<?> wildcardClass79 = byteArray70.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tarBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(tarBuffer68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 512 + "'", int69 == 512);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        int int4 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream1.buffer;
        tarArchiveOutputStream1.setLongFileMode(100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 32, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertNotNull(tarBuffer5);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode((int) (byte) 1);
        tarArchiveOutputStream1.setLongFileMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.write((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream9.setLongFileMode((int) (short) 100);
        tarArchiveOutputStream9.setBigNumberMode(100);
        java.util.Map<java.lang.String, java.lang.String> strMap27 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.writePaxHeaders("", strMap27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        tarArchiveOutputStream9.setBigNumberMode(2);
        long long14 = tarArchiveOutputStream9.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (byte) 0);
        tarArchiveOutputStream18.setAddPaxHeadersForNonAsciiNames(true);
        java.lang.Class<?> wildcardClass21 = tarArchiveOutputStream18.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        tarArchiveOutputStream9.setBigNumberMode(2);
        long long14 = tarArchiveOutputStream9.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry15);
        tarArchiveOutputStream9.setLongFileMode(0);
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19);
        tarArchiveOutputStream20.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = null;
        boolean boolean24 = tarArchiveOutputStream20.canWriteEntryData(archiveEntry23);
        int int25 = tarArchiveOutputStream20.getRecordSize();
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream26);
        tarArchiveOutputStream27.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = tarArchiveOutputStream27.canWriteEntryData(archiveEntry30);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = tarArchiveOutputStream27.canWriteEntryData(archiveEntry32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream27, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = null;
        boolean boolean37 = tarArchiveOutputStream35.canWriteEntryData(archiveEntry36);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer38 = tarArchiveOutputStream35.buffer;
        java.io.OutputStream outputStream39 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream39);
        tarArchiveOutputStream40.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry43 = null;
        boolean boolean44 = tarArchiveOutputStream40.canWriteEntryData(archiveEntry43);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry45 = null;
        boolean boolean46 = tarArchiveOutputStream40.canWriteEntryData(archiveEntry45);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream40, 100);
        java.io.OutputStream outputStream49 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream49);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer51 = tarArchiveOutputStream50.buffer;
        int int52 = tarArchiveOutputStream50.getRecordSize();
        byte[] byteArray53 = new byte[] {};
        tarArchiveOutputStream50.write(byteArray53);
        tarArchiveOutputStream48.write(byteArray53, 0, (int) (short) 0);
        tarArchiveOutputStream35.write(byteArray53);
        tarArchiveOutputStream20.write(byteArray53);
        java.io.OutputStream outputStream60 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream60);
        tarArchiveOutputStream61.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry64 = null;
        boolean boolean65 = tarArchiveOutputStream61.canWriteEntryData(archiveEntry64);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry66 = null;
        boolean boolean67 = tarArchiveOutputStream61.canWriteEntryData(archiveEntry66);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream69 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream61, 100);
        java.io.OutputStream outputStream70 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream71 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream70);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer72 = tarArchiveOutputStream71.buffer;
        int int73 = tarArchiveOutputStream71.getRecordSize();
        byte[] byteArray74 = new byte[] {};
        tarArchiveOutputStream71.write(byteArray74);
        tarArchiveOutputStream61.write(byteArray74);
        tarArchiveOutputStream20.write(byteArray74, (int) (byte) -1, 0);
        tarArchiveOutputStream9.write(byteArray74);
        tarArchiveOutputStream9.setLongFileMode(10);
        int int83 = tarArchiveOutputStream9.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream85 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 100);
        int int86 = tarArchiveOutputStream85.getRecordSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(tarBuffer38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(tarBuffer51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 512 + "'", int52 == 512);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(tarBuffer72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 512 + "'", int73 == 512);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 512 + "'", int83 == 512);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 512 + "'", int86 == 512);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        int int10 = tarArchiveOutputStream9.getCount();
        tarArchiveOutputStream9.setLongFileMode((int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 100, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 3, 100);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer21 = tarArchiveOutputStream9.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer22 = tarArchiveOutputStream9.buffer;
        int int23 = tarArchiveOutputStream9.getRecordSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(tarBuffer21);
        org.junit.Assert.assertNotNull(tarBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream9.setLongFileMode((int) (short) 100);
        tarArchiveOutputStream9.setBigNumberMode(100);
        long long26 = tarArchiveOutputStream9.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer27 = tarArchiveOutputStream9.buffer;
        tarArchiveOutputStream9.setBigNumberMode(1);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer32 = tarArchiveOutputStream9.buffer;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(tarBuffer27);
        org.junit.Assert.assertNotNull(tarBuffer32);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, (int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream11.buffer;
        int int13 = tarArchiveOutputStream11.getRecordSize();
        byte[] byteArray14 = new byte[] {};
        tarArchiveOutputStream11.write(byteArray14);
        tarArchiveOutputStream1.write(byteArray14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 3, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 10);
        int int23 = tarArchiveOutputStream22.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, 2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream25.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        long long11 = tarArchiveOutputStream10.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream9.setLongFileMode((int) (short) 100);
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24);
        tarArchiveOutputStream25.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = tarArchiveOutputStream25.canWriteEntryData(archiveEntry28);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = tarArchiveOutputStream25.canWriteEntryData(archiveEntry30);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25, 100);
        java.io.OutputStream outputStream34 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream34);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer36 = tarArchiveOutputStream35.buffer;
        int int37 = tarArchiveOutputStream35.getRecordSize();
        byte[] byteArray38 = new byte[] {};
        tarArchiveOutputStream35.write(byteArray38);
        tarArchiveOutputStream33.write(byteArray38, 0, (int) (short) 0);
        tarArchiveOutputStream9.write(byteArray38);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(true);
        int int46 = tarArchiveOutputStream9.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 3);
        java.io.File file50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry52 = tarArchiveOutputStream9.createArchiveEntry(file50, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tarBuffer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 512 + "'", int37 == 512);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        tarArchiveOutputStream9.setBigNumberMode(0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (byte) 100);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream15);
        tarArchiveOutputStream16.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = tarArchiveOutputStream16.canWriteEntryData(archiveEntry19);
        tarArchiveOutputStream16.setBigNumberMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16, 100);
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream26);
        tarArchiveOutputStream27.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = tarArchiveOutputStream27.canWriteEntryData(archiveEntry30);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = tarArchiveOutputStream27.canWriteEntryData(archiveEntry32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream27, 100);
        java.io.OutputStream outputStream36 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream36);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer38 = tarArchiveOutputStream37.buffer;
        int int39 = tarArchiveOutputStream37.getRecordSize();
        byte[] byteArray40 = new byte[] {};
        tarArchiveOutputStream37.write(byteArray40);
        tarArchiveOutputStream35.write(byteArray40, 0, (int) (short) 0);
        tarArchiveOutputStream16.write(byteArray40, (int) (byte) 10, (int) (short) -1);
        tarArchiveOutputStream14.write(byteArray40);
        int int49 = tarArchiveOutputStream14.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tarBuffer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        long long3 = tarArchiveOutputStream2.getBytesWritten();
        int int4 = tarArchiveOutputStream2.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 2, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, 2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream7.canWriteEntryData(archiveEntry10);
        int int12 = tarArchiveOutputStream7.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream7.buffer;
        tarArchiveOutputStream7.setLongFileMode((int) (byte) -1);
        tarArchiveOutputStream7.setLongFileMode(512);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(tarBuffer13);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 10);
        tarArchiveOutputStream1.setBigNumberMode(0);
        tarArchiveOutputStream1.setLongFileMode(512);
        int int15 = tarArchiveOutputStream1.getRecordSize();
        int int16 = tarArchiveOutputStream1.getCount();
        int int17 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 0, (int) (byte) 10);
        byte[] byteArray11 = null;
        tarArchiveOutputStream10.write(byteArray11, (int) (byte) 1, 0);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream15);
        tarArchiveOutputStream16.setAddPaxHeadersForNonAsciiNames(false);
        int int19 = tarArchiveOutputStream16.getRecordSize();
        tarArchiveOutputStream16.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16, (int) '#', 100);
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream25);
        tarArchiveOutputStream26.setAddPaxHeadersForNonAsciiNames(false);
        int int29 = tarArchiveOutputStream26.getRecordSize();
        java.io.OutputStream outputStream30 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream30);
        tarArchiveOutputStream31.setAddPaxHeadersForNonAsciiNames(false);
        java.io.OutputStream outputStream34 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream34);
        tarArchiveOutputStream35.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry38 = null;
        boolean boolean39 = tarArchiveOutputStream35.canWriteEntryData(archiveEntry38);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry40 = null;
        boolean boolean41 = tarArchiveOutputStream35.canWriteEntryData(archiveEntry40);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream35, 100);
        java.io.OutputStream outputStream44 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream44);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer46 = tarArchiveOutputStream45.buffer;
        int int47 = tarArchiveOutputStream45.getRecordSize();
        byte[] byteArray48 = new byte[] {};
        tarArchiveOutputStream45.write(byteArray48);
        tarArchiveOutputStream35.write(byteArray48);
        tarArchiveOutputStream31.write(byteArray48);
        tarArchiveOutputStream26.write(byteArray48);
        tarArchiveOutputStream24.write(byteArray48, (int) (byte) 0, (int) (byte) -1);
        tarArchiveOutputStream10.write(byteArray48);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        int int58 = tarArchiveOutputStream10.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        int int60 = tarArchiveOutputStream10.getCount();
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(tarBuffer4);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tarBuffer46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 512 + "'", int47 == 512);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        int int10 = tarArchiveOutputStream9.getCount();
        tarArchiveOutputStream9.setLongFileMode((int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 100, (int) (byte) 100);
        tarArchiveOutputStream15.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, (int) '#', (int) (short) 1);
        long long21 = tarArchiveOutputStream20.getBytesWritten();
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22);
        tarArchiveOutputStream23.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = null;
        boolean boolean27 = tarArchiveOutputStream23.canWriteEntryData(archiveEntry26);
        tarArchiveOutputStream23.setBigNumberMode(2);
        int int30 = tarArchiveOutputStream23.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, (int) (short) 10);
        int int33 = tarArchiveOutputStream23.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = null;
        boolean boolean35 = tarArchiveOutputStream23.canWriteEntryData(archiveEntry34);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, (int) (byte) 10, (int) (short) 10);
        int int39 = tarArchiveOutputStream38.getCount();
        tarArchiveOutputStream38.setLongFileMode(0);
        java.io.OutputStream outputStream42 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream42);
        tarArchiveOutputStream43.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream43.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry48 = null;
        boolean boolean49 = tarArchiveOutputStream43.canWriteEntryData(archiveEntry48);
        java.io.OutputStream outputStream50 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream50);
        tarArchiveOutputStream51.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry54 = null;
        boolean boolean55 = tarArchiveOutputStream51.canWriteEntryData(archiveEntry54);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry56 = null;
        boolean boolean57 = tarArchiveOutputStream51.canWriteEntryData(archiveEntry56);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream51, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry60 = null;
        boolean boolean61 = tarArchiveOutputStream59.canWriteEntryData(archiveEntry60);
        byte[] byteArray66 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream59.write(byteArray66, 100, (int) (byte) 0);
        tarArchiveOutputStream59.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream59.setLongFileMode((int) (short) 100);
        java.io.OutputStream outputStream74 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream75 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream74);
        tarArchiveOutputStream75.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry78 = null;
        boolean boolean79 = tarArchiveOutputStream75.canWriteEntryData(archiveEntry78);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry80 = null;
        boolean boolean81 = tarArchiveOutputStream75.canWriteEntryData(archiveEntry80);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream83 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream75, 100);
        java.io.OutputStream outputStream84 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream85 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream84);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer86 = tarArchiveOutputStream85.buffer;
        int int87 = tarArchiveOutputStream85.getRecordSize();
        byte[] byteArray88 = new byte[] {};
        tarArchiveOutputStream85.write(byteArray88);
        tarArchiveOutputStream83.write(byteArray88, 0, (int) (short) 0);
        tarArchiveOutputStream59.write(byteArray88);
        tarArchiveOutputStream43.write(byteArray88);
        tarArchiveOutputStream38.write(byteArray88);
        tarArchiveOutputStream20.write(byteArray88);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 512 + "'", int30 == 512);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(tarBuffer86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 512 + "'", int87 == 512);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] {});
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7);
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry11);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, 100);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream17);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = tarArchiveOutputStream18.buffer;
        int int20 = tarArchiveOutputStream18.getRecordSize();
        byte[] byteArray21 = new byte[] {};
        tarArchiveOutputStream18.write(byteArray21);
        tarArchiveOutputStream8.write(byteArray21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = tarArchiveOutputStream24.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream24.buffer;
        java.io.OutputStream outputStream27 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream27);
        tarArchiveOutputStream28.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = tarArchiveOutputStream28.canWriteEntryData(archiveEntry31);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        boolean boolean34 = tarArchiveOutputStream28.canWriteEntryData(archiveEntry33);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream28, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = null;
        boolean boolean38 = tarArchiveOutputStream36.canWriteEntryData(archiveEntry37);
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream36.write(byteArray43, 100, (int) (byte) 0);
        tarArchiveOutputStream36.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream36.setLongFileMode((int) (short) 100);
        java.io.OutputStream outputStream51 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream51);
        tarArchiveOutputStream52.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry55 = null;
        boolean boolean56 = tarArchiveOutputStream52.canWriteEntryData(archiveEntry55);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry57 = null;
        boolean boolean58 = tarArchiveOutputStream52.canWriteEntryData(archiveEntry57);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream60 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream52, 100);
        java.io.OutputStream outputStream61 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream62 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream61);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer63 = tarArchiveOutputStream62.buffer;
        int int64 = tarArchiveOutputStream62.getRecordSize();
        byte[] byteArray65 = new byte[] {};
        tarArchiveOutputStream62.write(byteArray65);
        tarArchiveOutputStream60.write(byteArray65, 0, (int) (short) 0);
        tarArchiveOutputStream36.write(byteArray65);
        tarArchiveOutputStream24.write(byteArray65);
        tarArchiveOutputStream1.write(byteArray65);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream74 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 100);
        int int75 = tarArchiveOutputStream74.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer76 = tarArchiveOutputStream74.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream77 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream74);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry78 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream77.putArchiveEntry(archiveEntry78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tarBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer25);
        org.junit.Assert.assertNotNull(tarBuffer26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(tarBuffer63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 512 + "'", int64 == 512);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 512 + "'", int75 == 512);
        org.junit.Assert.assertNotNull(tarBuffer76);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14);
        tarArchiveOutputStream15.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry18);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        boolean boolean25 = tarArchiveOutputStream23.canWriteEntryData(archiveEntry24);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream23.buffer;
        tarArchiveOutputStream23.setAddPaxHeadersForNonAsciiNames(true);
        int int29 = tarArchiveOutputStream23.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer30 = tarArchiveOutputStream23.buffer;
        java.io.OutputStream outputStream31 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream31);
        tarArchiveOutputStream32.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry35 = null;
        boolean boolean36 = tarArchiveOutputStream32.canWriteEntryData(archiveEntry35);
        tarArchiveOutputStream32.setBigNumberMode(2);
        int int39 = tarArchiveOutputStream32.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream41, 1);
        int int44 = tarArchiveOutputStream41.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer45 = tarArchiveOutputStream41.buffer;
        tarArchiveOutputStream41.setAddPaxHeadersForNonAsciiNames(false);
        java.io.OutputStream outputStream48 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream48);
        tarArchiveOutputStream49.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry52 = null;
        boolean boolean53 = tarArchiveOutputStream49.canWriteEntryData(archiveEntry52);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry54 = null;
        boolean boolean55 = tarArchiveOutputStream49.canWriteEntryData(archiveEntry54);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream49, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry58 = null;
        boolean boolean59 = tarArchiveOutputStream57.canWriteEntryData(archiveEntry58);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer60 = tarArchiveOutputStream57.buffer;
        java.io.OutputStream outputStream61 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream62 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream61);
        tarArchiveOutputStream62.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry65 = null;
        boolean boolean66 = tarArchiveOutputStream62.canWriteEntryData(archiveEntry65);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry67 = null;
        boolean boolean68 = tarArchiveOutputStream62.canWriteEntryData(archiveEntry67);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream70 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream62, 100);
        java.io.OutputStream outputStream71 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream72 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream71);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer73 = tarArchiveOutputStream72.buffer;
        int int74 = tarArchiveOutputStream72.getRecordSize();
        byte[] byteArray75 = new byte[] {};
        tarArchiveOutputStream72.write(byteArray75);
        tarArchiveOutputStream70.write(byteArray75, 0, (int) (short) 0);
        tarArchiveOutputStream57.write(byteArray75);
        tarArchiveOutputStream41.write(byteArray75);
        tarArchiveOutputStream23.write(byteArray75);
        tarArchiveOutputStream13.write(byteArray75);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tarBuffer26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(tarBuffer30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(tarBuffer45);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(tarBuffer60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(tarBuffer73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 512 + "'", int74 == 512);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream11.buffer;
        int int13 = tarArchiveOutputStream11.getRecordSize();
        byte[] byteArray14 = new byte[] {};
        tarArchiveOutputStream11.write(byteArray14);
        tarArchiveOutputStream1.write(byteArray14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        int int18 = tarArchiveOutputStream1.getRecordSize();
        int int19 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        long long21 = tarArchiveOutputStream20.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream1.buffer;
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream1.setLongFileMode((-1));
        int int14 = tarArchiveOutputStream1.getRecordSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        int int10 = tarArchiveOutputStream9.getCount();
        tarArchiveOutputStream9.setLongFileMode((int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 100, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17, 0);
        int int20 = tarArchiveOutputStream19.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer21 = tarArchiveOutputStream19.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = tarArchiveOutputStream19.canWriteEntryData(archiveEntry22);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream19.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNotNull(tarBuffer21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        long long3 = tarArchiveOutputStream1.getBytesWritten();
        long long4 = tarArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 10, 512);
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getCount();
        tarArchiveOutputStream1.setBigNumberMode((int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int14 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 2, 1);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 1, (int) (byte) 10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream1.buffer;
        tarArchiveOutputStream1.setLongFileMode((int) (byte) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 97, 97);
        org.junit.Assert.assertNotNull(tarBuffer7);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream1.buffer;
        int int9 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        int int4 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream8.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream15);
        tarArchiveOutputStream16.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = tarArchiveOutputStream16.canWriteEntryData(archiveEntry19);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = null;
        boolean boolean22 = tarArchiveOutputStream16.canWriteEntryData(archiveEntry21);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16, 100);
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream25);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer27 = tarArchiveOutputStream26.buffer;
        int int28 = tarArchiveOutputStream26.getRecordSize();
        byte[] byteArray29 = new byte[] {};
        tarArchiveOutputStream26.write(byteArray29);
        tarArchiveOutputStream24.write(byteArray29, 0, (int) (short) 0);
        tarArchiveOutputStream14.write(byteArray29);
        tarArchiveOutputStream12.write(byteArray29);
        tarArchiveOutputStream1.write(byteArray29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        tarArchiveOutputStream37.setBigNumberMode((int) (short) 0);
        int int40 = tarArchiveOutputStream37.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry41 = null;
        boolean boolean42 = tarArchiveOutputStream37.canWriteEntryData(archiveEntry41);
        tarArchiveOutputStream37.setBigNumberMode((int) ' ');
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tarBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 512 + "'", int40 == 512);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream9.setLongFileMode((int) (short) 100);
        tarArchiveOutputStream9.setBigNumberMode(100);
        long long26 = tarArchiveOutputStream9.getBytesWritten();
        int int27 = tarArchiveOutputStream9.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 2, 2);
        tarArchiveOutputStream32.setBigNumberMode((int) (short) 10);
        tarArchiveOutputStream32.setBigNumberMode((int) '4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream9.setLongFileMode((int) (short) 100);
        tarArchiveOutputStream9.setBigNumberMode(100);
        long long26 = tarArchiveOutputStream9.getBytesWritten();
        int int27 = tarArchiveOutputStream9.getRecordSize();
        int int28 = tarArchiveOutputStream9.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (byte) 0, 512);
        long long32 = tarArchiveOutputStream31.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream9.setLongFileMode((int) (short) 100);
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24);
        tarArchiveOutputStream25.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = tarArchiveOutputStream25.canWriteEntryData(archiveEntry28);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = tarArchiveOutputStream25.canWriteEntryData(archiveEntry30);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25, 100);
        java.io.OutputStream outputStream34 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream34);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer36 = tarArchiveOutputStream35.buffer;
        int int37 = tarArchiveOutputStream35.getRecordSize();
        byte[] byteArray38 = new byte[] {};
        tarArchiveOutputStream35.write(byteArray38);
        tarArchiveOutputStream33.write(byteArray38, 0, (int) (short) 0);
        tarArchiveOutputStream9.write(byteArray38);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(true);
        int int46 = tarArchiveOutputStream9.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer47 = tarArchiveOutputStream9.buffer;
        long long48 = tarArchiveOutputStream9.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tarBuffer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 512 + "'", int37 == 512);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(tarBuffer47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        tarArchiveOutputStream9.setBigNumberMode(2);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14);
        tarArchiveOutputStream15.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry18);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 100);
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream25.buffer;
        int int27 = tarArchiveOutputStream25.getRecordSize();
        byte[] byteArray28 = new byte[] {};
        tarArchiveOutputStream25.write(byteArray28);
        tarArchiveOutputStream15.write(byteArray28);
        tarArchiveOutputStream9.write(byteArray28);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer32 = tarArchiveOutputStream9.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        tarArchiveOutputStream9.setBigNumberMode((int) (short) 0);
        java.io.OutputStream outputStream36 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream36);
        tarArchiveOutputStream37.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry40 = null;
        boolean boolean41 = tarArchiveOutputStream37.canWriteEntryData(archiveEntry40);
        int int42 = tarArchiveOutputStream37.getRecordSize();
        java.io.OutputStream outputStream43 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream43);
        tarArchiveOutputStream44.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry47 = null;
        boolean boolean48 = tarArchiveOutputStream44.canWriteEntryData(archiveEntry47);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry49 = null;
        boolean boolean50 = tarArchiveOutputStream44.canWriteEntryData(archiveEntry49);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream44, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry53 = null;
        boolean boolean54 = tarArchiveOutputStream52.canWriteEntryData(archiveEntry53);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer55 = tarArchiveOutputStream52.buffer;
        java.io.OutputStream outputStream56 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream56);
        tarArchiveOutputStream57.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry60 = null;
        boolean boolean61 = tarArchiveOutputStream57.canWriteEntryData(archiveEntry60);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry62 = null;
        boolean boolean63 = tarArchiveOutputStream57.canWriteEntryData(archiveEntry62);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream65 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream57, 100);
        java.io.OutputStream outputStream66 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream67 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream66);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer68 = tarArchiveOutputStream67.buffer;
        int int69 = tarArchiveOutputStream67.getRecordSize();
        byte[] byteArray70 = new byte[] {};
        tarArchiveOutputStream67.write(byteArray70);
        tarArchiveOutputStream65.write(byteArray70, 0, (int) (short) 0);
        tarArchiveOutputStream52.write(byteArray70);
        tarArchiveOutputStream37.write(byteArray70);
        tarArchiveOutputStream9.write(byteArray70, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream82 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream85 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream82, (int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tarBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 512 + "'", int42 == 512);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(tarBuffer55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(tarBuffer68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 512 + "'", int69 == 512);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] {});
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 0, (int) (byte) 10);
        byte[] byteArray11 = null;
        tarArchiveOutputStream10.write(byteArray11, (int) (byte) 1, 0);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream15);
        tarArchiveOutputStream16.setAddPaxHeadersForNonAsciiNames(false);
        int int19 = tarArchiveOutputStream16.getRecordSize();
        tarArchiveOutputStream16.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16, (int) '#', 100);
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream25);
        tarArchiveOutputStream26.setAddPaxHeadersForNonAsciiNames(false);
        int int29 = tarArchiveOutputStream26.getRecordSize();
        java.io.OutputStream outputStream30 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream30);
        tarArchiveOutputStream31.setAddPaxHeadersForNonAsciiNames(false);
        java.io.OutputStream outputStream34 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream34);
        tarArchiveOutputStream35.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry38 = null;
        boolean boolean39 = tarArchiveOutputStream35.canWriteEntryData(archiveEntry38);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry40 = null;
        boolean boolean41 = tarArchiveOutputStream35.canWriteEntryData(archiveEntry40);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream35, 100);
        java.io.OutputStream outputStream44 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream44);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer46 = tarArchiveOutputStream45.buffer;
        int int47 = tarArchiveOutputStream45.getRecordSize();
        byte[] byteArray48 = new byte[] {};
        tarArchiveOutputStream45.write(byteArray48);
        tarArchiveOutputStream35.write(byteArray48);
        tarArchiveOutputStream31.write(byteArray48);
        tarArchiveOutputStream26.write(byteArray48);
        tarArchiveOutputStream24.write(byteArray48, (int) (byte) 0, (int) (byte) -1);
        tarArchiveOutputStream10.write(byteArray48);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        int int58 = tarArchiveOutputStream10.getRecordSize();
        java.io.OutputStream outputStream59 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream60 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream59);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer61 = tarArchiveOutputStream60.buffer;
        int int62 = tarArchiveOutputStream60.getRecordSize();
        byte[] byteArray63 = new byte[] {};
        tarArchiveOutputStream60.write(byteArray63);
        tarArchiveOutputStream10.write(byteArray63);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream68 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(tarBuffer4);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tarBuffer46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 512 + "'", int47 == 512);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertNotNull(tarBuffer61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 512 + "'", int62 == 512);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 97);
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream3);
        tarArchiveOutputStream4.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4, 1, (int) (byte) 10);
        tarArchiveOutputStream4.setAddPaxHeadersForNonAsciiNames(false);
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream12);
        tarArchiveOutputStream13.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = tarArchiveOutputStream13.canWriteEntryData(archiveEntry16);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = tarArchiveOutputStream13.canWriteEntryData(archiveEntry18);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = tarArchiveOutputStream21.canWriteEntryData(archiveEntry22);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer24 = tarArchiveOutputStream21.buffer;
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream25);
        tarArchiveOutputStream26.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = null;
        boolean boolean30 = tarArchiveOutputStream26.canWriteEntryData(archiveEntry29);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = tarArchiveOutputStream26.canWriteEntryData(archiveEntry31);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream26, 100);
        java.io.OutputStream outputStream35 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream35);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer37 = tarArchiveOutputStream36.buffer;
        int int38 = tarArchiveOutputStream36.getRecordSize();
        byte[] byteArray39 = new byte[] {};
        tarArchiveOutputStream36.write(byteArray39);
        tarArchiveOutputStream34.write(byteArray39, 0, (int) (short) 0);
        tarArchiveOutputStream21.write(byteArray39);
        tarArchiveOutputStream4.write(byteArray39);
        tarArchiveOutputStream2.write(byteArray39);
        int int47 = tarArchiveOutputStream2.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tarBuffer24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tarBuffer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 512 + "'", int38 == 512);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 512 + "'", int47 == 512);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        tarArchiveOutputStream11.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = tarArchiveOutputStream11.canWriteEntryData(archiveEntry14);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = tarArchiveOutputStream11.canWriteEntryData(archiveEntry16);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream19.canWriteEntryData(archiveEntry20);
        tarArchiveOutputStream19.setBigNumberMode(2);
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24);
        tarArchiveOutputStream25.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = tarArchiveOutputStream25.canWriteEntryData(archiveEntry28);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = tarArchiveOutputStream25.canWriteEntryData(archiveEntry30);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25, 100);
        java.io.OutputStream outputStream34 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream34);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer36 = tarArchiveOutputStream35.buffer;
        int int37 = tarArchiveOutputStream35.getRecordSize();
        byte[] byteArray38 = new byte[] {};
        tarArchiveOutputStream35.write(byteArray38);
        tarArchiveOutputStream25.write(byteArray38);
        tarArchiveOutputStream19.write(byteArray38);
        tarArchiveOutputStream1.write(byteArray38);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        java.io.OutputStream outputStream45 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream45);
        tarArchiveOutputStream46.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry49 = null;
        boolean boolean50 = tarArchiveOutputStream46.canWriteEntryData(archiveEntry49);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry51 = null;
        boolean boolean52 = tarArchiveOutputStream46.canWriteEntryData(archiveEntry51);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream54 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream46, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry55 = null;
        boolean boolean56 = tarArchiveOutputStream54.canWriteEntryData(archiveEntry55);
        tarArchiveOutputStream54.setBigNumberMode(2);
        java.io.OutputStream outputStream59 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream60 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream59);
        tarArchiveOutputStream60.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry63 = null;
        boolean boolean64 = tarArchiveOutputStream60.canWriteEntryData(archiveEntry63);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry65 = null;
        boolean boolean66 = tarArchiveOutputStream60.canWriteEntryData(archiveEntry65);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream68 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream60, 100);
        java.io.OutputStream outputStream69 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream70 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream69);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer71 = tarArchiveOutputStream70.buffer;
        int int72 = tarArchiveOutputStream70.getRecordSize();
        byte[] byteArray73 = new byte[] {};
        tarArchiveOutputStream70.write(byteArray73);
        tarArchiveOutputStream60.write(byteArray73);
        tarArchiveOutputStream54.write(byteArray73);
        tarArchiveOutputStream1.write(byteArray73);
        tarArchiveOutputStream1.setLongFileMode((int) (byte) 1);
        int int80 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry81 = null;
        boolean boolean82 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry81);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tarBuffer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 512 + "'", int37 == 512);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(tarBuffer71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 512 + "'", int72 == 512);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] {});
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 512 + "'", int80 == 512);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream9.buffer;
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13);
        tarArchiveOutputStream14.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry19);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, 100);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = tarArchiveOutputStream24.buffer;
        int int26 = tarArchiveOutputStream24.getRecordSize();
        byte[] byteArray27 = new byte[] {};
        tarArchiveOutputStream24.write(byteArray27);
        tarArchiveOutputStream22.write(byteArray27, 0, (int) (short) 0);
        tarArchiveOutputStream9.write(byteArray27);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 100, (int) (short) 100);
        tarArchiveOutputStream9.setBigNumberMode((int) '#');
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(true);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tarBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(true);
        int int25 = tarArchiveOutputStream9.getCount();
        int int26 = tarArchiveOutputStream9.getCount();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.writePaxHeaders("", strMap28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) '4');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 100);
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = tarArchiveOutputStream12.createArchiveEntry(file13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        int int11 = tarArchiveOutputStream10.getCount();
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        int int3 = tarArchiveOutputStream2.getCount();
        long long4 = tarArchiveOutputStream2.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 0, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream7, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 97);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 3);
        tarArchiveOutputStream4.setAddPaxHeadersForNonAsciiNames(false);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        tarArchiveOutputStream9.setLongFileMode(100);
        long long13 = tarArchiveOutputStream9.getBytesWritten();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.writePaxHeaders("", strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        tarArchiveOutputStream9.setBigNumberMode(0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream9.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 2);
        int int15 = tarArchiveOutputStream14.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer16 = tarArchiveOutputStream14.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream14.putArchiveEntry(archiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(tarBuffer16);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        long long6 = tarArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream1.buffer;
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        tarArchiveOutputStream1.setBigNumberMode((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertNotNull(tarBuffer10);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7);
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry11);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream16.canWriteEntryData(archiveEntry17);
        tarArchiveOutputStream16.setBigNumberMode(2);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21);
        tarArchiveOutputStream22.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = null;
        boolean boolean26 = tarArchiveOutputStream22.canWriteEntryData(archiveEntry25);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = null;
        boolean boolean28 = tarArchiveOutputStream22.canWriteEntryData(archiveEntry27);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, 100);
        java.io.OutputStream outputStream31 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream31);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer33 = tarArchiveOutputStream32.buffer;
        int int34 = tarArchiveOutputStream32.getRecordSize();
        byte[] byteArray35 = new byte[] {};
        tarArchiveOutputStream32.write(byteArray35);
        tarArchiveOutputStream22.write(byteArray35);
        tarArchiveOutputStream16.write(byteArray35);
        tarArchiveOutputStream1.write(byteArray35);
        tarArchiveOutputStream1.setLongFileMode((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 97, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tarBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 1, (int) (byte) 10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream1.buffer;
        tarArchiveOutputStream1.setLongFileMode((int) (byte) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.writePaxHeaders("", strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream11.buffer;
        int int13 = tarArchiveOutputStream11.getRecordSize();
        byte[] byteArray14 = new byte[] {};
        tarArchiveOutputStream11.write(byteArray14);
        tarArchiveOutputStream1.write(byteArray14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 3, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 10);
        tarArchiveOutputStream22.setAddPaxHeadersForNonAsciiNames(true);
        long long25 = tarArchiveOutputStream22.getBytesWritten();
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream26);
        tarArchiveOutputStream27.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = tarArchiveOutputStream27.canWriteEntryData(archiveEntry30);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = tarArchiveOutputStream27.canWriteEntryData(archiveEntry32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream27, 100);
        java.io.OutputStream outputStream36 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream36);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer38 = tarArchiveOutputStream37.buffer;
        int int39 = tarArchiveOutputStream37.getRecordSize();
        byte[] byteArray40 = new byte[] {};
        tarArchiveOutputStream37.write(byteArray40);
        tarArchiveOutputStream27.write(byteArray40);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream27);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer44 = tarArchiveOutputStream43.buffer;
        java.io.OutputStream outputStream45 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream45);
        tarArchiveOutputStream46.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry49 = null;
        boolean boolean50 = tarArchiveOutputStream46.canWriteEntryData(archiveEntry49);
        int int51 = tarArchiveOutputStream46.getRecordSize();
        tarArchiveOutputStream46.setLongFileMode((int) (byte) 1);
        java.io.OutputStream outputStream54 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream55 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream54);
        tarArchiveOutputStream55.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry58 = null;
        boolean boolean59 = tarArchiveOutputStream55.canWriteEntryData(archiveEntry58);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry60 = null;
        boolean boolean61 = tarArchiveOutputStream55.canWriteEntryData(archiveEntry60);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream63 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream55, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry64 = null;
        boolean boolean65 = tarArchiveOutputStream63.canWriteEntryData(archiveEntry64);
        tarArchiveOutputStream63.setBigNumberMode(2);
        java.io.OutputStream outputStream68 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream69 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream68);
        tarArchiveOutputStream69.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry72 = null;
        boolean boolean73 = tarArchiveOutputStream69.canWriteEntryData(archiveEntry72);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry74 = null;
        boolean boolean75 = tarArchiveOutputStream69.canWriteEntryData(archiveEntry74);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream77 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream69, 100);
        java.io.OutputStream outputStream78 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream79 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream78);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer80 = tarArchiveOutputStream79.buffer;
        int int81 = tarArchiveOutputStream79.getRecordSize();
        byte[] byteArray82 = new byte[] {};
        tarArchiveOutputStream79.write(byteArray82);
        tarArchiveOutputStream69.write(byteArray82);
        tarArchiveOutputStream63.write(byteArray82);
        tarArchiveOutputStream46.write(byteArray82, (int) '#', (int) (short) -1);
        tarArchiveOutputStream43.write(byteArray82, (int) '#', (int) (byte) 0);
        tarArchiveOutputStream22.write(byteArray82);
        long long93 = tarArchiveOutputStream22.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tarBuffer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 512 + "'", int51 == 512);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(tarBuffer80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 512 + "'", int81 == 512);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] {});
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int2 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int5 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = tarArchiveOutputStream1.buffer;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 512 + "'", int2 == 512);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertNotNull(tarBuffer11);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0);
        int int3 = tarArchiveOutputStream2.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, (int) '4');
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = tarArchiveOutputStream5.createArchiveEntry(file8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream9.setLongFileMode((int) (short) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream29.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (byte) 100, 3);
        int int4 = tarArchiveOutputStream3.getCount();
        long long5 = tarArchiveOutputStream3.getBytesWritten();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry11);
        tarArchiveOutputStream1.setBigNumberMode((int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 97);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream17, 32, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 0, (int) (byte) 10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = tarArchiveOutputStream10.canWriteEntryData(archiveEntry11);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, (int) '4', (int) (byte) 10);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) -1 };
        tarArchiveOutputStream10.write(byteArray20, 512, (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream25.putArchiveEntry(archiveEntry26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(tarBuffer4);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) -1 });
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        long long4 = tarArchiveOutputStream1.getBytesWritten();
        tarArchiveOutputStream1.setBigNumberMode((int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream1.buffer;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(tarBuffer7);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        tarArchiveOutputStream1.setBigNumberMode((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 2, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tarBuffer6);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream9.setLongFileMode((int) (short) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25);
        java.io.OutputStream outputStream27 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream27);
        tarArchiveOutputStream28.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = tarArchiveOutputStream28.canWriteEntryData(archiveEntry31);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        boolean boolean34 = tarArchiveOutputStream28.canWriteEntryData(archiveEntry33);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream28, 100);
        java.io.OutputStream outputStream37 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream37);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer39 = tarArchiveOutputStream38.buffer;
        int int40 = tarArchiveOutputStream38.getRecordSize();
        byte[] byteArray41 = new byte[] {};
        tarArchiveOutputStream38.write(byteArray41);
        tarArchiveOutputStream28.write(byteArray41);
        java.io.OutputStream outputStream44 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream45 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream44);
        tarArchiveOutputStream45.setAddPaxHeadersForNonAsciiNames(false);
        int int48 = tarArchiveOutputStream45.getRecordSize();
        tarArchiveOutputStream45.setAddPaxHeadersForNonAsciiNames(true);
        java.io.OutputStream outputStream51 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream51);
        tarArchiveOutputStream52.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry55 = null;
        boolean boolean56 = tarArchiveOutputStream52.canWriteEntryData(archiveEntry55);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry57 = null;
        boolean boolean58 = tarArchiveOutputStream52.canWriteEntryData(archiveEntry57);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream60 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream52, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry61 = null;
        boolean boolean62 = tarArchiveOutputStream60.canWriteEntryData(archiveEntry61);
        tarArchiveOutputStream60.setBigNumberMode(2);
        java.io.OutputStream outputStream65 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream66 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream65);
        tarArchiveOutputStream66.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry69 = null;
        boolean boolean70 = tarArchiveOutputStream66.canWriteEntryData(archiveEntry69);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry71 = null;
        boolean boolean72 = tarArchiveOutputStream66.canWriteEntryData(archiveEntry71);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream74 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream66, 100);
        java.io.OutputStream outputStream75 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream76 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream75);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer77 = tarArchiveOutputStream76.buffer;
        int int78 = tarArchiveOutputStream76.getRecordSize();
        byte[] byteArray79 = new byte[] {};
        tarArchiveOutputStream76.write(byteArray79);
        tarArchiveOutputStream66.write(byteArray79);
        tarArchiveOutputStream60.write(byteArray79);
        tarArchiveOutputStream45.write(byteArray79);
        tarArchiveOutputStream28.write(byteArray79);
        tarArchiveOutputStream25.write(byteArray79);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream87 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tarBuffer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 512 + "'", int40 == 512);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 512 + "'", int48 == 512);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(tarBuffer77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 512 + "'", int78 == 512);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] {});
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        tarArchiveOutputStream9.setBigNumberMode(0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) ' ', 3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer15 = tarArchiveOutputStream14.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer16 = tarArchiveOutputStream14.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, 0, (int) 'a');
        tarArchiveOutputStream14.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tarBuffer15);
        org.junit.Assert.assertNotNull(tarBuffer16);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        long long7 = tarArchiveOutputStream1.getBytesWritten();
        int int8 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (byte) 1, 100);
        tarArchiveOutputStream11.setLongFileMode(100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11, 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 1, (int) (byte) 10);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        tarArchiveOutputStream1.setBigNumberMode((int) (byte) 1);
        long long11 = tarArchiveOutputStream1.getBytesWritten();
        tarArchiveOutputStream1.setBigNumberMode(0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveOutputStream1.buffer;
        int int7 = tarArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) 'a', 3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = tarArchiveOutputStream1.buffer;
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(tarBuffer4);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(tarBuffer11);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (byte) 0, (int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13, (int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13);
        int int17 = tarArchiveOutputStream16.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16, 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        int int3 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6);
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream8);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, 100);
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer20 = tarArchiveOutputStream19.buffer;
        int int21 = tarArchiveOutputStream19.getRecordSize();
        byte[] byteArray22 = new byte[] {};
        tarArchiveOutputStream19.write(byteArray22);
        tarArchiveOutputStream17.write(byteArray22, 0, (int) (short) 0);
        tarArchiveOutputStream7.write(byteArray22);
        tarArchiveOutputStream5.write(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '10240' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(tarBuffer4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tarBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 512 + "'", int21 == 512);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        tarArchiveOutputStream9.setBigNumberMode(2);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14);
        tarArchiveOutputStream15.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry18);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = tarArchiveOutputStream15.canWriteEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15, 100);
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream25.buffer;
        int int27 = tarArchiveOutputStream25.getRecordSize();
        byte[] byteArray28 = new byte[] {};
        tarArchiveOutputStream25.write(byteArray28);
        tarArchiveOutputStream15.write(byteArray28);
        tarArchiveOutputStream9.write(byteArray28);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer32 = tarArchiveOutputStream9.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        tarArchiveOutputStream9.setBigNumberMode((int) (short) 0);
        java.io.OutputStream outputStream36 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream36);
        tarArchiveOutputStream37.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry40 = null;
        boolean boolean41 = tarArchiveOutputStream37.canWriteEntryData(archiveEntry40);
        int int42 = tarArchiveOutputStream37.getRecordSize();
        java.io.OutputStream outputStream43 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream43);
        tarArchiveOutputStream44.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry47 = null;
        boolean boolean48 = tarArchiveOutputStream44.canWriteEntryData(archiveEntry47);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry49 = null;
        boolean boolean50 = tarArchiveOutputStream44.canWriteEntryData(archiveEntry49);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream44, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry53 = null;
        boolean boolean54 = tarArchiveOutputStream52.canWriteEntryData(archiveEntry53);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer55 = tarArchiveOutputStream52.buffer;
        java.io.OutputStream outputStream56 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream56);
        tarArchiveOutputStream57.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry60 = null;
        boolean boolean61 = tarArchiveOutputStream57.canWriteEntryData(archiveEntry60);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry62 = null;
        boolean boolean63 = tarArchiveOutputStream57.canWriteEntryData(archiveEntry62);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream65 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream57, 100);
        java.io.OutputStream outputStream66 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream67 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream66);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer68 = tarArchiveOutputStream67.buffer;
        int int69 = tarArchiveOutputStream67.getRecordSize();
        byte[] byteArray70 = new byte[] {};
        tarArchiveOutputStream67.write(byteArray70);
        tarArchiveOutputStream65.write(byteArray70, 0, (int) (short) 0);
        tarArchiveOutputStream52.write(byteArray70);
        tarArchiveOutputStream37.write(byteArray70);
        tarArchiveOutputStream9.write(byteArray70, 0, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream82 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 100, (int) (short) 100);
        long long83 = tarArchiveOutputStream9.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry84 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.putArchiveEntry(archiveEntry84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tarBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(tarBuffer32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 512 + "'", int42 == 512);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(tarBuffer55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(tarBuffer68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 512 + "'", int69 == 512);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] {});
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream5);
        tarArchiveOutputStream6.setAddPaxHeadersForNonAsciiNames(false);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9);
        tarArchiveOutputStream10.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream10.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream10.canWriteEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, 100);
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer21 = tarArchiveOutputStream20.buffer;
        int int22 = tarArchiveOutputStream20.getRecordSize();
        byte[] byteArray23 = new byte[] {};
        tarArchiveOutputStream20.write(byteArray23);
        tarArchiveOutputStream10.write(byteArray23);
        tarArchiveOutputStream6.write(byteArray23);
        tarArchiveOutputStream1.write(byteArray23);
        long long28 = tarArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = null;
        boolean boolean30 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry29);
        java.io.OutputStream outputStream31 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream31);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer33 = tarArchiveOutputStream32.buffer;
        int int34 = tarArchiveOutputStream32.getRecordSize();
        byte[] byteArray35 = new byte[] {};
        tarArchiveOutputStream32.write(byteArray35);
        tarArchiveOutputStream1.write(byteArray35);
        tarArchiveOutputStream1.setBigNumberMode(3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tarBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tarBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveOutputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        tarArchiveOutputStream5.setBigNumberMode((int) '4');
        int int11 = tarArchiveOutputStream5.getRecordSize();
        long long12 = tarArchiveOutputStream5.getBytesWritten();
        int int13 = tarArchiveOutputStream5.getRecordSize();
        int int14 = tarArchiveOutputStream5.getRecordSize();
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream9.buffer;
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13);
        tarArchiveOutputStream14.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = tarArchiveOutputStream14.canWriteEntryData(archiveEntry19);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, 100);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = tarArchiveOutputStream24.buffer;
        int int26 = tarArchiveOutputStream24.getRecordSize();
        byte[] byteArray27 = new byte[] {};
        tarArchiveOutputStream24.write(byteArray27);
        tarArchiveOutputStream22.write(byteArray27, 0, (int) (short) 0);
        tarArchiveOutputStream9.write(byteArray27);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        int int34 = tarArchiveOutputStream9.getRecordSize();
        tarArchiveOutputStream9.setLongFileMode(1);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(true);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer39 = tarArchiveOutputStream9.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer40 = tarArchiveOutputStream9.buffer;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream42 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tarBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
        org.junit.Assert.assertNotNull(tarBuffer39);
        org.junit.Assert.assertNotNull(tarBuffer40);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        tarArchiveOutputStream1.setBigNumberMode(0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 10, (int) '4');
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = tarArchiveOutputStream14.createArchiveEntry(file15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int2 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int5 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry8);
        int int10 = tarArchiveOutputStream1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 512 + "'", int2 == 512);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        tarArchiveOutputStream9.write(byteArray16, 100, (int) (byte) 0);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (byte) 0);
        tarArchiveOutputStream24.setBigNumberMode(0);
        tarArchiveOutputStream24.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream24);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = tarArchiveOutputStream24.canWriteEntryData(archiveEntry30);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        tarArchiveOutputStream1.setBigNumberMode(2);
        int int8 = tarArchiveOutputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, (int) (short) 10);
        long long11 = tarArchiveOutputStream10.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream10.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = tarArchiveOutputStream10.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, (int) (short) 0, (int) (byte) 1);
        long long18 = tarArchiveOutputStream10.getBytesWritten();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        int int10 = tarArchiveOutputStream1.getCount();
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11);
        tarArchiveOutputStream12.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream12.canWriteEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream12.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, 100);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer23 = tarArchiveOutputStream22.buffer;
        int int24 = tarArchiveOutputStream22.getRecordSize();
        byte[] byteArray25 = new byte[] {};
        tarArchiveOutputStream22.write(byteArray25);
        tarArchiveOutputStream20.write(byteArray25, 0, (int) (short) 0);
        tarArchiveOutputStream1.write(byteArray25);
        tarArchiveOutputStream1.setBigNumberMode(3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream33, 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream33);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream33.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '10240' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tarBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        int int4 = tarArchiveOutputStream1.getRecordSize();
        tarArchiveOutputStream1.setBigNumberMode(1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 0, (int) (short) 1);
        int int10 = tarArchiveOutputStream1.getCount();
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11);
        tarArchiveOutputStream12.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = tarArchiveOutputStream12.canWriteEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveOutputStream12.canWriteEntryData(archiveEntry17);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, 100);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer23 = tarArchiveOutputStream22.buffer;
        int int24 = tarArchiveOutputStream22.getRecordSize();
        byte[] byteArray25 = new byte[] {};
        tarArchiveOutputStream22.write(byteArray25);
        tarArchiveOutputStream20.write(byteArray25, 0, (int) (short) 0);
        tarArchiveOutputStream1.write(byteArray25);
        tarArchiveOutputStream1.setBigNumberMode(3);
        long long33 = tarArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tarBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream1.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveOutputStream1.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 100);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream11.buffer;
        int int13 = tarArchiveOutputStream11.getRecordSize();
        byte[] byteArray14 = new byte[] {};
        tarArchiveOutputStream11.write(byteArray14);
        tarArchiveOutputStream1.write(byteArray14);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 3, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream1, 10);
        int int23 = tarArchiveOutputStream22.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25, (int) (short) 10, 100);
        java.io.File file29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = tarArchiveOutputStream28.createArchiveEntry(file29, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
    }
}

