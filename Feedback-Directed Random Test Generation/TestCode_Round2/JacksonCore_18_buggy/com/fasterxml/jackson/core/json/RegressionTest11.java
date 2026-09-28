package com.fasterxml.jackson.core.json;

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
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray6, 32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0 });
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray4, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray8, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 0 });
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray10, 32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) 0 });
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray7, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 0, (byte) 1 });
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray9, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray8, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1 });
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray8, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10 });
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray9, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray6, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0 });
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray10, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 100 });
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray9, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 100 });
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray4, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray10, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) -1 });
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray8, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray7, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100 });
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray5, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray8, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray8, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10 });
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 });
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray7, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray8, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) -1 });
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray5, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray7, 56319, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray6, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10 });
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray6, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10 });
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray6, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0 });
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray4, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray5, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray4, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 1 });
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray5, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray6, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100 });
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray5, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray5, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray10, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray7, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 10 });
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray7, 56320, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 0 });
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray4, 32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray6, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) -1 });
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray4, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray7, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10, (byte) 100 });
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray9, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray5, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray10, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray9, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray8, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray10, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray8, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10 });
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray9, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray8, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0 });
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray8, 56319, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray7, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray5, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray7, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 32, objectCodec2, outputStream3, byteArray10, 55296, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 });
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray5, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray6, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) -1 });
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray10, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 1 });
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray5, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray8, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray5, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray10, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 10 });
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray5, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray9, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) 1 });
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray8, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray4, 56319, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray4, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray4, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray8, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray10, 55296, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 100 });
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray10, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray7, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) 100 });
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray6, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1 });
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray9, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray8, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray8, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray5, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray10, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray6, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10 });
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray5, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray5, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray7, 32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100 });
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray10, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 0 });
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray6, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100 });
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray7, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray7, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray8, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 1 });
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray8, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 0 });
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray7, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 1 });
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 32, objectCodec2, outputStream3, byteArray10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 100 });
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray7, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) 10 });
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray6, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100 });
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray8, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray7, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 10 });
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray7, 56319, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 0, (byte) 1 });
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray4, 32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray4, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray6, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 10 });
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray6, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100 });
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray7, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0 });
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray7, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) -1, (byte) 1 });
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray9, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 100 });
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray5, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray7, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) -1 });
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray5, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray8, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 1 });
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray7, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) -1 });
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray7, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) -1 });
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray4, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 32, objectCodec2, outputStream3, byteArray6, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100 });
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray10, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 100 });
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray6, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10 });
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray8, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray7, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray9, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray5, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray6, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 1 });
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray6, 56320, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 100 });
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray8, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100 });
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray7, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 0 });
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray10, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray4, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray9, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 0 });
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray9, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 0 });
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) -1 });
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray9, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 100 });
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) 0 });
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray10, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 10 });
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray5, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray9, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 0 });
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray7, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1, (byte) 1 });
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray9, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray10, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) -1 });
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray8, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100 });
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray4, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray8, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0 });
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray5, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray7, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) -1, (byte) 10 });
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray7, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 1 });
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray7, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1, (byte) 1 });
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray5, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray10, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 10 });
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray9, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 0 });
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray9, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 1 });
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray6, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) -1 });
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray6, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 10 });
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray5, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray5, 32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray10, 32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) -1 });
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray10, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray7, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10, (byte) 10 });
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray6, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100 });
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray6, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) -1 });
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray9, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) -1 });
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray6, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) -1 });
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray8, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray4, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 32, objectCodec2, outputStream3, byteArray7, 55296, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray9, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 10 });
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray9, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray8, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray4, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray7, 32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) 0 });
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray9, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 10 });
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray10, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 10 });
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray10, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 100 });
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray5, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray9, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) -1 });
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray8, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 100 });
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray8, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100 });
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray10, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 1 });
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray7, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray8, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10 });
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray6, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100 });
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray9, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) -1 });
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray4, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray8, 56320, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 0 });
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray4, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray7, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10, (byte) 0 });
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 32, objectCodec2, outputStream3, byteArray5, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray6, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10 });
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray7, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 0 });
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray8, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100 });
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray8, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 1 });
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray7, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray7, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray9, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 0 });
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray4, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray6, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 100 });
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray8, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 10 });
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray10, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray10, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 1 });
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray5, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray8, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10 });
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray6, 55296, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray4, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray8, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray4, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray8, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray8, 56320, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) -1 });
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray4, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray7, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 0, (byte) 1 });
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray5, 32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray5, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray5, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray9, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) 0 });
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray8, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray9, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) 1 });
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray6, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 100 });
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray9, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray9, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) 0 });
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray5, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray9, 32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray7, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) -1, (byte) 1 });
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray9, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) -1 });
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray6, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10 });
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray4, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray8, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1 });
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray9, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) 1 });
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray5, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray5, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray6, 32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0 });
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray4, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray7, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1, (byte) 0 });
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray5, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray8, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 1 });
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray9, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 0 });
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray5, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray5, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray9, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray10, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray10, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) 10 });
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray8, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 1 });
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray6, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100 });
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray10, 32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) 1 });
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray5, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray6, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100 });
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray8, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 32, objectCodec2, outputStream3, byteArray6, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 100 });
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray8, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray4, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray9, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 1 });
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray5, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray8, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10 });
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 32, objectCodec2, outputStream3, byteArray8, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray5, 32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray5, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray4, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 32, objectCodec2, outputStream3, byteArray6, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray8, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1 });
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray7, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) -1, (byte) 100 });
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 32, objectCodec2, outputStream3, byteArray5, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray9, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray9, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray5, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray8, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 1 });
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray9, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray10, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) 100 });
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray6, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0 });
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray4, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray6, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 0 });
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray9, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray10, 56319, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 100 });
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray10, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray8, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray4, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray9, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray7, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray8, 32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1 });
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray9, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray9, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray6, 32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 0 });
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray9, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 0 });
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray8, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1 });
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray9, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 0 });
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray10, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray9, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 10 });
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray7, 55296, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 1 });
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray5, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray9, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray10, 56320, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1 });
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray10, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 0 });
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray4, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray5, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray7, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) -1 });
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray9, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray6, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10 });
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray6, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 1 });
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray5, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }
}

