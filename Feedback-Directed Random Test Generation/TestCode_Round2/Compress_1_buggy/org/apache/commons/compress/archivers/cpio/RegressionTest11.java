package org.apache.commons.compress.archivers.cpio;

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
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) (byte) 1);
        cpioArchiveOutputStream17.flush();
        cpioArchiveOutputStream17.write(100);
        cpioArchiveOutputStream17.close();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        java.io.OutputStream outputStream6 = java.io.OutputStream.nullOutputStream();
        outputStream6.flush();
        outputStream6.flush();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        outputStream6.write(byteArray10);
        outputStream0.write(byteArray10);
        outputStream0.flush();
        java.io.OutputStream outputStream14 = java.io.OutputStream.nullOutputStream();
        outputStream14.flush();
        outputStream14.flush();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        outputStream14.write(byteArray18);
        outputStream0.write(byteArray18);
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1 });
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write((int) (short) 10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.write(29127);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        cpioArchiveOutputStream17.write((int) (short) 8);
        java.lang.Class<?> wildcardClass20 = cpioArchiveOutputStream17.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        cpioArchiveOutputStream14.write(0);
        cpioArchiveOutputStream14.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream20.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        cpioArchiveOutputStream20.close();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.finish();
        java.io.OutputStream outputStream20 = java.io.OutputStream.nullOutputStream();
        outputStream20.flush();
        outputStream20.flush();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        outputStream20.write(byteArray24);
        java.io.OutputStream outputStream26 = java.io.OutputStream.nullOutputStream();
        outputStream26.flush();
        outputStream26.flush();
        byte[] byteArray30 = new byte[] { (byte) 1 };
        outputStream26.write(byteArray30);
        outputStream20.write(byteArray30);
        java.io.OutputStream outputStream33 = java.io.OutputStream.nullOutputStream();
        outputStream33.flush();
        outputStream33.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream36 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream33);
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 10 };
        outputStream33.write(byteArray43);
        java.io.OutputStream outputStream45 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream46 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream47 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream46);
        java.io.OutputStream outputStream48 = java.io.OutputStream.nullOutputStream();
        outputStream48.flush();
        outputStream48.flush();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        outputStream48.write(byteArray52);
        java.io.OutputStream outputStream54 = java.io.OutputStream.nullOutputStream();
        outputStream54.flush();
        outputStream54.flush();
        byte[] byteArray58 = new byte[] { (byte) 1 };
        outputStream54.write(byteArray58);
        outputStream48.write(byteArray58);
        outputStream46.write(byteArray58);
        outputStream45.write(byteArray58);
        outputStream33.write(byteArray58);
        outputStream20.write(byteArray58);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.write(byteArray58);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream20);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream33);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 10 });
        org.junit.Assert.assertNotNull(outputStream45);
        org.junit.Assert.assertNotNull(outputStream46);
        org.junit.Assert.assertNotNull(outputStream48);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream54);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 1 });
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        cpioArchiveOutputStream10.finish();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.write((int) '#');
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream18.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18, (short) 1);
        cpioArchiveOutputStream21.write((int) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream24.putArchiveEntry(archiveEntry25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream13, (short) 1);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream4.write(100);
        cpioArchiveOutputStream4.write((int) (short) -1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4, (short) 1);
        cpioArchiveOutputStream10.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream10.putArchiveEntry(archiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 1);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        java.io.OutputStream outputStream16 = java.io.OutputStream.nullOutputStream();
        outputStream16.flush();
        outputStream16.flush();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        outputStream16.write(byteArray20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        cpioArchiveOutputStream22.finish();
        cpioArchiveOutputStream22.write(32);
        cpioArchiveOutputStream22.write(4);
        cpioArchiveOutputStream22.write(100);
        cpioArchiveOutputStream22.finish();
        java.io.OutputStream outputStream31 = java.io.OutputStream.nullOutputStream();
        outputStream31.flush();
        java.io.OutputStream outputStream33 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream34 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream34);
        java.io.OutputStream outputStream36 = java.io.OutputStream.nullOutputStream();
        outputStream36.flush();
        outputStream36.flush();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        outputStream36.write(byteArray40);
        java.io.OutputStream outputStream42 = java.io.OutputStream.nullOutputStream();
        outputStream42.flush();
        outputStream42.flush();
        byte[] byteArray46 = new byte[] { (byte) 1 };
        outputStream42.write(byteArray46);
        outputStream36.write(byteArray46);
        outputStream34.write(byteArray46);
        outputStream33.write(byteArray46);
        outputStream31.write(byteArray46);
        cpioArchiveOutputStream22.write(byteArray46, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream15.write(byteArray46);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream31);
        org.junit.Assert.assertNotNull(outputStream33);
        org.junit.Assert.assertNotNull(outputStream34);
        org.junit.Assert.assertNotNull(outputStream36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream42);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 1 });
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream11.finish();
        cpioArchiveOutputStream11.flush();
        cpioArchiveOutputStream11.write((int) (short) 0);
        java.io.OutputStream outputStream16 = java.io.OutputStream.nullOutputStream();
        outputStream16.flush();
        outputStream16.flush();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        outputStream16.write(byteArray20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        java.io.OutputStream outputStream23 = java.io.OutputStream.nullOutputStream();
        outputStream23.flush();
        outputStream23.flush();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        outputStream23.write(byteArray27);
        outputStream16.write(byteArray27);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        cpioArchiveOutputStream30.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream30);
        cpioArchiveOutputStream30.write(29127);
        cpioArchiveOutputStream30.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream30);
        cpioArchiveOutputStream30.flush();
        java.io.OutputStream outputStream39 = java.io.OutputStream.nullOutputStream();
        outputStream39.flush();
        outputStream39.flush();
        byte[] byteArray43 = new byte[] { (byte) 1 };
        outputStream39.write(byteArray43);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream45 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream39);
        cpioArchiveOutputStream45.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream48 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream45, (short) 1);
        cpioArchiveOutputStream48.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream50 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream48);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream51 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream50);
        java.io.OutputStream outputStream52 = java.io.OutputStream.nullOutputStream();
        outputStream52.flush();
        outputStream52.flush();
        byte[] byteArray56 = new byte[] { (byte) 1 };
        outputStream52.write(byteArray56);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream58 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream52);
        cpioArchiveOutputStream58.write(49152);
        cpioArchiveOutputStream58.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream62 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream58);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream63 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream62);
        cpioArchiveOutputStream63.finish();
        java.io.OutputStream outputStream65 = java.io.OutputStream.nullOutputStream();
        outputStream65.flush();
        outputStream65.flush();
        byte[] byteArray69 = new byte[] { (byte) 1 };
        outputStream65.write(byteArray69);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream71 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream65);
        cpioArchiveOutputStream71.write(49152);
        cpioArchiveOutputStream71.flush();
        cpioArchiveOutputStream71.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream76 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream71);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream77 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream71);
        byte[] byteArray78 = new byte[] {};
        cpioArchiveOutputStream71.write(byteArray78);
        cpioArchiveOutputStream63.write(byteArray78);
        cpioArchiveOutputStream51.write(byteArray78);
        cpioArchiveOutputStream30.write(byteArray78);
        cpioArchiveOutputStream11.write(byteArray78);
        cpioArchiveOutputStream11.close();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream65);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] {});
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream1 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        java.io.OutputStream outputStream3 = java.io.OutputStream.nullOutputStream();
        outputStream3.flush();
        outputStream3.flush();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        outputStream3.write(byteArray7);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        outputStream9.flush();
        outputStream9.flush();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        outputStream9.write(byteArray13);
        outputStream3.write(byteArray13);
        outputStream1.write(byteArray13);
        outputStream0.write(byteArray13);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        cpioArchiveOutputStream19.finish();
        cpioArchiveOutputStream19.close();
        cpioArchiveOutputStream19.write(128);
        cpioArchiveOutputStream19.flush();
        cpioArchiveOutputStream19.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream1);
        org.junit.Assert.assertNotNull(outputStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1 });
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17, (short) 2);
        cpioArchiveOutputStream17.close();
        cpioArchiveOutputStream17.close();
        cpioArchiveOutputStream17.flush();
        cpioArchiveOutputStream17.write(0);
        cpioArchiveOutputStream17.flush();
        cpioArchiveOutputStream17.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(10);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.close();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.write(32);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        java.io.OutputStream outputStream16 = java.io.OutputStream.nullOutputStream();
        outputStream16.flush();
        outputStream16.flush();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        outputStream16.write(byteArray20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        cpioArchiveOutputStream22.finish();
        cpioArchiveOutputStream22.write(32);
        cpioArchiveOutputStream22.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        cpioArchiveOutputStream27.finish();
        cpioArchiveOutputStream27.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream27, (short) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream31);
        java.io.OutputStream outputStream33 = java.io.OutputStream.nullOutputStream();
        outputStream33.flush();
        outputStream33.flush();
        byte[] byteArray37 = new byte[] { (byte) 1 };
        outputStream33.write(byteArray37);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream39 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream33);
        cpioArchiveOutputStream39.finish();
        cpioArchiveOutputStream39.write(32);
        cpioArchiveOutputStream39.flush();
        cpioArchiveOutputStream39.write(0);
        cpioArchiveOutputStream39.finish();
        java.io.OutputStream outputStream47 = java.io.OutputStream.nullOutputStream();
        outputStream47.flush();
        outputStream47.flush();
        byte[] byteArray51 = new byte[] { (byte) 1 };
        outputStream47.write(byteArray51);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream53 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream47);
        cpioArchiveOutputStream53.write(49152);
        cpioArchiveOutputStream53.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream57 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream53);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream58 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream57);
        java.io.OutputStream outputStream59 = java.io.OutputStream.nullOutputStream();
        outputStream59.flush();
        outputStream59.flush();
        byte[] byteArray63 = new byte[] { (byte) 1 };
        outputStream59.write(byteArray63);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream65 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream59);
        java.io.OutputStream outputStream66 = java.io.OutputStream.nullOutputStream();
        outputStream66.flush();
        outputStream66.flush();
        byte[] byteArray70 = new byte[] { (byte) 1 };
        outputStream66.write(byteArray70);
        outputStream59.write(byteArray70);
        outputStream59.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream74 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream59);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream76 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream59, (short) 1);
        java.io.OutputStream outputStream77 = java.io.OutputStream.nullOutputStream();
        outputStream77.flush();
        outputStream77.flush();
        byte[] byteArray81 = new byte[] { (byte) 1 };
        outputStream77.write(byteArray81);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream83 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream77);
        cpioArchiveOutputStream83.write(49152);
        cpioArchiveOutputStream83.flush();
        cpioArchiveOutputStream83.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream88 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream83);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream89 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream83);
        byte[] byteArray90 = new byte[] {};
        cpioArchiveOutputStream83.write(byteArray90);
        outputStream59.write(byteArray90);
        cpioArchiveOutputStream57.write(byteArray90);
        cpioArchiveOutputStream39.write(byteArray90);
        cpioArchiveOutputStream32.write(byteArray90);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.write(byteArray90);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream33);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream47);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream66);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream77);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] {});
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17, (short) 1);
        cpioArchiveOutputStream19.finish();
        cpioArchiveOutputStream19.close();
        cpioArchiveOutputStream19.write(16384);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        cpioArchiveOutputStream25.close();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write((-1));
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.write(1);
        cpioArchiveOutputStream6.write((int) ' ');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.putArchiveEntry(archiveEntry18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        cpioArchiveOutputStream11.flush();
        cpioArchiveOutputStream11.write(4096);
        cpioArchiveOutputStream11.write(1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream11.putArchiveEntry(archiveEntry18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream20.write(36864);
        cpioArchiveOutputStream20.write(0);
        cpioArchiveOutputStream20.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        cpioArchiveOutputStream26.write((int) (short) 0);
        cpioArchiveOutputStream26.flush();
        java.lang.Class<?> wildcardClass30 = cpioArchiveOutputStream26.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 8);
        cpioArchiveOutputStream14.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.finish();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream19.write(2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        cpioArchiveOutputStream22.flush();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12, (short) 2);
        cpioArchiveOutputStream12.flush();
        cpioArchiveOutputStream12.write(36864);
        cpioArchiveOutputStream12.write(0);
        cpioArchiveOutputStream12.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream1 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        java.io.OutputStream outputStream3 = java.io.OutputStream.nullOutputStream();
        outputStream3.flush();
        outputStream3.flush();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        outputStream3.write(byteArray7);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        outputStream9.flush();
        outputStream9.flush();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        outputStream9.write(byteArray13);
        outputStream3.write(byteArray13);
        outputStream1.write(byteArray13);
        outputStream0.write(byteArray13);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        cpioArchiveOutputStream19.finish();
        cpioArchiveOutputStream19.close();
        cpioArchiveOutputStream19.write(128);
        cpioArchiveOutputStream19.flush();
        cpioArchiveOutputStream19.flush();
        java.io.OutputStream outputStream26 = java.io.OutputStream.nullOutputStream();
        outputStream26.flush();
        outputStream26.flush();
        byte[] byteArray30 = new byte[] { (byte) 1 };
        outputStream26.write(byteArray30);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream26);
        java.io.OutputStream outputStream33 = java.io.OutputStream.nullOutputStream();
        outputStream33.flush();
        outputStream33.flush();
        byte[] byteArray37 = new byte[] { (byte) 1 };
        outputStream33.write(byteArray37);
        outputStream26.write(byteArray37);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream40 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream26);
        cpioArchiveOutputStream40.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream40);
        cpioArchiveOutputStream40.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream46 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream40);
        cpioArchiveOutputStream46.write(36864);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream49 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream46);
        cpioArchiveOutputStream46.write((int) (short) 8);
        cpioArchiveOutputStream46.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream54 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream46, (short) 2);
        java.io.OutputStream outputStream55 = java.io.OutputStream.nullOutputStream();
        outputStream55.flush();
        outputStream55.flush();
        byte[] byteArray59 = new byte[] { (byte) 1 };
        outputStream55.write(byteArray59);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream61 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream55);
        java.io.OutputStream outputStream62 = java.io.OutputStream.nullOutputStream();
        outputStream62.flush();
        outputStream62.flush();
        byte[] byteArray66 = new byte[] { (byte) 1 };
        outputStream62.write(byteArray66);
        outputStream55.write(byteArray66);
        outputStream55.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream70 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream55);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream72 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream55, (short) 1);
        java.io.OutputStream outputStream73 = java.io.OutputStream.nullOutputStream();
        outputStream73.flush();
        outputStream73.flush();
        byte[] byteArray77 = new byte[] { (byte) 1 };
        outputStream73.write(byteArray77);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream79 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream73);
        cpioArchiveOutputStream79.write(49152);
        cpioArchiveOutputStream79.flush();
        cpioArchiveOutputStream79.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream84 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream79);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream85 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream79);
        byte[] byteArray86 = new byte[] {};
        cpioArchiveOutputStream79.write(byteArray86);
        outputStream55.write(byteArray86);
        cpioArchiveOutputStream54.write(byteArray86);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream19.write(byteArray86, 1, 49152);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream1);
        org.junit.Assert.assertNotNull(outputStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream33);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream55);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream62);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream73);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] {});
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(32768);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream12.write(0);
        cpioArchiveOutputStream12.finish();
        java.lang.Class<?> wildcardClass16 = cpioArchiveOutputStream12.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.write(128);
        cpioArchiveOutputStream6.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream10.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        cpioArchiveOutputStream12.write(29127);
        cpioArchiveOutputStream12.write(32);
        cpioArchiveOutputStream12.flush();
        cpioArchiveOutputStream12.write((int) (short) 10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream20.putNextEntry(cpioArchiveEntry21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream10.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream10.putArchiveEntry(archiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32768);
        cpioArchiveOutputStream6.write((int) (short) 8);
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18, (short) 2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        cpioArchiveOutputStream18.write(10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        java.lang.Class<?> wildcardClass26 = cpioArchiveOutputStream25.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream4.flush();
        cpioArchiveOutputStream4.close();
        cpioArchiveOutputStream4.close();
        java.io.OutputStream outputStream8 = java.io.OutputStream.nullOutputStream();
        outputStream8.flush();
        outputStream8.flush();
        byte[] byteArray12 = new byte[] { (byte) 1 };
        outputStream8.write(byteArray12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream8);
        cpioArchiveOutputStream14.finish();
        cpioArchiveOutputStream14.write(32);
        cpioArchiveOutputStream14.write(4);
        cpioArchiveOutputStream14.write(100);
        cpioArchiveOutputStream14.finish();
        java.io.OutputStream outputStream23 = java.io.OutputStream.nullOutputStream();
        outputStream23.flush();
        java.io.OutputStream outputStream25 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream26 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream26);
        java.io.OutputStream outputStream28 = java.io.OutputStream.nullOutputStream();
        outputStream28.flush();
        outputStream28.flush();
        byte[] byteArray32 = new byte[] { (byte) 1 };
        outputStream28.write(byteArray32);
        java.io.OutputStream outputStream34 = java.io.OutputStream.nullOutputStream();
        outputStream34.flush();
        outputStream34.flush();
        byte[] byteArray38 = new byte[] { (byte) 1 };
        outputStream34.write(byteArray38);
        outputStream28.write(byteArray38);
        outputStream26.write(byteArray38);
        outputStream25.write(byteArray38);
        outputStream23.write(byteArray38);
        cpioArchiveOutputStream14.write(byteArray38, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream4.write(byteArray38);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream23);
        org.junit.Assert.assertNotNull(outputStream25);
        org.junit.Assert.assertNotNull(outputStream26);
        org.junit.Assert.assertNotNull(outputStream28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 1 });
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream14.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(32768);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream12.write(0);
        cpioArchiveOutputStream12.write((int) (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        cpioArchiveOutputStream17.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        java.io.OutputStream outputStream15 = java.io.OutputStream.nullOutputStream();
        outputStream15.flush();
        outputStream15.flush();
        byte[] byteArray19 = new byte[] { (byte) 1 };
        outputStream15.write(byteArray19);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream15);
        cpioArchiveOutputStream21.finish();
        cpioArchiveOutputStream21.write(0);
        cpioArchiveOutputStream21.close();
        cpioArchiveOutputStream21.write(40960);
        cpioArchiveOutputStream21.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21, (short) 4);
        cpioArchiveOutputStream30.write(29127);
        cpioArchiveOutputStream30.finish();
        java.io.OutputStream outputStream34 = java.io.OutputStream.nullOutputStream();
        outputStream34.flush();
        outputStream34.flush();
        byte[] byteArray38 = new byte[] { (byte) 1 };
        outputStream34.write(byteArray38);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream40 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream34);
        cpioArchiveOutputStream40.write(49152);
        cpioArchiveOutputStream40.flush();
        cpioArchiveOutputStream40.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream45 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream40);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream46 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream40);
        byte[] byteArray47 = new byte[] {};
        cpioArchiveOutputStream40.write(byteArray47);
        cpioArchiveOutputStream30.write(byteArray47);
        cpioArchiveOutputStream14.write(byteArray47);
        cpioArchiveOutputStream14.write((int) (byte) 100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream53 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 10 };
        outputStream0.write(byteArray10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream15.write((int) (byte) 10);
        cpioArchiveOutputStream15.write((int) (short) 8);
        cpioArchiveOutputStream15.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 10 });
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.close();
        cpioArchiveOutputStream14.write(0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) 4);
        cpioArchiveOutputStream25.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream25, (short) (byte) 1);
        cpioArchiveOutputStream28.finish();
        cpioArchiveOutputStream28.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry31 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream28.putNextEntry(cpioArchiveEntry31);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.close();
        cpioArchiveOutputStream1.write(512);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        java.io.OutputStream outputStream14 = java.io.OutputStream.nullOutputStream();
        outputStream14.flush();
        outputStream14.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream14);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 10 };
        outputStream14.write(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream13.write(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream14);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 10 });
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.write((int) (short) 2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream3.putArchiveEntry(archiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.putArchiveEntry(archiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(32768);
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write((int) 'a');
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 1);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream8.flush();
        cpioArchiveOutputStream8.flush();
        java.io.OutputStream outputStream11 = java.io.OutputStream.nullOutputStream();
        outputStream11.flush();
        outputStream11.flush();
        byte[] byteArray15 = new byte[] { (byte) 1 };
        outputStream11.write(byteArray15);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream11);
        cpioArchiveOutputStream17.finish();
        cpioArchiveOutputStream17.write(0);
        cpioArchiveOutputStream17.close();
        cpioArchiveOutputStream17.write(40960);
        cpioArchiveOutputStream17.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17, (short) 4);
        cpioArchiveOutputStream26.write(512);
        java.io.OutputStream outputStream29 = java.io.OutputStream.nullOutputStream();
        outputStream29.flush();
        outputStream29.flush();
        byte[] byteArray33 = new byte[] { (byte) 1 };
        outputStream29.write(byteArray33);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream29);
        cpioArchiveOutputStream35.write(49152);
        cpioArchiveOutputStream35.flush();
        cpioArchiveOutputStream35.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream41 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream35);
        cpioArchiveOutputStream41.finish();
        cpioArchiveOutputStream41.write((int) ' ');
        cpioArchiveOutputStream41.flush();
        java.io.OutputStream outputStream46 = java.io.OutputStream.nullOutputStream();
        outputStream46.flush();
        outputStream46.flush();
        byte[] byteArray50 = new byte[] { (byte) 1 };
        outputStream46.write(byteArray50);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream52 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream46);
        cpioArchiveOutputStream52.close();
        cpioArchiveOutputStream52.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream56 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream52, (short) (byte) 1);
        java.io.OutputStream outputStream57 = java.io.OutputStream.nullOutputStream();
        outputStream57.flush();
        outputStream57.flush();
        byte[] byteArray61 = new byte[] { (byte) 1 };
        outputStream57.write(byteArray61);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream63 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream57);
        cpioArchiveOutputStream63.write(49152);
        cpioArchiveOutputStream63.flush();
        cpioArchiveOutputStream63.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream68 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream63);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream69 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream63);
        byte[] byteArray70 = new byte[] {};
        cpioArchiveOutputStream63.write(byteArray70);
        cpioArchiveOutputStream56.write(byteArray70);
        cpioArchiveOutputStream41.write(byteArray70);
        cpioArchiveOutputStream26.write(byteArray70);
        cpioArchiveOutputStream8.write(byteArray70);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry76 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream8.putArchiveEntry(archiveEntry76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream57);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] {});
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32768);
        cpioArchiveOutputStream6.write((int) (short) 8);
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18, (short) 2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        cpioArchiveOutputStream18.write(16384);
        cpioArchiveOutputStream18.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(24576);
        cpioArchiveOutputStream6.write((int) (short) -1);
        cpioArchiveOutputStream6.write(64);
        java.io.OutputStream outputStream14 = java.io.OutputStream.nullOutputStream();
        outputStream14.flush();
        java.io.OutputStream outputStream16 = java.io.OutputStream.nullOutputStream();
        outputStream16.flush();
        outputStream16.flush();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        outputStream16.write(byteArray20);
        outputStream14.write(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.write(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream14);
        org.junit.Assert.assertNotNull(outputStream16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1 });
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12, (short) 2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        cpioArchiveOutputStream12.write(4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream12.putArchiveEntry(archiveEntry18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) 2);
        cpioArchiveOutputStream17.finish();
        cpioArchiveOutputStream17.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17, (short) 4);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream10.flush();
        cpioArchiveOutputStream10.flush();
        cpioArchiveOutputStream10.write(0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        cpioArchiveOutputStream15.finish();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17, (short) 2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        cpioArchiveOutputStream21.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        cpioArchiveOutputStream23.close();
        cpioArchiveOutputStream23.write(256);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(29127);
        cpioArchiveOutputStream14.finish();
        cpioArchiveOutputStream14.close();
        cpioArchiveOutputStream14.close();
        cpioArchiveOutputStream14.close();
        cpioArchiveOutputStream14.close();
        cpioArchiveOutputStream14.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32768);
        cpioArchiveOutputStream6.write((int) (short) 8);
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18, (short) 2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        cpioArchiveOutputStream22.flush();
        cpioArchiveOutputStream22.close();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 2);
        cpioArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4, (short) 1);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        java.io.OutputStream outputStream13 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream14 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream14);
        java.io.OutputStream outputStream16 = java.io.OutputStream.nullOutputStream();
        outputStream16.flush();
        outputStream16.flush();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        outputStream16.write(byteArray20);
        java.io.OutputStream outputStream22 = java.io.OutputStream.nullOutputStream();
        outputStream22.flush();
        outputStream22.flush();
        byte[] byteArray26 = new byte[] { (byte) 1 };
        outputStream22.write(byteArray26);
        outputStream16.write(byteArray26);
        outputStream14.write(byteArray26);
        outputStream13.write(byteArray26);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream31);
        java.io.OutputStream outputStream33 = java.io.OutputStream.nullOutputStream();
        outputStream33.flush();
        outputStream33.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream36 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream33);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream36);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream39 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream36, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream40 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream36);
        java.io.OutputStream outputStream41 = java.io.OutputStream.nullOutputStream();
        outputStream41.flush();
        outputStream41.flush();
        byte[] byteArray45 = new byte[] { (byte) 1 };
        outputStream41.write(byteArray45);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream47 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream41);
        cpioArchiveOutputStream47.finish();
        cpioArchiveOutputStream47.write(32);
        cpioArchiveOutputStream47.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream52 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream47);
        cpioArchiveOutputStream52.finish();
        cpioArchiveOutputStream52.write(512);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream56 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream52);
        cpioArchiveOutputStream56.flush();
        cpioArchiveOutputStream56.finish();
        java.io.OutputStream outputStream59 = java.io.OutputStream.nullOutputStream();
        outputStream59.flush();
        outputStream59.flush();
        byte[] byteArray63 = new byte[] { (byte) 1 };
        outputStream59.write(byteArray63);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream65 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream59);
        java.io.OutputStream outputStream66 = java.io.OutputStream.nullOutputStream();
        outputStream66.flush();
        outputStream66.flush();
        byte[] byteArray70 = new byte[] { (byte) 1 };
        outputStream66.write(byteArray70);
        outputStream59.write(byteArray70);
        outputStream59.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream74 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream59);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream76 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream59, (short) 1);
        java.io.OutputStream outputStream77 = java.io.OutputStream.nullOutputStream();
        outputStream77.flush();
        outputStream77.flush();
        byte[] byteArray81 = new byte[] { (byte) 1 };
        outputStream77.write(byteArray81);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream83 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream77);
        cpioArchiveOutputStream83.write(49152);
        cpioArchiveOutputStream83.flush();
        cpioArchiveOutputStream83.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream88 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream83);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream89 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream83);
        byte[] byteArray90 = new byte[] {};
        cpioArchiveOutputStream83.write(byteArray90);
        outputStream59.write(byteArray90);
        cpioArchiveOutputStream56.write(byteArray90);
        cpioArchiveOutputStream36.write(byteArray90);
        cpioArchiveOutputStream31.write(byteArray90);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream12.write(byteArray90, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream13);
        org.junit.Assert.assertNotNull(outputStream14);
        org.junit.Assert.assertNotNull(outputStream16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream33);
        org.junit.Assert.assertNotNull(outputStream41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream66);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream77);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] {});
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) (byte) 1);
        cpioArchiveOutputStream10.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10, (short) 4);
        cpioArchiveOutputStream10.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream10.putNextEntry(cpioArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream11.write(0);
        cpioArchiveOutputStream11.finish();
        cpioArchiveOutputStream11.write((int) '4');
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.write((int) (short) 10);
        cpioArchiveOutputStream6.write((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = cpioArchiveOutputStream6.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream1 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        java.io.OutputStream outputStream3 = java.io.OutputStream.nullOutputStream();
        outputStream3.flush();
        outputStream3.flush();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        outputStream3.write(byteArray7);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        outputStream9.flush();
        outputStream9.flush();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        outputStream9.write(byteArray13);
        outputStream3.write(byteArray13);
        outputStream1.write(byteArray13);
        outputStream0.write(byteArray13);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        cpioArchiveOutputStream19.flush();
        cpioArchiveOutputStream19.write((int) (short) 12);
        cpioArchiveOutputStream19.finish();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream1);
        org.junit.Assert.assertNotNull(outputStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1 });
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17, (short) 2);
        cpioArchiveOutputStream17.close();
        cpioArchiveOutputStream17.write((int) (byte) -1);
        cpioArchiveOutputStream17.write(8192);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream9.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        cpioArchiveOutputStream9.finish();
        cpioArchiveOutputStream9.finish();
        cpioArchiveOutputStream9.finish();
        java.io.OutputStream outputStream15 = java.io.OutputStream.nullOutputStream();
        outputStream15.flush();
        outputStream15.flush();
        byte[] byteArray19 = new byte[] { (byte) 1 };
        outputStream15.write(byteArray19);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream15);
        cpioArchiveOutputStream21.flush();
        cpioArchiveOutputStream21.write(10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        java.io.OutputStream outputStream26 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream26);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream26);
        java.io.OutputStream outputStream29 = java.io.OutputStream.nullOutputStream();
        outputStream29.flush();
        outputStream29.flush();
        byte[] byteArray33 = new byte[] { (byte) 1 };
        outputStream29.write(byteArray33);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream29);
        java.io.OutputStream outputStream36 = java.io.OutputStream.nullOutputStream();
        outputStream36.flush();
        outputStream36.flush();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        outputStream36.write(byteArray40);
        outputStream29.write(byteArray40);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream29);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream44 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream29);
        java.io.OutputStream outputStream45 = java.io.OutputStream.nullOutputStream();
        outputStream45.flush();
        outputStream45.flush();
        byte[] byteArray49 = new byte[] { (byte) 1 };
        outputStream45.write(byteArray49);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream51 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream45);
        java.io.OutputStream outputStream52 = java.io.OutputStream.nullOutputStream();
        outputStream52.flush();
        outputStream52.flush();
        byte[] byteArray56 = new byte[] { (byte) 1 };
        outputStream52.write(byteArray56);
        outputStream45.write(byteArray56);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream59 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream45);
        java.io.OutputStream outputStream60 = java.io.OutputStream.nullOutputStream();
        outputStream60.flush();
        outputStream60.flush();
        byte[] byteArray64 = new byte[] { (byte) 1 };
        outputStream60.write(byteArray64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream66 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream60);
        java.io.OutputStream outputStream67 = java.io.OutputStream.nullOutputStream();
        outputStream67.flush();
        outputStream67.flush();
        byte[] byteArray71 = new byte[] { (byte) 1 };
        outputStream67.write(byteArray71);
        outputStream60.write(byteArray71);
        outputStream45.write(byteArray71);
        outputStream29.write(byteArray71);
        outputStream26.write(byteArray71);
        cpioArchiveOutputStream21.write(byteArray71, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream9.write(byteArray71, (int) (short) 4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream26);
        org.junit.Assert.assertNotNull(outputStream29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream45);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream60);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream67);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 1 });
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream11.finish();
        cpioArchiveOutputStream11.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11, (short) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        cpioArchiveOutputStream15.finish();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(0);
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream12.write(49152);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.write((int) (short) 12);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream3.putNextEntry(cpioArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream11.finish();
        cpioArchiveOutputStream11.write(512);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        cpioArchiveOutputStream15.flush();
        cpioArchiveOutputStream15.finish();
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        outputStream18.flush();
        outputStream18.flush();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        outputStream18.write(byteArray22);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream18);
        java.io.OutputStream outputStream25 = java.io.OutputStream.nullOutputStream();
        outputStream25.flush();
        outputStream25.flush();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        outputStream25.write(byteArray29);
        outputStream18.write(byteArray29);
        outputStream18.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream18);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream18, (short) 1);
        java.io.OutputStream outputStream36 = java.io.OutputStream.nullOutputStream();
        outputStream36.flush();
        outputStream36.flush();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        outputStream36.write(byteArray40);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream42 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream36);
        cpioArchiveOutputStream42.write(49152);
        cpioArchiveOutputStream42.flush();
        cpioArchiveOutputStream42.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream47 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream42);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream48 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream42);
        byte[] byteArray49 = new byte[] {};
        cpioArchiveOutputStream42.write(byteArray49);
        outputStream18.write(byteArray49);
        cpioArchiveOutputStream15.write(byteArray49);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream53 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        cpioArchiveOutputStream15.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream56 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15, (short) (byte) 1);
        java.lang.Class<?> wildcardClass57 = cpioArchiveOutputStream56.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        cpioArchiveOutputStream14.write(0);
        cpioArchiveOutputStream14.close();
        java.io.OutputStream outputStream20 = java.io.OutputStream.nullOutputStream();
        outputStream20.flush();
        java.io.OutputStream outputStream22 = java.io.OutputStream.nullOutputStream();
        outputStream22.flush();
        outputStream22.flush();
        byte[] byteArray26 = new byte[] { (byte) 1 };
        outputStream22.write(byteArray26);
        outputStream20.write(byteArray26);
        java.io.OutputStream outputStream29 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream29);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream29);
        java.io.OutputStream outputStream32 = java.io.OutputStream.nullOutputStream();
        outputStream32.flush();
        outputStream32.flush();
        byte[] byteArray36 = new byte[] { (byte) 1 };
        outputStream32.write(byteArray36);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream38 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream32);
        java.io.OutputStream outputStream39 = java.io.OutputStream.nullOutputStream();
        outputStream39.flush();
        outputStream39.flush();
        byte[] byteArray43 = new byte[] { (byte) 1 };
        outputStream39.write(byteArray43);
        outputStream32.write(byteArray43);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream46 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream32);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream47 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream32);
        java.io.OutputStream outputStream48 = java.io.OutputStream.nullOutputStream();
        outputStream48.flush();
        outputStream48.flush();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        outputStream48.write(byteArray52);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream54 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream48);
        java.io.OutputStream outputStream55 = java.io.OutputStream.nullOutputStream();
        outputStream55.flush();
        outputStream55.flush();
        byte[] byteArray59 = new byte[] { (byte) 1 };
        outputStream55.write(byteArray59);
        outputStream48.write(byteArray59);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream62 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream48);
        java.io.OutputStream outputStream63 = java.io.OutputStream.nullOutputStream();
        outputStream63.flush();
        outputStream63.flush();
        byte[] byteArray67 = new byte[] { (byte) 1 };
        outputStream63.write(byteArray67);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream69 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream63);
        java.io.OutputStream outputStream70 = java.io.OutputStream.nullOutputStream();
        outputStream70.flush();
        outputStream70.flush();
        byte[] byteArray74 = new byte[] { (byte) 1 };
        outputStream70.write(byteArray74);
        outputStream63.write(byteArray74);
        outputStream48.write(byteArray74);
        outputStream32.write(byteArray74);
        outputStream29.write(byteArray74);
        outputStream20.write(byteArray74);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream14.write(byteArray74, 2048, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream20);
        org.junit.Assert.assertNotNull(outputStream22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream29);
        org.junit.Assert.assertNotNull(outputStream32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream48);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream55);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream63);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream70);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 1 });
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, (short) 1);
        cpioArchiveOutputStream3.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.close();
        cpioArchiveOutputStream3.write((int) 'a');
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream3.putNextEntry(cpioArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(32768);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream13);
        cpioArchiveOutputStream13.write((int) ' ');
        cpioArchiveOutputStream13.write((int) (short) 4);
        cpioArchiveOutputStream13.flush();
        cpioArchiveOutputStream13.finish();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.putNextEntry(cpioArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream15.write(32768);
        cpioArchiveOutputStream15.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15, (short) 2);
        cpioArchiveOutputStream15.close();
        cpioArchiveOutputStream15.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry23 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream15.putNextEntry(cpioArchiveEntry23);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17, (short) 1);
        cpioArchiveOutputStream19.finish();
        cpioArchiveOutputStream19.close();
        cpioArchiveOutputStream19.write(16384);
        java.io.OutputStream outputStream24 = java.io.OutputStream.nullOutputStream();
        outputStream24.flush();
        outputStream24.flush();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        outputStream24.write(byteArray28);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream24);
        cpioArchiveOutputStream30.finish();
        cpioArchiveOutputStream30.write(32);
        cpioArchiveOutputStream30.write(4);
        cpioArchiveOutputStream30.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream38 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream30, (short) 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream39 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream30);
        java.io.OutputStream outputStream40 = java.io.OutputStream.nullOutputStream();
        outputStream40.flush();
        outputStream40.flush();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        outputStream40.write(byteArray44);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream46 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream40);
        cpioArchiveOutputStream46.write(49152);
        cpioArchiveOutputStream46.flush();
        cpioArchiveOutputStream46.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream52 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream46);
        cpioArchiveOutputStream52.finish();
        cpioArchiveOutputStream52.write((int) ' ');
        cpioArchiveOutputStream52.flush();
        java.io.OutputStream outputStream57 = java.io.OutputStream.nullOutputStream();
        outputStream57.flush();
        outputStream57.flush();
        byte[] byteArray61 = new byte[] { (byte) 1 };
        outputStream57.write(byteArray61);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream63 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream57);
        cpioArchiveOutputStream63.close();
        cpioArchiveOutputStream63.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream67 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream63, (short) (byte) 1);
        java.io.OutputStream outputStream68 = java.io.OutputStream.nullOutputStream();
        outputStream68.flush();
        outputStream68.flush();
        byte[] byteArray72 = new byte[] { (byte) 1 };
        outputStream68.write(byteArray72);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream74 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream68);
        cpioArchiveOutputStream74.write(49152);
        cpioArchiveOutputStream74.flush();
        cpioArchiveOutputStream74.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream79 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream74);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream80 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream74);
        byte[] byteArray81 = new byte[] {};
        cpioArchiveOutputStream74.write(byteArray81);
        cpioArchiveOutputStream67.write(byteArray81);
        cpioArchiveOutputStream52.write(byteArray81);
        cpioArchiveOutputStream30.write(byteArray81);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream19.write(byteArray81);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream57);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream68);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] {});
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        cpioArchiveOutputStream17.finish();
        cpioArchiveOutputStream17.write((int) (short) 3);
        java.io.OutputStream outputStream22 = java.io.OutputStream.nullOutputStream();
        outputStream22.flush();
        java.io.OutputStream outputStream24 = java.io.OutputStream.nullOutputStream();
        outputStream24.flush();
        outputStream24.flush();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        outputStream24.write(byteArray28);
        outputStream22.write(byteArray28);
        java.io.OutputStream outputStream31 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream31);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream31);
        java.io.OutputStream outputStream34 = java.io.OutputStream.nullOutputStream();
        outputStream34.flush();
        outputStream34.flush();
        byte[] byteArray38 = new byte[] { (byte) 1 };
        outputStream34.write(byteArray38);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream40 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream34);
        java.io.OutputStream outputStream41 = java.io.OutputStream.nullOutputStream();
        outputStream41.flush();
        outputStream41.flush();
        byte[] byteArray45 = new byte[] { (byte) 1 };
        outputStream41.write(byteArray45);
        outputStream34.write(byteArray45);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream48 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream34);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream49 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream34);
        java.io.OutputStream outputStream50 = java.io.OutputStream.nullOutputStream();
        outputStream50.flush();
        outputStream50.flush();
        byte[] byteArray54 = new byte[] { (byte) 1 };
        outputStream50.write(byteArray54);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream56 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream50);
        java.io.OutputStream outputStream57 = java.io.OutputStream.nullOutputStream();
        outputStream57.flush();
        outputStream57.flush();
        byte[] byteArray61 = new byte[] { (byte) 1 };
        outputStream57.write(byteArray61);
        outputStream50.write(byteArray61);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream64 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream50);
        java.io.OutputStream outputStream65 = java.io.OutputStream.nullOutputStream();
        outputStream65.flush();
        outputStream65.flush();
        byte[] byteArray69 = new byte[] { (byte) 1 };
        outputStream65.write(byteArray69);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream71 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream65);
        java.io.OutputStream outputStream72 = java.io.OutputStream.nullOutputStream();
        outputStream72.flush();
        outputStream72.flush();
        byte[] byteArray76 = new byte[] { (byte) 1 };
        outputStream72.write(byteArray76);
        outputStream65.write(byteArray76);
        outputStream50.write(byteArray76);
        outputStream34.write(byteArray76);
        outputStream31.write(byteArray76);
        outputStream22.write(byteArray76);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream17.write(byteArray76, 1, 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream22);
        org.junit.Assert.assertNotNull(outputStream24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream31);
        org.junit.Assert.assertNotNull(outputStream34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream50);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream57);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream65);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream72);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 1 });
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream1 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        java.io.OutputStream outputStream3 = java.io.OutputStream.nullOutputStream();
        outputStream3.flush();
        outputStream3.flush();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        outputStream3.write(byteArray7);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        outputStream9.flush();
        outputStream9.flush();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        outputStream9.write(byteArray13);
        outputStream3.write(byteArray13);
        outputStream1.write(byteArray13);
        outputStream0.write(byteArray13);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19, (short) 2);
        cpioArchiveOutputStream22.write(0);
        cpioArchiveOutputStream22.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry27 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream22.putNextEntry(cpioArchiveEntry27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream1);
        org.junit.Assert.assertNotNull(outputStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1 });
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.write((int) '#');
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream18.close();
        cpioArchiveOutputStream18.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        cpioArchiveOutputStream17.write((int) (short) 8);
        cpioArchiveOutputStream17.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        cpioArchiveOutputStream17.write((int) (short) 0);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream20.write(36864);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        cpioArchiveOutputStream23.write(128);
        cpioArchiveOutputStream23.finish();
        cpioArchiveOutputStream23.close();
        cpioArchiveOutputStream23.close();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.write(32);
        cpioArchiveOutputStream3.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(32768);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream14.flush();
        cpioArchiveOutputStream14.write((int) ' ');
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) 8);
        cpioArchiveOutputStream14.write((int) (byte) 1);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) 2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        java.io.OutputStream outputStream19 = java.io.OutputStream.nullOutputStream();
        outputStream19.flush();
        outputStream19.flush();
        byte[] byteArray23 = new byte[] { (byte) 1 };
        outputStream19.write(byteArray23);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream19);
        cpioArchiveOutputStream25.finish();
        cpioArchiveOutputStream25.write(0);
        cpioArchiveOutputStream25.close();
        cpioArchiveOutputStream25.write(40960);
        cpioArchiveOutputStream25.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream34 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream25, (short) 4);
        cpioArchiveOutputStream34.write(29127);
        cpioArchiveOutputStream34.finish();
        java.io.OutputStream outputStream38 = java.io.OutputStream.nullOutputStream();
        outputStream38.flush();
        outputStream38.flush();
        byte[] byteArray42 = new byte[] { (byte) 1 };
        outputStream38.write(byteArray42);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream44 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream38);
        cpioArchiveOutputStream44.write(49152);
        cpioArchiveOutputStream44.flush();
        cpioArchiveOutputStream44.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream49 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream44);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream50 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream44);
        byte[] byteArray51 = new byte[] {};
        cpioArchiveOutputStream44.write(byteArray51);
        cpioArchiveOutputStream34.write(byteArray51);
        cpioArchiveOutputStream18.write(byteArray51);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream56 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18, (short) (byte) 1);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream4.write(100);
        cpioArchiveOutputStream4.write((int) (short) -1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        outputStream10.flush();
        outputStream10.flush();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        outputStream10.write(byteArray14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10);
        cpioArchiveOutputStream16.write(49152);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream16);
        cpioArchiveOutputStream16.flush();
        cpioArchiveOutputStream16.finish();
        cpioArchiveOutputStream16.write(10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream16);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream16);
        java.io.OutputStream outputStream26 = java.io.OutputStream.nullOutputStream();
        outputStream26.flush();
        outputStream26.flush();
        byte[] byteArray30 = new byte[] { (byte) 1 };
        outputStream26.write(byteArray30);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream26);
        cpioArchiveOutputStream32.write(49152);
        cpioArchiveOutputStream32.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream36 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream32);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream36);
        cpioArchiveOutputStream37.finish();
        java.io.OutputStream outputStream39 = java.io.OutputStream.nullOutputStream();
        outputStream39.flush();
        outputStream39.flush();
        byte[] byteArray43 = new byte[] { (byte) 1 };
        outputStream39.write(byteArray43);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream45 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream39);
        cpioArchiveOutputStream45.write(49152);
        cpioArchiveOutputStream45.flush();
        cpioArchiveOutputStream45.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream50 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream45);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream51 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream45);
        byte[] byteArray52 = new byte[] {};
        cpioArchiveOutputStream45.write(byteArray52);
        cpioArchiveOutputStream37.write(byteArray52);
        cpioArchiveOutputStream16.write(byteArray52);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream4.write(byteArray52, 1, 32768);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.close();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(32768);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream12.close();
        cpioArchiveOutputStream12.flush();
        cpioArchiveOutputStream12.write(61440);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        outputStream18.flush();
        outputStream18.flush();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        outputStream18.write(byteArray22);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream18);
        cpioArchiveOutputStream24.finish();
        cpioArchiveOutputStream24.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream24);
        cpioArchiveOutputStream28.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream28);
        java.io.OutputStream outputStream31 = java.io.OutputStream.nullOutputStream();
        outputStream31.flush();
        outputStream31.flush();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        outputStream31.write(byteArray35);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream31);
        cpioArchiveOutputStream37.write(49152);
        cpioArchiveOutputStream37.flush();
        cpioArchiveOutputStream37.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream37);
        cpioArchiveOutputStream43.finish();
        cpioArchiveOutputStream43.write((int) ' ');
        cpioArchiveOutputStream43.flush();
        java.io.OutputStream outputStream48 = java.io.OutputStream.nullOutputStream();
        outputStream48.flush();
        outputStream48.flush();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        outputStream48.write(byteArray52);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream54 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream48);
        cpioArchiveOutputStream54.close();
        cpioArchiveOutputStream54.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream58 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream54, (short) (byte) 1);
        java.io.OutputStream outputStream59 = java.io.OutputStream.nullOutputStream();
        outputStream59.flush();
        outputStream59.flush();
        byte[] byteArray63 = new byte[] { (byte) 1 };
        outputStream59.write(byteArray63);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream65 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream59);
        cpioArchiveOutputStream65.write(49152);
        cpioArchiveOutputStream65.flush();
        cpioArchiveOutputStream65.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream70 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream65);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream71 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream65);
        byte[] byteArray72 = new byte[] {};
        cpioArchiveOutputStream65.write(byteArray72);
        cpioArchiveOutputStream58.write(byteArray72);
        cpioArchiveOutputStream43.write(byteArray72);
        cpioArchiveOutputStream30.write(byteArray72);
        cpioArchiveOutputStream17.write(byteArray72);
        cpioArchiveOutputStream17.write(4096);
        cpioArchiveOutputStream17.write(1);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream48);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] {});
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream1 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        java.io.OutputStream outputStream3 = java.io.OutputStream.nullOutputStream();
        outputStream3.flush();
        outputStream3.flush();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        outputStream3.write(byteArray7);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        outputStream9.flush();
        outputStream9.flush();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        outputStream9.write(byteArray13);
        outputStream3.write(byteArray13);
        outputStream1.write(byteArray13);
        outputStream0.write(byteArray13);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19, (short) 2);
        cpioArchiveOutputStream22.write(0);
        cpioArchiveOutputStream22.write(64);
        cpioArchiveOutputStream22.flush();
        cpioArchiveOutputStream22.finish();
        byte[] byteArray29 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream22.write(byteArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream1);
        org.junit.Assert.assertNotNull(outputStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1 });
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.putArchiveEntry(archiveEntry21);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream15.write((int) (byte) 1);
        cpioArchiveOutputStream15.write(0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17, (short) 1);
        cpioArchiveOutputStream17.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream15.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream18.putNextEntry(cpioArchiveEntry19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        cpioArchiveOutputStream14.write(0);
        cpioArchiveOutputStream14.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream22.finish();
        cpioArchiveOutputStream22.close();
        java.io.OutputStream outputStream25 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream26 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream26);
        java.io.OutputStream outputStream28 = java.io.OutputStream.nullOutputStream();
        outputStream28.flush();
        outputStream28.flush();
        byte[] byteArray32 = new byte[] { (byte) 1 };
        outputStream28.write(byteArray32);
        java.io.OutputStream outputStream34 = java.io.OutputStream.nullOutputStream();
        outputStream34.flush();
        outputStream34.flush();
        byte[] byteArray38 = new byte[] { (byte) 1 };
        outputStream34.write(byteArray38);
        outputStream28.write(byteArray38);
        outputStream26.write(byteArray38);
        outputStream25.write(byteArray38);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream25);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream44 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream43);
        cpioArchiveOutputStream43.flush();
        cpioArchiveOutputStream43.write((int) (short) 4);
        cpioArchiveOutputStream43.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream51 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream43, (short) 2);
        java.io.OutputStream outputStream52 = java.io.OutputStream.nullOutputStream();
        outputStream52.flush();
        outputStream52.flush();
        byte[] byteArray56 = new byte[] { (byte) 1 };
        outputStream52.write(byteArray56);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream58 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream52);
        cpioArchiveOutputStream58.finish();
        cpioArchiveOutputStream58.write(0);
        cpioArchiveOutputStream58.close();
        cpioArchiveOutputStream58.write(40960);
        cpioArchiveOutputStream58.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream67 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream58, (short) 4);
        cpioArchiveOutputStream67.write(512);
        java.io.OutputStream outputStream70 = java.io.OutputStream.nullOutputStream();
        outputStream70.flush();
        outputStream70.flush();
        byte[] byteArray74 = new byte[] { (byte) 1 };
        outputStream70.write(byteArray74);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream76 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream70);
        cpioArchiveOutputStream76.write(49152);
        cpioArchiveOutputStream76.flush();
        cpioArchiveOutputStream76.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream81 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream76);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream82 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream76);
        byte[] byteArray83 = new byte[] {};
        cpioArchiveOutputStream76.write(byteArray83);
        cpioArchiveOutputStream67.write(byteArray83);
        cpioArchiveOutputStream43.write(byteArray83);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream22.write(byteArray83, (int) ' ', 8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream25);
        org.junit.Assert.assertNotNull(outputStream26);
        org.junit.Assert.assertNotNull(outputStream28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream70);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] {});
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        cpioArchiveOutputStream10.write((int) (short) 100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
        outputStream17.flush();
        outputStream17.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream17);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20, (short) (byte) 1);
        cpioArchiveOutputStream20.finish();
        java.io.OutputStream outputStream25 = java.io.OutputStream.nullOutputStream();
        outputStream25.flush();
        outputStream25.flush();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        outputStream25.write(byteArray29);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream25);
        cpioArchiveOutputStream31.finish();
        cpioArchiveOutputStream31.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream31);
        cpioArchiveOutputStream35.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream35);
        java.io.OutputStream outputStream38 = java.io.OutputStream.nullOutputStream();
        outputStream38.flush();
        outputStream38.flush();
        byte[] byteArray42 = new byte[] { (byte) 1 };
        outputStream38.write(byteArray42);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream44 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream38);
        cpioArchiveOutputStream44.write(49152);
        cpioArchiveOutputStream44.flush();
        cpioArchiveOutputStream44.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream50 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream44);
        cpioArchiveOutputStream50.finish();
        cpioArchiveOutputStream50.write((int) ' ');
        cpioArchiveOutputStream50.flush();
        java.io.OutputStream outputStream55 = java.io.OutputStream.nullOutputStream();
        outputStream55.flush();
        outputStream55.flush();
        byte[] byteArray59 = new byte[] { (byte) 1 };
        outputStream55.write(byteArray59);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream61 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream55);
        cpioArchiveOutputStream61.close();
        cpioArchiveOutputStream61.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream65 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream61, (short) (byte) 1);
        java.io.OutputStream outputStream66 = java.io.OutputStream.nullOutputStream();
        outputStream66.flush();
        outputStream66.flush();
        byte[] byteArray70 = new byte[] { (byte) 1 };
        outputStream66.write(byteArray70);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream72 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream66);
        cpioArchiveOutputStream72.write(49152);
        cpioArchiveOutputStream72.flush();
        cpioArchiveOutputStream72.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream77 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream72);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream78 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream72);
        byte[] byteArray79 = new byte[] {};
        cpioArchiveOutputStream72.write(byteArray79);
        cpioArchiveOutputStream65.write(byteArray79);
        cpioArchiveOutputStream50.write(byteArray79);
        cpioArchiveOutputStream37.write(byteArray79);
        cpioArchiveOutputStream20.write(byteArray79);
        cpioArchiveOutputStream16.write(byteArray79);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(outputStream25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream55);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream66);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] {});
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream9.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        cpioArchiveOutputStream11.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream11.putArchiveEntry(archiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32768);
        cpioArchiveOutputStream6.write((int) (short) 8);
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18, (short) 2);
        java.lang.Class<?> wildcardClass21 = cpioArchiveOutputStream18.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.write(32);
        cpioArchiveOutputStream3.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        outputStream10.flush();
        outputStream10.flush();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        outputStream10.write(byteArray14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10);
        cpioArchiveOutputStream16.finish();
        cpioArchiveOutputStream16.write(32);
        cpioArchiveOutputStream16.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream16);
        cpioArchiveOutputStream21.finish();
        cpioArchiveOutputStream21.write(512);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        cpioArchiveOutputStream21.flush();
        java.io.OutputStream outputStream27 = java.io.OutputStream.nullOutputStream();
        outputStream27.flush();
        outputStream27.flush();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        outputStream27.write(byteArray31);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream27);
        cpioArchiveOutputStream33.write(49152);
        cpioArchiveOutputStream33.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream33);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream38 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream37);
        cpioArchiveOutputStream38.finish();
        java.io.OutputStream outputStream40 = java.io.OutputStream.nullOutputStream();
        outputStream40.flush();
        outputStream40.flush();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        outputStream40.write(byteArray44);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream46 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream40);
        cpioArchiveOutputStream46.write(49152);
        cpioArchiveOutputStream46.flush();
        cpioArchiveOutputStream46.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream51 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream46);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream52 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream46);
        byte[] byteArray53 = new byte[] {};
        cpioArchiveOutputStream46.write(byteArray53);
        cpioArchiveOutputStream38.write(byteArray53);
        cpioArchiveOutputStream21.write(byteArray53);
        cpioArchiveOutputStream9.write(byteArray53);
        java.lang.Class<?> wildcardClass58 = byteArray53.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32768);
        cpioArchiveOutputStream6.write((int) (short) 8);
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(16384);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.write(64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12, (short) (byte) 1);
        cpioArchiveOutputStream14.write((int) (short) 3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream17.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17, (short) 2);
        cpioArchiveOutputStream17.close();
        cpioArchiveOutputStream17.close();
        cpioArchiveOutputStream17.flush();
        cpioArchiveOutputStream17.write(0);
        cpioArchiveOutputStream17.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry26 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream17.putNextEntry(cpioArchiveEntry26);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        cpioArchiveOutputStream10.write(2048);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream9.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        cpioArchiveOutputStream11.close();
        cpioArchiveOutputStream11.write((int) (byte) 1);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.write(29127);
        cpioArchiveOutputStream6.close();
        java.lang.Class<?> wildcardClass13 = cpioArchiveOutputStream6.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream10.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        cpioArchiveOutputStream10.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        cpioArchiveOutputStream10.close();
        cpioArchiveOutputStream10.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream10.putNextEntry(cpioArchiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream11.finish();
        cpioArchiveOutputStream11.finish();
        cpioArchiveOutputStream11.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        java.lang.Class<?> wildcardClass16 = cpioArchiveOutputStream11.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream20.write(36864);
        cpioArchiveOutputStream20.write(0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        cpioArchiveOutputStream20.flush();
        cpioArchiveOutputStream20.finish();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(24576);
        cpioArchiveOutputStream6.write((int) (short) -1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 1);
        cpioArchiveOutputStream15.flush();
        cpioArchiveOutputStream15.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream18.putArchiveEntry(archiveEntry19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32768);
        cpioArchiveOutputStream6.write((int) (short) 8);
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(16384);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.write(64);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream1 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        java.io.OutputStream outputStream3 = java.io.OutputStream.nullOutputStream();
        outputStream3.flush();
        outputStream3.flush();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        outputStream3.write(byteArray7);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        outputStream9.flush();
        outputStream9.flush();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        outputStream9.write(byteArray13);
        outputStream3.write(byteArray13);
        outputStream1.write(byteArray13);
        outputStream0.write(byteArray13);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream18.finish();
        java.io.OutputStream outputStream20 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream21 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        java.io.OutputStream outputStream23 = java.io.OutputStream.nullOutputStream();
        outputStream23.flush();
        outputStream23.flush();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        outputStream23.write(byteArray27);
        java.io.OutputStream outputStream29 = java.io.OutputStream.nullOutputStream();
        outputStream29.flush();
        outputStream29.flush();
        byte[] byteArray33 = new byte[] { (byte) 1 };
        outputStream29.write(byteArray33);
        outputStream23.write(byteArray33);
        outputStream21.write(byteArray33);
        outputStream20.write(byteArray33);
        cpioArchiveOutputStream18.write(byteArray33, (int) (byte) 1, (int) (short) 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream41 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream42 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        cpioArchiveOutputStream42.close();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream42.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream1);
        org.junit.Assert.assertNotNull(outputStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream20);
        org.junit.Assert.assertNotNull(outputStream21);
        org.junit.Assert.assertNotNull(outputStream23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 1 });
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream2.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream2.putArchiveEntry(archiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(29127);
        cpioArchiveOutputStream14.finish();
        cpioArchiveOutputStream14.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22, (short) 4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream22.putArchiveEntry(archiveEntry27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.write(0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream7.close();
        cpioArchiveOutputStream7.write((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream20.write(36864);
        cpioArchiveOutputStream20.write(0);
        cpioArchiveOutputStream20.finish();
        cpioArchiveOutputStream20.close();
        cpioArchiveOutputStream20.flush();
        cpioArchiveOutputStream20.flush();
        java.lang.Class<?> wildcardClass29 = cpioArchiveOutputStream20.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        cpioArchiveOutputStream17.write((int) (short) 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        cpioArchiveOutputStream17.write(4096);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        cpioArchiveOutputStream17.close();
        java.lang.Class<?> wildcardClass25 = cpioArchiveOutputStream17.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream24.write(32768);
        cpioArchiveOutputStream24.close();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.flush();
        java.lang.Class<?> wildcardClass17 = cpioArchiveOutputStream6.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.write(32);
        cpioArchiveOutputStream3.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream9.write((int) (short) 2);
        cpioArchiveOutputStream9.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream9.putArchiveEntry(archiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(61440);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21, (short) 4);
        java.lang.Class<?> wildcardClass24 = cpioArchiveOutputStream21.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream12.finish();
        cpioArchiveOutputStream12.write((int) ' ');
        cpioArchiveOutputStream12.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream12.putArchiveEntry(archiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream2);
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        java.io.OutputStream outputStream3 = java.io.OutputStream.nullOutputStream();
        outputStream3.flush();
        java.io.OutputStream outputStream5 = java.io.OutputStream.nullOutputStream();
        outputStream5.flush();
        outputStream5.flush();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        outputStream5.write(byteArray9);
        outputStream3.write(byteArray9);
        outputStream0.write(byteArray9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream16 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream18);
        java.io.OutputStream outputStream20 = java.io.OutputStream.nullOutputStream();
        outputStream20.flush();
        outputStream20.flush();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        outputStream20.write(byteArray24);
        java.io.OutputStream outputStream26 = java.io.OutputStream.nullOutputStream();
        outputStream26.flush();
        outputStream26.flush();
        byte[] byteArray30 = new byte[] { (byte) 1 };
        outputStream26.write(byteArray30);
        outputStream20.write(byteArray30);
        outputStream18.write(byteArray30);
        outputStream16.write(byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream15.write(byteArray30);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream3);
        org.junit.Assert.assertNotNull(outputStream5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream16);
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(outputStream20);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 1 });
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.write(40960);
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 4);
        cpioArchiveOutputStream15.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 1);
        cpioArchiveOutputStream11.finish();
        java.io.OutputStream outputStream13 = java.io.OutputStream.nullOutputStream();
        outputStream13.flush();
        outputStream13.flush();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        outputStream13.write(byteArray17);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13);
        cpioArchiveOutputStream19.write(49152);
        cpioArchiveOutputStream19.flush();
        cpioArchiveOutputStream19.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        cpioArchiveOutputStream19.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19, (short) 4);
        cpioArchiveOutputStream19.finish();
        cpioArchiveOutputStream19.write((int) (byte) 10);
        cpioArchiveOutputStream19.finish();
        java.io.OutputStream outputStream33 = java.io.OutputStream.nullOutputStream();
        outputStream33.flush();
        outputStream33.flush();
        byte[] byteArray37 = new byte[] { (byte) 1 };
        outputStream33.write(byteArray37);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream39 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream33);
        cpioArchiveOutputStream39.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream42 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream39, (short) 1);
        java.io.OutputStream outputStream43 = java.io.OutputStream.nullOutputStream();
        outputStream43.flush();
        outputStream43.flush();
        byte[] byteArray47 = new byte[] { (byte) 1 };
        outputStream43.write(byteArray47);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream49 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream43);
        cpioArchiveOutputStream49.finish();
        cpioArchiveOutputStream49.write(32);
        cpioArchiveOutputStream49.write(32768);
        cpioArchiveOutputStream49.finish();
        cpioArchiveOutputStream49.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream57 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream49);
        cpioArchiveOutputStream49.write(8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream60 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream49);
        java.io.OutputStream outputStream61 = java.io.OutputStream.nullOutputStream();
        outputStream61.flush();
        outputStream61.flush();
        byte[] byteArray65 = new byte[] { (byte) 1 };
        outputStream61.write(byteArray65);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream67 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream61);
        cpioArchiveOutputStream67.write(49152);
        cpioArchiveOutputStream67.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream71 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream67);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream72 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream71);
        cpioArchiveOutputStream72.finish();
        java.io.OutputStream outputStream74 = java.io.OutputStream.nullOutputStream();
        outputStream74.flush();
        outputStream74.flush();
        byte[] byteArray78 = new byte[] { (byte) 1 };
        outputStream74.write(byteArray78);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream80 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream74);
        cpioArchiveOutputStream80.write(49152);
        cpioArchiveOutputStream80.flush();
        cpioArchiveOutputStream80.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream85 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream80);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream86 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream80);
        byte[] byteArray87 = new byte[] {};
        cpioArchiveOutputStream80.write(byteArray87);
        cpioArchiveOutputStream72.write(byteArray87);
        cpioArchiveOutputStream60.write(byteArray87);
        cpioArchiveOutputStream42.write(byteArray87);
        cpioArchiveOutputStream19.write(byteArray87);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream11.write(byteArray87, (int) (short) 12, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream13);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream33);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream61);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream74);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] {});
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream4.flush();
        cpioArchiveOutputStream4.write((int) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        cpioArchiveOutputStream4.finish();
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        cpioArchiveOutputStream11.flush();
        cpioArchiveOutputStream11.write(4096);
        cpioArchiveOutputStream11.write(1);
        cpioArchiveOutputStream11.write(24576);
        java.io.OutputStream outputStream20 = java.io.OutputStream.nullOutputStream();
        outputStream20.flush();
        outputStream20.flush();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        outputStream20.write(byteArray24);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        cpioArchiveOutputStream26.write(49152);
        cpioArchiveOutputStream26.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream26);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream30);
        java.io.OutputStream outputStream32 = java.io.OutputStream.nullOutputStream();
        outputStream32.flush();
        outputStream32.flush();
        byte[] byteArray36 = new byte[] { (byte) 1 };
        outputStream32.write(byteArray36);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream38 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream32);
        java.io.OutputStream outputStream39 = java.io.OutputStream.nullOutputStream();
        outputStream39.flush();
        outputStream39.flush();
        byte[] byteArray43 = new byte[] { (byte) 1 };
        outputStream39.write(byteArray43);
        outputStream32.write(byteArray43);
        outputStream32.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream47 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream32);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream49 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream32, (short) 1);
        java.io.OutputStream outputStream50 = java.io.OutputStream.nullOutputStream();
        outputStream50.flush();
        outputStream50.flush();
        byte[] byteArray54 = new byte[] { (byte) 1 };
        outputStream50.write(byteArray54);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream56 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream50);
        cpioArchiveOutputStream56.write(49152);
        cpioArchiveOutputStream56.flush();
        cpioArchiveOutputStream56.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream61 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream56);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream62 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream56);
        byte[] byteArray63 = new byte[] {};
        cpioArchiveOutputStream56.write(byteArray63);
        outputStream32.write(byteArray63);
        cpioArchiveOutputStream30.write(byteArray63);
        cpioArchiveOutputStream11.write(byteArray63);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry68 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream11.putNextEntry(cpioArchiveEntry68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream20);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream50);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream9.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        java.io.OutputStream outputStream13 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13);
        java.io.OutputStream outputStream15 = java.io.OutputStream.nullOutputStream();
        outputStream15.flush();
        outputStream15.flush();
        byte[] byteArray19 = new byte[] { (byte) 1 };
        outputStream15.write(byteArray19);
        java.io.OutputStream outputStream21 = java.io.OutputStream.nullOutputStream();
        outputStream21.flush();
        outputStream21.flush();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        outputStream21.write(byteArray25);
        outputStream15.write(byteArray25);
        outputStream13.write(byteArray25);
        java.io.OutputStream outputStream29 = java.io.OutputStream.nullOutputStream();
        outputStream29.flush();
        outputStream29.flush();
        byte[] byteArray33 = new byte[] { (byte) 1 };
        outputStream29.write(byteArray33);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream29);
        cpioArchiveOutputStream35.write(49152);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream38 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream35);
        cpioArchiveOutputStream35.flush();
        cpioArchiveOutputStream35.finish();
        cpioArchiveOutputStream35.write(10);
        cpioArchiveOutputStream35.write((int) (short) 2);
        java.io.OutputStream outputStream45 = java.io.OutputStream.nullOutputStream();
        outputStream45.flush();
        outputStream45.flush();
        byte[] byteArray49 = new byte[] { (byte) 1 };
        outputStream45.write(byteArray49);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream51 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream45);
        cpioArchiveOutputStream51.finish();
        cpioArchiveOutputStream51.write(32);
        cpioArchiveOutputStream51.write(32768);
        cpioArchiveOutputStream51.finish();
        cpioArchiveOutputStream51.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream59 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream51);
        cpioArchiveOutputStream51.write(8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream62 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream51);
        java.io.OutputStream outputStream63 = java.io.OutputStream.nullOutputStream();
        outputStream63.flush();
        outputStream63.flush();
        byte[] byteArray67 = new byte[] { (byte) 1 };
        outputStream63.write(byteArray67);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream69 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream63);
        cpioArchiveOutputStream69.write(49152);
        cpioArchiveOutputStream69.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream73 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream69);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream74 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream73);
        cpioArchiveOutputStream74.finish();
        java.io.OutputStream outputStream76 = java.io.OutputStream.nullOutputStream();
        outputStream76.flush();
        outputStream76.flush();
        byte[] byteArray80 = new byte[] { (byte) 1 };
        outputStream76.write(byteArray80);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream82 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream76);
        cpioArchiveOutputStream82.write(49152);
        cpioArchiveOutputStream82.flush();
        cpioArchiveOutputStream82.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream87 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream82);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream88 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream82);
        byte[] byteArray89 = new byte[] {};
        cpioArchiveOutputStream82.write(byteArray89);
        cpioArchiveOutputStream74.write(byteArray89);
        cpioArchiveOutputStream62.write(byteArray89);
        cpioArchiveOutputStream35.write(byteArray89);
        outputStream13.write(byteArray89);
        cpioArchiveOutputStream9.write(byteArray89);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream13);
        org.junit.Assert.assertNotNull(outputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream45);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream63);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream76);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] {});
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.write((int) (short) 3);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream20.write(36864);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream23, (short) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream25);
        cpioArchiveOutputStream25.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream11.finish();
        cpioArchiveOutputStream11.finish();
        cpioArchiveOutputStream11.finish();
        cpioArchiveOutputStream11.write(0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        cpioArchiveOutputStream17.close();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(29127);
        cpioArchiveOutputStream14.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream24.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        cpioArchiveOutputStream11.flush();
        cpioArchiveOutputStream11.write(4096);
        cpioArchiveOutputStream11.write(1);
        cpioArchiveOutputStream11.write(24576);
        cpioArchiveOutputStream11.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream11.putNextEntry(cpioArchiveEntry21);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 1);
        cpioArchiveOutputStream11.finish();
        cpioArchiveOutputStream11.write(40960);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        cpioArchiveOutputStream11.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream11.putArchiveEntry(archiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) (byte) 1);
        cpioArchiveOutputStream10.write(16384);
        cpioArchiveOutputStream10.write((int) (short) 2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        java.io.OutputStream outputStream16 = java.io.OutputStream.nullOutputStream();
        outputStream16.flush();
        outputStream16.flush();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        outputStream16.write(byteArray20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        cpioArchiveOutputStream22.write(49152);
        cpioArchiveOutputStream22.flush();
        cpioArchiveOutputStream22.write(100);
        cpioArchiveOutputStream22.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        cpioArchiveOutputStream29.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream29);
        java.io.OutputStream outputStream32 = java.io.OutputStream.nullOutputStream();
        outputStream32.flush();
        outputStream32.flush();
        byte[] byteArray36 = new byte[] { (byte) 1 };
        outputStream32.write(byteArray36);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream38 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream32);
        cpioArchiveOutputStream38.finish();
        cpioArchiveOutputStream38.write(32);
        cpioArchiveOutputStream38.write(32768);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream44 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream38);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream45 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream44);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream46 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream45);
        cpioArchiveOutputStream46.finish();
        java.io.OutputStream outputStream48 = java.io.OutputStream.nullOutputStream();
        outputStream48.flush();
        outputStream48.flush();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        outputStream48.write(byteArray52);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream54 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream48);
        java.io.OutputStream outputStream55 = java.io.OutputStream.nullOutputStream();
        outputStream55.flush();
        outputStream55.flush();
        byte[] byteArray59 = new byte[] { (byte) 1 };
        outputStream55.write(byteArray59);
        outputStream48.write(byteArray59);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream62 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream48);
        java.io.OutputStream outputStream63 = java.io.OutputStream.nullOutputStream();
        outputStream63.flush();
        outputStream63.flush();
        byte[] byteArray67 = new byte[] { (byte) 1 };
        outputStream63.write(byteArray67);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream69 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream63);
        java.io.OutputStream outputStream70 = java.io.OutputStream.nullOutputStream();
        outputStream70.flush();
        outputStream70.flush();
        byte[] byteArray74 = new byte[] { (byte) 1 };
        outputStream70.write(byteArray74);
        outputStream63.write(byteArray74);
        outputStream48.write(byteArray74);
        cpioArchiveOutputStream46.write(byteArray74, (int) (short) 1, 0);
        cpioArchiveOutputStream31.write(byteArray74, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream15.write(byteArray74, (int) (short) 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream48);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream55);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream63);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream70);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 1 });
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.putNextEntry(cpioArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(0);
        cpioArchiveOutputStream6.write(512);
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream13.flush();
        cpioArchiveOutputStream13.write((int) (byte) -1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream13);
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        outputStream18.flush();
        java.io.OutputStream outputStream20 = java.io.OutputStream.nullOutputStream();
        outputStream20.flush();
        outputStream20.flush();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        outputStream20.write(byteArray24);
        outputStream18.write(byteArray24);
        java.io.OutputStream outputStream27 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream27);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream27);
        java.io.OutputStream outputStream30 = java.io.OutputStream.nullOutputStream();
        outputStream30.flush();
        outputStream30.flush();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        outputStream30.write(byteArray34);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream36 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream30);
        java.io.OutputStream outputStream37 = java.io.OutputStream.nullOutputStream();
        outputStream37.flush();
        outputStream37.flush();
        byte[] byteArray41 = new byte[] { (byte) 1 };
        outputStream37.write(byteArray41);
        outputStream30.write(byteArray41);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream44 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream30);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream45 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream30);
        java.io.OutputStream outputStream46 = java.io.OutputStream.nullOutputStream();
        outputStream46.flush();
        outputStream46.flush();
        byte[] byteArray50 = new byte[] { (byte) 1 };
        outputStream46.write(byteArray50);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream52 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream46);
        java.io.OutputStream outputStream53 = java.io.OutputStream.nullOutputStream();
        outputStream53.flush();
        outputStream53.flush();
        byte[] byteArray57 = new byte[] { (byte) 1 };
        outputStream53.write(byteArray57);
        outputStream46.write(byteArray57);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream60 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream46);
        java.io.OutputStream outputStream61 = java.io.OutputStream.nullOutputStream();
        outputStream61.flush();
        outputStream61.flush();
        byte[] byteArray65 = new byte[] { (byte) 1 };
        outputStream61.write(byteArray65);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream67 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream61);
        java.io.OutputStream outputStream68 = java.io.OutputStream.nullOutputStream();
        outputStream68.flush();
        outputStream68.flush();
        byte[] byteArray72 = new byte[] { (byte) 1 };
        outputStream68.write(byteArray72);
        outputStream61.write(byteArray72);
        outputStream46.write(byteArray72);
        outputStream30.write(byteArray72);
        outputStream27.write(byteArray72);
        outputStream18.write(byteArray72);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream17.write(byteArray72, 32, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(outputStream20);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream27);
        org.junit.Assert.assertNotNull(outputStream30);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream53);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream61);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream68);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 1 });
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32768);
        cpioArchiveOutputStream6.write((int) (short) 8);
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.putArchiveEntry(archiveEntry19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        cpioArchiveOutputStream17.close();
        cpioArchiveOutputStream17.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17, (short) 2);
        cpioArchiveOutputStream17.write(49152);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        cpioArchiveOutputStream17.write(8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry27 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream17.putNextEntry(cpioArchiveEntry27);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.write((int) (byte) 1);
        cpioArchiveOutputStream6.close();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream13.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream13);
        java.io.OutputStream outputStream16 = java.io.OutputStream.nullOutputStream();
        outputStream16.flush();
        outputStream16.flush();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        outputStream16.write(byteArray20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        cpioArchiveOutputStream22.finish();
        cpioArchiveOutputStream22.write(32);
        cpioArchiveOutputStream22.write(32768);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream28);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream29);
        cpioArchiveOutputStream30.finish();
        java.io.OutputStream outputStream32 = java.io.OutputStream.nullOutputStream();
        outputStream32.flush();
        outputStream32.flush();
        byte[] byteArray36 = new byte[] { (byte) 1 };
        outputStream32.write(byteArray36);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream38 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream32);
        java.io.OutputStream outputStream39 = java.io.OutputStream.nullOutputStream();
        outputStream39.flush();
        outputStream39.flush();
        byte[] byteArray43 = new byte[] { (byte) 1 };
        outputStream39.write(byteArray43);
        outputStream32.write(byteArray43);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream46 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream32);
        java.io.OutputStream outputStream47 = java.io.OutputStream.nullOutputStream();
        outputStream47.flush();
        outputStream47.flush();
        byte[] byteArray51 = new byte[] { (byte) 1 };
        outputStream47.write(byteArray51);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream53 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream47);
        java.io.OutputStream outputStream54 = java.io.OutputStream.nullOutputStream();
        outputStream54.flush();
        outputStream54.flush();
        byte[] byteArray58 = new byte[] { (byte) 1 };
        outputStream54.write(byteArray58);
        outputStream47.write(byteArray58);
        outputStream32.write(byteArray58);
        cpioArchiveOutputStream30.write(byteArray58, (int) (short) 1, 0);
        cpioArchiveOutputStream15.write(byteArray58, (int) (short) 1, 0);
        cpioArchiveOutputStream15.write((int) (short) 100);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream47);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream54);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 1 });
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 10 };
        outputStream0.write(byteArray10);
        java.io.OutputStream outputStream12 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream13 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13);
        java.io.OutputStream outputStream15 = java.io.OutputStream.nullOutputStream();
        outputStream15.flush();
        outputStream15.flush();
        byte[] byteArray19 = new byte[] { (byte) 1 };
        outputStream15.write(byteArray19);
        java.io.OutputStream outputStream21 = java.io.OutputStream.nullOutputStream();
        outputStream21.flush();
        outputStream21.flush();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        outputStream21.write(byteArray25);
        outputStream15.write(byteArray25);
        outputStream13.write(byteArray25);
        outputStream12.write(byteArray25);
        outputStream0.write(byteArray25);
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream32.putArchiveEntry(archiveEntry33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 10 });
        org.junit.Assert.assertNotNull(outputStream12);
        org.junit.Assert.assertNotNull(outputStream13);
        org.junit.Assert.assertNotNull(outputStream15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 1 });
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write((int) '4');
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 1);
        cpioArchiveOutputStream15.write((int) (short) -1);
        cpioArchiveOutputStream15.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream15.write((int) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        cpioArchiveOutputStream18.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15, (short) 1);
        cpioArchiveOutputStream17.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        cpioArchiveOutputStream21.write(512);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        cpioArchiveOutputStream21.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.finish();
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        outputStream10.flush();
        outputStream10.flush();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        outputStream10.write(byteArray14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10);
        cpioArchiveOutputStream16.write(49152);
        cpioArchiveOutputStream16.flush();
        cpioArchiveOutputStream16.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream16);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream16);
        byte[] byteArray23 = new byte[] {};
        cpioArchiveOutputStream16.write(byteArray23);
        cpioArchiveOutputStream6.write(byteArray23);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream26.close();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream1 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        java.io.OutputStream outputStream3 = java.io.OutputStream.nullOutputStream();
        outputStream3.flush();
        outputStream3.flush();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        outputStream3.write(byteArray7);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        outputStream9.flush();
        outputStream9.flush();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        outputStream9.write(byteArray13);
        outputStream3.write(byteArray13);
        outputStream1.write(byteArray13);
        outputStream0.write(byteArray13);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        cpioArchiveOutputStream19.flush();
        cpioArchiveOutputStream19.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream1);
        org.junit.Assert.assertNotNull(outputStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1 });
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream14.putArchiveEntry(archiveEntry18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.putNextEntry(cpioArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.write((int) '#');
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        java.io.OutputStream outputStream13 = java.io.OutputStream.nullOutputStream();
        outputStream13.flush();
        outputStream13.flush();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        outputStream13.write(byteArray17);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13);
        cpioArchiveOutputStream19.write(49152);
        cpioArchiveOutputStream19.flush();
        cpioArchiveOutputStream19.write(100);
        cpioArchiveOutputStream19.finish();
        cpioArchiveOutputStream19.write(32768);
        cpioArchiveOutputStream19.write((int) (short) 8);
        cpioArchiveOutputStream19.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        cpioArchiveOutputStream19.flush();
        cpioArchiveOutputStream19.finish();
        cpioArchiveOutputStream19.finish();
        java.io.OutputStream outputStream35 = java.io.OutputStream.nullOutputStream();
        outputStream35.flush();
        outputStream35.flush();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        outputStream35.write(byteArray39);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream41 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream35);
        cpioArchiveOutputStream41.write(49152);
        cpioArchiveOutputStream41.flush();
        cpioArchiveOutputStream41.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream47 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream41);
        cpioArchiveOutputStream47.finish();
        cpioArchiveOutputStream47.write((int) ' ');
        cpioArchiveOutputStream47.flush();
        java.io.OutputStream outputStream52 = java.io.OutputStream.nullOutputStream();
        outputStream52.flush();
        outputStream52.flush();
        byte[] byteArray56 = new byte[] { (byte) 1 };
        outputStream52.write(byteArray56);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream58 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream52);
        cpioArchiveOutputStream58.close();
        cpioArchiveOutputStream58.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream62 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream58, (short) (byte) 1);
        java.io.OutputStream outputStream63 = java.io.OutputStream.nullOutputStream();
        outputStream63.flush();
        outputStream63.flush();
        byte[] byteArray67 = new byte[] { (byte) 1 };
        outputStream63.write(byteArray67);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream69 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream63);
        cpioArchiveOutputStream69.write(49152);
        cpioArchiveOutputStream69.flush();
        cpioArchiveOutputStream69.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream74 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream69);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream75 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream69);
        byte[] byteArray76 = new byte[] {};
        cpioArchiveOutputStream69.write(byteArray76);
        cpioArchiveOutputStream62.write(byteArray76);
        cpioArchiveOutputStream47.write(byteArray76);
        cpioArchiveOutputStream19.write(byteArray76);
        cpioArchiveOutputStream12.write(byteArray76);
        cpioArchiveOutputStream12.flush();
        byte[] byteArray83 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream12.write(byteArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream13);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream63);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] {});
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(0);
        cpioArchiveOutputStream6.write(2048);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.write(0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        byte[] byteArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream16.write(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(256);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) (byte) 1);
        cpioArchiveOutputStream6.write(16);
        cpioArchiveOutputStream6.write(0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream22.flush();
        cpioArchiveOutputStream22.finish();
        cpioArchiveOutputStream22.write(0);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.close();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream11.finish();
        cpioArchiveOutputStream11.write(512);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        cpioArchiveOutputStream15.finish();
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
        outputStream17.flush();
        outputStream17.flush();
        byte[] byteArray21 = new byte[] { (byte) 1 };
        outputStream17.write(byteArray21);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream17);
        cpioArchiveOutputStream23.write(49152);
        cpioArchiveOutputStream23.flush();
        cpioArchiveOutputStream23.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream23);
        cpioArchiveOutputStream29.finish();
        cpioArchiveOutputStream29.write((int) ' ');
        cpioArchiveOutputStream29.flush();
        java.io.OutputStream outputStream34 = java.io.OutputStream.nullOutputStream();
        outputStream34.flush();
        outputStream34.flush();
        byte[] byteArray38 = new byte[] { (byte) 1 };
        outputStream34.write(byteArray38);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream40 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream34);
        java.io.OutputStream outputStream41 = java.io.OutputStream.nullOutputStream();
        outputStream41.flush();
        outputStream41.flush();
        byte[] byteArray45 = new byte[] { (byte) 1 };
        outputStream41.write(byteArray45);
        outputStream34.write(byteArray45);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream48 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream34);
        cpioArchiveOutputStream48.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream51 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream48);
        cpioArchiveOutputStream51.finish();
        cpioArchiveOutputStream51.finish();
        java.io.OutputStream outputStream54 = java.io.OutputStream.nullOutputStream();
        outputStream54.flush();
        outputStream54.flush();
        byte[] byteArray58 = new byte[] { (byte) 1 };
        outputStream54.write(byteArray58);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream60 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream54);
        cpioArchiveOutputStream60.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream63 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream60, (short) 1);
        cpioArchiveOutputStream63.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream65 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream63);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream66 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream65);
        java.io.OutputStream outputStream67 = java.io.OutputStream.nullOutputStream();
        outputStream67.flush();
        outputStream67.flush();
        byte[] byteArray71 = new byte[] { (byte) 1 };
        outputStream67.write(byteArray71);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream73 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream67);
        cpioArchiveOutputStream73.write(49152);
        cpioArchiveOutputStream73.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream77 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream73);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream78 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream77);
        cpioArchiveOutputStream78.finish();
        java.io.OutputStream outputStream80 = java.io.OutputStream.nullOutputStream();
        outputStream80.flush();
        outputStream80.flush();
        byte[] byteArray84 = new byte[] { (byte) 1 };
        outputStream80.write(byteArray84);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream86 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream80);
        cpioArchiveOutputStream86.write(49152);
        cpioArchiveOutputStream86.flush();
        cpioArchiveOutputStream86.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream91 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream86);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream92 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream86);
        byte[] byteArray93 = new byte[] {};
        cpioArchiveOutputStream86.write(byteArray93);
        cpioArchiveOutputStream78.write(byteArray93);
        cpioArchiveOutputStream66.write(byteArray93);
        cpioArchiveOutputStream51.write(byteArray93);
        cpioArchiveOutputStream29.write(byteArray93);
        cpioArchiveOutputStream15.write(byteArray93);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream54);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream67);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream80);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] {});
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.finish();
        cpioArchiveOutputStream14.write((int) (short) -1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry25 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream24.putNextEntry(cpioArchiveEntry25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(32768);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream13);
        cpioArchiveOutputStream14.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) 4);
        cpioArchiveOutputStream17.close();
        cpioArchiveOutputStream17.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream11.finish();
        cpioArchiveOutputStream11.flush();
        cpioArchiveOutputStream11.write((int) (short) 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11, (short) 1);
        cpioArchiveOutputStream11.write((int) (short) 10);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17, (short) 1);
        cpioArchiveOutputStream17.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        cpioArchiveOutputStream23.close();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream1 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        java.io.OutputStream outputStream3 = java.io.OutputStream.nullOutputStream();
        outputStream3.flush();
        outputStream3.flush();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        outputStream3.write(byteArray7);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        outputStream9.flush();
        outputStream9.flush();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        outputStream9.write(byteArray13);
        outputStream3.write(byteArray13);
        outputStream1.write(byteArray13);
        outputStream0.write(byteArray13);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        cpioArchiveOutputStream18.flush();
        cpioArchiveOutputStream18.flush();
        cpioArchiveOutputStream18.close();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream1);
        org.junit.Assert.assertNotNull(outputStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1 });
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream1 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        java.io.OutputStream outputStream3 = java.io.OutputStream.nullOutputStream();
        outputStream3.flush();
        outputStream3.flush();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        outputStream3.write(byteArray7);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        outputStream9.flush();
        outputStream9.flush();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        outputStream9.write(byteArray13);
        outputStream3.write(byteArray13);
        outputStream1.write(byteArray13);
        outputStream0.write(byteArray13);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream18.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18, (short) 4);
        cpioArchiveOutputStream18.finish();
        cpioArchiveOutputStream18.close();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream1);
        org.junit.Assert.assertNotNull(outputStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1 });
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 8);
        cpioArchiveOutputStream6.write(2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream18.write(100);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(0);
        cpioArchiveOutputStream6.write(2048);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.write(0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        cpioArchiveOutputStream16.finish();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.lang.Class<?> wildcardClass5 = outputStream0.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream20.write(36864);
        cpioArchiveOutputStream20.write(0);
        cpioArchiveOutputStream20.finish();
        cpioArchiveOutputStream20.write(29127);
        cpioArchiveOutputStream20.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20, (short) 8);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream20.write(36864);
        cpioArchiveOutputStream20.write(0);
        cpioArchiveOutputStream20.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        java.io.OutputStream outputStream27 = java.io.OutputStream.nullOutputStream();
        outputStream27.flush();
        outputStream27.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream27);
        cpioArchiveOutputStream30.finish();
        cpioArchiveOutputStream30.flush();
        cpioArchiveOutputStream30.write(4096);
        java.io.OutputStream outputStream35 = java.io.OutputStream.nullOutputStream();
        outputStream35.flush();
        outputStream35.flush();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        outputStream35.write(byteArray39);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream41 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream35);
        cpioArchiveOutputStream41.finish();
        cpioArchiveOutputStream41.write(0);
        cpioArchiveOutputStream41.close();
        cpioArchiveOutputStream41.write(40960);
        cpioArchiveOutputStream41.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream50 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream41, (short) 4);
        cpioArchiveOutputStream50.write(29127);
        cpioArchiveOutputStream50.finish();
        java.io.OutputStream outputStream54 = java.io.OutputStream.nullOutputStream();
        outputStream54.flush();
        outputStream54.flush();
        byte[] byteArray58 = new byte[] { (byte) 1 };
        outputStream54.write(byteArray58);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream60 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream54);
        cpioArchiveOutputStream60.write(49152);
        cpioArchiveOutputStream60.flush();
        cpioArchiveOutputStream60.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream65 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream60);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream66 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream60);
        byte[] byteArray67 = new byte[] {};
        cpioArchiveOutputStream60.write(byteArray67);
        cpioArchiveOutputStream50.write(byteArray67);
        cpioArchiveOutputStream30.write(byteArray67);
        cpioArchiveOutputStream26.write(byteArray67);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream27);
        org.junit.Assert.assertNotNull(outputStream35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream54);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] {});
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        cpioArchiveOutputStream19.write((int) (short) 100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19, (short) 2);
        java.io.OutputStream outputStream24 = java.io.OutputStream.nullOutputStream();
        outputStream24.flush();
        outputStream24.flush();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        outputStream24.write(byteArray28);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream24);
        cpioArchiveOutputStream30.finish();
        cpioArchiveOutputStream30.write(32);
        cpioArchiveOutputStream30.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream30);
        cpioArchiveOutputStream35.finish();
        java.io.OutputStream outputStream37 = java.io.OutputStream.nullOutputStream();
        outputStream37.flush();
        outputStream37.flush();
        byte[] byteArray41 = new byte[] { (byte) 1 };
        outputStream37.write(byteArray41);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream37);
        cpioArchiveOutputStream43.finish();
        cpioArchiveOutputStream43.write(32);
        cpioArchiveOutputStream43.write(32768);
        cpioArchiveOutputStream43.finish();
        cpioArchiveOutputStream43.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream51 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream43);
        cpioArchiveOutputStream43.write(8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream54 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream43);
        java.io.OutputStream outputStream55 = java.io.OutputStream.nullOutputStream();
        outputStream55.flush();
        outputStream55.flush();
        byte[] byteArray59 = new byte[] { (byte) 1 };
        outputStream55.write(byteArray59);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream61 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream55);
        cpioArchiveOutputStream61.write(49152);
        cpioArchiveOutputStream61.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream65 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream61);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream66 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream65);
        cpioArchiveOutputStream66.finish();
        java.io.OutputStream outputStream68 = java.io.OutputStream.nullOutputStream();
        outputStream68.flush();
        outputStream68.flush();
        byte[] byteArray72 = new byte[] { (byte) 1 };
        outputStream68.write(byteArray72);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream74 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream68);
        cpioArchiveOutputStream74.write(49152);
        cpioArchiveOutputStream74.flush();
        cpioArchiveOutputStream74.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream79 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream74);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream80 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream74);
        byte[] byteArray81 = new byte[] {};
        cpioArchiveOutputStream74.write(byteArray81);
        cpioArchiveOutputStream66.write(byteArray81);
        cpioArchiveOutputStream54.write(byteArray81);
        cpioArchiveOutputStream35.write(byteArray81);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream19.write(byteArray81, (int) (short) 8, 40960);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream55);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream68);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] {});
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) (byte) 1);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.write(40960);
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 4);
        cpioArchiveOutputStream15.write(512);
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        outputStream18.flush();
        outputStream18.flush();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        outputStream18.write(byteArray22);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream18);
        cpioArchiveOutputStream24.finish();
        cpioArchiveOutputStream24.write(32);
        cpioArchiveOutputStream24.write(4);
        cpioArchiveOutputStream24.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream24, (short) 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream24);
        java.io.OutputStream outputStream34 = java.io.OutputStream.nullOutputStream();
        outputStream34.flush();
        outputStream34.flush();
        byte[] byteArray38 = new byte[] { (byte) 1 };
        outputStream34.write(byteArray38);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream40 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream34);
        cpioArchiveOutputStream40.write(49152);
        cpioArchiveOutputStream40.flush();
        cpioArchiveOutputStream40.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream46 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream40);
        cpioArchiveOutputStream46.finish();
        cpioArchiveOutputStream46.write((int) ' ');
        cpioArchiveOutputStream46.flush();
        java.io.OutputStream outputStream51 = java.io.OutputStream.nullOutputStream();
        outputStream51.flush();
        outputStream51.flush();
        byte[] byteArray55 = new byte[] { (byte) 1 };
        outputStream51.write(byteArray55);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream57 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream51);
        cpioArchiveOutputStream57.close();
        cpioArchiveOutputStream57.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream61 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream57, (short) (byte) 1);
        java.io.OutputStream outputStream62 = java.io.OutputStream.nullOutputStream();
        outputStream62.flush();
        outputStream62.flush();
        byte[] byteArray66 = new byte[] { (byte) 1 };
        outputStream62.write(byteArray66);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream68 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream62);
        cpioArchiveOutputStream68.write(49152);
        cpioArchiveOutputStream68.flush();
        cpioArchiveOutputStream68.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream73 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream68);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream74 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream68);
        byte[] byteArray75 = new byte[] {};
        cpioArchiveOutputStream68.write(byteArray75);
        cpioArchiveOutputStream61.write(byteArray75);
        cpioArchiveOutputStream46.write(byteArray75);
        cpioArchiveOutputStream24.write(byteArray75);
        cpioArchiveOutputStream15.write(byteArray75);
        cpioArchiveOutputStream15.finish();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream62);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, (short) 1);
        cpioArchiveOutputStream3.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        cpioArchiveOutputStream9.flush();
        cpioArchiveOutputStream9.finish();
        cpioArchiveOutputStream9.flush();
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 1);
        cpioArchiveOutputStream12.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        cpioArchiveOutputStream12.write((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream12.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream1 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        java.io.OutputStream outputStream3 = java.io.OutputStream.nullOutputStream();
        outputStream3.flush();
        outputStream3.flush();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        outputStream3.write(byteArray7);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        outputStream9.flush();
        outputStream9.flush();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        outputStream9.write(byteArray13);
        outputStream3.write(byteArray13);
        outputStream1.write(byteArray13);
        outputStream0.write(byteArray13);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream18.finish();
        java.io.OutputStream outputStream20 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream21 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        java.io.OutputStream outputStream23 = java.io.OutputStream.nullOutputStream();
        outputStream23.flush();
        outputStream23.flush();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        outputStream23.write(byteArray27);
        java.io.OutputStream outputStream29 = java.io.OutputStream.nullOutputStream();
        outputStream29.flush();
        outputStream29.flush();
        byte[] byteArray33 = new byte[] { (byte) 1 };
        outputStream29.write(byteArray33);
        outputStream23.write(byteArray33);
        outputStream21.write(byteArray33);
        outputStream20.write(byteArray33);
        cpioArchiveOutputStream18.write(byteArray33, (int) (byte) 1, (int) (short) 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream42 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18, (short) 2);
        cpioArchiveOutputStream18.write((int) (short) 4);
        cpioArchiveOutputStream18.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry46 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream18.putNextEntry(cpioArchiveEntry46);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream1);
        org.junit.Assert.assertNotNull(outputStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream20);
        org.junit.Assert.assertNotNull(outputStream21);
        org.junit.Assert.assertNotNull(outputStream23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 1 });
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream15.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        cpioArchiveOutputStream17.write(40960);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry20 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream17.putNextEntry(cpioArchiveEntry20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21, (short) 2);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17, (short) 1);
        cpioArchiveOutputStream19.finish();
        cpioArchiveOutputStream19.close();
        cpioArchiveOutputStream19.write(16384);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream24);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream25, (short) 2);
        cpioArchiveOutputStream27.close();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.close();
        java.lang.Class<?> wildcardClass15 = cpioArchiveOutputStream6.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.write((int) (short) 3);
        cpioArchiveOutputStream6.write((-1));
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        cpioArchiveOutputStream23.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.write((int) '#');
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.write(128);
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) (byte) 1);
        java.lang.Class<?> wildcardClass23 = cpioArchiveOutputStream6.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(256);
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
        outputStream17.flush();
        outputStream17.flush();
        byte[] byteArray21 = new byte[] { (byte) 1 };
        outputStream17.write(byteArray21);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream17);
        cpioArchiveOutputStream23.finish();
        cpioArchiveOutputStream23.write(0);
        cpioArchiveOutputStream23.close();
        cpioArchiveOutputStream23.write(40960);
        cpioArchiveOutputStream23.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream23, (short) 4);
        cpioArchiveOutputStream32.write(512);
        java.io.OutputStream outputStream35 = java.io.OutputStream.nullOutputStream();
        outputStream35.flush();
        outputStream35.flush();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        outputStream35.write(byteArray39);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream41 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream35);
        cpioArchiveOutputStream41.finish();
        cpioArchiveOutputStream41.write(32);
        cpioArchiveOutputStream41.write(4);
        cpioArchiveOutputStream41.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream49 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream41, (short) 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream50 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream41);
        java.io.OutputStream outputStream51 = java.io.OutputStream.nullOutputStream();
        outputStream51.flush();
        outputStream51.flush();
        byte[] byteArray55 = new byte[] { (byte) 1 };
        outputStream51.write(byteArray55);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream57 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream51);
        cpioArchiveOutputStream57.write(49152);
        cpioArchiveOutputStream57.flush();
        cpioArchiveOutputStream57.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream63 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream57);
        cpioArchiveOutputStream63.finish();
        cpioArchiveOutputStream63.write((int) ' ');
        cpioArchiveOutputStream63.flush();
        java.io.OutputStream outputStream68 = java.io.OutputStream.nullOutputStream();
        outputStream68.flush();
        outputStream68.flush();
        byte[] byteArray72 = new byte[] { (byte) 1 };
        outputStream68.write(byteArray72);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream74 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream68);
        cpioArchiveOutputStream74.close();
        cpioArchiveOutputStream74.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream78 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream74, (short) (byte) 1);
        java.io.OutputStream outputStream79 = java.io.OutputStream.nullOutputStream();
        outputStream79.flush();
        outputStream79.flush();
        byte[] byteArray83 = new byte[] { (byte) 1 };
        outputStream79.write(byteArray83);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream85 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream79);
        cpioArchiveOutputStream85.write(49152);
        cpioArchiveOutputStream85.flush();
        cpioArchiveOutputStream85.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream90 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream85);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream91 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream85);
        byte[] byteArray92 = new byte[] {};
        cpioArchiveOutputStream85.write(byteArray92);
        cpioArchiveOutputStream78.write(byteArray92);
        cpioArchiveOutputStream63.write(byteArray92);
        cpioArchiveOutputStream41.write(byteArray92);
        cpioArchiveOutputStream32.write(byteArray92);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.write(byteArray92);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream68);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream79);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] {});
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream22.flush();
        cpioArchiveOutputStream22.close();
        cpioArchiveOutputStream22.close();
        cpioArchiveOutputStream22.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream15.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        cpioArchiveOutputStream17.finish();
        cpioArchiveOutputStream17.finish();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 2);
        cpioArchiveOutputStream13.close();
        cpioArchiveOutputStream13.write(16384);
        cpioArchiveOutputStream13.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        cpioArchiveOutputStream11.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11, (short) 8);
        cpioArchiveOutputStream11.finish();
        cpioArchiveOutputStream11.write(0);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(1024);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream1 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        java.io.OutputStream outputStream3 = java.io.OutputStream.nullOutputStream();
        outputStream3.flush();
        outputStream3.flush();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        outputStream3.write(byteArray7);
        java.io.OutputStream outputStream9 = java.io.OutputStream.nullOutputStream();
        outputStream9.flush();
        outputStream9.flush();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        outputStream9.write(byteArray13);
        outputStream3.write(byteArray13);
        outputStream1.write(byteArray13);
        outputStream0.write(byteArray13);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        outputStream0.flush();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(outputStream1);
        org.junit.Assert.assertNotNull(outputStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1 });
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 8);
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.putArchiveEntry(archiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(29127);
        cpioArchiveOutputStream14.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.close();
        cpioArchiveOutputStream14.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream24);
        cpioArchiveOutputStream24.flush();
        cpioArchiveOutputStream24.finish();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(0);
        cpioArchiveOutputStream6.write(512);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.write((int) (short) 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.putArchiveEntry(archiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream5.write((int) (byte) 100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream8);
        cpioArchiveOutputStream9.finish();
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.finish();
        cpioArchiveOutputStream14.write((int) (short) -1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write((int) (short) 3);
        cpioArchiveOutputStream14.finish();
        java.io.OutputStream outputStream24 = java.io.OutputStream.nullOutputStream();
        outputStream24.flush();
        outputStream24.flush();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        outputStream24.write(byteArray28);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream24);
        java.io.OutputStream outputStream31 = java.io.OutputStream.nullOutputStream();
        outputStream31.flush();
        outputStream31.flush();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        outputStream31.write(byteArray35);
        outputStream24.write(byteArray35);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream38 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream24);
        cpioArchiveOutputStream38.write(256);
        cpioArchiveOutputStream38.write(0);
        cpioArchiveOutputStream38.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream44 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream38);
        cpioArchiveOutputStream44.finish();
        cpioArchiveOutputStream44.write(128);
        java.io.OutputStream outputStream48 = java.io.OutputStream.nullOutputStream();
        outputStream48.flush();
        outputStream48.flush();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        outputStream48.write(byteArray52);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream54 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream48);
        cpioArchiveOutputStream54.close();
        cpioArchiveOutputStream54.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream58 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream54, (short) (byte) 1);
        java.io.OutputStream outputStream59 = java.io.OutputStream.nullOutputStream();
        outputStream59.flush();
        outputStream59.flush();
        byte[] byteArray63 = new byte[] { (byte) 1 };
        outputStream59.write(byteArray63);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream65 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream59);
        cpioArchiveOutputStream65.write(49152);
        cpioArchiveOutputStream65.flush();
        cpioArchiveOutputStream65.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream70 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream65);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream71 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream65);
        byte[] byteArray72 = new byte[] {};
        cpioArchiveOutputStream65.write(byteArray72);
        cpioArchiveOutputStream58.write(byteArray72);
        cpioArchiveOutputStream44.write(byteArray72);
        cpioArchiveOutputStream14.write(byteArray72);
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream48);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] {});
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream20.write(36864);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        cpioArchiveOutputStream20.write((int) (short) 3);
        cpioArchiveOutputStream20.close();
        cpioArchiveOutputStream20.close();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        cpioArchiveOutputStream17.write(8);
        cpioArchiveOutputStream17.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream17.putArchiveEntry(archiveEntry22);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.putArchiveEntry(archiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream10.write(256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        cpioArchiveOutputStream13.flush();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, (short) 1);
        cpioArchiveOutputStream3.finish();
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        java.io.OutputStream outputStream6 = java.io.OutputStream.nullOutputStream();
        outputStream6.flush();
        outputStream6.flush();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        outputStream6.write(byteArray10);
        outputStream0.write(byteArray10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream13, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1 });
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17, (short) 1);
        cpioArchiveOutputStream19.write(0);
        cpioArchiveOutputStream19.close();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.write(100);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        cpioArchiveOutputStream19.write((int) (short) 100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry22 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream19.putNextEntry(cpioArchiveEntry22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        outputStream0.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream14.write(256);
        cpioArchiveOutputStream14.write(0);
        cpioArchiveOutputStream14.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry22 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream21.putNextEntry(cpioArchiveEntry22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write(4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream12.close();
        cpioArchiveOutputStream12.flush();
        cpioArchiveOutputStream12.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        cpioArchiveOutputStream16.flush();
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        outputStream18.flush();
        outputStream18.flush();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        outputStream18.write(byteArray22);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream18);
        java.io.OutputStream outputStream25 = java.io.OutputStream.nullOutputStream();
        outputStream25.flush();
        outputStream25.flush();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        outputStream25.write(byteArray29);
        outputStream18.write(byteArray29);
        outputStream18.flush();
        java.io.OutputStream outputStream33 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream34 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream34);
        java.io.OutputStream outputStream36 = java.io.OutputStream.nullOutputStream();
        outputStream36.flush();
        outputStream36.flush();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        outputStream36.write(byteArray40);
        java.io.OutputStream outputStream42 = java.io.OutputStream.nullOutputStream();
        outputStream42.flush();
        outputStream42.flush();
        byte[] byteArray46 = new byte[] { (byte) 1 };
        outputStream42.write(byteArray46);
        outputStream36.write(byteArray46);
        outputStream34.write(byteArray46);
        outputStream33.write(byteArray46);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream51 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream33);
        cpioArchiveOutputStream51.finish();
        java.io.OutputStream outputStream53 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream54 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream55 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream54);
        java.io.OutputStream outputStream56 = java.io.OutputStream.nullOutputStream();
        outputStream56.flush();
        outputStream56.flush();
        byte[] byteArray60 = new byte[] { (byte) 1 };
        outputStream56.write(byteArray60);
        java.io.OutputStream outputStream62 = java.io.OutputStream.nullOutputStream();
        outputStream62.flush();
        outputStream62.flush();
        byte[] byteArray66 = new byte[] { (byte) 1 };
        outputStream62.write(byteArray66);
        outputStream56.write(byteArray66);
        outputStream54.write(byteArray66);
        outputStream53.write(byteArray66);
        cpioArchiveOutputStream51.write(byteArray66, (int) (byte) 1, (int) (short) 0);
        outputStream18.write(byteArray66);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream16.write(byteArray66, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream33);
        org.junit.Assert.assertNotNull(outputStream34);
        org.junit.Assert.assertNotNull(outputStream36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream42);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream53);
        org.junit.Assert.assertNotNull(outputStream54);
        org.junit.Assert.assertNotNull(outputStream56);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream62);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 1 });
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream11.finish();
        cpioArchiveOutputStream11.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11, (short) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
        outputStream17.flush();
        outputStream17.flush();
        byte[] byteArray21 = new byte[] { (byte) 1 };
        outputStream17.write(byteArray21);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream17);
        cpioArchiveOutputStream23.finish();
        cpioArchiveOutputStream23.write(32);
        cpioArchiveOutputStream23.flush();
        cpioArchiveOutputStream23.write(0);
        cpioArchiveOutputStream23.finish();
        java.io.OutputStream outputStream31 = java.io.OutputStream.nullOutputStream();
        outputStream31.flush();
        outputStream31.flush();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        outputStream31.write(byteArray35);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream31);
        cpioArchiveOutputStream37.write(49152);
        cpioArchiveOutputStream37.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream41 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream37);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream42 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream41);
        java.io.OutputStream outputStream43 = java.io.OutputStream.nullOutputStream();
        outputStream43.flush();
        outputStream43.flush();
        byte[] byteArray47 = new byte[] { (byte) 1 };
        outputStream43.write(byteArray47);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream49 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream43);
        java.io.OutputStream outputStream50 = java.io.OutputStream.nullOutputStream();
        outputStream50.flush();
        outputStream50.flush();
        byte[] byteArray54 = new byte[] { (byte) 1 };
        outputStream50.write(byteArray54);
        outputStream43.write(byteArray54);
        outputStream43.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream58 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream43);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream60 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream43, (short) 1);
        java.io.OutputStream outputStream61 = java.io.OutputStream.nullOutputStream();
        outputStream61.flush();
        outputStream61.flush();
        byte[] byteArray65 = new byte[] { (byte) 1 };
        outputStream61.write(byteArray65);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream67 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream61);
        cpioArchiveOutputStream67.write(49152);
        cpioArchiveOutputStream67.flush();
        cpioArchiveOutputStream67.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream72 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream67);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream73 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream67);
        byte[] byteArray74 = new byte[] {};
        cpioArchiveOutputStream67.write(byteArray74);
        outputStream43.write(byteArray74);
        cpioArchiveOutputStream41.write(byteArray74);
        cpioArchiveOutputStream23.write(byteArray74);
        cpioArchiveOutputStream16.write(byteArray74);
        java.lang.Class<?> wildcardClass80 = byteArray74.getClass();
        org.junit.Assert.assertNotNull(outputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream50);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(outputStream61);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass80);
    }
}

