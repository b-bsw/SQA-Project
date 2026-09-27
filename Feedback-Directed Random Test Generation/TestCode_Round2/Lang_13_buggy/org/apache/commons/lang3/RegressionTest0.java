package org.apache.commons.lang3;

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
        byte byte0 = java.io.ObjectStreamConstants.TC_MAX;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 126 + "'", byte0 == (byte) 126);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        byte byte0 = java.io.ObjectStreamConstants.TC_RESET;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 121 + "'", byte0 == (byte) 121);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        byte byte0 = java.io.ObjectStreamConstants.SC_ENUM;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 16 + "'", byte0 == (byte) 16);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        byte byte0 = java.io.ObjectStreamConstants.TC_BLOCKDATA;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 119 + "'", byte0 == (byte) 119);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int0 = java.io.ObjectStreamConstants.PROTOCOL_VERSION_2;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0d, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        byte byte0 = java.io.ObjectStreamConstants.TC_CLASS;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 118 + "'", byte0 == (byte) 118);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.lang3.SerializationUtils serializationUtils0 = new org.apache.commons.lang3.SerializationUtils();
        java.lang.Class<?> wildcardClass1 = serializationUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        byte byte0 = java.io.ObjectStreamConstants.TC_BASE;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 112 + "'", byte0 == (byte) 112);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        byte byte0 = java.io.ObjectStreamConstants.TC_CLASSDESC;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 114 + "'", byte0 == (byte) 114);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        byte byte0 = java.io.ObjectStreamConstants.TC_ENUM;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 126 + "'", byte0 == (byte) 126);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        byte byte0 = java.io.ObjectStreamConstants.SC_BLOCK_DATA;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 8 + "'", byte0 == (byte) 8);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        byte byte0 = java.io.ObjectStreamConstants.TC_LONGSTRING;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 124 + "'", byte0 == (byte) 124);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        byte byte0 = java.io.ObjectStreamConstants.SC_WRITE_METHOD;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 1 + "'", byte0 == (byte) 1);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        byte[] byteArray3 = new byte[] { (byte) 126, (byte) 121, (byte) 112 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 126, (byte) 121, (byte) 112 });
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        byte byte0 = java.io.ObjectStreamConstants.TC_STRING;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 116 + "'", byte0 == (byte) 116);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int0 = java.io.ObjectStreamConstants.PROTOCOL_VERSION_1;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 116, (byte) 0, (byte) 121, (byte) 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.StreamCorruptedException: invalid stream header: 0A740079");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 116, (byte) 0, (byte) 121, (byte) 8 });
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        byte[] byteArray4 = new byte[] { (byte) 118, (byte) 16, (byte) 116, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.StreamCorruptedException: invalid stream header: 761074FF");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 118, (byte) 16, (byte) 116, (byte) -1 });
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0L, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 1.0d, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        short short0 = java.io.ObjectStreamConstants.STREAM_MAGIC;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) -21267 + "'", short0 == (short) -21267);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        byte byte0 = java.io.ObjectStreamConstants.TC_BLOCKDATALONG;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 122 + "'", byte0 == (byte) 122);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        byte byte0 = java.io.ObjectStreamConstants.SC_SERIALIZABLE;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 2 + "'", byte0 == (byte) 2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        byte byte0 = java.io.ObjectStreamConstants.TC_EXCEPTION;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 123 + "'", byte0 == (byte) 123);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The InputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int int0 = java.io.ObjectStreamConstants.baseWireHandle;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8257536 + "'", int0 == 8257536);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        byte byte0 = java.io.ObjectStreamConstants.SC_EXTERNALIZABLE;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 4 + "'", byte0 == (byte) 4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        byte byte0 = java.io.ObjectStreamConstants.TC_ARRAY;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 117 + "'", byte0 == (byte) 117);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        byte byte0 = java.io.ObjectStreamConstants.TC_NULL;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 112 + "'", byte0 == (byte) 112);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePermission0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        byte byte0 = java.io.ObjectStreamConstants.TC_OBJECT;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 115 + "'", byte0 == (byte) 115);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        short short0 = java.io.ObjectStreamConstants.STREAM_VERSION;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 5 + "'", short0 == (short) 5);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.io.InputStream inputStream0 = null;
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream2 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        byte byte0 = java.io.ObjectStreamConstants.TC_REFERENCE;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 113 + "'", byte0 == (byte) 113);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '4');
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        byte[] byteArray6 = new byte[] { (byte) 122, (byte) 122, (byte) 123, (byte) 114, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.StreamCorruptedException: invalid stream header: 7A7A7B72");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 122, (byte) 122, (byte) 123, (byte) 114, (byte) 1, (byte) 10 });
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        byte byte0 = java.io.ObjectStreamConstants.TC_ENDBLOCKDATA;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 120 + "'", byte0 == (byte) 120);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        byte byte0 = java.io.ObjectStreamConstants.TC_PROXYCLASSDESC;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 125 + "'", byte0 == (byte) 125);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream3 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int7 = inputStream0.readNBytes(byteArray4, 1, (int) (byte) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [1, 1 + 16) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int5 = inputStream0.readNBytes(byteArray2, (int) (byte) 16, (int) (byte) 2);
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream7 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = inputStream0.readNBytes(byteArray4, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [10, 10 + 100) out of bounds for length 77");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.String str1 = org.apache.commons.lang3.SerializationUtils.clone("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 123, outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream4 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0.0f, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        inputStream0.mark((int) (byte) 100);
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream8 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) int7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = inputStream0.transferTo(outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 115, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 5, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream6 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader5);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        java.lang.ClassLoader classLoader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream16 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader15);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int5 = inputStream0.readNBytes(byteArray2, (int) (byte) 16, (int) (byte) 2);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = inputStream0.transferTo(outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream4 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream8 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = inputStream0.transferTo(outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = inputStream0.read(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray1 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 126, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = inputStream0.transferTo(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        long long4 = inputStream0.skip((long) (byte) 113);
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream6 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader5);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.lang.Object obj6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = inputStream0.readNBytes(byteArray4, (int) (byte) 120, (int) (byte) 115);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [120, 120 + 115) out of bounds for length 77");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 0 + "'", obj6, (short) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 0 + "'", obj7, (short) 0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = inputStream0.readNBytes(byteArray7, 2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [2, 2 + 97) out of bounds for length 77");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream6 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader5);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        boolean boolean3 = inputStream0.markSupported();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = inputStream0.readNBytes(byteArray6, (int) (byte) 126, (int) (short) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [126, 126 + 5) out of bounds for length 77");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) -1, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 119, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray11 = inputStream0.readNBytes(8257536);
        java.lang.ClassLoader classLoader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream13 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader12);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        boolean boolean3 = inputStream0.markSupported();
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = inputStream0.transferTo(outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = inputStream0.readNBytes(byteArray5, (int) (byte) 126, (int) (byte) 121);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [126, 126 + 121) out of bounds for length 77");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        byte[] byteArray3 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        java.lang.ClassLoader classLoader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream10 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader9);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        java.lang.Class<?> wildcardClass1 = inputStream0.getClass();
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass1, outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        boolean boolean8 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark(8257536);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray18);
        int int21 = inputStream13.read(byteArray20);
        int int22 = inputStream0.read(byteArray20);
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) int22, outputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        boolean boolean22 = inputStream21.markSupported();
        inputStream21.mark(8257536);
        byte[] byteArray25 = inputStream21.readAllBytes();
        inputStream21.mark(1);
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int33 = inputStream28.readNBytes(byteArray30, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int35 = inputStream21.read(byteArray34);
        java.lang.Object obj36 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = inputStream0.readNBytes(byteArray34, (int) (short) -21267, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-21267, -21267 + 100) out of bounds for length 75");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 2 + "'", obj36, (byte) 2);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        boolean boolean7 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        boolean boolean3 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        java.lang.ClassLoader classLoader19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream20 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader19);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 'a' + "'", obj2, 'a');
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        boolean boolean13 = inputStream0.markSupported();
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = inputStream0.transferTo(outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Object obj3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        boolean boolean3 = inputStream0.markSupported();
        java.io.InputStream inputStream4 = java.io.InputStream.nullInputStream();
        long long6 = inputStream4.skip((long) (short) 1);
        long long8 = inputStream4.skip(0L);
        long long10 = inputStream4.skip((long) (byte) -1);
        byte[] byteArray11 = inputStream4.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = inputStream0.readNBytes(byteArray11, (int) (byte) 2, (int) (byte) 122);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [2, 2 + 122) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1L), outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 121, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray1 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = inputStream0.transferTo(outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 119);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 124);
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = inputStream0.transferTo(outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        java.lang.ClassLoader classLoader29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream30 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader29);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 1L, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.security.BasicPermission basicPermission0 = null;
        java.security.BasicPermission basicPermission1 = org.apache.commons.lang3.SerializationUtils.clone(basicPermission0);
        org.junit.Assert.assertNull(basicPermission1);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 8, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) ' ');
        byte[] byteArray6 = inputStream0.readAllBytes();
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream8 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray11 = inputStream0.readNBytes(8257536);
        inputStream0.mark((int) (byte) 112);
        byte[] byteArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = inputStream0.readNBytes(byteArray14, (int) (byte) 123, (int) (byte) 123);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        boolean boolean7 = inputStream0.markSupported();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = inputStream0.transferTo(outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        boolean boolean7 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        inputStream0.mark(2);
        java.lang.ClassLoader classLoader19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream20 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader19);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        boolean boolean9 = inputStream7.markSupported();
        java.lang.Class<?> wildcardClass10 = inputStream7.getClass();
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = inputStream0.readNBytes(byteArray11, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [0, 0 + 97) out of bounds for length 42");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(byteArray11);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        boolean boolean9 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        inputStream0.mark(8257536);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (short) 10);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 118);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = inputStream0.readNBytes(byteArray16, (int) (byte) 10, (int) (byte) 113);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [10, 10 + 113) out of bounds for length 75");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        int int14 = inputStream0.read(byteArray13);
        java.lang.ClassLoader classLoader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream16 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader15);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        boolean boolean8 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        inputStream0.mark((int) (byte) 121);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.clone(byteArray16);
        java.lang.Object obj18 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray16);
        java.lang.Object obj19 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = inputStream0.readNBytes(byteArray16, (int) (byte) 120, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [120, 120 + 100) out of bounds for length 77");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 0 + "'", obj18, (short) 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 0 + "'", obj19, (short) 0);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (short) 0 + "'", obj2, (short) 0);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = inputStream0.readNBytes((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: len < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        byte[] byteArray3 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = inputStream0.transferTo(outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        java.lang.ClassLoader classLoader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream16 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader15);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 124);
        java.lang.ClassLoader classLoader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream11 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader10);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) ' ');
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        boolean boolean7 = inputStream6.markSupported();
        boolean boolean8 = inputStream6.markSupported();
        byte[] byteArray9 = inputStream6.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = inputStream0.readNBytes(byteArray9, (int) '#', (int) (byte) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [35, 35 + 8) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        inputStream0.mark((int) (byte) 100);
        byte[] byteArray7 = inputStream0.readAllBytes();
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        long long10 = inputStream8.skip((long) (short) 1);
        long long12 = inputStream8.skip(0L);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int15 = inputStream8.read(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = inputStream0.readNBytes(byteArray14, (int) (byte) 115, (int) (byte) 124);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [115, 115 + 124) out of bounds for length 77");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark(8257536);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray18);
        int int21 = inputStream13.read(byteArray20);
        int int22 = inputStream0.read(byteArray20);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray20);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray20, outputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) -1);
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        inputStream0.mark((int) (byte) 8);
        inputStream0.mark((int) (byte) 123);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        byte[] byteArray21 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        byte[] byteArray10 = inputStream0.readNBytes((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.lang.String str1 = org.apache.commons.lang3.SerializationUtils.clone("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        inputStream0.mark((int) (byte) 100);
        byte[] byteArray7 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10.0f, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int5 = inputStream0.readNBytes(byteArray2, (int) (byte) 16, (int) (byte) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        java.lang.Class<?> wildcardClass15 = inputStream0.getClass();
        java.io.Serializable serializable16 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass15);
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable16, outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(serializable16);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(0);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = inputStream0.transferTo(outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        byte[] byteArray7 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        inputStream0.mark(2);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = inputStream0.transferTo(outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) ' ');
        byte[] byteArray6 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = inputStream0.transferTo(outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        boolean boolean8 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream10 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader9);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 124);
        byte[] byteArray10 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) (byte) 122);
        org.junit.Assert.assertEquals("'" + serializable1 + "' != '" + (byte) 122 + "'", serializable1, (byte) 122);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = inputStream0.readNBytes((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        boolean boolean7 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 16);
        java.lang.Class<?> wildcardClass16 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) false);
        org.junit.Assert.assertEquals("'" + serializable1 + "' != '" + false + "'", serializable1, false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        boolean boolean3 = inputStream0.markSupported();
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        java.lang.Object obj8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = inputStream0.readNBytes(byteArray6, (int) (short) 1, (int) (byte) 122);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [1, 1 + 122) out of bounds for length 50");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) ' ');
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream7 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) ' ');
        byte[] byteArray6 = inputStream0.readAllBytes();
        java.lang.Class<?> wildcardClass7 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        inputStream0.mark(8257536);
        byte[] byteArray18 = inputStream0.readNBytes(100);
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        boolean boolean20 = inputStream19.markSupported();
        inputStream19.mark(8257536);
        byte[] byteArray23 = inputStream19.readAllBytes();
        long long25 = inputStream19.skip((long) (byte) 125);
        boolean boolean26 = inputStream19.markSupported();
        inputStream19.mark((int) (byte) 124);
        byte[] byteArray29 = inputStream19.readAllBytes();
        int int30 = inputStream0.read(byteArray29);
        java.io.OutputStream outputStream31 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long32 = inputStream0.transferTo(outputStream31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        inputStream0.mark((int) (byte) 8);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) 100L);
        org.junit.Assert.assertEquals("'" + serializable1 + "' != '" + 100L + "'", serializable1, 100L);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = inputStream0.transferTo(outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark(8257536);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray18);
        int int21 = inputStream13.read(byteArray20);
        int int22 = inputStream0.read(byteArray20);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.clone(byteArray24);
        java.lang.Object obj26 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray24);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.clone(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = inputStream0.readNBytes(byteArray24, (int) (byte) 124, (int) (short) -21267);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [124, 124 + -21267) out of bounds for length 77");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) 0 + "'", obj26, (short) 0);
        org.junit.Assert.assertNotNull(byteArray27);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark(8257536);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray18);
        int int21 = inputStream13.read(byteArray20);
        int int22 = inputStream0.read(byteArray20);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int25 = inputStream0.read(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray1 = inputStream0.readAllBytes();
        byte[] byteArray3 = inputStream0.readNBytes((int) (short) 100);
        java.io.InputStream inputStream4 = java.io.InputStream.nullInputStream();
        boolean boolean5 = inputStream4.markSupported();
        inputStream4.mark(8257536);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.clone(byteArray9);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray9);
        int int12 = inputStream4.read(byteArray11);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.clone(byteArray14);
        int int16 = inputStream4.read(byteArray15);
        byte[] byteArray18 = inputStream4.readNBytes((int) (byte) 123);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = inputStream0.readNBytes(byteArray18, (int) (byte) 126, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [126, 126 + 100) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        long long10 = inputStream0.skip((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark(8257536);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray18);
        int int21 = inputStream13.read(byteArray20);
        int int22 = inputStream0.read(byteArray20);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int25 = inputStream0.read(byteArray24);
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long27 = inputStream0.transferTo(outputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray1 = inputStream0.readAllBytes();
        byte[] byteArray3 = inputStream0.readNBytes((int) (short) 100);
        byte[] byteArray5 = inputStream0.readNBytes(0);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.clone(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = inputStream0.readNBytes(byteArray10, (int) (byte) 122, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [122, 122 + 0) out of bounds for length 77");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 0 + "'", obj9, (short) 0);
        org.junit.Assert.assertNotNull(byteArray10);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 0 + "'", obj4, (short) 0);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        byte[] byteArray3 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 112);
        byte[] byteArray7 = inputStream0.readNBytes((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) 'a');
        org.junit.Assert.assertEquals("'" + serializable1 + "' != '" + 'a' + "'", serializable1, 'a');
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.clone(byteArray22);
        java.lang.Object obj24 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        java.lang.Object obj25 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        int int26 = inputStream0.read(byteArray22);
        inputStream0.mark((int) (byte) 118);
        java.io.OutputStream outputStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long30 = inputStream0.transferTo(outputStream29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 0 + "'", obj24, (short) 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 0 + "'", obj25, (short) 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray10 = inputStream0.readAllBytes();
        java.lang.Class<?> wildcardClass11 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark(8257536);
        byte[] byteArray10 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Object obj3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Object obj5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 0 + "'", obj4, (short) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 0 + "'", obj5, (short) 0);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = inputStream0.readNBytes((int) (short) 0);
        java.io.InputStream inputStream31 = java.io.InputStream.nullInputStream();
        boolean boolean32 = inputStream31.markSupported();
        inputStream31.mark(8257536);
        byte[] byteArray36 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.clone(byteArray36);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray36);
        int int39 = inputStream31.read(byteArray38);
        byte[] byteArray41 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray42 = org.apache.commons.lang3.SerializationUtils.clone(byteArray41);
        int int43 = inputStream31.read(byteArray42);
        byte[] byteArray44 = inputStream31.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int47 = inputStream0.readNBytes(byteArray44, 0, (int) (byte) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [0, 0 + 8) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        java.lang.ClassLoader classLoader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream10 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader9);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        int int33 = inputStream0.read(byteArray30);
        byte[] byteArray35 = inputStream0.readNBytes(100);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int38 = inputStream0.read(byteArray37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        int int33 = inputStream0.read(byteArray30);
        java.io.InputStream inputStream34 = java.io.InputStream.nullInputStream();
        boolean boolean35 = inputStream34.markSupported();
        inputStream34.mark(8257536);
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.clone(byteArray39);
        byte[] byteArray41 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray39);
        int int42 = inputStream34.read(byteArray41);
        byte[] byteArray44 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray45 = org.apache.commons.lang3.SerializationUtils.clone(byteArray44);
        int int46 = inputStream34.read(byteArray45);
        byte[] byteArray48 = inputStream34.readNBytes((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = inputStream0.readNBytes(byteArray48, (int) (byte) 119, (int) (byte) 121);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [119, 119 + 121) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        java.lang.Object obj15 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13, outputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 2 + "'", obj15, (byte) 2);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) (byte) 100);
        long long18 = inputStream0.skip((long) (short) -21267);
        java.lang.Class<?> wildcardClass19 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        inputStream0.mark((int) (short) -21267);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = inputStream0.transferTo(outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) (byte) 100);
        long long18 = inputStream0.skip((long) (short) -21267);
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = inputStream0.transferTo(outputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        byte[] byteArray3 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 112);
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        boolean boolean7 = inputStream6.markSupported();
        inputStream6.mark(8257536);
        byte[] byteArray10 = inputStream6.readAllBytes();
        long long12 = inputStream6.skip((long) '4');
        byte[] byteArray13 = inputStream6.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = inputStream0.readNBytes(byteArray13, (int) (byte) 125, (int) (byte) 118);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [125, 125 + 118) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark(8257536);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray18);
        int int21 = inputStream13.read(byteArray20);
        int int22 = inputStream0.read(byteArray20);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int25 = inputStream0.read(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        byte[] byteArray16 = inputStream0.readNBytes((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.clone(byteArray9);
        java.lang.Object obj11 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray9);
        java.lang.Object obj12 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = inputStream0.readNBytes(byteArray9, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [100, 100 + 1) out of bounds for length 77");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 0 + "'", obj11, (short) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 0 + "'", obj12, (short) 0);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        boolean boolean3 = inputStream0.markSupported();
        byte[] byteArray4 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 119);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        byte[] byteArray21 = inputStream0.readAllBytes();
        java.lang.ClassLoader classLoader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream23 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader22);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark(8257536);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray18);
        int int21 = inputStream13.read(byteArray20);
        int int22 = inputStream0.read(byteArray20);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int25 = inputStream0.read(byteArray24);
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray24, outputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.lang.ClassLoader classLoader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream10 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader9);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        boolean boolean8 = inputStream0.markSupported();
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        int int14 = inputStream0.read(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        inputStream0.mark((int) (byte) 100);
        byte[] byteArray7 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = inputStream0.transferTo(outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        java.lang.Object obj15 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.clone(byteArray13);
        java.lang.Class<?> wildcardClass17 = byteArray16.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 2 + "'", obj15, (byte) 2);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark(8257536);
        boolean boolean12 = inputStream8.markSupported();
        long long14 = inputStream8.skip((long) (byte) 112);
        inputStream8.mark(1);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark(8257536);
        byte[] byteArray21 = inputStream17.readAllBytes();
        inputStream17.mark(1);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int29 = inputStream24.readNBytes(byteArray26, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int31 = inputStream17.read(byteArray30);
        int int32 = inputStream8.read(byteArray30);
        boolean boolean33 = inputStream8.markSupported();
        byte[] byteArray34 = inputStream8.readAllBytes();
        inputStream8.mark((int) (byte) 119);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj39 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray38);
        java.lang.Object obj40 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray38);
        int int41 = inputStream8.read(byteArray38);
        int int42 = inputStream0.read(byteArray38);
        java.io.OutputStream outputStream43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray38, outputStream43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 'a' + "'", obj39, 'a');
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 'a' + "'", obj40, 'a');
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        inputStream0.mark(8257536);
        boolean boolean17 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '4');
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '4', outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        inputStream0.mark((int) (byte) 121);
        java.lang.ClassLoader classLoader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream16 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader15);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        boolean boolean8 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) 10L);
        org.junit.Assert.assertEquals("'" + serializable1 + "' != '" + 10L + "'", serializable1, 10L);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray16);
        int int18 = inputStream0.read(byteArray16);
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = inputStream0.transferTo(outputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0d) + "'", obj17, (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) ' ');
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int8 = inputStream0.read(byteArray7);
        inputStream0.mark((int) (byte) 118);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        boolean boolean8 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream10 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader9);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        boolean boolean15 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        int int14 = inputStream0.read(byteArray13);
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = inputStream0.transferTo(outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        long long4 = inputStream0.skip((long) (byte) 113);
        java.io.InputStream inputStream5 = java.io.InputStream.nullInputStream();
        boolean boolean6 = inputStream5.markSupported();
        inputStream5.mark(8257536);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray10);
        int int13 = inputStream5.read(byteArray12);
        byte[] byteArray14 = inputStream5.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = inputStream0.readNBytes(byteArray14, (int) (byte) 122, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [122, 122 + 100) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        int int14 = inputStream0.read(byteArray13);
        inputStream0.mark((int) (byte) 112);
        java.lang.Class<?> wildcardClass17 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        int int33 = inputStream0.read(byteArray30);
        byte[] byteArray35 = inputStream0.readNBytes(100);
        java.lang.ClassLoader classLoader36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream37 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader36);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        boolean boolean3 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream5 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        java.lang.Object obj15 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.clone(byteArray13);
        java.io.Serializable serializable17 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray13);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 2 + "'", obj15, (byte) 2);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(serializable17);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        byte[] byteArray3 = inputStream0.readAllBytes();
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream5 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission0);
        java.io.SerializablePermission serializablePermission2 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.lang.Class<?> wildcardClass3 = serializablePermission2.getClass();
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(serializablePermission2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long27 = inputStream0.transferTo(outputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        boolean boolean14 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        byte[] byteArray16 = inputStream0.readNBytes((int) ' ');
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark(8257536);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.clone(byteArray22);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray22);
        int int25 = inputStream17.read(byteArray24);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.clone(byteArray27);
        int int29 = inputStream17.read(byteArray28);
        int int30 = inputStream0.read(byteArray28);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) ' ');
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int8 = inputStream0.read(byteArray7);
        inputStream0.mark((int) (byte) 118);
        java.lang.Class<?> wildcardClass11 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        byte[] byteArray8 = inputStream0.readNBytes((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark((int) (byte) 113);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        long long15 = inputStream9.skip((long) (byte) 125);
        boolean boolean16 = inputStream9.markSupported();
        byte[] byteArray18 = inputStream9.readNBytes((int) '#');
        byte[] byteArray19 = inputStream9.readAllBytes();
        int int20 = inputStream0.read(byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        inputStream0.mark(2);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark(8257536);
        byte[] byteArray15 = inputStream11.readAllBytes();
        inputStream11.mark(1);
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int23 = inputStream18.readNBytes(byteArray20, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int25 = inputStream11.read(byteArray24);
        int int26 = inputStream0.read(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        int int33 = inputStream0.read(byteArray30);
        byte[] byteArray35 = inputStream0.readNBytes(100);
        byte[] byteArray36 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream37 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long38 = inputStream0.transferTo(outputStream37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) -1);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        long long25 = inputStream23.skip((long) (short) 1);
        long long27 = inputStream23.skip(0L);
        long long29 = inputStream23.skip((long) (byte) -1);
        byte[] byteArray31 = inputStream23.readNBytes((int) (byte) 4);
        byte[] byteArray33 = inputStream23.readNBytes((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = inputStream0.readNBytes(byteArray33, (int) (byte) 2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [2, 2 + -1) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = inputStream0.readNBytes((int) (byte) 125);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        int int15 = inputStream7.read(byteArray14);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.clone(byteArray17);
        int int19 = inputStream7.read(byteArray18);
        java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray18);
        int int21 = inputStream0.read(byteArray18);
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        long long24 = inputStream22.skip((long) (short) 1);
        long long26 = inputStream22.skip(0L);
        byte[] byteArray28 = inputStream22.readNBytes((int) (byte) 125);
        int int29 = inputStream0.read(byteArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 0 + "'", obj20, (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 124);
        byte[] byteArray10 = inputStream0.readAllBytes();
        byte[] byteArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = inputStream0.readNBytes(byteArray11, (int) (byte) 112, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        boolean boolean10 = inputStream0.markSupported();
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100);
        int int13 = inputStream0.read(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        inputStream0.mark((int) (byte) 8);
        long long7 = inputStream0.skip((long) (byte) 100);
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream9 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark((int) (byte) 113);
        java.lang.ClassLoader classLoader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream10 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader9);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        long long22 = inputStream0.skip((long) 10);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.clone(byteArray24);
        java.lang.Object obj26 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray24);
        java.lang.Object obj27 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray24);
        java.lang.Object obj28 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray24);
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray24);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.clone(byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = inputStream0.readNBytes(byteArray29, (int) (byte) 112, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [112, 112 + 100) out of bounds for length 104");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) 0 + "'", obj26, (short) 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 0 + "'", obj27, (short) 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (short) 0 + "'", obj28, (short) 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray30);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        long long10 = inputStream8.skip((long) (short) 1);
        long long12 = inputStream8.skip(0L);
        long long14 = inputStream8.skip((long) (byte) -1);
        byte[] byteArray15 = inputStream8.readAllBytes();
        byte[] byteArray17 = inputStream8.readNBytes((int) (byte) 119);
        byte[] byteArray18 = inputStream8.readAllBytes();
        int int19 = inputStream0.read(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark(8257536);
        byte[] byteArray10 = inputStream0.readNBytes(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) -1);
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = inputStream0.transferTo(outputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        inputStream0.mark(8257536);
        byte[] byteArray18 = inputStream0.readNBytes(100);
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        boolean boolean20 = inputStream19.markSupported();
        inputStream19.mark(8257536);
        byte[] byteArray23 = inputStream19.readAllBytes();
        long long25 = inputStream19.skip((long) (byte) 125);
        boolean boolean26 = inputStream19.markSupported();
        inputStream19.mark((int) (byte) 124);
        byte[] byteArray29 = inputStream19.readAllBytes();
        int int30 = inputStream0.read(byteArray29);
        byte[] byteArray32 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.clone(byteArray32);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray32);
        byte[] byteArray35 = org.apache.commons.lang3.SerializationUtils.clone(byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = inputStream0.readNBytes(byteArray34, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [100, 100 + -1) out of bounds for length 104");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertNotNull(byteArray35);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) ' ');
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int8 = inputStream0.read(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        byte[] byteArray7 = inputStream0.readAllBytes();
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream9 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) (byte) 100);
        long long18 = inputStream0.skip((long) (short) -21267);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 118);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = inputStream0.readNBytes(byteArray20, (int) (byte) 125, 8257536);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [125, 125 + 8257536) out of bounds for length 75");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        byte[] byteArray3 = inputStream0.readAllBytes();
        java.io.InputStream inputStream4 = java.io.InputStream.nullInputStream();
        boolean boolean5 = inputStream4.markSupported();
        inputStream4.mark(8257536);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.clone(byteArray9);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray9);
        int int12 = inputStream4.read(byteArray11);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.clone(byteArray14);
        int int16 = inputStream4.read(byteArray15);
        boolean boolean17 = inputStream4.markSupported();
        byte[] byteArray18 = inputStream4.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = inputStream0.readNBytes(byteArray18, (int) (short) 5, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [5, 5 + 1) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        boolean boolean7 = inputStream0.markSupported();
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark(8257536);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.clone(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream8.read(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        int int20 = inputStream8.read(byteArray19);
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int26 = inputStream21.readNBytes(byteArray23, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int28 = inputStream8.read(byteArray27);
        java.lang.Object obj29 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray27);
        int int30 = inputStream0.read(byteArray27);
        java.io.OutputStream outputStream31 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long32 = inputStream0.transferTo(outputStream31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 2 + "'", obj29, (byte) 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        inputStream0.mark((int) (byte) 121);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        java.lang.Class<?> wildcardClass3 = inputStream0.getClass();
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        java.lang.Object obj5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class java.io.InputStream$1");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 119);
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        boolean boolean11 = inputStream10.markSupported();
        inputStream10.mark(8257536);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.clone(byteArray15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray15);
        int int18 = inputStream10.read(byteArray17);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int21 = inputStream10.read(byteArray20);
        byte[] byteArray23 = inputStream10.readNBytes((int) (byte) 125);
        int int24 = inputStream0.read(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100 + "'", obj2, 100);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.io.Serializable serializable0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize(serializable0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream5 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        byte[] byteArray10 = inputStream0.readNBytes((int) (short) 100);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        boolean boolean13 = inputStream11.markSupported();
        java.lang.Class<?> wildcardClass14 = inputStream11.getClass();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray15);
        int int19 = inputStream0.readNBytes(byteArray15, (int) (short) 5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "class java.io.InputStream$1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        inputStream0.mark((int) (short) -21267);
        java.lang.ClassLoader classLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream12 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader11);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 113);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.clone(byteArray9);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray10);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.clone(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = inputStream0.readNBytes(byteArray12, (int) (byte) 123, (int) (byte) 117);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [123, 123 + 117) out of bounds for length 102");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        boolean boolean13 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 121);
        inputStream0.mark((int) (byte) 117);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        byte[] byteArray8 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = inputStream0.readNBytes((int) (byte) 125);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        int int15 = inputStream7.read(byteArray14);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.clone(byteArray17);
        int int19 = inputStream7.read(byteArray18);
        byte[] byteArray21 = inputStream7.readNBytes((int) (byte) 123);
        byte[] byteArray23 = inputStream7.readNBytes((int) ' ');
        byte[] byteArray24 = inputStream7.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = inputStream0.readNBytes(byteArray24, (int) (byte) 119, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [119, 119 + 0) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        byte[] byteArray3 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = inputStream0.transferTo(outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 124);
        byte[] byteArray10 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        byte[] byteArray10 = inputStream0.readNBytes((int) (short) 100);
        byte[] byteArray11 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        byte[] byteArray7 = inputStream0.readAllBytes();
        long long9 = inputStream0.skip((long) 2);
        inputStream0.mark((int) (byte) 113);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = inputStream0.readNBytes(byteArray13, (int) (byte) 115, 8257536);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [115, 115 + 8257536) out of bounds for length 77");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        inputStream0.mark(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        boolean boolean3 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 2);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 113);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = inputStream0.readNBytes(byteArray7, (int) (byte) 112, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [112, 112 + 10) out of bounds for length 75");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        java.lang.Class<?> wildcardClass4 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass3);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100 + "'", obj2, 100);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 126);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 119);
        byte[] byteArray10 = inputStream0.readAllBytes();
        byte[] byteArray12 = inputStream0.readNBytes(2);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = inputStream0.transferTo(outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        byte[] byteArray22 = inputStream0.readNBytes((int) (byte) 0);
        inputStream0.mark((int) (byte) 118);
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        boolean boolean26 = inputStream25.markSupported();
        inputStream25.mark(8257536);
        byte[] byteArray29 = inputStream25.readAllBytes();
        long long31 = inputStream25.skip((long) (byte) 125);
        boolean boolean32 = inputStream25.markSupported();
        byte[] byteArray34 = inputStream25.readNBytes((int) '#');
        boolean boolean35 = inputStream25.markSupported();
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100);
        int int38 = inputStream25.read(byteArray37);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = inputStream0.readNBytes(byteArray37, (int) (byte) 118, (int) (byte) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [118, 118 + 4) out of bounds for length 81");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBCLASS_IMPLEMENTATION_PERMISSION;
        java.security.Permission permission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        java.security.Permission permission2 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        java.io.SerializablePermission serializablePermission3 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission0, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(permission1);
        org.junit.Assert.assertNotNull(permission2);
        org.junit.Assert.assertNotNull(serializablePermission3);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = inputStream0.transferTo(outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) (byte) 100);
        long long18 = inputStream0.skip((long) (short) -21267);
        long long20 = inputStream0.skip((long) ' ');
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = inputStream0.transferTo(outputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        byte[] byteArray25 = inputStream0.readAllBytes();
        byte[] byteArray26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = inputStream0.readNBytes(byteArray26, (int) (byte) 121, (int) (short) -21267);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        boolean boolean8 = inputStream0.markSupported();
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = inputStream0.transferTo(outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        boolean boolean9 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark((int) (byte) 120);
        inputStream0.mark((int) (byte) 0);
        java.lang.ClassLoader classLoader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream17 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader16);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        boolean boolean7 = inputStream0.markSupported();
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark(8257536);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.clone(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream8.read(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        int int20 = inputStream8.read(byteArray19);
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int26 = inputStream21.readNBytes(byteArray23, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int28 = inputStream8.read(byteArray27);
        java.lang.Object obj29 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray27);
        int int30 = inputStream0.read(byteArray27);
        java.io.InputStream inputStream31 = java.io.InputStream.nullInputStream();
        boolean boolean32 = inputStream31.markSupported();
        boolean boolean33 = inputStream31.markSupported();
        java.io.InputStream inputStream34 = java.io.InputStream.nullInputStream();
        byte[] byteArray36 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int39 = inputStream34.readNBytes(byteArray36, (int) (byte) 16, (int) (byte) 2);
        java.lang.Object obj40 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray36);
        java.lang.Object obj41 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray36);
        int int42 = inputStream31.read(byteArray36);
        byte[] byteArray44 = inputStream31.readNBytes((int) (byte) 118);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = inputStream0.readNBytes(byteArray44, 100, (int) (byte) 116);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [100, 100 + 116) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 2 + "'", obj29, (byte) 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (short) 0 + "'", obj40, (short) 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (short) 0 + "'", obj41, (short) 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        boolean boolean13 = inputStream0.markSupported();
        byte[] byteArray14 = inputStream0.readAllBytes();
        boolean boolean15 = inputStream0.markSupported();
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 113);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.clone(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = inputStream0.readNBytes(byteArray17, 0, (int) (byte) 116);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [0, 0 + 116) out of bounds for length 75");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = inputStream0.readNBytes((int) (byte) 121);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 113);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6);
        int int11 = inputStream0.readNBytes(byteArray6, (int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass12 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        byte[] byteArray10 = inputStream0.readNBytes((int) (short) 100);
        byte[] byteArray11 = inputStream0.readAllBytes();
        java.io.InputStream inputStream12 = java.io.InputStream.nullInputStream();
        boolean boolean13 = inputStream12.markSupported();
        inputStream12.mark(8257536);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.clone(byteArray17);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray17);
        int int20 = inputStream12.read(byteArray19);
        byte[] byteArray21 = inputStream12.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = inputStream0.readNBytes(byteArray21, 0, (int) (byte) 118);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [0, 0 + 118) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 124);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        byte[] byteArray7 = inputStream0.readAllBytes();
        long long9 = inputStream0.skip((long) 2);
        java.lang.ClassLoader classLoader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream11 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader10);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark((int) (byte) 113);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        long long15 = inputStream9.skip((long) (byte) 125);
        boolean boolean16 = inputStream9.markSupported();
        byte[] byteArray18 = inputStream9.readNBytes((int) '#');
        byte[] byteArray19 = inputStream9.readAllBytes();
        int int20 = inputStream0.read(byteArray19);
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray19, outputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 113);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Object obj3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 113 + "'", obj3, (byte) 113);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray11 = inputStream0.readNBytes(8257536);
        boolean boolean12 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        byte[] byteArray16 = inputStream0.readNBytes((int) ' ');
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark(8257536);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.clone(byteArray22);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray22);
        int int25 = inputStream17.read(byteArray24);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.clone(byteArray27);
        int int29 = inputStream17.read(byteArray28);
        int int30 = inputStream0.read(byteArray28);
        java.io.OutputStream outputStream31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) int30, outputStream31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        long long22 = inputStream0.skip((long) 10);
        boolean boolean23 = inputStream0.markSupported();
        boolean boolean24 = inputStream0.markSupported();
        byte[] byteArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = inputStream0.read(byteArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark(8257536);
        byte[] byteArray10 = inputStream0.readNBytes(0);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = inputStream0.transferTo(outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        byte[] byteArray16 = inputStream0.readNBytes((int) ' ');
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark(8257536);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.clone(byteArray22);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray22);
        int int25 = inputStream17.read(byteArray24);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.clone(byteArray27);
        int int29 = inputStream17.read(byteArray28);
        int int30 = inputStream0.read(byteArray28);
        java.lang.ClassLoader classLoader31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream32 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader31);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        long long8 = inputStream0.skip((long) (byte) 124);
        byte[] byteArray10 = inputStream0.readNBytes((int) (byte) 122);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        boolean boolean10 = inputStream0.markSupported();
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100);
        int int13 = inputStream0.read(byteArray12);
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = inputStream0.transferTo(outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = inputStream0.readNBytes((int) (byte) 125);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        int int15 = inputStream7.read(byteArray14);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.clone(byteArray17);
        int int19 = inputStream7.read(byteArray18);
        java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray18);
        int int21 = inputStream0.read(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 0 + "'", obj20, (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.Permission permission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) permission1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(permission1);
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark(8257536);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.clone(byteArray11);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray11);
        int int14 = inputStream0.read(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.lang.Object obj13 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray11);
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray11, outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 0 + "'", obj13, (short) 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark(8257536);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.clone(byteArray11);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray11);
        int int14 = inputStream0.read(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 124);
        boolean boolean10 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 16);
        inputStream0.mark(0);
        java.lang.ClassLoader classLoader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream19 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader18);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        boolean boolean7 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 10, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        int int33 = inputStream0.read(byteArray30);
        java.io.OutputStream outputStream34 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long35 = inputStream0.transferTo(outputStream34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 118);
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 118, outputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        byte[] byteArray7 = inputStream0.readAllBytes();
        long long9 = inputStream0.skip((long) 2);
        byte[] byteArray11 = inputStream0.readNBytes((int) (byte) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        byte[] byteArray25 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long27 = inputStream0.transferTo(outputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark(8257536);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.clone(byteArray11);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray11);
        int int14 = inputStream0.read(byteArray11);
        inputStream0.mark(2);
        byte[] byteArray17 = inputStream0.readAllBytes();
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        long long20 = inputStream18.skip((long) (short) 1);
        long long22 = inputStream18.skip(0L);
        long long24 = inputStream18.skip((long) (byte) -1);
        byte[] byteArray26 = inputStream18.readNBytes((int) (byte) 4);
        byte[] byteArray28 = inputStream18.readNBytes((int) (short) 100);
        java.io.InputStream inputStream29 = java.io.InputStream.nullInputStream();
        boolean boolean30 = inputStream29.markSupported();
        boolean boolean31 = inputStream29.markSupported();
        java.lang.Class<?> wildcardClass32 = inputStream29.getClass();
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass32);
        java.lang.Object obj34 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray33);
        int int37 = inputStream18.readNBytes(byteArray33, (int) (short) 5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = inputStream0.readNBytes(byteArray33, (int) ' ', (int) (short) -21267);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [32, 32 + -21267) out of bounds for length 42");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "class java.io.InputStream$1");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        int int14 = inputStream0.read(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark(8257536);
        inputStream0.mark((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        byte[] byteArray3 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        java.lang.Class<?> wildcardClass3 = inputStream0.getClass();
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray1 = inputStream0.readAllBytes();
        byte[] byteArray3 = inputStream0.readNBytes((int) (short) 100);
        byte[] byteArray5 = inputStream0.readNBytes(0);
        byte[] byteArray7 = inputStream0.readNBytes(100);
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream9 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        inputStream0.mark(10);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = inputStream0.transferTo(outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        java.lang.ClassLoader classLoader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream17 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader16);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = inputStream0.transferTo(outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        byte[] byteArray8 = inputStream0.readNBytes((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.Permission permission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        java.security.BasicPermission basicPermission2 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.BasicPermission basicPermission3 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.Permission permission4 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) permission4, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(permission1);
        org.junit.Assert.assertNotNull(basicPermission2);
        org.junit.Assert.assertNotNull(basicPermission3);
        org.junit.Assert.assertNotNull(permission4);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        inputStream0.mark((int) (byte) 100);
        byte[] byteArray7 = inputStream0.readAllBytes();
        boolean boolean8 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream10 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader9);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        boolean boolean14 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream16 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader15);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        byte[] byteArray25 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray25, outputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        long long22 = inputStream0.skip((long) 10);
        boolean boolean23 = inputStream0.markSupported();
        boolean boolean24 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readNBytes((int) (byte) 115);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.Permission permission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        java.security.BasicPermission basicPermission2 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission0, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(permission1);
        org.junit.Assert.assertNotNull(basicPermission2);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = inputStream0.transferTo(outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray1 = inputStream0.readAllBytes();
        byte[] byteArray3 = inputStream0.readNBytes((int) (short) 100);
        byte[] byteArray5 = inputStream0.readNBytes(0);
        byte[] byteArray6 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.Permission permission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) permission1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(permission1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        long long10 = inputStream0.skip((long) (short) 5);
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark(8257536);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.clone(byteArray16);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray16);
        int int19 = inputStream11.read(byteArray18);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.clone(byteArray21);
        int int23 = inputStream11.read(byteArray22);
        byte[] byteArray24 = inputStream11.readAllBytes();
        byte[] byteArray26 = inputStream11.readNBytes((int) (byte) 118);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = inputStream0.readNBytes(byteArray26, (int) (byte) 115, (int) (byte) 115);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [115, 115 + 115) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        long long10 = inputStream0.skip((long) (-1));
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark(8257536);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.clone(byteArray16);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray16);
        int int19 = inputStream11.read(byteArray18);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.clone(byteArray21);
        int int23 = inputStream11.read(byteArray22);
        boolean boolean24 = inputStream11.markSupported();
        byte[] byteArray25 = inputStream11.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = inputStream0.readNBytes(byteArray25, (int) '4', (int) (byte) 121);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [52, 52 + 121) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -84, (byte) -19, (byte) 0, (byte) 5, (byte) 112 });
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission0);
        java.io.SerializablePermission serializablePermission2 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission2, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(serializablePermission2);
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        boolean boolean13 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 121);
        inputStream0.mark((int) (byte) 117);
        java.lang.Class<?> wildcardClass18 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        boolean boolean7 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream9 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        int int33 = inputStream0.read(byteArray30);
        java.lang.Class<?> wildcardClass34 = byteArray30.getClass();
        java.lang.Class<?> wildcardClass35 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass34);
        java.io.OutputStream outputStream36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass35, outputStream36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        long long22 = inputStream0.skip((long) 10);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        long long25 = inputStream23.skip((long) (short) 1);
        byte[] byteArray26 = inputStream23.readAllBytes();
        int int27 = inputStream0.read(byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        java.lang.Class<?> wildcardClass13 = byteArray11.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        byte[] byteArray3 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 112);
        byte[] byteArray7 = inputStream0.readNBytes((int) (byte) 4);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        boolean boolean9 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark((int) (byte) 120);
        java.lang.ClassLoader classLoader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream15 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader14);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 124);
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        long long12 = inputStream10.skip((long) (short) 1);
        long long14 = inputStream10.skip(0L);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int17 = inputStream10.read(byteArray16);
        inputStream10.mark(8257536);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.clone(byteArray21);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray21);
        int int24 = inputStream10.read(byteArray21);
        int int25 = inputStream0.read(byteArray21);
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long27 = inputStream0.transferTo(outputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        byte[] byteArray3 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 112);
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream7 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        java.lang.ClassLoader classLoader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream22 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader21);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) ' ', outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(0);
        inputStream0.mark((int) (byte) 4);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        java.lang.Class<?> wildcardClass15 = inputStream0.getClass();
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass15, outputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int8 = inputStream3.readNBytes(byteArray5, (int) (byte) 16, (int) (byte) 2);
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Object obj10 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        int int11 = inputStream0.read(byteArray5);
        inputStream0.mark((int) (byte) 10);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 0 + "'", obj9, (short) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 0 + "'", obj10, (short) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        long long8 = inputStream0.skip((long) (byte) 124);
        byte[] byteArray10 = inputStream0.readNBytes((int) (byte) 126);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray10, outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        boolean boolean10 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream12 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader11);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        java.io.InputStream inputStream29 = java.io.InputStream.nullInputStream();
        boolean boolean30 = inputStream29.markSupported();
        boolean boolean31 = inputStream29.markSupported();
        byte[] byteArray32 = inputStream29.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int35 = inputStream0.readNBytes(byteArray32, 8257536, (int) (byte) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [8257536, 8257536 + 2) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 8);
        long long11 = inputStream0.skip((long) ' ');
        byte[] byteArray12 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = inputStream0.transferTo(outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        java.lang.Object obj12 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray10);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray10, outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 125 + "'", obj12, (byte) 125);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        int int33 = inputStream0.read(byteArray30);
        byte[] byteArray35 = inputStream0.readNBytes(100);
        java.io.OutputStream outputStream36 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long37 = inputStream0.transferTo(outputStream36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The byte[] must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray1 = inputStream0.readAllBytes();
        byte[] byteArray3 = inputStream0.readNBytes((int) (short) 100);
        byte[] byteArray5 = inputStream0.readNBytes(0);
        byte[] byteArray6 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = inputStream0.transferTo(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        byte[] byteArray21 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = inputStream0.transferTo(outputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        boolean boolean3 = inputStream0.markSupported();
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = inputStream0.read(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int5 = inputStream0.readNBytes(byteArray2, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray10 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 2);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        boolean boolean15 = inputStream13.markSupported();
        byte[] byteArray16 = inputStream13.readAllBytes();
        inputStream13.mark((int) (byte) 112);
        byte[] byteArray20 = inputStream13.readNBytes((int) (byte) 4);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = inputStream0.readNBytes(byteArray20, (int) (byte) 8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [8, 8 + 0) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.Permission permission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission0, outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(permission1);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray1 = inputStream0.readAllBytes();
        byte[] byteArray3 = inputStream0.readNBytes((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 125);
        byte[] byteArray14 = inputStream0.readAllBytes();
        long long16 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark(8257536);
        boolean boolean21 = inputStream17.markSupported();
        long long23 = inputStream17.skip((long) (byte) 112);
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj26 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray25);
        int int27 = inputStream17.read(byteArray25);
        byte[] byteArray28 = inputStream17.readAllBytes();
        int int29 = inputStream0.read(byteArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 'a' + "'", obj26, 'a');
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        boolean boolean9 = inputStream0.markSupported();
        boolean boolean10 = inputStream0.markSupported();
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = inputStream0.transferTo(outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray11 = inputStream0.readNBytes(8257536);
        boolean boolean12 = inputStream0.markSupported();
        byte[] byteArray13 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.clone(byteArray22);
        java.lang.Object obj24 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        java.lang.Object obj25 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        int int26 = inputStream0.read(byteArray22);
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long28 = inputStream0.transferTo(outputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 0 + "'", obj24, (short) 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 0 + "'", obj25, (short) 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(0);
        inputStream0.mark(8257536);
        long long7 = inputStream0.skip((long) ' ');
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 123);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        long long15 = inputStream0.skip((long) (byte) 120);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        byte[] byteArray7 = inputStream0.readAllBytes();
        long long9 = inputStream0.skip((long) 2);
        byte[] byteArray11 = inputStream0.readNBytes((int) (byte) 2);
        java.lang.Class<?> wildcardClass12 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        boolean boolean15 = inputStream0.markSupported();
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int25 = inputStream0.readNBytes(byteArray22, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark((int) (byte) 113);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        long long15 = inputStream9.skip((long) (byte) 125);
        boolean boolean16 = inputStream9.markSupported();
        byte[] byteArray18 = inputStream9.readNBytes((int) '#');
        byte[] byteArray19 = inputStream9.readAllBytes();
        int int20 = inputStream0.read(byteArray19);
        byte[] byteArray22 = inputStream0.readNBytes((int) (byte) 124);
        byte[] byteArray23 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        inputStream0.mark((int) (byte) 121);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        boolean boolean16 = inputStream15.markSupported();
        boolean boolean17 = inputStream15.markSupported();
        byte[] byteArray18 = inputStream15.readAllBytes();
        inputStream15.mark((int) (byte) 112);
        byte[] byteArray22 = inputStream15.readNBytes((int) (short) 0);
        int int23 = inputStream0.read(byteArray22);
        byte[] byteArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = inputStream0.read(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark(8257536);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray18);
        int int21 = inputStream13.read(byteArray20);
        int int22 = inputStream0.read(byteArray20);
        java.lang.ClassLoader classLoader23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream24 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader23);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) int20, outputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 124);
        byte[] byteArray10 = inputStream0.readAllBytes();
        java.lang.ClassLoader classLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream12 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader11);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        long long10 = inputStream0.skip((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) ' ');
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int8 = inputStream0.read(byteArray7);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) int8, outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        inputStream0.mark((int) (short) 100);
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int23 = inputStream18.readNBytes(byteArray20, (int) (byte) 16, (int) (byte) 2);
        java.lang.Object obj24 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = inputStream0.readNBytes(byteArray20, (int) (byte) 123, (int) (byte) 125);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [123, 123 + 125) out of bounds for length 77");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 0 + "'", obj24, (short) 0);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100.0f, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        int int14 = inputStream0.read(byteArray13);
        boolean boolean15 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 125);
        java.lang.Class<?> wildcardClass14 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        java.lang.Class<?> wildcardClass27 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark(8257536);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray18);
        int int21 = inputStream13.read(byteArray20);
        int int22 = inputStream0.read(byteArray20);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.clone(byteArray24);
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray24);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.clone(byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = inputStream0.readNBytes(byteArray26, (int) (byte) 113, (int) (byte) 117);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [113, 113 + 117) out of bounds for length 104");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray27);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(0);
        byte[] byteArray4 = inputStream0.readAllBytes();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.clone(byteArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        java.lang.Class<?> wildcardClass25 = byteArray22.getClass();
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray22, outputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = inputStream0.readNBytes((int) (byte) 125);
        long long8 = inputStream0.skip((long) (byte) 122);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = inputStream0.transferTo(outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        byte[] byteArray3 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 112);
        byte[] byteArray7 = inputStream0.readNBytes((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark(8257536);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.clone(byteArray11);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray11);
        int int14 = inputStream0.read(byteArray11);
        byte[] byteArray16 = inputStream0.readNBytes((int) (byte) 119);
        byte[] byteArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = inputStream0.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray9, outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        inputStream0.mark((int) (byte) 8);
        boolean boolean6 = inputStream0.markSupported();
        boolean boolean7 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0f), outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray1 = inputStream0.readAllBytes();
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream3 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        inputStream0.mark((int) (byte) 121);
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = inputStream0.transferTo(outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark(8257536);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray18);
        int int21 = inputStream13.read(byteArray20);
        int int22 = inputStream0.read(byteArray20);
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray20, outputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.clone(byteArray14);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray14);
        int int17 = inputStream9.read(byteArray16);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.clone(byteArray19);
        int int21 = inputStream9.read(byteArray20);
        byte[] byteArray23 = inputStream9.readNBytes((int) (short) 10);
        int int24 = inputStream0.read(byteArray23);
        java.lang.ClassLoader classLoader25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream26 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader25);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) ' ');
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = inputStream0.transferTo(outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes(2);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 8);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.clone(byteArray11);
        java.lang.Object obj13 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray11);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray11);
        java.lang.Object obj15 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray11);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray11);
        int int17 = inputStream0.read(byteArray16);
        byte[] byteArray19 = inputStream0.readNBytes((int) (byte) 122);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = inputStream0.readNBytes((int) (short) -21267);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: len < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 0 + "'", obj13, (short) 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 0 + "'", obj14, (short) 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 0 + "'", obj15, (short) 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 8);
        java.lang.ClassLoader classLoader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream11 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader10);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = inputStream0.readNBytes((int) (byte) 125);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        int int15 = inputStream7.read(byteArray14);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.clone(byteArray17);
        int int19 = inputStream7.read(byteArray18);
        java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray18);
        int int21 = inputStream0.read(byteArray18);
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        long long24 = inputStream22.skip((long) (short) 1);
        long long26 = inputStream22.skip(0L);
        byte[] byteArray28 = inputStream22.readNBytes((int) (byte) 125);
        int int29 = inputStream0.read(byteArray28);
        java.io.OutputStream outputStream30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) int29, outputStream30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 0 + "'", obj20, (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        long long3 = inputStream1.skip((long) (short) 1);
        byte[] byteArray4 = inputStream1.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = inputStream0.readNBytes(byteArray4, (int) (short) -21267, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-21267, -21267 + 100) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray11 = inputStream0.readNBytes(8257536);
        inputStream0.mark((int) (byte) 112);
        boolean boolean14 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream16 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader15);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission0);
        java.io.SerializablePermission serializablePermission2 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.security.BasicPermission basicPermission3 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission2);
        java.lang.Class<?> wildcardClass4 = serializablePermission2.getClass();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission2, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(serializablePermission2);
        org.junit.Assert.assertNotNull(basicPermission3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.security.Permission permission0 = null;
        java.security.Permission permission1 = org.apache.commons.lang3.SerializationUtils.clone(permission0);
        org.junit.Assert.assertNull(permission1);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark(8257536);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.clone(byteArray11);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray11);
        int int14 = inputStream0.read(byteArray11);
        inputStream0.mark(2);
        byte[] byteArray17 = inputStream0.readAllBytes();
        java.lang.ClassLoader classLoader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream19 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader18);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Object obj3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Object obj5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.clone(byteArray6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray6, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 0 + "'", obj4, (short) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 0 + "'", obj5, (short) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        boolean boolean9 = inputStream0.markSupported();
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        boolean boolean11 = inputStream10.markSupported();
        inputStream10.mark(8257536);
        byte[] byteArray14 = inputStream10.readAllBytes();
        long long16 = inputStream10.skip((long) (byte) 125);
        boolean boolean17 = inputStream10.markSupported();
        byte[] byteArray19 = inputStream10.readNBytes((int) (byte) 8);
        int int22 = inputStream0.readNBytes(byteArray19, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        boolean boolean14 = inputStream0.markSupported();
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        boolean boolean16 = inputStream15.markSupported();
        inputStream15.mark(8257536);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.clone(byteArray20);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray20);
        int int23 = inputStream15.read(byteArray22);
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.clone(byteArray25);
        int int27 = inputStream15.read(byteArray26);
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int33 = inputStream28.readNBytes(byteArray30, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int35 = inputStream15.read(byteArray34);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.clone(byteArray37);
        java.lang.Object obj39 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray37);
        java.lang.Object obj40 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray37);
        int int41 = inputStream15.read(byteArray37);
        inputStream15.mark((int) (byte) 118);
        java.lang.Class<?> wildcardClass44 = inputStream15.getClass();
        byte[] byteArray45 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass44);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = inputStream0.readNBytes(byteArray45, (int) (short) 0, (int) (short) -21267);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [0, 0 + -21267) out of bounds for length 42");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (short) 0 + "'", obj39, (short) 0);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (short) 0 + "'", obj40, (short) 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(byteArray45);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark(8257536);
        boolean boolean9 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray11 = inputStream0.readNBytes(8257536);
        inputStream0.mark(1);
        boolean boolean14 = inputStream0.markSupported();
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = inputStream0.transferTo(outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        byte[] byteArray11 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream22 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader21);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        long long8 = inputStream0.skip((long) (byte) 124);
        byte[] byteArray10 = inputStream0.readNBytes((int) (byte) 126);
        long long12 = inputStream0.skip((long) (short) -21267);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        inputStream0.mark(2);
        inputStream0.mark((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 118);
        byte[] byteArray16 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark(8257536);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.clone(byteArray11);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray11);
        int int14 = inputStream0.read(byteArray11);
        byte[] byteArray16 = inputStream0.readNBytes((int) (byte) 119);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.io.Serializable serializable1 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) (byte) 112);
        org.junit.Assert.assertEquals("'" + serializable1 + "' != '" + (byte) 112 + "'", serializable1, (byte) 112);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        byte[] byteArray22 = inputStream0.readNBytes((int) (byte) 0);
        byte[] byteArray24 = inputStream0.readNBytes((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (short) 10);
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 10, outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray16);
        int int18 = inputStream0.read(byteArray16);
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        boolean boolean20 = inputStream19.markSupported();
        inputStream19.mark(8257536);
        byte[] byteArray23 = inputStream19.readAllBytes();
        long long25 = inputStream19.skip((long) (byte) 125);
        boolean boolean26 = inputStream19.markSupported();
        byte[] byteArray28 = inputStream19.readNBytes((int) (byte) 8);
        int int29 = inputStream0.read(byteArray28);
        java.lang.Class<?> wildcardClass30 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0d) + "'", obj17, (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) '#', outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark((int) (byte) 113);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        long long15 = inputStream9.skip((long) (byte) 125);
        boolean boolean16 = inputStream9.markSupported();
        byte[] byteArray18 = inputStream9.readNBytes((int) '#');
        byte[] byteArray19 = inputStream9.readAllBytes();
        int int20 = inputStream0.read(byteArray19);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 125);
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 8);
        byte[] byteArray17 = inputStream0.readNBytes(0);
        long long19 = inputStream0.skip((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        long long28 = inputStream0.skip(10L);
        java.io.OutputStream outputStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long30 = inputStream0.transferTo(outputStream29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) -1);
        java.lang.ClassLoader classLoader23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream24 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader23);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        boolean boolean9 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark((int) (byte) 120);
        inputStream0.mark((int) (byte) 0);
        byte[] byteArray17 = inputStream0.readNBytes((int) (byte) 2);
        boolean boolean18 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream20 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader19);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission0);
        java.io.SerializablePermission serializablePermission2 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.security.BasicPermission basicPermission3 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) basicPermission3, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(serializablePermission2);
        org.junit.Assert.assertNotNull(basicPermission3);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray11 = inputStream0.readNBytes(8257536);
        inputStream0.mark(1);
        boolean boolean14 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream16 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader15);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark(8257536);
        boolean boolean12 = inputStream8.markSupported();
        long long14 = inputStream8.skip((long) (byte) 112);
        inputStream8.mark(1);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark(8257536);
        byte[] byteArray21 = inputStream17.readAllBytes();
        inputStream17.mark(1);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int29 = inputStream24.readNBytes(byteArray26, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int31 = inputStream17.read(byteArray30);
        int int32 = inputStream8.read(byteArray30);
        boolean boolean33 = inputStream8.markSupported();
        byte[] byteArray34 = inputStream8.readAllBytes();
        inputStream8.mark((int) (byte) 119);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj39 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray38);
        java.lang.Object obj40 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray38);
        int int41 = inputStream8.read(byteArray38);
        int int42 = inputStream0.read(byteArray38);
        boolean boolean43 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 'a' + "'", obj39, 'a');
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 'a' + "'", obj40, 'a');
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray11 = inputStream0.readNBytes(8257536);
        inputStream0.mark((int) (byte) 112);
        java.lang.ClassLoader classLoader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream15 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader14);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) true, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        boolean boolean9 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark((int) (byte) 120);
        byte[] byteArray14 = inputStream0.readAllBytes();
        byte[] byteArray15 = inputStream0.readAllBytes();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.clone(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (short) 10);
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = inputStream0.transferTo(outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        inputStream0.mark(10);
        inputStream0.mark((int) (byte) 16);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        boolean boolean15 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream17 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader16);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        byte[] byteArray15 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = inputStream0.transferTo(outputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        byte[] byteArray22 = inputStream0.readNBytes((int) (byte) 0);
        inputStream0.mark((int) (byte) 118);
        inputStream0.mark((int) (byte) 2);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        boolean boolean16 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        boolean boolean3 = inputStream0.markSupported();
        boolean boolean4 = inputStream0.markSupported();
        java.io.InputStream inputStream5 = java.io.InputStream.nullInputStream();
        boolean boolean6 = inputStream5.markSupported();
        inputStream5.mark(8257536);
        byte[] byteArray9 = inputStream5.readAllBytes();
        long long11 = inputStream5.skip((long) (byte) 125);
        boolean boolean12 = inputStream5.markSupported();
        byte[] byteArray14 = inputStream5.readNBytes(2);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = inputStream0.readNBytes(byteArray14, (int) (short) 100, (int) (byte) 124);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [100, 100 + 124) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark(8257536);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray18);
        int int21 = inputStream13.read(byteArray20);
        int int22 = inputStream0.read(byteArray20);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray20);
        java.lang.Object obj24 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray20);
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray20);
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray20, outputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray26);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        inputStream0.mark((int) (byte) 8);
        inputStream0.mark((int) (byte) 123);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.Permission permission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) permission1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Object obj5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray3);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(permission1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark(8257536);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.clone(byteArray11);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray11);
        int int14 = inputStream0.read(byteArray11);
        byte[] byteArray16 = inputStream0.readNBytes((int) (byte) 119);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray18);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        int int22 = inputStream0.read(byteArray18);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark(8257536);
        byte[] byteArray27 = inputStream23.readAllBytes();
        inputStream23.mark(1);
        java.io.InputStream inputStream30 = java.io.InputStream.nullInputStream();
        byte[] byteArray32 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int35 = inputStream30.readNBytes(byteArray32, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray36 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int37 = inputStream23.read(byteArray36);
        inputStream23.mark(8257536);
        byte[] byteArray41 = inputStream23.readNBytes(100);
        java.io.InputStream inputStream42 = java.io.InputStream.nullInputStream();
        boolean boolean43 = inputStream42.markSupported();
        inputStream42.mark(8257536);
        byte[] byteArray46 = inputStream42.readAllBytes();
        long long48 = inputStream42.skip((long) (byte) 125);
        boolean boolean49 = inputStream42.markSupported();
        inputStream42.mark((int) (byte) 124);
        byte[] byteArray52 = inputStream42.readAllBytes();
        int int53 = inputStream23.read(byteArray52);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = inputStream0.readNBytes(byteArray52, 0, (int) (byte) 112);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [0, 0 + 112) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 0 + "'", obj20, (short) 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream30);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark(8257536);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.clone(byteArray11);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray11);
        int int14 = inputStream0.read(byteArray11);
        inputStream0.mark(2);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 125);
        byte[] byteArray14 = inputStream0.readAllBytes();
        java.lang.Class<?> wildcardClass15 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        byte[] byteArray7 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        boolean boolean13 = inputStream0.markSupported();
        byte[] byteArray14 = inputStream0.readAllBytes();
        boolean boolean15 = inputStream0.markSupported();
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = inputStream0.transferTo(outputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        java.lang.ClassLoader classLoader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream13 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader12);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        java.lang.ClassLoader classLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream12 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader11);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) true);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) true);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = inputStream0.readNBytes(byteArray16, (int) '#', (int) (byte) 121);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [35, 35 + 121) out of bounds for length 47");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        boolean boolean8 = inputStream0.markSupported();
        long long10 = inputStream0.skip((long) ' ');
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark(8257536);
        byte[] byteArray15 = inputStream11.readAllBytes();
        long long17 = inputStream11.skip((long) (byte) 125);
        boolean boolean18 = inputStream11.markSupported();
        byte[] byteArray20 = inputStream11.readNBytes(2);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = inputStream0.readNBytes(byteArray20, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-1, -1 + 97) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) -1);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark(8257536);
        byte[] byteArray27 = inputStream23.readAllBytes();
        inputStream23.mark(1);
        java.io.InputStream inputStream30 = java.io.InputStream.nullInputStream();
        byte[] byteArray32 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int35 = inputStream30.readNBytes(byteArray32, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray36 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int37 = inputStream23.read(byteArray36);
        inputStream23.mark(8257536);
        byte[] byteArray41 = inputStream23.readNBytes(100);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = inputStream0.readNBytes(byteArray41, (int) (short) -21267, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-21267, -21267 + 0) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream30);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        boolean boolean9 = inputStream0.markSupported();
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        boolean boolean11 = inputStream10.markSupported();
        inputStream10.mark(8257536);
        boolean boolean14 = inputStream10.markSupported();
        long long16 = inputStream10.skip((long) (byte) 112);
        inputStream10.mark(1);
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        boolean boolean20 = inputStream19.markSupported();
        inputStream19.mark(8257536);
        byte[] byteArray23 = inputStream19.readAllBytes();
        inputStream19.mark(1);
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int31 = inputStream26.readNBytes(byteArray28, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray32 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int33 = inputStream19.read(byteArray32);
        int int34 = inputStream10.read(byteArray32);
        boolean boolean35 = inputStream10.markSupported();
        byte[] byteArray36 = inputStream10.readAllBytes();
        inputStream10.mark((int) (byte) 119);
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj41 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray40);
        java.lang.Object obj42 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray40);
        int int43 = inputStream10.read(byteArray40);
        byte[] byteArray45 = inputStream10.readNBytes(100);
        byte[] byteArray47 = inputStream10.readNBytes(100);
        int int48 = inputStream0.read(byteArray47);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray50 = inputStream0.readNBytes((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: len < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 'a' + "'", obj41, 'a');
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 'a' + "'", obj42, 'a');
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.clone(byteArray22);
        java.lang.Object obj24 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        java.lang.Object obj25 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        int int26 = inputStream0.read(byteArray22);
        inputStream0.mark((int) (byte) 118);
        byte[] byteArray30 = inputStream0.readNBytes((int) (byte) 122);
        inputStream0.mark((int) (byte) 4);
        java.lang.ClassLoader classLoader33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream34 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader33);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 0 + "'", obj24, (short) 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 0 + "'", obj25, (short) 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 125);
        byte[] byteArray14 = inputStream0.readAllBytes();
        long long16 = inputStream0.skip((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -84, (byte) -19, (byte) 0, (byte) 5, (byte) 112 });
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -84, (byte) -19, (byte) 0, (byte) 5, (byte) 118, (byte) 114, (byte) 0, (byte) 2, (byte) 91, (byte) 66, (byte) -84, (byte) -13, (byte) 23, (byte) -8, (byte) 6, (byte) 8, (byte) 84, (byte) -32, (byte) 2, (byte) 0, (byte) 0, (byte) 120, (byte) 112 });
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        long long22 = inputStream20.skip((long) (short) 1);
        long long24 = inputStream20.skip(0L);
        long long26 = inputStream20.skip((long) (byte) -1);
        java.io.InputStream inputStream27 = java.io.InputStream.nullInputStream();
        boolean boolean28 = inputStream27.markSupported();
        inputStream27.mark(8257536);
        byte[] byteArray31 = inputStream27.readAllBytes();
        int int32 = inputStream20.read(byteArray31);
        java.io.InputStream inputStream33 = java.io.InputStream.nullInputStream();
        boolean boolean34 = inputStream33.markSupported();
        inputStream33.mark(8257536);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.clone(byteArray38);
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray38);
        int int41 = inputStream33.read(byteArray40);
        int int42 = inputStream20.read(byteArray40);
        byte[] byteArray43 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray40);
        java.lang.Object obj44 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray40);
        byte[] byteArray45 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray40);
        int int48 = inputStream0.readNBytes(byteArray45, (int) (byte) 10, (int) (byte) 0);
        java.lang.ClassLoader classLoader49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream50 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader49);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        byte[] byteArray22 = inputStream0.readNBytes((int) (byte) 0);
        byte[] byteArray24 = inputStream0.readNBytes((int) (byte) 0);
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray24, outputStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) -1);
        boolean boolean23 = inputStream0.markSupported();
        byte[] byteArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = inputStream0.read(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        byte[] byteArray22 = inputStream0.readNBytes((int) (byte) 0);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.clone(byteArray24);
        java.lang.Object obj26 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray24);
        java.lang.Object obj27 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray24);
        java.lang.Object obj28 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray24);
        java.lang.Object obj29 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray24);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = inputStream0.readNBytes(byteArray24, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-1, -1 + 52) out of bounds for length 77");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) 0 + "'", obj26, (short) 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 0 + "'", obj27, (short) 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (short) 0 + "'", obj28, (short) 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) 0 + "'", obj29, (short) 0);
        org.junit.Assert.assertNotNull(byteArray30);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        inputStream0.mark(10);
        java.lang.Class<?> wildcardClass11 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark(8257536);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        long long10 = inputStream0.skip((long) (-1));
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        boolean boolean12 = inputStream11.markSupported();
        inputStream11.mark(8257536);
        byte[] byteArray15 = inputStream11.readAllBytes();
        long long17 = inputStream11.skip((long) (byte) 125);
        boolean boolean18 = inputStream11.markSupported();
        boolean boolean19 = inputStream11.markSupported();
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        boolean boolean21 = inputStream20.markSupported();
        inputStream20.mark(8257536);
        byte[] byteArray24 = inputStream20.readAllBytes();
        int int25 = inputStream11.read(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = inputStream0.readNBytes(byteArray24, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [10, 10 + 0) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 125);
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 8);
        byte[] byteArray17 = inputStream0.readNBytes(0);
        long long19 = inputStream0.skip((long) ' ');
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        boolean boolean21 = inputStream20.markSupported();
        boolean boolean22 = inputStream20.markSupported();
        boolean boolean23 = inputStream20.markSupported();
        byte[] byteArray24 = inputStream20.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = inputStream0.readNBytes(byteArray24, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [0, 0 + 1) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        java.lang.Class<?> wildcardClass15 = inputStream0.getClass();
        java.io.Serializable serializable16 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass15);
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass15, outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(serializable16);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        long long15 = inputStream0.skip((long) (byte) 120);
        byte[] byteArray16 = inputStream0.readAllBytes();
        byte[] byteArray18 = inputStream0.readNBytes((int) (byte) 116);
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = inputStream0.transferTo(outputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        java.io.SerializablePermission serializablePermission12 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.Permission permission13 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission12);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) permission13);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = inputStream0.readNBytes(byteArray14, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-1, -1 + 0) out of bounds for length 199");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(serializablePermission12);
        org.junit.Assert.assertNotNull(permission13);
        org.junit.Assert.assertNotNull(byteArray14);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        boolean boolean9 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark((int) (byte) 120);
        inputStream0.mark((int) (byte) 0);
        byte[] byteArray17 = inputStream0.readNBytes((int) (byte) 2);
        inputStream0.mark((int) (byte) 116);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray11 = inputStream0.readNBytes(8257536);
        boolean boolean12 = inputStream0.markSupported();
        byte[] byteArray13 = inputStream0.readAllBytes();
        java.lang.ClassLoader classLoader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream15 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader14);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        byte[] byteArray22 = inputStream0.readNBytes((int) (byte) 0);
        inputStream0.mark((int) (byte) 118);
        inputStream0.mark((int) (byte) 2);
        java.lang.ClassLoader classLoader27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream28 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader27);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 125);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.Permission permission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) permission1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        java.lang.Object obj4 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(permission1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "(\"java.io.SerializablePermission\" \"enableSubstitution\")");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "(\"java.io.SerializablePermission\" \"enableSubstitution\")");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "(\"java.io.SerializablePermission\" \"enableSubstitution\")");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) 118);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 120);
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = inputStream0.readNBytes((int) (short) 0);
        java.io.OutputStream outputStream31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray30, outputStream31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray11 = inputStream0.readNBytes(8257536);
        boolean boolean12 = inputStream0.markSupported();
        boolean boolean13 = inputStream0.markSupported();
        inputStream0.mark((int) '4');
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = inputStream0.transferTo(outputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray7 = inputStream0.readAllBytes();
        long long9 = inputStream0.skip((long) (byte) 8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.clone(byteArray22);
        java.lang.Object obj24 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        java.lang.Object obj25 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        int int26 = inputStream0.read(byteArray22);
        inputStream0.mark((int) (byte) 118);
        byte[] byteArray30 = inputStream0.readNBytes((int) (byte) 122);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 0 + "'", obj24, (short) 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 0 + "'", obj25, (short) 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 123);
        inputStream0.mark(100);
        java.io.InputStream inputStream12 = java.io.InputStream.nullInputStream();
        boolean boolean13 = inputStream12.markSupported();
        inputStream12.mark(8257536);
        byte[] byteArray16 = inputStream12.readAllBytes();
        long long18 = inputStream12.skip((long) (byte) 125);
        inputStream12.mark(0);
        boolean boolean21 = inputStream12.markSupported();
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        boolean boolean23 = inputStream22.markSupported();
        inputStream22.mark(8257536);
        byte[] byteArray26 = inputStream22.readAllBytes();
        long long28 = inputStream22.skip((long) (byte) 125);
        boolean boolean29 = inputStream22.markSupported();
        byte[] byteArray31 = inputStream22.readNBytes((int) (byte) 8);
        int int34 = inputStream12.readNBytes(byteArray31, (int) (byte) 0, 0);
        int int35 = inputStream0.read(byteArray31);
        byte[] byteArray36 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray36);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        byte[] byteArray21 = inputStream0.readAllBytes();
        boolean boolean22 = inputStream0.markSupported();
        long long24 = inputStream0.skip((long) (byte) 121);
        byte[] byteArray25 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 113);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray3);
        java.io.Serializable serializable5 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray4);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(serializable5);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        java.lang.Class<?> wildcardClass10 = byteArray9.getClass();
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass10, outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 123);
        inputStream0.mark(100);
        java.lang.ClassLoader classLoader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream13 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader12);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark(8257536);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray18);
        int int21 = inputStream13.read(byteArray20);
        int int22 = inputStream0.read(byteArray20);
        long long24 = inputStream0.skip(100L);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBCLASS_IMPLEMENTATION_PERMISSION;
        java.security.Permission permission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        java.security.Permission permission2 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        java.io.SerializablePermission serializablePermission3 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.lang.Class<?> wildcardClass4 = serializablePermission3.getClass();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission3, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(permission1);
        org.junit.Assert.assertNotNull(permission2);
        org.junit.Assert.assertNotNull(serializablePermission3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        byte[] byteArray10 = inputStream0.readNBytes((int) (short) 100);
        byte[] byteArray11 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.clone(byteArray22);
        java.lang.Object obj24 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        java.lang.Object obj25 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        int int26 = inputStream0.read(byteArray22);
        inputStream0.mark((int) (byte) 118);
        java.lang.Class<?> wildcardClass29 = inputStream0.getClass();
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass29);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 0 + "'", obj24, (short) 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 0 + "'", obj25, (short) 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        int int33 = inputStream0.read(byteArray30);
        byte[] byteArray35 = inputStream0.readNBytes(100);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int38 = inputStream0.read(byteArray37);
        long long40 = inputStream0.skip(10L);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        long long22 = inputStream0.skip((long) 10);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        long long25 = inputStream23.skip((long) (short) 1);
        byte[] byteArray26 = inputStream23.readAllBytes();
        int int27 = inputStream0.read(byteArray26);
        java.io.OutputStream outputStream28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray26, outputStream28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        byte[] byteArray12 = inputStream0.readNBytes(1);
        java.lang.ClassLoader classLoader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream14 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader13);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        inputStream0.mark(2);
        byte[] byteArray4 = inputStream0.readNBytes((int) (byte) 2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.clone(byteArray22);
        java.lang.Object obj24 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        java.lang.Object obj25 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        int int26 = inputStream0.read(byteArray22);
        inputStream0.mark((int) (byte) 118);
        inputStream0.mark((int) (byte) 10);
        java.lang.ClassLoader classLoader31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream32 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader31);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 0 + "'", obj24, (short) 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 0 + "'", obj25, (short) 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark(8257536);
        byte[] byteArray10 = inputStream0.readAllBytes();
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray12);
        java.lang.Object obj15 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray12);
        java.lang.Object obj16 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray12);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        int int19 = inputStream0.read(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = inputStream0.readNBytes((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: len < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 0 + "'", obj14, (short) 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 0 + "'", obj15, (short) 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 0 + "'", obj16, (short) 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        long long28 = inputStream0.skip(10L);
        byte[] byteArray30 = inputStream0.readNBytes((int) (byte) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
    }
}

