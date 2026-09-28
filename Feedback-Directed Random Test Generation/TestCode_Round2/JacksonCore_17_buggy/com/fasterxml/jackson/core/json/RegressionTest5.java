package com.fasterxml.jackson.core.json;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray9, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 10 });
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray4, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray8, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray10, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray9, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray6, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10 });
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray8, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) -1 });
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray4, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray9, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 10 });
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray7, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray5, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray10, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray10, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray7, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray5, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray4, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray5, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray10, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray7, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray8, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray8, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 100 });
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray4, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray5, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray7, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray7, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray6, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray10, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray5, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray8, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray10, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray5, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray7, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray6, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100 });
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray4, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray10, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 10 });
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray7, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray6, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1 });
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray6, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1 });
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray8, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray8, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1 });
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray5, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray10, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray10, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray8, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray8, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray9, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray4, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray5, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray10, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 10 });
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray4, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray8, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 1 });
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray9, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray9, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray8, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) -1 });
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray5, 56319, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray6, 55296, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100 });
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray7, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray10, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) -1 });
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray7, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray8, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray4, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray10, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray9, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray9, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray5, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray8, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0 });
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray8, 56320, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray8, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 0 });
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray8, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray9, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 10 });
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray7, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray5, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray9, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 0 });
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray7, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray10, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray6, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 10 });
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray4, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray5, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray9, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) -1 });
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray6, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10 });
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray8, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray9, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 100, (byte) 10 });
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray4, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray7, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) 1 });
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray4, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray8, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1 });
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray8, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray9, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 1 });
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray6, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0 });
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray9, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray4, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray4, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray8, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray6, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0 });
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray10, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 1 });
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray9, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) -1 });
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray10, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray4, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray10, 56319, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray7, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) 10 });
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray9, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray5, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray8, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 100 });
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray9, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) 10 });
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray7, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 10 });
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray10, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray7, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray4, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray10, 56320, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray6, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 0 });
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray7, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray7, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray8, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray7, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 10 });
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray4, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray4, 55296, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray9, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray5, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray7, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray9, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray10, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray6, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 100 });
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray5, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray6, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) -1 });
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray8, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray6, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray7, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray4, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray5, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray7, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 10 });
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray7, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray4, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray7, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray6, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10 });
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray9, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray9, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray7, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 0 });
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray10, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray9, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray8, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray7, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray10, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray9, 56320, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 1 });
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray4, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray10, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray4, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray6, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0 });
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray10, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 0 });
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray4, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray8, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray6, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 100 });
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray4, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray6, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1 });
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray5, 56320, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray8, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 100 });
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray6, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 1 });
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray9, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray9, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray4, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray7, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray4, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray8, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray6, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 100 });
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray6, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10 });
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray4, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray9, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray8, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1 });
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray9, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 100 });
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray10, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray10, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray8, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray5, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray9, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 1 });
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray9, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray9, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) -1 });
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray10, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray4, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray5, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray5, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray4, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray4, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray7, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 0 });
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray8, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray9, 56319, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray8, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray5, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray10, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray9, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray7, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray7, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray5, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray9, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray7, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) -1 });
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray7, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray4, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray10, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray7, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray6, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100 });
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray9, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray9, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray6, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) -1 });
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray7, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray10, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) 100 });
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray5, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray5, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray5, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 1 });
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray6, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) -1 });
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray5, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray9, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) -1 });
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray5, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray4, 55296, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray6, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10 });
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray7, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) 1 });
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray9, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray6, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 0 });
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray5, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray6, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1 });
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray10, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray7, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray4, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray6, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10 });
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray4, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray9, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray8, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray10, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray5, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) -1 });
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray6, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100 });
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray5, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray7, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray10, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray8, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray6, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100 });
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray10, 55296, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray8, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray10, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray9, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray7, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 1 });
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray8, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 0 });
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray5, 56319, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray7, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) 1 });
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray8, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray4, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray7, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray9, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 100, (byte) 1 });
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray9, 56320, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray5, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray5, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray10, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray10, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray8, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray9, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 10 });
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray6, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1 });
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray9, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray9, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray8, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray8, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 10 });
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray7, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray7, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10, (byte) 0 });
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray5, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray9, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray10, 56320, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray6, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0 });
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray5, 56319, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray6, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10 });
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray8, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 10 });
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 1 });
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray10, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) 100 });
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray6, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 1 });
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray8, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray8, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 100 });
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray8, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 1 });
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray5, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray6, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10 });
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray7, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray5, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray10, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray4, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray9, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 100, (byte) 10 });
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray10, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray9, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 100 });
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray6, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray4, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray4, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray9, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray6, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100 });
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray9, 56320, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray7, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 10 });
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray10, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray5, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray4, 55296, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray6, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100 });
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray8, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray7, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray4, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray9, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) 1 });
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray9, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray4, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray5, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
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
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray4, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray9, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 0, (byte) -1 });
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray4, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray6, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 1 });
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray7, 56319, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray5, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray9, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray8, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray8, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray7, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray10, 55296, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray7, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray8, 55296, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 });
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray6, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 1 });
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray4, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray6, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10 });
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray4, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray8, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray7, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) 1 });
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray8, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 1 });
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray6, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 1 });
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray6, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100 });
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray9, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray5, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray7, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray5, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray5, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray8, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0 });
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray7, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray10, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray7, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray5, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray8, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1 });
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray6, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10 });
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray8, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 100 });
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray7, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray7, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) -1, (byte) -1 });
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) 100 });
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray9, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 });
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray6, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0 });
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray7, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray9, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray5, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray9, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray8, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray9, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray6, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) -1 });
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray6, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0 });
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray5, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray7, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray9, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray10, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray9, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) 10 });
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray5, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray7, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray8, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray5, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray10, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray10, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray8, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray9, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 100 });
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray7, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray4, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray5, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray7, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray9, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray6, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10 });
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray8, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray10, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 100 });
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray4, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray6, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10 });
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray7, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray7, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray8, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray7, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray7, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) -1, (byte) 1 });
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray8, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0 });
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray8, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray4, 55296, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray5, 56320, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray10, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray10, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray4, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray8, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray4, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray8, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray4, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray7, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray10, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray7, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray4, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray9, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 10 });
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray8, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray9, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 10, (byte) -1 });
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray6, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10 });
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray7, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 1 });
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray6, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) -1 });
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray6, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) -1 });
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray8, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray8, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray9, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray5, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray6, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray7, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) -1, (byte) 100 });
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray7, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray5, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray9, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray4, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray10, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 100 });
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray4, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray8, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray5, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray8, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray9, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray8, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1 });
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray4, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray6, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0 });
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray8, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray8, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1 });
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray9, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) -1 });
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray5, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray10, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 1 });
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray7, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray4, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray6, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100 });
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray4, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray6, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10 });
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray8, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray9, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 10 });
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray9, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) 1 });
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) -1 });
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray5, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray10, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray4, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray9, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray10, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) -1 });
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray6, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) -1 });
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray6, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 1 });
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray10, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 10 });
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray8, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray4, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray8, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray8, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray6, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10 });
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray5, 56319, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray9, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray8, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 1 });
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray8, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) -1 });
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray7, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray9, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) 100 });
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray5, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray10, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray9, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 1 });
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray9, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray10, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray9, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray4, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray4, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray7, 55296, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) -1, (byte) 1 });
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray4, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray8, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 });
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray7, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray5, 56319, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray4, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray5, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray5, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray4, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray4, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray9, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray5, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray9, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray7, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray9, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray6, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100 });
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray7, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray8, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100 });
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray7, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) -1, (byte) 1 });
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray8, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray9, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) 0 });
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray8, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray9, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray5, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray5, 56320, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray10, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) 0 });
    }
}

