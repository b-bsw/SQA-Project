package org.apache.commons.compress.compressors;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        int int8 = inputStream0.read(byteArray7);
        inputStream0.mark((-1));
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        int int19 = inputStream11.read(byteArray18);
        boolean boolean20 = inputStream11.markSupported();
        byte[] byteArray21 = inputStream11.readAllBytes();
        int int22 = inputStream0.read(byteArray21);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream23 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(inputStream0);
        int int24 = deflateCompressorInputStream23.getCount();
        long long25 = deflateCompressorInputStream23.getBytesRead();
        deflateCompressorInputStream23.close();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream27 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) deflateCompressorInputStream23);
        deflateCompressorInputStream23.close();
        int int29 = deflateCompressorInputStream23.getCount();
        long long30 = deflateCompressorInputStream23.getBytesRead();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream31 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) deflateCompressorInputStream23);
        boolean boolean32 = deflateCompressorInputStream23.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        int int8 = inputStream0.read(byteArray7);
        inputStream0.mark((-1));
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream11 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(inputStream0);
        deflateCompressorInputStream11.mark((-1));
        boolean boolean14 = deflateCompressorInputStream11.markSupported();
        int int15 = deflateCompressorInputStream11.getCount();
        int int16 = deflateCompressorInputStream11.available();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        compressorStreamFactory0.setDecompressConcatenated(false);
        boolean boolean3 = compressorStreamFactory0.getDecompressConcatenated();
        compressorStreamFactory0.setDecompressConcatenated(false);
        compressorStreamFactory0.setDecompressConcatenated(false);
        boolean boolean8 = compressorStreamFactory0.getDecompressConcatenated();
        compressorStreamFactory0.setDecompressConcatenated(true);
        boolean boolean11 = compressorStreamFactory0.getDecompressConcatenated();
        compressorStreamFactory0.setDecompressConcatenated(true);
        boolean boolean14 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean15 = compressorStreamFactory0.getDecompressConcatenated();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        int int8 = inputStream0.read(byteArray7);
        inputStream0.mark((-1));
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream11 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(inputStream0);
        int int12 = deflateCompressorInputStream11.getCount();
        long long14 = deflateCompressorInputStream11.skip(0L);
        int int15 = deflateCompressorInputStream11.available();
        int int16 = deflateCompressorInputStream11.available();
        deflateCompressorInputStream11.mark((int) '4');
        long long19 = deflateCompressorInputStream11.getBytesRead();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        int int8 = inputStream0.read(byteArray7);
        inputStream0.mark((-1));
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream11 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(inputStream0);
        int int12 = deflateCompressorInputStream11.getCount();
        deflateCompressorInputStream11.close();
        int int14 = deflateCompressorInputStream11.getCount();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream15 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) deflateCompressorInputStream11);
        int int16 = deflateCompressorInputStream11.getCount();
        deflateCompressorInputStream11.mark(1);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream19 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) deflateCompressorInputStream11);
        int int20 = deflateCompressorInputStream19.getCount();
        deflateCompressorInputStream19.mark((int) '4');
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        int int31 = inputStream23.read(byteArray30);
        inputStream23.mark((-1));
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream34 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(inputStream23);
        int int35 = deflateCompressorInputStream34.getCount();
        deflateCompressorInputStream34.close();
        int int37 = deflateCompressorInputStream34.getCount();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream38 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) deflateCompressorInputStream34);
        deflateCompressorInputStream34.mark((int) (byte) -1);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream41 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) deflateCompressorInputStream34);
        int int42 = deflateCompressorInputStream41.getCount();
        byte[] byteArray44 = deflateCompressorInputStream41.readNBytes(0);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = deflateCompressorInputStream19.readNBytes(byteArray44, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [32, 32 + -1) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        int int8 = inputStream0.read(byteArray7);
        inputStream0.mark((-1));
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream11 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(inputStream0);
        int int12 = deflateCompressorInputStream11.getCount();
        deflateCompressorInputStream11.close();
        int int14 = deflateCompressorInputStream11.getCount();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream15 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) deflateCompressorInputStream11);
        int int16 = deflateCompressorInputStream11.getCount();
        deflateCompressorInputStream11.mark(1);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream19 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) deflateCompressorInputStream11);
        deflateCompressorInputStream11.close();
        int int21 = deflateCompressorInputStream11.getCount();
        boolean boolean22 = deflateCompressorInputStream11.markSupported();
        deflateCompressorInputStream11.mark((int) (byte) 10);
        int int25 = deflateCompressorInputStream11.getCount();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream26 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) deflateCompressorInputStream11);
        boolean boolean27 = deflateCompressorInputStream11.markSupported();
        long long28 = deflateCompressorInputStream11.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = deflateCompressorInputStream11.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }
}

