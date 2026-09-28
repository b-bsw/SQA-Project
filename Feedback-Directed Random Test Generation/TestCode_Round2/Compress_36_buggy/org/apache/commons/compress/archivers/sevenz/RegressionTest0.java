package org.apache.commons.compress.archivers.sevenz;

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
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile1 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        java.lang.Class<?> wildcardClass1 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile9 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.SIGNATURE_HEADER_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        java.lang.Class<?> wildcardClass10 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        java.lang.Class<?> wildcardClass8 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        java.lang.Class<?> wildcardClass10 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.io.File file0 = null;
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 0 });
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        java.lang.Class<?> wildcardClass11 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        java.lang.Class<?> wildcardClass7 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        java.lang.Class<?> wildcardClass10 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile9 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) 10);
        boolean boolean4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.io.File file0 = null;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        java.lang.Class<?> wildcardClass8 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        java.lang.Class<?> wildcardClass15 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.io.File file0 = null;
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 1 });
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        java.lang.Class<?> wildcardClass9 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (short) 10);
        boolean boolean5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile17 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (-1));
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        java.lang.Class<?> wildcardClass15 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (-1));
        java.lang.Class<?> wildcardClass11 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile17 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile18 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) 10);
        boolean boolean4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) 0);
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) '4');
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        byte[] byteArray0 = null;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile18 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile17 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile18 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (short) 10);
        boolean boolean5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (byte) 0);
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 10);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) '#');
        java.lang.Class<?> wildcardClass11 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        java.lang.Class<?> wildcardClass8 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile9 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile18 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 100);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile23 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        java.lang.Class<?> wildcardClass15 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile23 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile20 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile17 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        java.lang.Class<?> wildcardClass10 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 10 });
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (-1));
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 0);
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        byte[] byteArray0 = null;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass11 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) 10);
        boolean boolean4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile17 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (short) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (-1));
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile17 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 10);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (short) 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) '4');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile23 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile23 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile22 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (short) 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) '4');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) 'a');
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile17 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (-1));
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile18 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (short) 10);
        boolean boolean5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (byte) 0);
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) '4');
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (-1));
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) ' ');
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.io.File file0 = null;
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile17 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile23 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile23 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        java.lang.Class<?> wildcardClass15 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile17 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean24 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile25 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        boolean boolean24 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile25 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        java.lang.Class<?> wildcardClass15 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        boolean boolean24 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile25 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) 10);
        boolean boolean4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) -1);
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (-1));
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile20 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile23 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (short) 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) '4');
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean25 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        java.lang.Class<?> wildcardClass26 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 10);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile23 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 10);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile23 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile23 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean25 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean27 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        java.lang.Class<?> wildcardClass28 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile17 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        java.lang.Class<?> wildcardClass15 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean25 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        java.lang.Class<?> wildcardClass26 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 32);
        java.lang.Class<?> wildcardClass9 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile17 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile18 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean24 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        boolean boolean26 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile27 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (short) 10);
        boolean boolean5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        byte[] byteArray0 = null;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 10);
        java.lang.Class<?> wildcardClass9 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) 100);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile20 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile17 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) ' ');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile23 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile23 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        boolean boolean24 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile25 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean24 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile25 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) 0);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile20 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile17 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) 'a');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (-1));
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) '#');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile20 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        boolean boolean24 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean26 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile27 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) ' ');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile20 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        byte[] byteArray0 = null;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 10);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) '#');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (-1));
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 1);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile22 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean24 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile25 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) 'a');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 0);
        java.lang.Class<?> wildcardClass15 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        java.lang.Class<?> wildcardClass21 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile23 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        java.lang.Class<?> wildcardClass10 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile23 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile23 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) 10);
        boolean boolean4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) -1);
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.io.File file0 = null;
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100 };
        boolean boolean5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        byte[] byteArray0 = null;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        boolean boolean24 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        boolean boolean26 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        boolean boolean28 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean30 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile31 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        boolean boolean24 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile25 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile23 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) 100);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile20 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) '#');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile22 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) ' ');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile22 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean25 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass26 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (-1));
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (-1));
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        boolean boolean24 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean26 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile27 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        boolean boolean25 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        java.lang.Class<?> wildcardClass26 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        java.lang.Class<?> wildcardClass21 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        byte[] byteArray0 = null;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) 10);
        boolean boolean4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (short) 10);
        boolean boolean5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (byte) -1);
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (byte) 0);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean25 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        java.lang.Class<?> wildcardClass26 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile24 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        java.lang.Class<?> wildcardClass21 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) 100);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) -1);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile22 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) '#');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile20 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (byte) 10);
        boolean boolean5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        boolean boolean24 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        boolean boolean26 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile27 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile23 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile20 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile17 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (byte) 10);
        boolean boolean5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (byte) -1);
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) 10);
        boolean boolean4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) 0);
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) '4');
        java.lang.Class<?> wildcardClass7 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (-1));
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile18 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (short) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (-1));
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile20 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile20 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        byte[] byteArray0 = null;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 10);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile17 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile22 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (-1));
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) '#');
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (-1));
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 1);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) '4');
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile24 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile20 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile18 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile18 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) 'a');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (-1));
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (short) 1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        boolean boolean24 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        boolean boolean26 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile27 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean24 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean26 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean28 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile29 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.io.File file0 = null;
        byte[] byteArray1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (byte) 10);
        boolean boolean5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (byte) -1);
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile17 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 1);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile24 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) -1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile22 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean25 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean27 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        java.lang.Class<?> wildcardClass28 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile18 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean24 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean26 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        boolean boolean28 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile29 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (short) 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) '4');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) 'a');
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 1);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile22 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 10);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        java.lang.Class<?> wildcardClass23 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        boolean boolean24 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile25 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) '#');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 10);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile22 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) ' ');
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile18 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 10);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile18 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (short) 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) '4');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) 'a');
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (short) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (-1));
        java.lang.Class<?> wildcardClass19 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.io.File file0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 1);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) -1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile20 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        java.lang.Class<?> wildcardClass11 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 100);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 32);
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) 100);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile22 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) 'a');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

