package com.fasterxml.jackson.core.json;

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
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray8, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray6, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100 });
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray7, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 1 });
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray4, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray7, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray4, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray6, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0 });
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray6, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) -1 });
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray8, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 1 });
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray4, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray4, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray7, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 10 });
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray10, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 });
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray4, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray8, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray9, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray9, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray8, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray8, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10 });
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray7, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 10 });
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray5, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray9, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 1 });
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray7, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 10 });
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray9, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray10, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray9, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray10, 56320, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray4, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray5, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray10, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 1 });
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray6, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 1 });
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray7, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) -1 });
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray6, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 0 });
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray5, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray8, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0 });
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray5, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray8, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray5, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray4, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray4, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray10, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 100, (byte) 10 });
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray4, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray8, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray8, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 0 });
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray6, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0 });
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray10, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 100 });
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray5, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray8, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 0 });
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray4, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray4, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray9, 55296, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 10 });
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray6, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1 });
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray10, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray9, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 1 });
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray9, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 100 });
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray7, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1 });
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray8, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 0 });
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray6, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 0 });
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray5, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray6, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) -1 });
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray10, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray8, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10 });
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray10, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 0 });
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray5, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray6, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) -1 });
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray7, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) 0 });
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 1, objectCodec2, outputStream3, byteArray10, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 0 });
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray5, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray7, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray9, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) 1 });
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray7, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray6, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 0 });
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray6, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1 });
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray5, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray5, 55296, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray7, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray8, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0 });
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray5, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray9, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray7, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1 });
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray9, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 10 });
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray8, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 1 });
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray4, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray4, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray10, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) 0 });
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray5, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray4, 57343, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray7, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) -1, (byte) 100 });
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray9, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 0 });
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray9, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray7, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 1 });
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray9, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray5, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
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
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray10, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray8, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray10, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray6, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0 });
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) -1 });
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray10, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 10 });
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray8, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 0 });
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray7, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 10 });
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray10, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray5, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray5, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray8, 55296, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 100 });
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray9, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray5, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray5, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray5, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray7, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray8, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56319, objectCodec2, outputStream3, byteArray9, 56320, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray7, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) 10 });
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray8, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0 });
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray9, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) -1 });
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray7, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray10, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray9, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray7, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray10, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray9, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 100 });
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray10, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 100, objectCodec2, outputStream3, byteArray6, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 10 });
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray6, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) -1 });
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray6, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100 });
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray8, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) -1 });
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 0 });
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray8, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray6, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100 });
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray4, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray10, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) -1 });
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 1, objectCodec2, outputStream3, byteArray6, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 10 });
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray6, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) -1 });
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray5, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray8, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 100 });
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray4, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray8, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 1, objectCodec2, outputStream3, byteArray9, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 100 });
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 10, objectCodec2, outputStream3, byteArray9, 55296, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray10, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray4, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray5, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10 });
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray4, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray6, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100 });
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray5, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray4, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray6, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10 });
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '#', objectCodec2, outputStream3, byteArray9, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray9, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray6, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray8, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray8, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray9, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray9, 56319, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray4, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray8, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1 });
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 56320, objectCodec2, outputStream3, byteArray9, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 10 });
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray5, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 57343, objectCodec2, outputStream3, byteArray5, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray9, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 0 });
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) -1, objectCodec2, outputStream3, byteArray9, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray10, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator8 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray5, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 10, objectCodec2, outputStream3, byteArray8, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10 });
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 55296, objectCodec2, outputStream3, byteArray8, 57343, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 1 });
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray9, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 100 });
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray9, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 1 });
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 0, objectCodec2, outputStream3, byteArray4, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray10, 56320, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) 'a', objectCodec2, outputStream3, byteArray9, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 0, (byte) 1 });
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (-1), objectCodec2, outputStream3, byteArray7, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 10, objectCodec2, outputStream3, byteArray6, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) -1 });
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator12 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray9, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator13 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, 0, objectCodec2, outputStream3, byteArray10, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) 100 });
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 100, objectCodec2, outputStream3, byteArray8, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1 });
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator10 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray7, 56319, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator7 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (byte) 0, objectCodec2, outputStream3, byteArray4, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) (short) 100, objectCodec2, outputStream3, byteArray6, 55296, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator9 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray6, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 0 });
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext0, (int) ' ', objectCodec2, outputStream3, byteArray8, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100 });
    }
}

