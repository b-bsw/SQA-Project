package org.apache.commons.compress.archivers.cpio;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream1.closeArchiveEntry();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream10.closeArchiveEntry();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(24576);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
        cpioArchiveOutputStream20.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        cpioArchiveOutputStream14.write(29127);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream10.closeArchiveEntry();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18, (short) 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream10.closeArchiveEntry();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream9.write((int) (short) 4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream21.closeArchiveEntry();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream21.closeArchiveEntry();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
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
        cpioArchiveOutputStream14.write(29127);
        cpioArchiveOutputStream14.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
        cpioArchiveOutputStream6.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        cpioArchiveOutputStream13.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream13.closeArchiveEntry();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream9.closeArchiveEntry();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream4.closeArchiveEntry();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream1.closeArchiveEntry();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        cpioArchiveOutputStream22.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream24.closeArchiveEntry();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(0);
        cpioArchiveOutputStream6.write(512);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        cpioArchiveOutputStream6.write((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
        cpioArchiveOutputStream6.write(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.write(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        cpioArchiveOutputStream6.write(512);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.write(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        cpioArchiveOutputStream20.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream13.closeArchiveEntry();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream7.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream7.closeArchiveEntry();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
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
        cpioArchiveOutputStream20.write((int) (short) 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20, (short) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream27.closeArchiveEntry();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
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
        cpioArchiveOutputStream12.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(24576);
        cpioArchiveOutputStream6.write((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        cpioArchiveOutputStream18.write(61440);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream9.write((int) (short) 4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream9.closeArchiveEntry();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream10.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
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
        cpioArchiveOutputStream20.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
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
        cpioArchiveOutputStream14.write(29127);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
        cpioArchiveOutputStream14.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream22.closeArchiveEntry();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        cpioArchiveOutputStream20.write((int) (short) 8);
        cpioArchiveOutputStream20.flush();
        cpioArchiveOutputStream20.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        cpioArchiveOutputStream17.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
        cpioArchiveOutputStream17.finish();
        cpioArchiveOutputStream17.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        cpioArchiveOutputStream20.write((int) (short) 8);
        cpioArchiveOutputStream20.flush();
        cpioArchiveOutputStream20.write(40960);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        cpioArchiveOutputStream19.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        cpioArchiveOutputStream11.write(61440);
        cpioArchiveOutputStream11.write((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        cpioArchiveOutputStream6.write(49152);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        cpioArchiveOutputStream6.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream4.flush();
        cpioArchiveOutputStream4.write((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream4.closeArchiveEntry();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream23.closeArchiveEntry();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
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
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream13.closeArchiveEntry();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        cpioArchiveOutputStream14.write((int) (byte) -1);
        cpioArchiveOutputStream14.write((int) (short) 100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.write(32);
        cpioArchiveOutputStream3.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream9.write((int) (short) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream9.closeArchiveEntry();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream10.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream10.closeArchiveEntry();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        cpioArchiveOutputStream13.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream13.closeArchiveEntry();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(24576);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream10.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream13.closeArchiveEntry();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        cpioArchiveOutputStream6.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(0);
        cpioArchiveOutputStream6.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        cpioArchiveOutputStream19.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4, (short) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream4.closeArchiveEntry();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream16.closeArchiveEntry();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream10.closeArchiveEntry();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        cpioArchiveOutputStream14.write(29127);
        cpioArchiveOutputStream14.write((int) (short) 12);
        cpioArchiveOutputStream14.write(4096);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
        cpioArchiveOutputStream15.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream41.closeArchiveEntry();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        cpioArchiveOutputStream6.write((int) '#');
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream23.closeArchiveEntry();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12, (short) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        cpioArchiveOutputStream11.write(512);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) (byte) 1);
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream12.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
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
        cpioArchiveOutputStream20.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream21.closeArchiveEntry();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
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
        cpioArchiveOutputStream6.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream15.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15, (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream42);
        cpioArchiveOutputStream43.write((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream43.closeArchiveEntry();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream9.closeArchiveEntry();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
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
        cpioArchiveOutputStream6.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream22.closeArchiveEntry();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
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
        cpioArchiveOutputStream18.write(61440);
        cpioArchiveOutputStream18.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        cpioArchiveOutputStream6.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream26.closeArchiveEntry();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.write(0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        cpioArchiveOutputStream20.finish();
        cpioArchiveOutputStream20.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.write(1024);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        cpioArchiveOutputStream15.write((int) (short) -1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
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
        cpioArchiveOutputStream6.write((int) '#');
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream21.closeArchiveEntry();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream13.closeArchiveEntry();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, (short) 1);
        cpioArchiveOutputStream6.write((int) (short) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18, (short) 4);
        cpioArchiveOutputStream18.write(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
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
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
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
        cpioArchiveOutputStream15.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
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
        cpioArchiveOutputStream6.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream8.write(128);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream8.closeArchiveEntry();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream4.closeArchiveEntry();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream10.closeArchiveEntry();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
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
        cpioArchiveOutputStream12.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        cpioArchiveOutputStream12.write((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        cpioArchiveOutputStream12.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream8.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream8.closeArchiveEntry();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream1.closeArchiveEntry();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11, (short) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
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
        cpioArchiveOutputStream19.finish();
        cpioArchiveOutputStream19.flush();
        cpioArchiveOutputStream19.write(4096);
        cpioArchiveOutputStream19.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream22.closeArchiveEntry();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22, (short) 2);
        cpioArchiveOutputStream25.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream25, (short) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream25.closeArchiveEntry();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 4);
        cpioArchiveOutputStream18.close();
        cpioArchiveOutputStream18.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream21.closeArchiveEntry();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream23.closeArchiveEntry();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(24576);
        cpioArchiveOutputStream6.write((int) (short) -1);
        cpioArchiveOutputStream6.write(0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
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
        cpioArchiveOutputStream15.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream7.closeArchiveEntry();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
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
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20, (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream22.closeArchiveEntry();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
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
        cpioArchiveOutputStream12.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream3.finish();
        cpioArchiveOutputStream3.finish();
        cpioArchiveOutputStream3.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        cpioArchiveOutputStream22.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream22.closeArchiveEntry();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream9.closeArchiveEntry();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream25.closeArchiveEntry();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream21.closeArchiveEntry();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
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
        cpioArchiveOutputStream14.write(29127);
        cpioArchiveOutputStream14.write(24576);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(10);
        cpioArchiveOutputStream6.write(128);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream10.write(24576);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream10.closeArchiveEntry();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream9.closeArchiveEntry();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
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
        cpioArchiveOutputStream12.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        cpioArchiveOutputStream12.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12, (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        cpioArchiveOutputStream12.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
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
        cpioArchiveOutputStream42.flush();
        cpioArchiveOutputStream42.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream42.closeArchiveEntry();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.write(0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
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
        cpioArchiveOutputStream20.write((int) (short) 8);
        cpioArchiveOutputStream20.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        cpioArchiveOutputStream20.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream10.closeArchiveEntry();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream9.write(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream9.closeArchiveEntry();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
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
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) 2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22, (short) 2);
        cpioArchiveOutputStream24.write((int) (short) 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream24.closeArchiveEntry();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
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
        cpioArchiveOutputStream19.finish();
        cpioArchiveOutputStream19.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
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
        cpioArchiveOutputStream20.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream2 = java.io.OutputStream.nullOutputStream();
        outputStream2.flush();
        outputStream2.flush();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        outputStream2.write(byteArray6);
        java.io.OutputStream outputStream8 = java.io.OutputStream.nullOutputStream();
        outputStream8.flush();
        outputStream8.flush();
        byte[] byteArray12 = new byte[] { (byte) 1 };
        outputStream8.write(byteArray12);
        outputStream2.write(byteArray12);
        outputStream0.write(byteArray12);
        java.io.OutputStream outputStream16 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        outputStream18.flush();
        outputStream18.flush();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        outputStream18.write(byteArray22);
        java.io.OutputStream outputStream24 = java.io.OutputStream.nullOutputStream();
        outputStream24.flush();
        outputStream24.flush();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        outputStream24.write(byteArray28);
        outputStream18.write(byteArray28);
        outputStream16.write(byteArray28);
        outputStream0.write(byteArray28);
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream35.closeArchiveEntry();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
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
        cpioArchiveOutputStream6.finish();
        java.io.OutputStream outputStream15 = java.io.OutputStream.nullOutputStream();
        outputStream15.flush();
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
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
        outputStream17.write(byteArray30);
        outputStream15.write(byteArray30);
        cpioArchiveOutputStream6.write(byteArray30, 0, 0);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream40 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 4);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(32768);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream24.closeArchiveEntry();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
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
        cpioArchiveOutputStream14.write((int) (byte) -1);
        cpioArchiveOutputStream14.write((int) (short) 100);
        cpioArchiveOutputStream14.write((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream2 = java.io.OutputStream.nullOutputStream();
        outputStream2.flush();
        outputStream2.flush();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        outputStream2.write(byteArray6);
        java.io.OutputStream outputStream8 = java.io.OutputStream.nullOutputStream();
        outputStream8.flush();
        outputStream8.flush();
        byte[] byteArray12 = new byte[] { (byte) 1 };
        outputStream8.write(byteArray12);
        outputStream2.write(byteArray12);
        outputStream0.write(byteArray12);
        java.io.OutputStream outputStream16 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        outputStream18.flush();
        outputStream18.flush();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        outputStream18.write(byteArray22);
        java.io.OutputStream outputStream24 = java.io.OutputStream.nullOutputStream();
        outputStream24.flush();
        outputStream24.flush();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        outputStream24.write(byteArray28);
        outputStream18.write(byteArray28);
        outputStream16.write(byteArray28);
        outputStream0.write(byteArray28);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream33.write((int) '4');
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream36 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream33.closeArchiveEntry();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18, (short) 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream3.finish();
        cpioArchiveOutputStream3.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream6.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
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
        cpioArchiveOutputStream6.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
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
        java.io.OutputStream outputStream18 = java.io.OutputStream.nullOutputStream();
        outputStream18.flush();
        outputStream18.flush();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        outputStream18.write(byteArray22);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream18);
        cpioArchiveOutputStream24.finish();
        cpioArchiveOutputStream24.write(32);
        cpioArchiveOutputStream24.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream24);
        cpioArchiveOutputStream29.finish();
        cpioArchiveOutputStream29.write(512);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream29);
        cpioArchiveOutputStream33.flush();
        cpioArchiveOutputStream33.finish();
        java.io.OutputStream outputStream36 = java.io.OutputStream.nullOutputStream();
        outputStream36.flush();
        outputStream36.flush();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        outputStream36.write(byteArray40);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream42 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream36);
        java.io.OutputStream outputStream43 = java.io.OutputStream.nullOutputStream();
        outputStream43.flush();
        outputStream43.flush();
        byte[] byteArray47 = new byte[] { (byte) 1 };
        outputStream43.write(byteArray47);
        outputStream36.write(byteArray47);
        outputStream36.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream51 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream36);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream53 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream36, (short) 1);
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
        outputStream36.write(byteArray67);
        cpioArchiveOutputStream33.write(byteArray67);
        cpioArchiveOutputStream17.write(byteArray67);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream72 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream72.closeArchiveEntry();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 10 };
        outputStream0.write(byteArray10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream13.closeArchiveEntry();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream22.closeArchiveEntry();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
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
        cpioArchiveOutputStream6.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream23.closeArchiveEntry();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.write(32);
        cpioArchiveOutputStream3.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream9.closeArchiveEntry();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
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
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
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
        cpioArchiveOutputStream14.write(29127);
        cpioArchiveOutputStream14.write((int) (short) 12);
        cpioArchiveOutputStream14.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
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
        cpioArchiveOutputStream12.flush();
        cpioArchiveOutputStream12.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 1);
        java.io.OutputStream outputStream10 = java.io.OutputStream.nullOutputStream();
        outputStream10.flush();
        outputStream10.flush();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        outputStream10.write(byteArray14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10);
        cpioArchiveOutputStream16.finish();
        cpioArchiveOutputStream16.write(32);
        cpioArchiveOutputStream16.write(32768);
        cpioArchiveOutputStream16.finish();
        cpioArchiveOutputStream16.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream16);
        cpioArchiveOutputStream16.write(8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream16);
        java.io.OutputStream outputStream28 = java.io.OutputStream.nullOutputStream();
        outputStream28.flush();
        outputStream28.flush();
        byte[] byteArray32 = new byte[] { (byte) 1 };
        outputStream28.write(byteArray32);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream34 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream28);
        cpioArchiveOutputStream34.write(49152);
        cpioArchiveOutputStream34.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream38 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream34);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream39 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream38);
        cpioArchiveOutputStream39.finish();
        java.io.OutputStream outputStream41 = java.io.OutputStream.nullOutputStream();
        outputStream41.flush();
        outputStream41.flush();
        byte[] byteArray45 = new byte[] { (byte) 1 };
        outputStream41.write(byteArray45);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream47 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream41);
        cpioArchiveOutputStream47.write(49152);
        cpioArchiveOutputStream47.flush();
        cpioArchiveOutputStream47.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream52 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream47);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream53 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream47);
        byte[] byteArray54 = new byte[] {};
        cpioArchiveOutputStream47.write(byteArray54);
        cpioArchiveOutputStream39.write(byteArray54);
        cpioArchiveOutputStream27.write(byteArray54);
        cpioArchiveOutputStream9.write(byteArray54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream9.closeArchiveEntry();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
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
        outputStream13.flush();
        outputStream13.flush();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        outputStream13.write(byteArray17);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13);
        cpioArchiveOutputStream19.finish();
        cpioArchiveOutputStream19.write(32);
        cpioArchiveOutputStream19.write(4);
        cpioArchiveOutputStream19.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        cpioArchiveOutputStream19.write((int) '#');
        cpioArchiveOutputStream19.flush();
        cpioArchiveOutputStream19.close();
        cpioArchiveOutputStream19.write(128);
        cpioArchiveOutputStream19.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19, (short) (byte) 1);
        java.io.OutputStream outputStream36 = java.io.OutputStream.nullOutputStream();
        outputStream36.flush();
        outputStream36.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream39 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream36);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream40 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream39);
        cpioArchiveOutputStream40.write(100);
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
        cpioArchiveOutputStream40.write(byteArray74);
        cpioArchiveOutputStream35.write(byteArray74);
        cpioArchiveOutputStream9.write(byteArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream9.closeArchiveEntry();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
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
        cpioArchiveOutputStream15.write((int) ' ');
        cpioArchiveOutputStream15.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
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
        cpioArchiveOutputStream6.finish();
        java.io.OutputStream outputStream15 = java.io.OutputStream.nullOutputStream();
        outputStream15.flush();
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
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
        outputStream17.write(byteArray30);
        outputStream15.write(byteArray30);
        cpioArchiveOutputStream6.write(byteArray30, 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
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
        cpioArchiveOutputStream12.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
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
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
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
        cpioArchiveOutputStream23.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream25.closeArchiveEntry();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream9.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9, (short) 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        cpioArchiveOutputStream19.write(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream26.closeArchiveEntry();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
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
        cpioArchiveOutputStream12.write((int) (short) 12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
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
        cpioArchiveOutputStream15.write((int) (short) 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 10 };
        outputStream0.write(byteArray10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream12.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream13.closeArchiveEntry();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
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
        cpioArchiveOutputStream23.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream23.closeArchiveEntry();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream2.closeArchiveEntry();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
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
        cpioArchiveOutputStream11.finish();
        cpioArchiveOutputStream11.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
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
        cpioArchiveOutputStream24.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream24.closeArchiveEntry();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.write(0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
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
        cpioArchiveOutputStream26.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream26.closeArchiveEntry();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
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
        cpioArchiveOutputStream16.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream16.closeArchiveEntry();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
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
        cpioArchiveOutputStream6.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(0);
        cpioArchiveOutputStream6.write(1);
        cpioArchiveOutputStream6.write((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(10);
        cpioArchiveOutputStream6.write(128);
        cpioArchiveOutputStream6.write(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
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
        cpioArchiveOutputStream26.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream26.closeArchiveEntry();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
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
        cpioArchiveOutputStream18.flush();
        cpioArchiveOutputStream18.finish();
        cpioArchiveOutputStream18.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18, (short) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream24.closeArchiveEntry();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
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
        cpioArchiveOutputStream18.finish();
        cpioArchiveOutputStream18.write((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        cpioArchiveOutputStream23.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream23.closeArchiveEntry();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.write(32);
        cpioArchiveOutputStream3.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
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
        cpioArchiveOutputStream14.write(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream22.closeArchiveEntry();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.write(0);
        cpioArchiveOutputStream3.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream21.closeArchiveEntry();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(10);
        cpioArchiveOutputStream6.write(128);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
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
        cpioArchiveOutputStream18.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
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
        cpioArchiveOutputStream12.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12, (short) 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream16.closeArchiveEntry();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
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
        cpioArchiveOutputStream14.write(29127);
        cpioArchiveOutputStream14.write((int) (short) 12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream23.flush();
        cpioArchiveOutputStream23.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream26.closeArchiveEntry();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream24.closeArchiveEntry();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(49152);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
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
        cpioArchiveOutputStream15.finish();
        cpioArchiveOutputStream15.write(512);
        cpioArchiveOutputStream15.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
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
        cpioArchiveOutputStream12.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
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
        cpioArchiveOutputStream20.write((int) (short) 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20, (short) 8);
        cpioArchiveOutputStream20.write(4);
        cpioArchiveOutputStream20.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
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
        cpioArchiveOutputStream14.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream4.flush();
        cpioArchiveOutputStream4.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream4.closeArchiveEntry();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
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
        cpioArchiveOutputStream20.flush();
        cpioArchiveOutputStream20.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream16.closeArchiveEntry();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
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
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) (byte) 1);
        cpioArchiveOutputStream16.write(16384);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) (byte) 1);
        java.io.OutputStream outputStream11 = java.io.OutputStream.nullOutputStream();
        outputStream11.flush();
        outputStream11.flush();
        byte[] byteArray15 = new byte[] { (byte) 1 };
        outputStream11.write(byteArray15);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream11);
        cpioArchiveOutputStream17.write(49152);
        cpioArchiveOutputStream17.flush();
        cpioArchiveOutputStream17.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        byte[] byteArray24 = new byte[] {};
        cpioArchiveOutputStream17.write(byteArray24);
        cpioArchiveOutputStream10.write(byteArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream10.closeArchiveEntry();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
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
        cpioArchiveOutputStream13.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream13.closeArchiveEntry();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
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
        cpioArchiveOutputStream15.write((int) (short) 4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream24.closeArchiveEntry();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11, (short) 4);
        cpioArchiveOutputStream11.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
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
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
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
        cpioArchiveOutputStream14.write(29127);
        cpioArchiveOutputStream14.write((int) (short) 12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream23.flush();
        cpioArchiveOutputStream23.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream23.closeArchiveEntry();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
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
        cpioArchiveOutputStream6.write((int) (byte) 1);
        cpioArchiveOutputStream6.write((int) (short) 100);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write((int) (short) 3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(0);
        cpioArchiveOutputStream6.write(2048);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
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
        cpioArchiveOutputStream18.write((int) (short) 4);
        cpioArchiveOutputStream18.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream25.closeArchiveEntry();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream26.closeArchiveEntry();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
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
        cpioArchiveOutputStream21.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream21.closeArchiveEntry();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
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
        cpioArchiveOutputStream10.write(4096);
        cpioArchiveOutputStream10.write((int) (byte) 10);
        cpioArchiveOutputStream10.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream10.closeArchiveEntry();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream21.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream21.closeArchiveEntry();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(24576);
        cpioArchiveOutputStream6.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream16.closeArchiveEntry();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
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
        cpioArchiveOutputStream19.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        java.io.OutputStream outputStream2 = java.io.OutputStream.nullOutputStream();
        java.io.OutputStream outputStream3 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3);
        java.io.OutputStream outputStream5 = java.io.OutputStream.nullOutputStream();
        outputStream5.flush();
        outputStream5.flush();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        outputStream5.write(byteArray9);
        java.io.OutputStream outputStream11 = java.io.OutputStream.nullOutputStream();
        outputStream11.flush();
        outputStream11.flush();
        byte[] byteArray15 = new byte[] { (byte) 1 };
        outputStream11.write(byteArray15);
        outputStream5.write(byteArray15);
        outputStream3.write(byteArray15);
        outputStream2.write(byteArray15);
        outputStream0.write(byteArray15);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream21.closeArchiveEntry();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream25.closeArchiveEntry();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
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
        cpioArchiveOutputStream16.finish();
        cpioArchiveOutputStream16.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream16.closeArchiveEntry();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.write(1024);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream16, (short) 4);
        cpioArchiveOutputStream18.finish();
        cpioArchiveOutputStream18.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
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
        cpioArchiveOutputStream14.flush();
        cpioArchiveOutputStream14.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
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
        cpioArchiveOutputStream20.write((int) (short) 8);
        cpioArchiveOutputStream20.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream27.closeArchiveEntry();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
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
        cpioArchiveOutputStream15.write((int) (short) 4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream10.closeArchiveEntry();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
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
        cpioArchiveOutputStream14.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) 2);
        cpioArchiveOutputStream14.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        java.io.OutputStream outputStream25 = java.io.OutputStream.nullOutputStream();
        outputStream25.flush();
        outputStream25.flush();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        outputStream25.write(byteArray29);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream25);
        cpioArchiveOutputStream31.write(49152);
        cpioArchiveOutputStream31.flush();
        cpioArchiveOutputStream31.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream31);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream39 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream37, (short) 2);
        cpioArchiveOutputStream37.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream41 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream37);
        cpioArchiveOutputStream37.write((int) (short) 8);
        cpioArchiveOutputStream37.flush();
        cpioArchiveOutputStream37.flush();
        java.io.OutputStream outputStream46 = java.io.OutputStream.nullOutputStream();
        outputStream46.flush();
        outputStream46.flush();
        byte[] byteArray50 = new byte[] { (byte) 1 };
        outputStream46.write(byteArray50);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream52 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream46);
        cpioArchiveOutputStream52.write(49152);
        cpioArchiveOutputStream52.flush();
        cpioArchiveOutputStream52.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream57 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream52);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream58 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream52);
        byte[] byteArray59 = new byte[] {};
        cpioArchiveOutputStream52.write(byteArray59);
        cpioArchiveOutputStream37.write(byteArray59);
        cpioArchiveOutputStream24.write(byteArray59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream24.closeArchiveEntry();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
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
        cpioArchiveOutputStream20.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20, (short) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream26.closeArchiveEntry();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
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
        cpioArchiveOutputStream17.write((int) (short) 0);
        cpioArchiveOutputStream17.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream4.flush();
        cpioArchiveOutputStream4.flush();
        cpioArchiveOutputStream4.write(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream4.closeArchiveEntry();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream13);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream2.closeArchiveEntry();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.write(32);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream25.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream25.closeArchiveEntry();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(36864);
        cpioArchiveOutputStream6.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.write((int) (short) 10);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
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
        cpioArchiveOutputStream6.write(29127);
        cpioArchiveOutputStream6.write((int) (byte) 1);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(1024);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17, (short) 1);
        cpioArchiveOutputStream19.flush();
        cpioArchiveOutputStream19.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
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
        cpioArchiveOutputStream16.write(100);
        cpioArchiveOutputStream16.write((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream16.closeArchiveEntry();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream3.finish();
        cpioArchiveOutputStream3.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
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
        cpioArchiveOutputStream22.flush();
        cpioArchiveOutputStream22.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream22.closeArchiveEntry();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.flush();
        cpioArchiveOutputStream3.write(64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
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
        cpioArchiveOutputStream18.flush();
        cpioArchiveOutputStream18.flush();
        cpioArchiveOutputStream18.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
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
        cpioArchiveOutputStream6.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream22.closeArchiveEntry();
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
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
        java.io.OutputStream outputStream17 = java.io.OutputStream.nullOutputStream();
        outputStream17.flush();
        outputStream17.flush();
        byte[] byteArray21 = new byte[] { (byte) 1 };
        outputStream17.write(byteArray21);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream17);
        cpioArchiveOutputStream23.close();
        cpioArchiveOutputStream23.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream23, (short) (byte) 1);
        java.io.OutputStream outputStream28 = java.io.OutputStream.nullOutputStream();
        outputStream28.flush();
        outputStream28.flush();
        byte[] byteArray32 = new byte[] { (byte) 1 };
        outputStream28.write(byteArray32);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream34 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream28);
        cpioArchiveOutputStream34.write(49152);
        cpioArchiveOutputStream34.flush();
        cpioArchiveOutputStream34.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream39 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream34);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream40 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream34);
        byte[] byteArray41 = new byte[] {};
        cpioArchiveOutputStream34.write(byteArray41);
        cpioArchiveOutputStream27.write(byteArray41);
        cpioArchiveOutputStream12.write(byteArray41);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream45 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        cpioArchiveOutputStream12.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
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
        cpioArchiveOutputStream9.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream9.closeArchiveEntry();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
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
        cpioArchiveOutputStream15.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
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
        cpioArchiveOutputStream13.finish();
        cpioArchiveOutputStream13.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream13.closeArchiveEntry();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream28.closeArchiveEntry();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) (byte) 1);
        cpioArchiveOutputStream14.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
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
        cpioArchiveOutputStream25.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream25.closeArchiveEntry();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 1);
        cpioArchiveOutputStream9.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream9.closeArchiveEntry();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
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
        cpioArchiveOutputStream18.finish();
        cpioArchiveOutputStream18.write(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
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
        cpioArchiveOutputStream20.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        cpioArchiveOutputStream20.write(29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream41, (short) 2);
        cpioArchiveOutputStream41.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream45 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream41);
        cpioArchiveOutputStream41.write((int) (short) 8);
        cpioArchiveOutputStream41.flush();
        cpioArchiveOutputStream41.flush();
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
        cpioArchiveOutputStream41.write(byteArray63);
        cpioArchiveOutputStream28.write(byteArray63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream28.closeArchiveEntry();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9, (short) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
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
        cpioArchiveOutputStream13.finish();
        cpioArchiveOutputStream13.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream13, (short) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
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
        cpioArchiveOutputStream20.finish();
        cpioArchiveOutputStream20.write((int) (short) -1);
        cpioArchiveOutputStream20.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
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
        cpioArchiveOutputStream6.write((int) (byte) 1);
        cpioArchiveOutputStream6.write(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 4);
        cpioArchiveOutputStream18.write(2048);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
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
        cpioArchiveOutputStream15.write(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
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
        cpioArchiveOutputStream10.closeArchiveEntry();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
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
        cpioArchiveOutputStream27.write(4096);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream27.closeArchiveEntry();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
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
        cpioArchiveOutputStream15.finish();
        cpioArchiveOutputStream15.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
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
        cpioArchiveOutputStream12.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream10.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        cpioArchiveOutputStream10.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream10.closeArchiveEntry();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
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
        cpioArchiveOutputStream6.write(10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.write(0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, (short) 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream9.closeArchiveEntry();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
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
        cpioArchiveOutputStream20.write((int) (short) 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20, (short) 8);
        cpioArchiveOutputStream20.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream29.closeArchiveEntry();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.write(49152);
        cpioArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        cpioArchiveOutputStream11.flush();
        cpioArchiveOutputStream11.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
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
        cpioArchiveOutputStream18.flush();
        cpioArchiveOutputStream18.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18, (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream16.closeArchiveEntry();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
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
        cpioArchiveOutputStream10.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream10.closeArchiveEntry();
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20, (short) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream23.closeArchiveEntry();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
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
        cpioArchiveOutputStream20.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20, (short) 2);
        cpioArchiveOutputStream20.flush();
        cpioArchiveOutputStream20.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream30.closeArchiveEntry();
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
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
        cpioArchiveOutputStream6.write((int) (byte) 1);
        cpioArchiveOutputStream6.write((int) (short) 100);
        cpioArchiveOutputStream6.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
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
        cpioArchiveOutputStream18.write(16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 8);
        cpioArchiveOutputStream11.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 2);
        cpioArchiveOutputStream17.write((int) (short) 1);
        cpioArchiveOutputStream17.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
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
        cpioArchiveOutputStream20.finish();
        cpioArchiveOutputStream20.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
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
        cpioArchiveOutputStream25.write(61440);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream25.closeArchiveEntry();
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
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
        java.io.OutputStream outputStream15 = java.io.OutputStream.nullOutputStream();
        outputStream15.flush();
        outputStream15.flush();
        byte[] byteArray19 = new byte[] { (byte) 1 };
        outputStream15.write(byteArray19);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream15);
        cpioArchiveOutputStream21.finish();
        cpioArchiveOutputStream21.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream21);
        cpioArchiveOutputStream25.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream25);
        java.io.OutputStream outputStream28 = java.io.OutputStream.nullOutputStream();
        outputStream28.flush();
        outputStream28.flush();
        byte[] byteArray32 = new byte[] { (byte) 1 };
        outputStream28.write(byteArray32);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream34 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream28);
        cpioArchiveOutputStream34.write(49152);
        cpioArchiveOutputStream34.flush();
        cpioArchiveOutputStream34.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream40 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream34);
        cpioArchiveOutputStream40.finish();
        cpioArchiveOutputStream40.write((int) ' ');
        cpioArchiveOutputStream40.flush();
        java.io.OutputStream outputStream45 = java.io.OutputStream.nullOutputStream();
        outputStream45.flush();
        outputStream45.flush();
        byte[] byteArray49 = new byte[] { (byte) 1 };
        outputStream45.write(byteArray49);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream51 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream45);
        cpioArchiveOutputStream51.close();
        cpioArchiveOutputStream51.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream55 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream51, (short) (byte) 1);
        java.io.OutputStream outputStream56 = java.io.OutputStream.nullOutputStream();
        outputStream56.flush();
        outputStream56.flush();
        byte[] byteArray60 = new byte[] { (byte) 1 };
        outputStream56.write(byteArray60);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream62 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream56);
        cpioArchiveOutputStream62.write(49152);
        cpioArchiveOutputStream62.flush();
        cpioArchiveOutputStream62.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream67 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream62);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream68 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream62);
        byte[] byteArray69 = new byte[] {};
        cpioArchiveOutputStream62.write(byteArray69);
        cpioArchiveOutputStream55.write(byteArray69);
        cpioArchiveOutputStream40.write(byteArray69);
        cpioArchiveOutputStream27.write(byteArray69);
        cpioArchiveOutputStream14.write(byteArray69);
        cpioArchiveOutputStream14.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.close();
        cpioArchiveOutputStream6.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream9.write((int) (short) 4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        cpioArchiveOutputStream12.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(24576);
        cpioArchiveOutputStream6.write((int) (short) -1);
        cpioArchiveOutputStream6.write(0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream21.closeArchiveEntry();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream11.closeArchiveEntry();
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
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
        cpioArchiveOutputStream18.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream44 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18, (short) 8);
        cpioArchiveOutputStream18.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.write(32);
        cpioArchiveOutputStream3.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream3.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream3.closeArchiveEntry();
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream24.flush();
        cpioArchiveOutputStream24.write(1024);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream28.closeArchiveEntry();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
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
        cpioArchiveOutputStream12.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        cpioArchiveOutputStream12.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12, (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream15.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15, (short) 1);
        cpioArchiveOutputStream18.finish();
        cpioArchiveOutputStream18.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
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
        cpioArchiveOutputStream18.flush();
        cpioArchiveOutputStream18.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream44 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream44.closeArchiveEntry();
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
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
        cpioArchiveOutputStream18.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
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
        cpioArchiveOutputStream6.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, (short) (byte) 1);
        cpioArchiveOutputStream14.flush();
        cpioArchiveOutputStream14.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream14.closeArchiveEntry();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        cpioArchiveOutputStream18.flush();
        java.io.OutputStream outputStream20 = java.io.OutputStream.nullOutputStream();
        outputStream20.flush();
        outputStream20.flush();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        outputStream20.write(byteArray24);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream20);
        cpioArchiveOutputStream26.finish();
        cpioArchiveOutputStream26.write(32);
        cpioArchiveOutputStream26.flush();
        cpioArchiveOutputStream26.write(0);
        cpioArchiveOutputStream26.finish();
        java.io.OutputStream outputStream34 = java.io.OutputStream.nullOutputStream();
        outputStream34.flush();
        outputStream34.flush();
        byte[] byteArray38 = new byte[] { (byte) 1 };
        outputStream34.write(byteArray38);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream40 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream34);
        cpioArchiveOutputStream40.write(49152);
        cpioArchiveOutputStream40.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream44 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream40);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream45 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream44);
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
        outputStream46.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream61 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream46);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream63 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream46, (short) 1);
        java.io.OutputStream outputStream64 = java.io.OutputStream.nullOutputStream();
        outputStream64.flush();
        outputStream64.flush();
        byte[] byteArray68 = new byte[] { (byte) 1 };
        outputStream64.write(byteArray68);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream70 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream64);
        cpioArchiveOutputStream70.write(49152);
        cpioArchiveOutputStream70.flush();
        cpioArchiveOutputStream70.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream75 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream70);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream76 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream70);
        byte[] byteArray77 = new byte[] {};
        cpioArchiveOutputStream70.write(byteArray77);
        outputStream46.write(byteArray77);
        cpioArchiveOutputStream44.write(byteArray77);
        cpioArchiveOutputStream26.write(byteArray77);
        cpioArchiveOutputStream18.write(byteArray77);
        cpioArchiveOutputStream18.write(49152);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream4.write(100);
        java.io.OutputStream outputStream7 = java.io.OutputStream.nullOutputStream();
        outputStream7.flush();
        outputStream7.flush();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        outputStream7.write(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream7);
        java.io.OutputStream outputStream14 = java.io.OutputStream.nullOutputStream();
        outputStream14.flush();
        outputStream14.flush();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        outputStream14.write(byteArray18);
        outputStream7.write(byteArray18);
        outputStream7.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream7, (short) 1);
        java.io.OutputStream outputStream25 = java.io.OutputStream.nullOutputStream();
        outputStream25.flush();
        outputStream25.flush();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        outputStream25.write(byteArray29);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream25);
        cpioArchiveOutputStream31.write(49152);
        cpioArchiveOutputStream31.flush();
        cpioArchiveOutputStream31.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream36 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream31);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream31);
        byte[] byteArray38 = new byte[] {};
        cpioArchiveOutputStream31.write(byteArray38);
        outputStream7.write(byteArray38);
        cpioArchiveOutputStream4.write(byteArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream4.closeArchiveEntry();
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream19.closeArchiveEntry();
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
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
        cpioArchiveOutputStream20.write((int) (short) 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20, (short) 8);
        cpioArchiveOutputStream20.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 10 };
        outputStream0.write(byteArray10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream13.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream13.closeArchiveEntry();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
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
        cpioArchiveOutputStream15.write((int) (short) 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream4.write(100);
        cpioArchiveOutputStream4.write((int) (short) -1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4, (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream10.closeArchiveEntry();
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream18.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        cpioArchiveOutputStream20.flush();
        cpioArchiveOutputStream20.write((int) (short) -1);
        cpioArchiveOutputStream20.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream20, (short) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream26.closeArchiveEntry();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
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
        cpioArchiveOutputStream42.finish();
        cpioArchiveOutputStream42.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream45 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream42.closeArchiveEntry();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        cpioArchiveOutputStream21.write((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream21.closeArchiveEntry();
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        cpioArchiveOutputStream4.flush();
        cpioArchiveOutputStream4.flush();
        cpioArchiveOutputStream4.write(0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream4.closeArchiveEntry();
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
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
        cpioArchiveOutputStream6.write(4096);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream10.closeArchiveEntry();
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
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
        cpioArchiveOutputStream6.write(29127);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
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
        cpioArchiveOutputStream6.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream1.closeArchiveEntry();
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
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
        cpioArchiveOutputStream20.finish();
        cpioArchiveOutputStream20.finish();
        cpioArchiveOutputStream20.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream20.closeArchiveEntry();
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        cpioArchiveOutputStream23.write((int) (short) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream23.closeArchiveEntry();
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
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
        cpioArchiveOutputStream14.write(0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream24.closeArchiveEntry();
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream10.closeArchiveEntry();
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
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
        cpioArchiveOutputStream16.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream16, (short) 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream16);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream16.closeArchiveEntry();
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
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
        cpioArchiveOutputStream14.write(29127);
        cpioArchiveOutputStream14.write((int) (short) 12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        cpioArchiveOutputStream23.flush();
        cpioArchiveOutputStream23.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream23);
        cpioArchiveOutputStream23.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream23.closeArchiveEntry();
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12, (short) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
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
        java.io.OutputStream outputStream19 = java.io.OutputStream.nullOutputStream();
        outputStream19.flush();
        outputStream19.flush();
        byte[] byteArray23 = new byte[] { (byte) 1 };
        outputStream19.write(byteArray23);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream19);
        cpioArchiveOutputStream25.finish();
        cpioArchiveOutputStream25.write(32);
        cpioArchiveOutputStream25.write(4);
        cpioArchiveOutputStream25.write(100);
        cpioArchiveOutputStream25.write(100);
        cpioArchiveOutputStream25.finish();
        cpioArchiveOutputStream25.write(32);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream38 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream25);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream39 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream25);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream40 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream25);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream41 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream25);
        cpioArchiveOutputStream41.flush();
        java.io.OutputStream outputStream43 = java.io.OutputStream.nullOutputStream();
        outputStream43.flush();
        outputStream43.flush();
        byte[] byteArray47 = new byte[] { (byte) 1 };
        outputStream43.write(byteArray47);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream49 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream43);
        cpioArchiveOutputStream49.write(49152);
        cpioArchiveOutputStream49.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream53 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream49);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream54 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream53);
        cpioArchiveOutputStream54.finish();
        java.io.OutputStream outputStream56 = java.io.OutputStream.nullOutputStream();
        outputStream56.flush();
        outputStream56.flush();
        byte[] byteArray60 = new byte[] { (byte) 1 };
        outputStream56.write(byteArray60);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream62 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream56);
        cpioArchiveOutputStream62.write(49152);
        cpioArchiveOutputStream62.flush();
        cpioArchiveOutputStream62.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream67 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream62);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream68 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream62);
        byte[] byteArray69 = new byte[] {};
        cpioArchiveOutputStream62.write(byteArray69);
        cpioArchiveOutputStream54.write(byteArray69);
        cpioArchiveOutputStream41.write(byteArray69);
        cpioArchiveOutputStream16.write(byteArray69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream16.closeArchiveEntry();
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
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
        cpioArchiveOutputStream6.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, (short) 4);
        cpioArchiveOutputStream6.finish();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream13.closeArchiveEntry();
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream17.closeArchiveEntry();
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
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
        cpioArchiveOutputStream12.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream15.closeArchiveEntry();
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
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
        cpioArchiveOutputStream12.write(61440);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream12.closeArchiveEntry();
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        outputStream0.flush();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        outputStream0.write(byteArray4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream6.finish();
        cpioArchiveOutputStream6.write(32);
        cpioArchiveOutputStream6.flush();
        cpioArchiveOutputStream6.write(0);
        cpioArchiveOutputStream6.write((int) '#');
        java.io.OutputStream outputStream15 = java.io.OutputStream.nullOutputStream();
        outputStream15.flush();
        outputStream15.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream15);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream18, (short) (byte) 1);
        cpioArchiveOutputStream18.finish();
        java.io.OutputStream outputStream23 = java.io.OutputStream.nullOutputStream();
        outputStream23.flush();
        outputStream23.flush();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        outputStream23.write(byteArray27);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream23);
        cpioArchiveOutputStream29.finish();
        cpioArchiveOutputStream29.write(24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream29);
        cpioArchiveOutputStream33.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream33);
        java.io.OutputStream outputStream36 = java.io.OutputStream.nullOutputStream();
        outputStream36.flush();
        outputStream36.flush();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        outputStream36.write(byteArray40);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream42 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream36);
        cpioArchiveOutputStream42.write(49152);
        cpioArchiveOutputStream42.flush();
        cpioArchiveOutputStream42.write(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream48 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream42);
        cpioArchiveOutputStream48.finish();
        cpioArchiveOutputStream48.write((int) ' ');
        cpioArchiveOutputStream48.flush();
        java.io.OutputStream outputStream53 = java.io.OutputStream.nullOutputStream();
        outputStream53.flush();
        outputStream53.flush();
        byte[] byteArray57 = new byte[] { (byte) 1 };
        outputStream53.write(byteArray57);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream59 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream53);
        cpioArchiveOutputStream59.close();
        cpioArchiveOutputStream59.close();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream63 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream59, (short) (byte) 1);
        java.io.OutputStream outputStream64 = java.io.OutputStream.nullOutputStream();
        outputStream64.flush();
        outputStream64.flush();
        byte[] byteArray68 = new byte[] { (byte) 1 };
        outputStream64.write(byteArray68);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream70 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream64);
        cpioArchiveOutputStream70.write(49152);
        cpioArchiveOutputStream70.flush();
        cpioArchiveOutputStream70.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream75 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream70);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream76 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream70);
        byte[] byteArray77 = new byte[] {};
        cpioArchiveOutputStream70.write(byteArray77);
        cpioArchiveOutputStream63.write(byteArray77);
        cpioArchiveOutputStream48.write(byteArray77);
        cpioArchiveOutputStream35.write(byteArray77);
        cpioArchiveOutputStream18.write(byteArray77);
        cpioArchiveOutputStream6.write(byteArray77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        cpioArchiveOutputStream18.closeArchiveEntry();
    }
}

