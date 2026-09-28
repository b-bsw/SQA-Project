package org.mockito.internal.matchers;

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
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (short) 0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 0, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 0, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10L, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) "hi!", (java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100.0d, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 1.0d, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) '#', (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0.0f, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) '#', (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) 100, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 1.0d, (java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10, (java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 100, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0d, (java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 1.0d, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1.0d, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (-1L), (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1.0f), (java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10.0d, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) false, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1L), (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 10, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '#', (java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0L, (java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100.0f, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100.0d, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) 10, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) 1, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) '#', obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1.0f), (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean2, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 1L, (java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1), (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 10.0d, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (-1.0f), (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (-1L), (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) -1, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10.0f, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) '#', (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (-1), (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (-1L), (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) 100, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) 10, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 1, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass6, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, (java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) true, (java.lang.Object) equality1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj2);
        java.lang.Class<?> wildcardClass4 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 'a', obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.mockito.internal.matchers.Equality.isArray(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10L, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (short) 100, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1.0d, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 100, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100.0f, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = null;
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj3, obj4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj3);
        java.lang.Class<?> wildcardClass7 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1.0d), (java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0L, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj2, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1.0f, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100.0f, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) ' ', (java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (-1L), (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) true, (java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj2.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass6, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = null;
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj3, obj4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj3);
        java.lang.Class<?> wildcardClass7 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100.0f, (java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10L, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        java.lang.Class<?> wildcardClass5 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass1, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (-1L), (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 100L, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) '#', (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0f, (java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0, (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj5 = null;
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, obj5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (-1.0d), (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean2, (java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) 0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj3, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass6 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass1, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) "hi!", (java.lang.Object) boolean3);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass4 = obj1.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 10L, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0.0f, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean2, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj1, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (-1L), (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 1.0f, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) 0);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray(obj6);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, obj6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0.0f, (java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean9, (java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 10, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10.0f, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass4, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj5);
        java.lang.Class<?> wildcardClass7 = obj5.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual(obj9, (java.lang.Object) 0);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray(obj9);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, obj9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass11 = equality10.getClass();
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArraysEqual(obj5, (java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) 10, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj2.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj2);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) 0);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray(obj6);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, obj6);
        java.lang.Class<?> wildcardClass11 = obj6.getClass();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, obj6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) (-1.0f));
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj4);
        java.lang.Class<?> wildcardClass8 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean3, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0.0d, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 0, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean2, (java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj0.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj7, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass10 = obj7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass6, obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = null;
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj3, obj4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj3);
        java.lang.Class<?> wildcardClass7 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) ' ', (java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean5, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) -1, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100.0f, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) "hi!", (java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 0, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) '4', (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) "hi!", (java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) 10);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj5);
        java.lang.Class<?> wildcardClass7 = obj5.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual(obj9, (java.lang.Object) 0);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray(obj9);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, obj9);
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean3, (java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj4);
        java.lang.Class<?> wildcardClass6 = obj4.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean2, obj4);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 1, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = null;
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj3, obj4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) 100, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10.0d, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean5);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass4, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) (-1.0f));
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj4);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, obj4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArraysEqual(obj4, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj2);
        java.lang.Class<?> wildcardClass4 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) -1, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) false, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) (-1.0f));
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) boolean4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean2, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        java.lang.Class<?> wildcardClass10 = obj5.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray(obj5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) (-1.0f));
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray(obj6);
        java.lang.Class<?> wildcardClass10 = obj6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArraysEqual(obj2, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) 0);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj4);
        java.lang.Class<?> wildcardClass8 = obj4.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) boolean9);
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj12);
        java.lang.Class<?> wildcardClass14 = obj12.getClass();
        boolean boolean15 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual(obj16, (java.lang.Object) 0);
        boolean boolean19 = org.mockito.internal.matchers.Equality.isArray(obj16);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass14, obj16);
        java.lang.Class<?> wildcardClass21 = obj16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 0, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass3, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 1.0f, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj4);
        java.lang.Class<?> wildcardClass7 = obj4.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        java.lang.Class<?> wildcardClass10 = obj5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass10, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass7 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj1);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) 10);
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) 0);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj1);
        java.lang.Class<?> wildcardClass5 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 10, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) -1, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) 1, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = null;
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj7, obj8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj5, obj7);
        java.lang.Class<?> wildcardClass11 = obj5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean4, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) 0);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj1);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) (-1.0f));
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean4, obj5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1.0d, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 1.0d, (java.lang.Object) boolean6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass4 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10.0d, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean2, (java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj4);
        java.lang.Class<?> wildcardClass7 = obj4.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1.0f), (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 'a', (java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 0, (java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj1, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        java.lang.Object obj10 = null;
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean9, obj10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) 10);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj5 = null;
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, obj5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean3, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 1, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj2.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj7, (java.lang.Object) 0);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray(obj7);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj11, (java.lang.Object) (-1.0f));
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray(obj11);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean10, obj11);
        java.lang.Class<?> wildcardClass16 = obj11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass6, obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj10, (java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj5, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj5);
        java.lang.Class<?> wildcardClass8 = obj5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 10L, (java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 10, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj2, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj3, (java.lang.Object) 0);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray(obj3);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj7, (java.lang.Object) (-1.0f));
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray(obj7);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean6, obj7);
        java.lang.Class<?> wildcardClass12 = obj7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean2, (java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) '#', (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass4 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 0.0d, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 100, obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) equality0, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) (-1.0f));
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj1);
        java.lang.Class<?> wildcardClass5 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (-1), (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) 0);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray(obj6);
        java.lang.Class<?> wildcardClass10 = obj6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean5, (java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) false, (java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        java.lang.Class<?> wildcardClass5 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality0, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) (-1.0f));
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj4);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, obj4);
        java.lang.Class<?> wildcardClass9 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass9, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) 0);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) 100, (java.lang.Object) boolean4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 100, (java.lang.Object) equality2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100.0f, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual(obj1, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (short) 100, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (-1.0d), obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 1, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass4 = obj1.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        java.lang.Class<?> wildcardClass9 = obj5.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) boolean10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1.0d, (java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) 0);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj4);
        java.lang.Class<?> wildcardClass8 = obj4.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) boolean9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean10, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) 0);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj4);
        java.lang.Class<?> wildcardClass8 = obj4.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) boolean9);
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj12);
        java.lang.Class<?> wildcardClass14 = obj12.getClass();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean9, (java.lang.Object) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean9, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1L), (java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) 0);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray(obj6);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, obj6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass4);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, (java.lang.Object) 10);
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj17);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, (java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (short) -1, (java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) 0);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj4);
        java.lang.Class<?> wildcardClass8 = obj4.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100.0d, (java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean2, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass6, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj1);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj4);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj7);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj7);
        java.lang.Class<?> wildcardClass10 = obj7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean2, (java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) "hi!", obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1), (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) 0);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj1);
        java.lang.Class<?> wildcardClass5 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) "hi!", (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass4, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        java.lang.Class<?> wildcardClass10 = obj5.getClass();
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj12);
        java.lang.Class<?> wildcardClass14 = obj12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj5, (java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) 0);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj4);
        java.lang.Class<?> wildcardClass8 = obj4.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) boolean9);
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj12);
        java.lang.Class<?> wildcardClass14 = obj12.getClass();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean9, (java.lang.Object) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass14, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj5);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1L), (java.lang.Object) boolean7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 100, (java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 1.0f, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) '4', (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) '4', (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) (short) 0);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) "hi!", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass6, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) (-1.0f));
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean4, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass3, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj2.getClass();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass6, obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass9 = obj6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (short) 1, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean3);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) 0);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray(obj6);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, obj6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 0, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) 10);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) '4');
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj9);
        java.lang.Class<?> wildcardClass11 = obj9.getClass();
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual(obj13, (java.lang.Object) 0);
        boolean boolean16 = org.mockito.internal.matchers.Equality.isArray(obj13);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass11, obj13);
        java.lang.Class<?> wildcardClass18 = obj13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass1, obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 100, (java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass3 = equality1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        java.lang.Class<?> wildcardClass9 = obj5.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100.0d, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean11, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) 0);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray(obj6);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, obj6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass4);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) 10);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 1L, (java.lang.Object) wildcardClass2);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 100.0d, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (-1L), (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality0, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) 10);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) '4');
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) '4');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass5 = equality4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) equality4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) (short) 0);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean12, (java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1.0d, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        java.lang.Class<?> wildcardClass9 = obj5.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100.0d, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean10);
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj12, (java.lang.Object) 0);
        boolean boolean15 = org.mockito.internal.matchers.Equality.isArray(obj12);
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual(obj16, (java.lang.Object) (-1.0f));
        boolean boolean19 = org.mockito.internal.matchers.Equality.isArray(obj16);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean15, obj16);
        java.lang.Class<?> wildcardClass21 = obj16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) (-1.0f));
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj4);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, obj4);
        java.lang.Class<?> wildcardClass9 = obj4.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj10, (java.lang.Object) (-1.0f));
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) boolean12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = null;
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj3, obj4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) 100, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 100, (java.lang.Object) equality2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) true, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj4);
        java.lang.Class<?> wildcardClass6 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj1, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object obj6 = null;
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, obj6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj3, obj5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass1, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 100, (java.lang.Object) equality2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (-1), (java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj4);
        java.lang.Class<?> wildcardClass6 = obj4.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj8, (java.lang.Object) 0);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray(obj8);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, obj8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) "", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass4 = obj1.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        java.lang.Class<?> wildcardClass9 = obj5.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) boolean10);
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj13);
        java.lang.Class<?> wildcardClass15 = obj13.getClass();
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean10, (java.lang.Object) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100L, (java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) 0, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1.0f, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0, (java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100L, (java.lang.Object) boolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass7 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) '4', (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass6, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 100, (java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass3 = equality1.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) boolean6);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj10);
        java.lang.Class<?> wildcardClass12 = obj10.getClass();
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual(obj14, (java.lang.Object) 0);
        boolean boolean17 = org.mockito.internal.matchers.Equality.isArray(obj14);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass12, obj14);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass12);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean7, (java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass4, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        java.lang.Class<?> wildcardClass9 = obj5.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100.0d, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj1);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj3, (java.lang.Object) 0);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray(obj3);
        java.lang.Class<?> wildcardClass7 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj1, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj2, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0L, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10L, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj3);
        java.lang.Class<?> wildcardClass5 = obj3.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj7, (java.lang.Object) 0);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray(obj7);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, obj7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass5);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 1, (java.lang.Object) boolean12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) 10);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 1L, (java.lang.Object) wildcardClass3);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) "hi!", (java.lang.Object) boolean6);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 100, (java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass4 = equality2.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) boolean7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) '4', (java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj3, (java.lang.Object) (-1.0f));
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray(obj3);
        java.lang.Class<?> wildcardClass7 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean2, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass3, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        java.lang.Class<?> wildcardClass9 = obj5.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100.0d, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj4);
        java.lang.Class<?> wildcardClass6 = obj4.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean2, (java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) 10);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj3, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass6 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean2, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) true, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray(obj0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) 10);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean7, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = null;
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj3, obj4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (short) 10, (java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) 0);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj4);
        java.lang.Class<?> wildcardClass8 = obj4.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) boolean9);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Object obj14 = null;
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual(obj13, obj14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual(obj11, obj13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean10, obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj1);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) 1, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) ' ', (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) (-1.0f));
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (short) 1, (java.lang.Object) boolean4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Object obj13 = null;
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj12, obj13);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual(obj10, obj12);
        java.lang.Class<?> wildcardClass16 = obj12.getClass();
        boolean boolean17 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean9, (java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Class<?> wildcardClass2 = equality0.getClass();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj2.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj8);
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj12, (java.lang.Object) 0);
        boolean boolean15 = org.mockito.internal.matchers.Equality.isArray(obj12);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, obj12);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual(obj2, (java.lang.Object) wildcardClass10);
        java.lang.Object obj19 = new java.lang.Object();
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj19);
        java.lang.Class<?> wildcardClass21 = obj19.getClass();
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass21, (java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj2, (java.lang.Object) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 100, (java.lang.Object) equality1);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj4);
        java.lang.Class<?> wildcardClass6 = obj4.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality1, (java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj7);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass4, (java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) "hi!", (java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean5, (java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        java.lang.Class<?> wildcardClass9 = obj5.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100.0d, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean10);
        java.lang.Class<?> wildcardClass12 = obj0.getClass();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = null;
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual(obj15, obj16);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual(obj13, obj15);
        java.lang.Class<?> wildcardClass19 = obj15.getClass();
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj21);
        java.lang.Class<?> wildcardClass23 = obj21.getClass();
        boolean boolean24 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = new java.lang.Object();
        boolean boolean27 = org.mockito.internal.matchers.Equality.areEqual(obj25, (java.lang.Object) 0);
        boolean boolean28 = org.mockito.internal.matchers.Equality.isArray(obj25);
        boolean boolean29 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass23, obj25);
        boolean boolean30 = org.mockito.internal.matchers.Equality.areEqual(obj15, (java.lang.Object) wildcardClass23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) 0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) equality1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean4, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) 10);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 1L, (java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality0, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) 0);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj1);
        java.lang.Class<?> wildcardClass5 = obj1.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1L), (java.lang.Object) wildcardClass5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (-1.0d), (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) 100.0d);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100.0d, (java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) boolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) 0);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray(obj6);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, obj6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality0, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) (short) 10);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) (-1.0f));
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj4);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, obj4);
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean3, obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 100, (java.lang.Object) equality4);
        java.lang.Class<?> wildcardClass6 = equality4.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) boolean9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean2, (java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = null;
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj3, obj4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj3);
        java.lang.Class<?> wildcardClass7 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1.0d, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 100, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass4 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1L, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100.0d, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) (-1.0f));
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object obj11 = null;
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj10, obj11);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj8, obj10);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj5, obj8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass3, obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0L, (java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Object obj13 = null;
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj12, obj13);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual(obj10, obj12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj5, (java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean2, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Class<?> wildcardClass3 = equality0.getClass();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass3, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj2.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj10);
        java.lang.Class<?> wildcardClass12 = obj10.getClass();
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual(obj14, (java.lang.Object) 0);
        boolean boolean17 = org.mockito.internal.matchers.Equality.isArray(obj14);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass12, obj14);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass6, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) 0);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, (java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality0, (java.lang.Object) equality2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj5);
        java.lang.Class<?> wildcardClass8 = obj5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) "", (java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj4);
        java.lang.Class<?> wildcardClass7 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass7, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1));
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj6);
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj9);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean4, (java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = null;
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj3, obj4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj3);
        java.lang.Class<?> wildcardClass7 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 'a', obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) 0);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray(obj6);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, obj6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray(obj6);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray(obj6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 'a', (java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) (short) 10);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) 0);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray(obj6);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj11, (java.lang.Object) 0);
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray(obj11);
        java.lang.Class<?> wildcardClass15 = obj11.getClass();
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100.0d, (java.lang.Object) wildcardClass15);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) boolean16);
        java.lang.Class<?> wildcardClass18 = obj6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 10, (java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass5 = equality1.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = null;
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, obj7);
        java.lang.Class<?> wildcardClass9 = obj6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass5, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj0.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj7, (java.lang.Object) 0);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray(obj7);
        java.lang.Class<?> wildcardClass11 = obj7.getClass();
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass6, (java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) 0);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray(obj6);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, obj6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 10L, (java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1));
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) 0);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj4);
        java.lang.Class<?> wildcardClass8 = obj4.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100.0d, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj12 = null;
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj11, obj12);
        java.lang.Class<?> wildcardClass14 = obj11.getClass();
        boolean boolean15 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean10, (java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray(obj5);
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj14);
        java.lang.Class<?> wildcardClass16 = obj14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean12, (java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object obj6 = null;
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, obj6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj3, obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj3);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray(obj0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) 10);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) '4');
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj8, (java.lang.Object) 0);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray(obj8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean7, (java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) 0);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray(obj6);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, obj6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 10, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) 0);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj4);
        java.lang.Class<?> wildcardClass8 = obj4.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100.0d, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean10, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual(obj9, (java.lang.Object) (-1.0f));
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray(obj9);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean8, obj9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean4, (java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 100, (java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) boolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) '#');
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj7);
        java.lang.Class<?> wildcardClass9 = obj7.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj11, (java.lang.Object) 0);
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray(obj11);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, obj11);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean4, (java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj2.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj8);
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj12, (java.lang.Object) 0);
        boolean boolean15 = org.mockito.internal.matchers.Equality.isArray(obj12);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, obj12);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual(obj2, (java.lang.Object) wildcardClass10);
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual(obj18, (java.lang.Object) (-1.0f));
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object obj24 = null;
        boolean boolean25 = org.mockito.internal.matchers.Equality.areEqual(obj23, obj24);
        boolean boolean26 = org.mockito.internal.matchers.Equality.areEqual(obj21, obj23);
        boolean boolean27 = org.mockito.internal.matchers.Equality.areEqual(obj18, obj21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean17, obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) 0);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj1);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass8 = obj5.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean4, (java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1L), (java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass4 = equality1.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj3, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass6 = obj3.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) 100.0d);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) 0);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj1);
        java.lang.Class<?> wildcardClass5 = obj1.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1L), (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj7, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass10 = obj7.getClass();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) 100.0d);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1L), (java.lang.Object) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (-1L), (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj3, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass6 = obj3.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) 100.0d);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100L, (java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj11, (java.lang.Object) (-1.0f));
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual(obj14, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass17 = obj14.getClass();
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass17, (java.lang.Object) 100.0d);
        boolean boolean20 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass17);
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual(obj11, (java.lang.Object) wildcardClass17);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean10, obj11);
        boolean boolean23 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray(obj0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100.0d, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray(obj2);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 100, (java.lang.Object) equality8);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object obj11 = null;
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj10, obj11);
        java.lang.Class<?> wildcardClass13 = obj10.getClass();
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass13);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean9, (java.lang.Object) wildcardClass13);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean6, (java.lang.Object) boolean9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) 0);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj1);
        java.lang.Class<?> wildcardClass5 = obj1.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100.0d, (java.lang.Object) wildcardClass5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass5, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean2, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass4 = obj1.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 0, obj1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) (-1.0f));
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = null;
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, obj7);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj4, obj6);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj4);
        java.lang.Class<?> wildcardClass11 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) 0, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Class<?> wildcardClass2 = equality0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj4);
        java.lang.Class<?> wildcardClass6 = obj4.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj8, (java.lang.Object) 0);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray(obj8);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, obj8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass2, (java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) 0);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj4);
        java.lang.Class<?> wildcardClass8 = obj4.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) boolean9);
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj12);
        java.lang.Class<?> wildcardClass14 = obj12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean10, (java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 100, (java.lang.Object) equality1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = null;
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj3, obj4);
        java.lang.Class<?> wildcardClass6 = obj3.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean2, (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean8, obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) '#', (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray(obj5);
        java.lang.Class<?> wildcardClass11 = obj5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj5, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray(obj5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean10, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj3, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass6 = obj3.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) 100.0d);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass11 = obj0.getClass();
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj12, (java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass11, (java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 100, (java.lang.Object) equality1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality1, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) '4', (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) 1.0d);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) (-1.0f));
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj7, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass10 = obj7.getClass();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) 100.0d);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean3, (java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass4 = obj1.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) 100.0d);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) ' ', (java.lang.Object) boolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        java.lang.Class<?> wildcardClass9 = obj5.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100.0d, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean10);
        org.mockito.internal.matchers.Equality equality12 = new org.mockito.internal.matchers.Equality();
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality12);
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality12);
        java.lang.Class<?> wildcardClass15 = equality12.getClass();
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual(obj16, (java.lang.Object) (-1.0f));
        java.lang.Object obj19 = new java.lang.Object();
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual(obj19, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass22 = obj19.getClass();
        boolean boolean24 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass22, (java.lang.Object) 100.0d);
        boolean boolean25 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass22);
        boolean boolean26 = org.mockito.internal.matchers.Equality.areEqual(obj16, (java.lang.Object) wildcardClass22);
        boolean boolean27 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass15, (java.lang.Object) boolean26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) boolean26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass5 = equality2.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) wildcardClass5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj2.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj8);
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj12, (java.lang.Object) 0);
        boolean boolean15 = org.mockito.internal.matchers.Equality.isArray(obj12);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, obj12);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual(obj2, (java.lang.Object) wildcardClass10);
        boolean boolean18 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj0.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj7, (java.lang.Object) (-1.0f));
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Object obj13 = null;
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj12, obj13);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual(obj10, obj12);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual(obj7, obj10);
        java.lang.Class<?> wildcardClass17 = obj7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) 0);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray(obj6);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj10, (java.lang.Object) (-1.0f));
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray(obj10);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean9, obj10);
        java.lang.Class<?> wildcardClass15 = obj10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass4, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality6);
        java.lang.Class<?> wildcardClass9 = equality6.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj10, (java.lang.Object) (-1.0f));
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual(obj13, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass16 = obj13.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass16, (java.lang.Object) 100.0d);
        boolean boolean19 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass16);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual(obj10, (java.lang.Object) wildcardClass16);
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) boolean20);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean5, (java.lang.Object) boolean21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj10, (java.lang.Object) (-1.0f));
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = null;
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual(obj15, obj16);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual(obj13, obj15);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual(obj10, obj13);
        boolean boolean20 = org.mockito.internal.matchers.Equality.isArray(obj10);
        java.lang.Class<?> wildcardClass21 = obj10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass7 = obj4.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, (java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual(obj9, (java.lang.Object) 0);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray(obj9);
        java.lang.Class<?> wildcardClass13 = obj9.getClass();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, (java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean3, (java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '4');
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj4);
        java.lang.Class<?> wildcardClass6 = obj4.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj8, (java.lang.Object) 0);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray(obj8);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, obj8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray(obj8);
        java.lang.Class<?> wildcardClass14 = obj8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean2, (java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object obj6 = null;
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, obj6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj3, obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj3);
        java.lang.Class<?> wildcardClass10 = obj0.getClass();
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj11, (java.lang.Object) (-1.0f));
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Object obj17 = null;
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual(obj16, obj17);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual(obj14, obj16);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual(obj11, obj14);
        boolean boolean21 = org.mockito.internal.matchers.Equality.isArray(obj11);
        java.lang.Object obj22 = null;
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual(obj11, obj22);
        java.lang.Object obj24 = new java.lang.Object();
        boolean boolean26 = org.mockito.internal.matchers.Equality.areEqual(obj24, (java.lang.Object) 0);
        boolean boolean27 = org.mockito.internal.matchers.Equality.isArray(obj24);
        java.lang.Object obj28 = new java.lang.Object();
        boolean boolean30 = org.mockito.internal.matchers.Equality.areEqual(obj28, (java.lang.Object) (-1.0f));
        boolean boolean31 = org.mockito.internal.matchers.Equality.isArray(obj28);
        boolean boolean32 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean27, obj28);
        boolean boolean33 = org.mockito.internal.matchers.Equality.areEqual(obj22, obj28);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass10, obj28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray(obj1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10L, (java.lang.Object) boolean2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) '#');
        java.lang.Object obj6 = null;
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality7);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality7);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) equality7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean5, (java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, (java.lang.Object) 0);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray(obj2);
        java.lang.Class<?> wildcardClass6 = obj2.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1L), (java.lang.Object) wildcardClass6);
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj8, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass11 = obj8.getClass();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass11, (java.lang.Object) 100.0d);
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass11);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1L), (java.lang.Object) wildcardClass11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10.0d, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj2.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj7, (java.lang.Object) (-1.0f));
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Object obj13 = null;
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj12, obj13);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual(obj10, obj12);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual(obj7, obj10);
        java.lang.Class<?> wildcardClass17 = obj10.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.mockito.internal.matchers.Equality.areArraysEqual(obj2, (java.lang.Object) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        java.lang.Class<?> wildcardClass6 = obj2.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj8);
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj12, (java.lang.Object) 0);
        boolean boolean15 = org.mockito.internal.matchers.Equality.isArray(obj12);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, obj12);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual(obj2, (java.lang.Object) wildcardClass10);
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj2, obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj5);
        java.lang.Class<?> wildcardClass7 = obj5.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) boolean9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean12, (java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj6 = null;
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality7);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality7);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) equality7);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean5, obj6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100L, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj4);
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj8);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj11);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj11);
        java.lang.Class<?> wildcardClass14 = obj11.getClass();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean6, (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Object obj19 = null;
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual(obj18, obj19);
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual(obj16, obj18);
        java.lang.Class<?> wildcardClass22 = obj18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean6, (java.lang.Object) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) 0);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray(obj6);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, obj6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) boolean11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        java.lang.Object obj4 = null;
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality5);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) equality5);
        java.lang.Class<?> wildcardClass9 = equality5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.lang.Object obj0 = null;
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj3);
        java.lang.Class<?> wildcardClass5 = obj3.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj7, (java.lang.Object) 0);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray(obj7);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, obj7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass5);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) (-1.0f));
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj4);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, obj4);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj11);
        java.lang.Class<?> wildcardClass13 = obj11.getClass();
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = new java.lang.Object();
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual(obj15, (java.lang.Object) 0);
        boolean boolean18 = org.mockito.internal.matchers.Equality.isArray(obj15);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, obj15);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.mockito.internal.matchers.Equality.areArraysEqual(obj4, (java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) 0);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray(obj6);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, obj6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass4);
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj12, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass15 = obj12.getClass();
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual(obj16, (java.lang.Object) 0);
        boolean boolean19 = org.mockito.internal.matchers.Equality.isArray(obj16);
        java.lang.Class<?> wildcardClass20 = obj16.getClass();
        boolean boolean21 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass20);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass15, (java.lang.Object) boolean21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) 0);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj4);
        java.lang.Class<?> wildcardClass8 = obj4.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100.0d, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj11, (java.lang.Object) (-1.0f));
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray(obj11);
        java.lang.Class<?> wildcardClass15 = obj11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) (byte) 10);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj7, (java.lang.Object) (-1.0f));
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray(obj7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj7, (java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) 10, obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray(obj5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean10, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) "hi!", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10, (java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) '4');
        java.lang.Class<?> wildcardClass4 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1L, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass7 = obj4.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, (java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual(obj9, (java.lang.Object) (-1.0f));
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj12, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass15 = obj12.getClass();
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass15, (java.lang.Object) 100.0d);
        boolean boolean18 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass15);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual(obj9, (java.lang.Object) wildcardClass15);
        boolean boolean20 = org.mockito.internal.matchers.Equality.isArray(obj9);
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, (java.lang.Object) boolean20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean4, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean2, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass4 = equality1.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass4);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Class<?> wildcardClass3 = equality0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) (-1.0f));
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj7, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass10 = obj7.getClass();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) 100.0d);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) wildcardClass10);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) boolean14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.lang.Object obj1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj3);
        java.lang.Class<?> wildcardClass5 = obj3.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj7, (java.lang.Object) 0);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray(obj7);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, obj7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray(obj7);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray(obj7);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj7);
        java.lang.Class<?> wildcardClass15 = obj7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 100, (java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object obj6 = null;
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, obj6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj3, obj5);
        java.lang.Class<?> wildcardClass9 = obj5.getClass();
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj11);
        java.lang.Class<?> wildcardClass13 = obj11.getClass();
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = new java.lang.Object();
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual(obj15, (java.lang.Object) 0);
        boolean boolean18 = org.mockito.internal.matchers.Equality.isArray(obj15);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, obj15);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) wildcardClass13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 100L, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object obj6 = null;
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, obj6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj3, obj5);
        java.lang.Class<?> wildcardClass9 = obj5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean2, (java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) 0);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj4);
        java.lang.Class<?> wildcardClass8 = obj4.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) boolean9);
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj12);
        java.lang.Class<?> wildcardClass14 = obj12.getClass();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean9, (java.lang.Object) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean9, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) -1, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj2);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray(obj2);
        java.lang.Class<?> wildcardClass7 = obj2.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj10);
        java.lang.Class<?> wildcardClass12 = obj10.getClass();
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual(obj14, (java.lang.Object) 0);
        boolean boolean17 = org.mockito.internal.matchers.Equality.isArray(obj14);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass12, obj14);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.mockito.internal.matchers.Equality.areArraysEqual(obj2, (java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) (-1.0f));
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object obj11 = null;
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj10, obj11);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj8, obj10);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj5, obj8);
        boolean boolean15 = org.mockito.internal.matchers.Equality.isArray(obj5);
        java.lang.Class<?> wildcardClass16 = obj5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (-1.0f));
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray(obj0);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) '#');
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) 0);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray(obj6);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj11, (java.lang.Object) 0);
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray(obj11);
        java.lang.Class<?> wildcardClass15 = obj11.getClass();
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100.0d, (java.lang.Object) wildcardClass15);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) boolean16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean5, (java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray(obj5);
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj14);
        java.lang.Class<?> wildcardClass16 = obj14.getClass();
        boolean boolean17 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual(obj18, (java.lang.Object) 0);
        boolean boolean21 = org.mockito.internal.matchers.Equality.isArray(obj18);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass16, obj18);
        boolean boolean23 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass16);
        boolean boolean25 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass16, (java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean12, (java.lang.Object) boolean25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 100, (java.lang.Object) equality1);
        java.lang.Object obj3 = null;
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        java.lang.Class<?> wildcardClass7 = equality4.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj3, (java.lang.Object) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) 100, (java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) 0);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj1);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) 0);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray(obj6);
        java.lang.Class<?> wildcardClass10 = obj6.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100.0d, (java.lang.Object) wildcardClass10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) boolean11);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10L, (java.lang.Object) boolean12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj2);
        java.lang.Class<?> wildcardClass4 = obj1.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, obj1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = null;
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj3, obj4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj3);
        java.lang.Class<?> wildcardClass7 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) 1, (java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj5, (java.lang.Object) 0);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj5);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray(obj5);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray(obj5);
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj14);
        java.lang.Class<?> wildcardClass16 = obj14.getClass();
        boolean boolean17 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual(obj18, (java.lang.Object) 0);
        boolean boolean21 = org.mockito.internal.matchers.Equality.isArray(obj18);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass16, obj18);
        boolean boolean23 = org.mockito.internal.matchers.Equality.isArray(obj18);
        boolean boolean24 = org.mockito.internal.matchers.Equality.isArray(obj18);
        boolean boolean25 = org.mockito.internal.matchers.Equality.isArray(obj18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj5, obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj1);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj4);
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj8);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', obj11);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj11);
        java.lang.Class<?> wildcardClass14 = obj11.getClass();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean6, (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual(obj16, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass19 = obj16.getClass();
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass19, (java.lang.Object) 100.0d);
        boolean boolean22 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass19);
        boolean boolean23 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean15, (java.lang.Object) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 1.0d, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.lang.Object obj1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, obj3);
        java.lang.Class<?> wildcardClass5 = obj3.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj7, (java.lang.Object) 0);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray(obj7);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, obj7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray(obj7);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray(obj7);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj7);
        java.lang.Class<?> wildcardClass15 = obj7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) '4', (java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj1);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) 0);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray(obj4);
        java.lang.Class<?> wildcardClass8 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass3, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, obj1);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }
}

