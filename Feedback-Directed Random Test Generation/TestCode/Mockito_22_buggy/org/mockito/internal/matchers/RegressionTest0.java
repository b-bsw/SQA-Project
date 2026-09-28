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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) ' ', (java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 10, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10.0d, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0.0f, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) 10, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 100.0f, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1.0d, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) true, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) ' ', (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) '#', (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) false, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1.0d, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 'a', (java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 10L, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
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
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 0, (java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 100L, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) ' ', (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100L, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1.0f, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '#', (java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) false, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0.0d, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) boolean2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 1, (java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 10, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1.0f, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0f, (java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) 100, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 1.0f, (java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1.0f, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100.0d, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 1.0d, (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 1, (java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0L, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 10, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1.0f, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) 1, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean2, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) '4', (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (-1.0f), (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) '4', (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        java.lang.Class<?> wildcardClass4 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) ' ', (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1L, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 10, (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0d, (java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean2, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass3 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 1, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 0, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (short) 1, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) true, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 'a', (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 0.0d, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 0.0f, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) equality0, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1L), (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0.0d, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (short) 100, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) 1, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) false, (java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean1, (java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass1, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 100, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) -1, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0L, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 100, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1L), (java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass4 = equality2.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100, (java.lang.Object) boolean4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1.0d, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 10, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) -1, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) 100, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10.0f, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) false, (java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) ' ', (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) -1, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0.0d, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 100.0f, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality0, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', (java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1.0d, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        java.lang.Object obj4 = null;
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, obj4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass4 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) equality7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (short) 0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) "", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 0, (java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        java.lang.Class<?> wildcardClass5 = equality3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 100, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '#', (java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) 1, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 'a', (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass1, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 100L, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 100, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) -1, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0.0f, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (-1), (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 0L, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass3 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10.0d, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        java.lang.Class<?> wildcardClass3 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean3, (java.lang.Object) equality4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) "hi!", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1L, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 10.0d, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) (short) -1);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1L, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) 10, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10L, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean3, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (-1.0d), (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '#', (java.lang.Object) boolean5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0.0f, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) -1, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) "", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean3, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) '#');
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) -1, (java.lang.Object) boolean4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        java.lang.Class<?> wildcardClass3 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        java.lang.Class<?> wildcardClass5 = equality3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) -1, (java.lang.Object) equality3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0.0d, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) boolean3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) ' ', (java.lang.Object) boolean3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass3, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1.0d, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, (java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) 10, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) boolean3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '#', (java.lang.Object) boolean4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', (java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1.0d, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (-1.0d), (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) equality0, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 'a', (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean5, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) ' ', (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) false, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass3 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 1L, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0.0f, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, obj2);
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
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        java.lang.Class<?> wildcardClass3 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass3, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) boolean2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) "", (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) 100, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10L, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) ' ', (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass4, (java.lang.Object) equality5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality0, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100.0f, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality7);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality7, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass11 = equality7.getClass();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1.0d), (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1), (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 100, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality6);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality6, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass10 = equality6.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality6);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass15 = equality14.getClass();
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, (java.lang.Object) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality6, (java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass5 = equality4.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 1.0f, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1.0f, (java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass4 = equality2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality2, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 1L, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean11, (java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) equality8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass14 = equality13.getClass();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass12, (java.lang.Object) wildcardClass14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass12);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean5, (java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) 100, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass5 = equality4.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean7, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass4 = equality2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass4, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 10, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass4 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) equality7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass4, (java.lang.Object) equality7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) 0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100L, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) "", (java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 1, (java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray(obj0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass4 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj6 = null;
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality5, obj6);
        java.lang.Class<?> wildcardClass8 = equality5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality2, (java.lang.Object) equality5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 1.0d, (java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100.0d, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) (short) -1);
        java.lang.Object obj6 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean5, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray(obj0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        java.lang.Class<?> wildcardClass3 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Class<?> wildcardClass2 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass2, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean2, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 'a', (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass1, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, obj3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality0, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1), (java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass7);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 'a', (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass5 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 10.0d, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (-1.0f), (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (short) 100, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean12, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass5 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) 100, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass5 = equality1.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) "", (java.lang.Object) equality1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual(obj2, (java.lang.Object) wildcardClass4);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) boolean11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
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
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, obj1);
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0.0f, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10.0f, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) boolean3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1.0d), (java.lang.Object) boolean3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        java.lang.Class<?> wildcardClass5 = equality3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10.0f, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) equality5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) boolean6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) "", (java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean3, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        java.lang.Class<?> wildcardClass5 = equality3.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0f, (java.lang.Object) equality3);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) '#', (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) (short) -1);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1), (java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean7, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass4, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10L, (java.lang.Object) boolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100L, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass10 = equality9.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality7);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality7, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass11 = equality7.getClass();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) equality0, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass3 = equality1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 0, (java.lang.Object) equality1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) ' ', (java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10.0d, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) (short) -1);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1), (java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass2, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 10, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass7);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 1, (java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) boolean5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean5, (java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass8, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, (java.lang.Object) equality4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality2, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean2, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) equality7);
        java.lang.Class<?> wildcardClass9 = equality7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality0, (java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10L, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1.0d), (java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass3);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 'a', (java.lang.Object) boolean6);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) equality8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass7);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean4, (java.lang.Object) 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10.0d, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        java.lang.Class<?> wildcardClass3 = equality0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass12 = equality11.getClass();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) wildcardClass12);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) boolean13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality6);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality6, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass10 = equality6.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality6);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj14 = null;
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality13, obj14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality13);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality6, (java.lang.Object) boolean16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) "", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality2, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj3, (java.lang.Object) wildcardClass5);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj1, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean2, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) equality7);
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality9);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality7, (java.lang.Object) equality9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean4, (java.lang.Object) equality7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100.0d, (java.lang.Object) boolean5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0.0f, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass7);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass5);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) equality11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) true, (java.lang.Object) equality11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1L), (java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass3);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) boolean10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0, (java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass10 = equality9.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) wildcardClass6);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 100.0d, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10.0f, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass5 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality1, (java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass10 = equality9.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj3, (java.lang.Object) wildcardClass5);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj3);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean13, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) 'a');
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass8, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean4, (java.lang.Object) boolean6);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, (java.lang.Object) 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) -1, obj1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) "", (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass5 = equality1.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 1, (java.lang.Object) wildcardClass5);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj8 = null;
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality7, obj8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality7);
        java.lang.Class<?> wildcardClass11 = equality7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 1, (java.lang.Object) equality7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) -1, obj13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean11, obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass7);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass5);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) equality11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (-1L), (java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) (short) 10);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean13, (java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality12 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass13 = equality12.getClass();
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, (java.lang.Object) equality14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean11, (java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 100L, (java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) (short) 100);
        org.mockito.internal.matchers.Equality equality15 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass16 = equality15.getClass();
        org.mockito.internal.matchers.Equality equality17 = new org.mockito.internal.matchers.Equality();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass16, (java.lang.Object) equality17);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean14, (java.lang.Object) boolean18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) equality10);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.mockito.internal.matchers.Equality equality16 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass17 = equality16.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass15, (java.lang.Object) wildcardClass17);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, (java.lang.Object) wildcardClass15);
        boolean boolean20 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) boolean20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, (java.lang.Object) equality4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) equality2, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj11 = null;
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality10, obj11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) equality10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass5 = equality4.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass10 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj12 = null;
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality11, obj12);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.mockito.internal.matchers.Equality equality19 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass20 = equality19.getClass();
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass18, (java.lang.Object) wildcardClass20);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass16, (java.lang.Object) wildcardClass18);
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual(obj14, (java.lang.Object) wildcardClass16);
        boolean boolean24 = org.mockito.internal.matchers.Equality.areEqual(obj12, obj14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass10, obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 10, (java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) "", obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) -1, (java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality5);
        java.lang.Class<?> wildcardClass7 = equality5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) false, (java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) (short) -1);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1), (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass10 = equality9.getClass();
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) equality11);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (-1), (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1.0f), obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass10 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass12 = equality11.getClass();
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass12, (java.lang.Object) equality13);
        java.lang.Class<?> wildcardClass15 = equality13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass10, (java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj3, (java.lang.Object) wildcardClass5);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj3);
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj15 = null;
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality14, obj15);
        java.lang.Class<?> wildcardClass17 = equality14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.mockito.internal.matchers.Equality.areArraysEqual(obj3, (java.lang.Object) equality14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, obj1);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) equality8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality4, (java.lang.Object) boolean9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0d, (java.lang.Object) equality4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj1, (java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) equality10);
        org.mockito.internal.matchers.Equality equality12 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj13 = null;
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality12, obj13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean11, (java.lang.Object) equality12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0, (java.lang.Object) equality2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass7);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 1, (java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 100, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj6 = null;
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality5, obj6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality5);
        java.lang.Class<?> wildcardClass9 = equality5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj1, (java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass7);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass5);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) equality11);
        java.lang.Class<?> wildcardClass13 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj3, (java.lang.Object) wildcardClass5);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj3);
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj15 = null;
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality14, obj15);
        boolean boolean17 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality14);
        java.lang.Class<?> wildcardClass18 = equality14.getClass();
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) equality14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1.0f, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality6);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality6, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass10 = equality6.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality6);
        org.mockito.internal.matchers.Equality equality12 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass13 = equality12.getClass();
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, (java.lang.Object) equality14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass1, (java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) 1, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality0, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        java.lang.Class<?> wildcardClass4 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 1.0f, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass5 = equality4.getClass();
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) equality6);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) equality10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass9);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.mockito.internal.matchers.Equality equality15 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass16 = equality15.getClass();
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass14, (java.lang.Object) wildcardClass16);
        boolean boolean18 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass14);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) wildcardClass14);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality6, (java.lang.Object) boolean19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality2, (java.lang.Object) equality6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass10 = equality9.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) wildcardClass6);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj2, obj4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 0, (java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj7 = null;
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality6, obj7);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality6);
        java.lang.Class<?> wildcardClass10 = equality6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality2, (java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality2);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) "", (java.lang.Object) boolean5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) boolean5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) true, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) equality7);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass12 = equality11.getClass();
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass12, (java.lang.Object) equality13);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass12);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass12, (java.lang.Object) 'a');
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 100L, (java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean2, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 0.0d, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) false, (java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 10, (java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj15 = null;
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality14, obj15);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean12, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 1, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) (short) -1);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) ' ');
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj14 = null;
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality13, obj14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality13);
        java.lang.Class<?> wildcardClass17 = equality13.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass17);
        org.mockito.internal.matchers.Equality equality19 = new org.mockito.internal.matchers.Equality();
        boolean boolean20 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality19);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality19, (java.lang.Object) '#');
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass17, (java.lang.Object) equality19);
        boolean boolean24 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality19);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean24, obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass7);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass5);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass11 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass7);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 100.0f, (java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass2);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.mockito.internal.matchers.Equality equality12 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass13 = equality12.getClass();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass11, (java.lang.Object) wildcardClass13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Class<?> wildcardClass2 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) equality5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1.0f, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) true, (java.lang.Object) wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
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
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) -1, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass7);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 10, (java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass7);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) 10, (java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean3, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean4, (java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) boolean9);
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass12 = equality11.getClass();
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass12, (java.lang.Object) equality13);
        boolean boolean15 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass12);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.mockito.internal.matchers.Equality equality18 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass19 = equality18.getClass();
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass17, (java.lang.Object) wildcardClass19);
        boolean boolean21 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass17);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass12, (java.lang.Object) wildcardClass17);
        org.mockito.internal.matchers.Equality equality24 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj25 = null;
        boolean boolean26 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality24, obj25);
        boolean boolean27 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality24);
        java.lang.Class<?> wildcardClass28 = equality24.getClass();
        boolean boolean29 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass12, (java.lang.Object) wildcardClass28);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean10, (java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) 'a');
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass2, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0.0d, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality7);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality7, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass11 = equality7.getClass();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 1, (java.lang.Object) wildcardClass11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass2, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1L, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) 'a');
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass8);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.mockito.internal.matchers.Equality equality17 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass18 = equality17.getClass();
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass16, (java.lang.Object) wildcardClass18);
        boolean boolean20 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass6, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) -1, obj6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass1, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality6);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality6, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass10 = equality6.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality6);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass14 = equality13.getClass();
        org.mockito.internal.matchers.Equality equality15 = new org.mockito.internal.matchers.Equality();
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass14, (java.lang.Object) equality15);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass14, (java.lang.Object) (short) -1);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1), (java.lang.Object) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) boolean3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 0L, (java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass5 = equality1.getClass();
        java.lang.Object obj6 = null;
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, obj6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArraysEqual(obj6, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) equality7);
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass10 = equality9.getClass();
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) equality11);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.mockito.internal.matchers.Equality equality16 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass17 = equality16.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass15, (java.lang.Object) wildcardClass17);
        boolean boolean19 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass15);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) wildcardClass15);
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality7, (java.lang.Object) boolean20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass1, (java.lang.Object) boolean20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) 1, (java.lang.Object) equality3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass5 = equality1.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 1, (java.lang.Object) wildcardClass5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) equality10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass9);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) 'a');
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) 1, (java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) 'a');
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass8);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) (short) 0);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean16, (java.lang.Object) 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) boolean3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (-1L), (java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) equality10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass9);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) 'a');
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass9);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) (short) 0);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10.0d, obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 1L, (java.lang.Object) boolean5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) ' ', (java.lang.Object) boolean4);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean5, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass8);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass14 = equality13.getClass();
        org.mockito.internal.matchers.Equality equality15 = new org.mockito.internal.matchers.Equality();
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass14, (java.lang.Object) equality15);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass14);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass14, (java.lang.Object) 'a');
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass14);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) (short) 0);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        boolean boolean25 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, obj23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass4, (java.lang.Object) boolean25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 10L, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Class<?> wildcardClass2 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) equality5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass11 = equality10.getClass();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) wildcardClass11);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass9);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass9);
        org.mockito.internal.matchers.Equality equality16 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj17 = null;
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality16, obj17);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality16);
        java.lang.Class<?> wildcardClass20 = equality16.getClass();
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) equality10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass9);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) 'a');
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 0, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) 'a');
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass8);
        org.mockito.internal.matchers.Equality equality15 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass16 = equality15.getClass();
        boolean boolean17 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass16);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean14, (java.lang.Object) boolean17);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean9, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100.0f, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) equality7);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.mockito.internal.matchers.Equality equality12 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass13 = equality12.getClass();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass11, (java.lang.Object) wildcardClass13);
        boolean boolean15 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass11);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass11);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality3, (java.lang.Object) boolean16);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) false, (java.lang.Object) boolean16);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean5, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        java.lang.Class<?> wildcardClass5 = equality3.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean6, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj2, (java.lang.Object) boolean4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) boolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean2, (java.lang.Object) equality3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) -1, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) equality5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) boolean6);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean6, (java.lang.Object) wildcardClass9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass10 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality12 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass13 = equality12.getClass();
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, (java.lang.Object) equality14);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, (java.lang.Object) (short) -1);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1), (java.lang.Object) wildcardClass13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass10, (java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) 'a');
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass8);
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass8, obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) 'a');
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass8);
        org.mockito.internal.matchers.Equality equality15 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass16 = equality15.getClass();
        org.mockito.internal.matchers.Equality equality17 = new org.mockito.internal.matchers.Equality();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass16, (java.lang.Object) equality17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass7);
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj15 = null;
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality14, obj15);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality14);
        java.lang.Class<?> wildcardClass18 = equality14.getClass();
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1.0f), (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass5 = equality4.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) equality10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass9);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.mockito.internal.matchers.Equality equality15 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass16 = equality15.getClass();
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass14, (java.lang.Object) wildcardClass16);
        boolean boolean18 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass14);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) wildcardClass14);
        boolean boolean20 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) boolean20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) 'a');
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass8);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) (short) 0);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, obj17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean19, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality6);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) equality10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality6, (java.lang.Object) boolean11);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean11, (java.lang.Object) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean5, (java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) false, (java.lang.Object) boolean2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) equality8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass14 = equality13.getClass();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass12, (java.lang.Object) wildcardClass14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass12);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass12);
        boolean boolean18 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass12);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean4, (java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) 'a');
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality9);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality9, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass13 = equality9.getClass();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 1, (java.lang.Object) wildcardClass13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 'a', (java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) -1, (java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1.0d), (java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) equality10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass9);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) 'a');
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass9);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) (short) 0);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, obj18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (-1L), (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, (java.lang.Object) equality4);
        java.lang.Class<?> wildcardClass8 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass10 = equality9.getClass();
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) equality11);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.mockito.internal.matchers.Equality equality16 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass17 = equality16.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass15, (java.lang.Object) wildcardClass17);
        boolean boolean19 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass15);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) wildcardClass15);
        boolean boolean21 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, (java.lang.Object) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean22, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass4 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) equality8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) 'a');
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, (java.lang.Object) wildcardClass7);
        java.lang.Object obj14 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass7, obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1.0f), (java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass10 = equality9.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass8);
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, (java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality5);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality5, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass9 = equality5.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass3, (java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1), (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) (short) -1);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10L, (java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) -1, obj1);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj5 = null;
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality4, obj5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality4);
        java.lang.Class<?> wildcardClass8 = equality4.getClass();
        java.lang.Object obj9 = null;
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, obj9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj1, obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass5 = equality1.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass10 = equality9.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass5 = equality1.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 1, (java.lang.Object) wildcardClass5);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass12 = equality11.getClass();
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass12, (java.lang.Object) equality13);
        boolean boolean15 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass12);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.mockito.internal.matchers.Equality equality18 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass19 = equality18.getClass();
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass17, (java.lang.Object) wildcardClass19);
        boolean boolean21 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass17);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass12, (java.lang.Object) wildcardClass17);
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality9, (java.lang.Object) boolean22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean6, (java.lang.Object) equality9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass7);
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj15 = null;
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality14, obj15);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality14);
        java.lang.Class<?> wildcardClass18 = equality14.getClass();
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass18);
        org.mockito.internal.matchers.Equality equality20 = new org.mockito.internal.matchers.Equality();
        boolean boolean21 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality20);
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality20, (java.lang.Object) '#');
        boolean boolean24 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass18, (java.lang.Object) equality20);
        boolean boolean25 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100.0f, (java.lang.Object) equality20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) equality10);
        org.mockito.internal.matchers.Equality equality12 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass13 = equality12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) equality10, (java.lang.Object) equality12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) (short) 100);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 100, (java.lang.Object) '4');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass5 = equality4.getClass();
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) equality6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass5);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass12 = equality11.getClass();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) wildcardClass12);
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass10);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, (java.lang.Object) boolean15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean16, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) 'a');
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean14, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 0, (java.lang.Object) equality1);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass12 = equality11.getClass();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) wildcardClass12);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass10);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean5, (java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Class<?> wildcardClass2 = equality0.getClass();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) equality10);
        java.lang.Class<?> wildcardClass12 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass15 = equality14.getClass();
        org.mockito.internal.matchers.Equality equality16 = new org.mockito.internal.matchers.Equality();
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass15, (java.lang.Object) equality16);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass12, (java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj14 = null;
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality13, obj14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality13);
        java.lang.Class<?> wildcardClass17 = equality13.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass17);
        org.mockito.internal.matchers.Equality equality19 = new org.mockito.internal.matchers.Equality();
        boolean boolean20 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality19);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality19, (java.lang.Object) '#');
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass17, (java.lang.Object) equality19);
        java.lang.Class<?> wildcardClass24 = equality19.getClass();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.mockito.internal.matchers.Equality equality27 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass28 = equality27.getClass();
        boolean boolean29 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass26, (java.lang.Object) wildcardClass28);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality19, (java.lang.Object) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean5, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) equality5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass11 = equality10.getClass();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) wildcardClass11);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass9);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass9);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality0, (java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj14 = null;
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality13, obj14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality13);
        java.lang.Class<?> wildcardClass17 = equality13.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass17);
        org.mockito.internal.matchers.Equality equality20 = new org.mockito.internal.matchers.Equality();
        boolean boolean21 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality20);
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality20, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass24 = equality20.getClass();
        boolean boolean25 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 1, (java.lang.Object) wildcardClass24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass17, (java.lang.Object) boolean25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass5 = equality4.getClass();
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) equality6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass5);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass12 = equality11.getClass();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) wildcardClass12);
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass10);
        boolean boolean16 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality1);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean2, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        java.lang.Class<?> wildcardClass5 = equality3.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 100, (java.lang.Object) equality3);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass5 = equality4.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) (short) -1);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) ' ');
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 1.0d, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) boolean9);
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) -1, obj12);
        java.lang.Class<?> wildcardClass14 = obj12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj3, (java.lang.Object) wildcardClass5);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj1, obj3);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        org.mockito.internal.matchers.Equality equality15 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass16 = equality15.getClass();
        org.mockito.internal.matchers.Equality equality17 = new org.mockito.internal.matchers.Equality();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass16, (java.lang.Object) equality17);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass16);
        org.mockito.internal.matchers.Equality equality21 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass22 = equality21.getClass();
        org.mockito.internal.matchers.Equality equality23 = new org.mockito.internal.matchers.Equality();
        boolean boolean24 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass22, (java.lang.Object) equality23);
        boolean boolean25 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass22);
        boolean boolean27 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass22, (java.lang.Object) 'a');
        boolean boolean28 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass16, (java.lang.Object) wildcardClass22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean13, (java.lang.Object) boolean28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }
}

