package org.apache.commons.compress.archivers.cpio;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
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
        cpioArchiveOutputStream14.finish();
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
        java.io.OutputStream outputStream31 = java.io.OutputStream.nullOutputStream();
        outputStream31.flush();
        outputStream31.flush();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        outputStream31.write(byteArray35);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream31);
        java.io.OutputStream outputStream38 = java.io.OutputStream.nullOutputStream();
        outputStream38.flush();
        outputStream38.flush();
        byte[] byteArray42 = new byte[] { (byte) 1 };
        outputStream38.write(byteArray42);
        outputStream31.write(byteArray42);
        outputStream16.write(byteArray42);
        cpioArchiveOutputStream14.write(byteArray42, (int) (short) 1, 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream50 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream50.closeArchiveEntry();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
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
        cpioArchiveOutputStream14.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream23.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream23, (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream26.closeArchiveEntry();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
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
        cpioArchiveOutputStream20.write(128);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        cpioArchiveOutputStream20.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20, (short) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream29.closeArchiveEntry();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
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
        cpioArchiveOutputStream18.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
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
        cpioArchiveOutputStream15.write(29127);
        cpioArchiveOutputStream15.finish();
        java.io.OutputStream outputStream19 = java.io.OutputStream.nullOutputStream();
        outputStream19.flush();
        outputStream19.flush();
        byte[] byteArray23 = new byte[] { (byte) 1 };
        outputStream19.write(byteArray23);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream19);
        cpioArchiveOutputStream25.write(49152);
        cpioArchiveOutputStream25.flush();
        cpioArchiveOutputStream25.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream25);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream25);
        byte[] byteArray32 = new byte[] {};
        cpioArchiveOutputStream25.write(byteArray32);
        cpioArchiveOutputStream15.write(byteArray32);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream35.closeArchiveEntry();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
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
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11, (short) 2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
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
        cpioArchiveOutputStream19.write((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
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
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write((int) (short) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
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
        cpioArchiveOutputStream12.write((int) (byte) 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
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
        cpioArchiveOutputStream19.write(1024);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
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
        cpioArchiveOutputStream20.flush();
        cpioArchiveOutputStream20.write((-1));
        cpioArchiveOutputStream20.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
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
        cpioArchiveOutputStream13.finish();
        cpioArchiveOutputStream13.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream13.closeArchiveEntry();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        cpioArchiveOutputStream18.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
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
        cpioArchiveOutputStream19.write(10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream24.closeArchiveEntry();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12, (short) 1);
        cpioArchiveOutputStream18.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
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
        cpioArchiveOutputStream18.write((int) (byte) 1);
        cpioArchiveOutputStream18.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
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
        cpioArchiveOutputStream16.finish();
        cpioArchiveOutputStream16.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream16);
        cpioArchiveOutputStream19.write(1024);
        cpioArchiveOutputStream19.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream16.closeArchiveEntry();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
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
        cpioArchiveOutputStream14.write(256);
        cpioArchiveOutputStream14.write(36864);
        cpioArchiveOutputStream14.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.write((int) (byte) 10);
        cpioArchiveOutputStream6.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
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
        cpioArchiveOutputStream19.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19, (short) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream23.closeArchiveEntry();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream13.closeArchiveEntry();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
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
        cpioArchiveOutputStream11.flush();
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
        outputStream17.flush();
        outputStream17.flush();
        byte[] byteArray21 = new byte[] { (byte) 1 };
        outputStream17.write(byteArray21);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream17);
        cpioArchiveOutputStream23.write(49152);
        cpioArchiveOutputStream23.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream23);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream27);
        cpioArchiveOutputStream28.finish();
        java.io.OutputStream outputStream30 = java.io.OutputStream.nullOutputStream();
        outputStream30.flush();
        outputStream30.flush();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        outputStream30.write(byteArray34);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream36 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream30);
        cpioArchiveOutputStream36.write(49152);
        cpioArchiveOutputStream36.flush();
        cpioArchiveOutputStream36.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream41 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream36);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream42 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream36);
        byte[] byteArray43 = new byte[] {};
        cpioArchiveOutputStream36.write(byteArray43);
        cpioArchiveOutputStream28.write(byteArray43);
        cpioArchiveOutputStream11.write(byteArray43);
        cpioArchiveOutputStream11.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
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
        cpioArchiveOutputStream14.write((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream4.write(100);
        cpioArchiveOutputStream4.write((int) (short) -1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        cpioArchiveOutputStream9.write((int) (short) 3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream9.closeArchiveEntry();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
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
        cpioArchiveOutputStream20.finish();
        cpioArchiveOutputStream20.flush();
        cpioArchiveOutputStream20.finish();
        cpioArchiveOutputStream20.write((int) (short) 10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream26.closeArchiveEntry();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
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
        cpioArchiveOutputStream15.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }
}

