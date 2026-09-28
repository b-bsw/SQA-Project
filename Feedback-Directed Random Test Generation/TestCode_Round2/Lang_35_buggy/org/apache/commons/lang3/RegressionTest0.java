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
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (-1), (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (int) (byte) 1, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        char[] charArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray0, 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.lang3.ArrayUtils arrayUtils0 = new org.apache.commons.lang3.ArrayUtils();
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.lang3.ArrayUtils arrayUtils0 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils1 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils2 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils3 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils4 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray5 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils0, arrayUtils1, arrayUtils2, arrayUtils3, arrayUtils4 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray7 = org.apache.commons.lang3.ArrayUtils.remove(arrayUtilsArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayUtilsArray5);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray4 = org.apache.commons.lang3.ArrayUtils.remove(charArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertArrayEquals(booleanArray1, new java.lang.Boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] { false });
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray7 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[][] booleanArray8 = new java.lang.Boolean[][] { booleanArray3, booleanArray7 };
        java.lang.Boolean[] booleanArray11 = new java.lang.Boolean[] { false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean[][] booleanArray12 = org.apache.commons.lang3.ArrayUtils.add(booleanArray8, (int) (short) 100, booleanArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertArrayEquals(booleanArray3, new java.lang.Boolean[] { true, true, false });
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertArrayEquals(booleanArray7, new java.lang.Boolean[] { true, true, false });
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertArrayEquals(booleanArray11, new java.lang.Boolean[] { false });
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) false, (java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int[] intArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(intArray0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = org.apache.commons.lang3.ArrayUtils.remove(intArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        short[] shortArray2 = new short[] { (short) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.remove(shortArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) 10, (short) -1 });
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.Object[] objArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(objArray0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = org.apache.commons.lang3.ArrayUtils.remove(intArray9, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int[] intArray6 = new int[] { (-1) };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, 100, 0);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, 0, (int) (byte) 1);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray6, (int) ' ');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray1, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = org.apache.commons.lang3.ArrayUtils.add(intArray1, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        float[] floatArray4 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray9 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray9, (int) (byte) 10, 100);
        float[] floatArray16 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray12, floatArray16);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray12);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray18);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.remove(floatArray18, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ArrayUtils.toString(obj0, "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        double[] doubleArray0 = null;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        float[] floatArray4 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray9 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray9, (int) (byte) 10, 100);
        float[] floatArray16 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray12, floatArray16);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray12);
        float[] floatArray23 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray23, (int) (byte) 10, 100);
        float[] floatArray30 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray26, floatArray30);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray12, floatArray26);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray12);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        double[] doubleArray4 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, 1.0d, (int) 'a', (double) (-1));
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = org.apache.commons.lang3.ArrayUtils.remove(intArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        int[] intArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        char[] charArray4 = new char[] { '#', ' ', '#', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 1, '#');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 0, '4');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray4, (int) (byte) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '#', ' ', '#', '#' });
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.Character[][] charArray0 = null;
        java.lang.Character[][] charArray1 = org.apache.commons.lang3.ArrayUtils.toArray(charArray0);
        org.junit.Assert.assertNull(charArray1);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        boolean[] booleanArray0 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.Byte[] byteArray1 = new java.lang.Byte[] { (byte) -1 };
        java.lang.Byte[][] byteArray2 = new java.lang.Byte[][] { byteArray1 };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray2);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new java.lang.Byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        float[] floatArray11 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray7, floatArray11);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, (int) '#', 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.Character[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, '#');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (-1), (int) '#', 0.0d);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) ' ', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (int) (byte) 1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 6, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        float[] floatArray2 = new float[] { (-1.0f), 100.0f };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray2);
        float[] floatArray8 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray13 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray13, (int) (byte) 10, 100);
        float[] floatArray20 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray16, floatArray20);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray8, floatArray16);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray22);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.clone(floatArray22);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray24);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.remove(floatArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new float[] { (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { (-1.0f), 100.0f, 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.Object obj0 = null;
        int int1 = org.apache.commons.lang3.ArrayUtils.getLength(obj0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) int11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 10, 2 };
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) intArray3, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 100, 10, 2 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10, 2 });
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 1L };
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray5 = org.apache.commons.lang3.ArrayUtils.remove(longArray3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new java.lang.Long[] { 1L, 1L });
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertArrayEquals(longArray3, new long[] { 1L, 1L });
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        int int0 = org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        float[] floatArray0 = null;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.clone(floatArray0);
        org.junit.Assert.assertNull(floatArray1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 0, 5 };
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = org.apache.commons.lang3.ArrayUtils.add(intArray4, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 1, 0, 5 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 5 });
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.Character[] charArray0 = new java.lang.Character[] {};
        java.lang.Character[] charArray1 = new java.lang.Character[] {};
        java.lang.Character[][] charArray2 = new java.lang.Character[][] { charArray0, charArray1 };
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character[][] charArray6 = org.apache.commons.lang3.ArrayUtils.add(charArray2, 5, charArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new java.lang.Character[] { '#' });
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        char[][] charArray0 = null;
        char[][] charArray1 = org.apache.commons.lang3.ArrayUtils.toArray(charArray0);
        org.junit.Assert.assertNull(charArray1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray7, (byte) 1, (int) (byte) 1);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray7, (-1), (int) (short) 10);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 100);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray7, (int) (byte) 1, 100);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) 10.0f, (java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.toObject(charArray2);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray2);
        char[] charArray10 = new char[] { '#', ' ', '#', '#' };
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray10, 1, '#');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.add(charArray10, 'a');
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.subarray(charArray10, (int) ' ', (int) (byte) 10);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray2, charArray18);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray22 = org.apache.commons.lang3.ArrayUtils.add(charArray2, 100, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, (long) 4);
        long[] longArray17 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray17, 100L);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray17, 4, 100L);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray10, longArray22);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray25 = org.apache.commons.lang3.ArrayUtils.remove(longArray23, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 13");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { 32L, 10L, 0L, (-1L), 100L, 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L), 32L, 10L, 0L, (-1L), 100L, 32L, (-1L) });
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) 0);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray2, (short) (byte) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.remove(shortArray2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.Integer[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 4);
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        byte[] byteArray0 = null;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        char[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = org.apache.commons.lang3.ArrayUtils.remove(charArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) '4', (int) (short) -1);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        short[] shortArray0 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.remove(shortArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.remove(byteArray4, 2);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray4, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str12 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) (byte) 1, "{true,true,true,true,false,true,false,false,true,false,true}");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new java.lang.Byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        long[] longArray6 = new long[] { (byte) 100, 0L, (short) -1, (-1L), (short) 0, '#' };
        long[] longArray13 = new long[] { (byte) 100, 0L, (short) -1, (-1L), (short) 0, '#' };
        long[] longArray20 = new long[] { (byte) 100, 0L, (short) -1, (-1L), (short) 0, '#' };
        long[] longArray27 = new long[] { (byte) 100, 0L, (short) -1, (-1L), (short) 0, '#' };
        long[][] longArray28 = new long[][] { longArray6, longArray13, longArray20, longArray27 };
        long[] longArray36 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray36, 100L);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray36, (long) 4);
        // The following exception was thrown during execution in test generation
        try {
            long[][] longArray41 = org.apache.commons.lang3.ArrayUtils.add(longArray28, 100, longArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 100L, 0L, (-1L), (-1L), 0L, 35L });
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 100L, 0L, (-1L), (-1L), 0L, 35L });
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 100L, 0L, (-1L), (-1L), 0L, 35L });
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 100L, 0L, (-1L), (-1L), 0L, 35L });
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertArrayEquals(longArray36, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertArrayEquals(longArray40, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        char[] charArray1 = new char[] { '#' };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray5 = org.apache.commons.lang3.ArrayUtils.remove(charArray1, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        float[] floatArray2 = new float[] { (-1.0f), 100.0f };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray2);
        java.lang.Float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray2);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (short) 1, (float) (byte) -1);
        java.lang.String str8 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new float[] { (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new java.lang.Float[] { (-1.0f), 100.0f });
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { (-1.0f), (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) -1 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap4 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) shortArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '-1', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new java.lang.Short[] { (short) -1 });
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] { (short) -1 });
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        double[] doubleArray4 = new double[] { 10.0f, 100.0f, (short) 10, (-1) };
        double[] doubleArray9 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray10 = new double[] {};
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray9, doubleArray10);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, 1.0d, (int) 'a', (double) (-1));
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray10);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray10);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1, true);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray3, true);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray3, true, (int) (byte) 10);
        boolean[] booleanArray14 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray21 = new boolean[] { true, false, false, true, false, true };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray14, booleanArray21);
        boolean[] booleanArray28 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray35 = new boolean[] { true, false, false, true, false, true };
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray28, booleanArray35);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray14, booleanArray35);
        boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray3, booleanArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray38, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertArrayEquals(booleanArray1, new java.lang.Boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] { false });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray35);
        assertBooleanArrayEquals(booleanArray35, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(booleanArray37);
        assertBooleanArrayEquals(booleanArray37, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray38);
        assertBooleanArrayEquals(booleanArray38, new boolean[] { false, true, true, true, true, false });
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray1, (byte) 0, (int) (short) 0);
        java.lang.String str6 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) int4, "hi!");
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new java.lang.Byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        int[] intArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        float[] floatArray12 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray17 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray17, (int) (byte) 10, 100);
        float[] floatArray24 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray20, floatArray24);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray12, floatArray20);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray7, floatArray20);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray20, (float) '4');
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.add(floatArray20, (float) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.remove(floatArray20, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertArrayEquals(floatArray29, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertArrayEquals(floatArray31, new float[] { 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, false };
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { true, false };
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { true, false };
        java.lang.Boolean[] booleanArray11 = new java.lang.Boolean[] { true, false };
        java.lang.Boolean[] booleanArray14 = new java.lang.Boolean[] { true, false };
        java.lang.Boolean[][] booleanArray15 = new java.lang.Boolean[][] { booleanArray2, booleanArray5, booleanArray8, booleanArray11, booleanArray14 };
        java.lang.Boolean[][] booleanArray18 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray15, 3, (int) 'a');
        java.lang.String[] strArray20 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][] objArray22 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Object[][]) booleanArray15, 6, (java.lang.Object[]) strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertArrayEquals(booleanArray2, new java.lang.Boolean[] { true, false });
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertArrayEquals(booleanArray5, new java.lang.Boolean[] { true, false });
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertArrayEquals(booleanArray8, new java.lang.Boolean[] { true, false });
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertArrayEquals(booleanArray11, new java.lang.Boolean[] { true, false });
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertArrayEquals(booleanArray14, new java.lang.Boolean[] { true, false });
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        boolean[] booleanArray19 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray26 = new boolean[] { true, false, false, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray26);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray30);
        assertBooleanArrayEquals(booleanArray30, new boolean[] { true, true, true, false });
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        short[] shortArray4 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray4, (short) 0, 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray4, (short) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.remove(shortArray4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) 0, (short) 0, (short) 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.lang.Byte[] byteArray3 = new java.lang.Byte[] { (byte) 0, (byte) 1, (byte) 100 };
        java.lang.Byte[][] byteArray4 = new java.lang.Byte[][] { byteArray3 };
        java.lang.Byte[][] byteArray5 = org.apache.commons.lang3.ArrayUtils.toArray(byteArray4);
        float[] floatArray8 = new float[] { (-1.0f), 100.0f };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray8);
        float[] floatArray14 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray19 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray19, (int) (byte) 10, 100);
        float[] floatArray26 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray22, floatArray26);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray14, floatArray22);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray28);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.clone(floatArray28);
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray8, floatArray30);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray30, (int) (short) 10, (int) (short) 10);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray34, (float) (short) 0, (int) (short) 0);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray5, (java.lang.Object) int37, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new java.lang.Byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new float[] { (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertArrayEquals(floatArray31, new float[] { (-1.0f), 100.0f, 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertArrayEquals(floatArray34, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.remove(byteArray4, 2);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray4, 100, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new java.lang.Byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) 1 });
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 10L, 10L, 0L, 1L };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray5);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray7, (double) (short) 1);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray9, (double) (short) 0);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) 3, 100.0d);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) longArray5, (java.lang.Object) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap16 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) longArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '100', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new java.lang.Long[] { 100L, 10L, 10L, 0L, 1L });
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 100L, 10L, 10L, 0L, 1L });
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, (long) 4);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray6, (int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray16 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (-1), (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] {});
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        char[] charArray1 = new char[] { '#' };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray1, 'a');
        char[] charArray8 = new char[] { '#', ' ', '#', '#' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 1, '#');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.addAll(charArray1, charArray8);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray14, 'a');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1, true);
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5, true);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[] serializableArray8 = org.apache.commons.lang3.ArrayUtils.add((java.io.Serializable[]) booleanArray1, (java.io.Serializable) booleanArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: [Z");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertArrayEquals(booleanArray1, new java.lang.Boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertArrayEquals(booleanArray5, new java.lang.Boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray7);
        assertBooleanArrayEquals(booleanArray7, new boolean[] { false });
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray12, true);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray12, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, false, false, true, false, true });
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        short[] shortArray5 = new short[] { (byte) 100, (byte) -1, (short) 10, (short) 10, (short) -1 };
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap7 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) shortArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '100', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new java.lang.Short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        float[] floatArray4 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray9 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray9, (int) (byte) 10, 100);
        float[] floatArray16 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray12, floatArray16);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray12);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray18);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.remove(floatArray18, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (short) 1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.add(doubleArray2, (double) (short) 0);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray4, (double) ' ');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray4, (double) (-1L), (double) 2);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        double[] doubleArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray0);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.add(longArray6, 4, 100L);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.subarray(longArray6, 100, (int) (short) 0);
        java.lang.Long[] longArray15 = org.apache.commons.lang3.ArrayUtils.toObject(longArray14);
        java.lang.Class<?> wildcardClass16 = longArray15.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 32L, 10L, 0L, (-1L), 100L, 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] {});
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new java.lang.Long[] {});
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class[] classArray10 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        java.lang.Class[] classArray16 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        java.lang.Class[][] classArray19 = new java.lang.Class[6][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray20 = (java.lang.Class<?>[][]) classArray19;
        wildcardClassArray20[0] = classArray1;
        wildcardClassArray20[1] = wildcardClassArray5;
        wildcardClassArray20[2] = classArray7;
        wildcardClassArray20[3] = classArray10;
        wildcardClassArray20[4] = classArray13;
        wildcardClassArray20[5] = wildcardClassArray17;
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isEmpty(wildcardClassArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap34 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) wildcardClassArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '[Ljava.lang.Class;@79315ef', has a length less than 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertArrayEquals(classArray1, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertArrayEquals(wildcardClassArray2, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertArrayEquals(classArray4, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertArrayEquals(wildcardClassArray5, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertArrayEquals(classArray7, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertArrayEquals(wildcardClassArray8, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertArrayEquals(classArray10, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertArrayEquals(wildcardClassArray11, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertArrayEquals(classArray13, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertArrayEquals(wildcardClassArray14, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertArrayEquals(classArray16, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertArrayEquals(wildcardClassArray17, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 0 };
        java.lang.Byte[] byteArray11 = new java.lang.Byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 0 };
        java.lang.Byte[] byteArray17 = new java.lang.Byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 0 };
        java.lang.Byte[] byteArray23 = new java.lang.Byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 0 };
        java.lang.Byte[][] byteArray24 = new java.lang.Byte[][] { byteArray5, byteArray11, byteArray17, byteArray23 };
        java.lang.Byte[][][] byteArray25 = new java.lang.Byte[][][] { byteArray24 };
        java.lang.Byte[] byteArray30 = new java.lang.Byte[] { (byte) 0, (byte) 1, (byte) 100 };
        java.lang.Byte[][] byteArray31 = new java.lang.Byte[][] { byteArray30 };
        java.lang.Byte[][] byteArray32 = org.apache.commons.lang3.ArrayUtils.toArray(byteArray31);
        float[] floatArray37 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray42 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray45 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray42, (int) (byte) 10, 100);
        float[] floatArray49 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray45, floatArray49);
        float[] floatArray51 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray37, floatArray45);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray32, (java.lang.Object) floatArray37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte[][][] byteArray53 = org.apache.commons.lang3.ArrayUtils.add(byteArray25, (int) 'a', byteArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new java.lang.Byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new java.lang.Byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new java.lang.Byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new java.lang.Byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new java.lang.Byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertArrayEquals(floatArray37, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertArrayEquals(floatArray42, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertArrayEquals(floatArray45, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertArrayEquals(floatArray49, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertArrayEquals(floatArray51, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        float[] floatArray12 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray17 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray17, (int) (byte) 10, 100);
        float[] floatArray24 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray20, floatArray24);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray12, floatArray20);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray7, floatArray20);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray20, (float) ' ', (int) '4');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1, true);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray3, true);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray3, true, (int) (byte) 10);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray3, false);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertArrayEquals(booleanArray1, new java.lang.Boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] { false });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray12, false);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray12, false);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.add(booleanArray12, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] { true, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        double[] doubleArray4 = new double[] { 10.0f, 100.0f, (short) 10, (-1) };
        double[] doubleArray9 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray10 = new double[] {};
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray9, doubleArray10);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, 1.0d, (int) 'a', (double) (-1));
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray10);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.add(doubleArray10, 2, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 0);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray7, (float) 100L, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 10L, 10L, 0L, 1L };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray5);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) longArray5);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray5, (long) 5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new java.lang.Long[] { 1L, 0L, 10L, 10L, 100L });
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 100L, 10L, 10L, 0L, 1L });
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertArrayEquals(longArray9, new long[] { 1L, 0L, 10L, 10L, 100L });
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4, 'a');
        char[] charArray8 = new char[] { '#' };
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, 'a');
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray4, (java.lang.Object) int10);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.subarray(charArray12, 3, (int) (short) -1);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray12, '#');
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.addAll(charArray2, charArray12);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray2, '4', (-1));
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        char[] charArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray0, '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray12, (int) 'a', 10);
        java.lang.Byte[] byteArray22 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray22);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.add(byteArray23, (byte) 1);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray23);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray26, 0, 5);
        java.lang.Byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray26);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new java.lang.Byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        long[] longArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        short[] shortArray4 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray4, (short) 0, 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray4, (short) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray4, (int) '4', (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) 0, (short) 0, (short) 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (byte) 1, 100);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        float[] floatArray1 = new float[] { 1 };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, 4, (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] { 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        char[] charArray4 = new char[] { '#', ' ', '#', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 1, '#');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 'a');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.clone(charArray9);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray11, '#');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        char[] charArray4 = new char[] { '#', ' ', '#', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 1, '#');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(charArray7, '4');
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, ' ');
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a');
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray14, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray16);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray7, charArray16);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray20 = org.apache.commons.lang3.ArrayUtils.remove(charArray7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        float[] floatArray2 = new float[] { (-1.0f), 100.0f };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray2);
        float[] floatArray8 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray13 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray13, (int) (byte) 10, 100);
        float[] floatArray20 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray16, floatArray20);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray8, floatArray16);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray22);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.clone(floatArray22);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray24);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray25, (float) 1L, 4);
        java.lang.Object obj29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) floatArray25, obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new float[] { (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { (-1.0f), 100.0f, 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray1);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(intArray1, (int) (short) 100);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 4, 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(intArray1, 5);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        byte[][] byteArray0 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray8, (byte) 1, (int) (byte) 1);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray8, (-1), (int) (short) 10);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.remove(byteArray8, 0);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.remove(byteArray16, 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[][] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, (int) '4', byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, (long) 4);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray6, (int) (short) 0, (-1));
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, (-1L));
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.subarray(longArray6, (int) '#', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray21 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (int) (short) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] {});
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        boolean[] booleanArray19 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray26 = new boolean[] { true, false, false, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray26);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray30);
        assertBooleanArrayEquals(booleanArray30, new boolean[] { true, true, true, false });
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 0);
        java.lang.Byte[] byteArray13 = new java.lang.Byte[] { (byte) 0, (byte) 1, (byte) 100 };
        java.lang.Byte[][] byteArray14 = new java.lang.Byte[][] { byteArray13 };
        java.lang.Byte[][] byteArray15 = org.apache.commons.lang3.ArrayUtils.toArray(byteArray14);
        float[] floatArray20 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray25 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray25, (int) (byte) 10, 100);
        float[] floatArray32 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray28, floatArray32);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray20, floatArray28);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray15, (java.lang.Object) floatArray20);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray7, floatArray20);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.contains(floatArray36, (float) 'a');
        java.lang.Float[] floatArray39 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray36);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new java.lang.Byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertArrayEquals(floatArray32, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertArrayEquals(floatArray34, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertArrayEquals(floatArray36, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertArrayEquals(floatArray39, new java.lang.Float[] { 2.0f, 10.0f, 97.0f, 2.0f });
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        boolean[] booleanArray19 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray26 = new boolean[] { true, false, false, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray26);
        boolean[] booleanArray34 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray41 = new boolean[] { true, false, false, true, false, true };
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray34, booleanArray41);
        boolean[] booleanArray48 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray55 = new boolean[] { true, false, false, true, false, true };
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray48, booleanArray55);
        boolean[] booleanArray57 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray34, booleanArray55);
        boolean[] booleanArray59 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray34, (int) (short) 1);
        boolean[] booleanArray60 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray59);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray26, booleanArray60);
        boolean[] booleanArray67 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray74 = new boolean[] { true, false, false, true, false, true };
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray67, booleanArray74);
        boolean[] booleanArray81 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray88 = new boolean[] { true, false, false, true, false, true };
        boolean boolean89 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray81, booleanArray88);
        boolean[] booleanArray90 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray67, booleanArray88);
        boolean[] booleanArray92 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray67, (int) (short) 1);
        boolean[] booleanArray93 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray92);
        boolean boolean94 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray93);
        boolean[] booleanArray95 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray60, booleanArray93);
        java.lang.String str97 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray60, "{}");
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray34);
        assertBooleanArrayEquals(booleanArray34, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray41);
        assertBooleanArrayEquals(booleanArray41, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(booleanArray48);
        assertBooleanArrayEquals(booleanArray48, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray55);
        assertBooleanArrayEquals(booleanArray55, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(booleanArray57);
        assertBooleanArrayEquals(booleanArray57, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray59);
        assertBooleanArrayEquals(booleanArray59, new boolean[] { true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray60);
        assertBooleanArrayEquals(booleanArray60, new boolean[] { true, true, true, false });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(booleanArray67);
        assertBooleanArrayEquals(booleanArray67, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray74);
        assertBooleanArrayEquals(booleanArray74, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(booleanArray81);
        assertBooleanArrayEquals(booleanArray81, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray88);
        assertBooleanArrayEquals(booleanArray88, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(booleanArray90);
        assertBooleanArrayEquals(booleanArray90, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray92);
        assertBooleanArrayEquals(booleanArray92, new boolean[] { true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray93);
        assertBooleanArrayEquals(booleanArray93, new boolean[] { true, true, true, false });
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(booleanArray95);
        assertBooleanArrayEquals(booleanArray95, new boolean[] { true, true, true, false, true, true, true, false });
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "{true,true,true,false}" + "'", str97, "{true,true,true,false}");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        double[][][] doubleArray0 = null;
        double[][][] doubleArray1 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        long[] longArray0 = null;
        long[] longArray7 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray7, 100L);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(longArray7, (long) ' ');
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray7, (-1L));
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray0, longArray13);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L), (-1L) });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int[] intArray6 = new int[] { (-1) };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, 100, 0);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, 0, (int) (byte) 1);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray6, (int) ' ');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray1, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = org.apache.commons.lang3.ArrayUtils.remove(intArray14, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = org.apache.commons.lang3.ArrayUtils.add(intArray1, (int) ' ', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        double[] doubleArray4 = new double[] { 10.0f, 100.0f, (short) 10, (-1) };
        double[] doubleArray9 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray10 = new double[] {};
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray9, doubleArray10);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, 1.0d, (int) 'a', (double) (-1));
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray10);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray10);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.add(doubleArray10, (double) 6);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.add(doubleArray10, (int) (byte) 1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 6.0d }, 1.0E-15);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        long[] longArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(longArray0);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        boolean[] booleanArray19 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray26 = new boolean[] { true, false, false, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray33 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray40 = new boolean[] { true, false, false, true, false, true };
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray33, booleanArray40);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray19, booleanArray40);
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray42);
        boolean[] booleanArray49 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray56 = new boolean[] { true, false, false, true, false, true };
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray49, booleanArray56);
        boolean[] booleanArray63 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray70 = new boolean[] { true, false, false, true, false, true };
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray63, booleanArray70);
        boolean[] booleanArray72 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray49, booleanArray70);
        boolean[] booleanArray74 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray49, (int) (short) 1);
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray43, booleanArray74);
        boolean boolean76 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray43);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray33);
        assertBooleanArrayEquals(booleanArray33, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray40);
        assertBooleanArrayEquals(booleanArray40, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(booleanArray42);
        assertBooleanArrayEquals(booleanArray42, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray43);
        assertBooleanArrayEquals(booleanArray43, new boolean[] { true, true, true, true, false, true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray49);
        assertBooleanArrayEquals(booleanArray49, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray56);
        assertBooleanArrayEquals(booleanArray56, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(booleanArray63);
        assertBooleanArrayEquals(booleanArray63, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray70);
        assertBooleanArrayEquals(booleanArray70, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(booleanArray72);
        assertBooleanArrayEquals(booleanArray72, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray74);
        assertBooleanArrayEquals(booleanArray74, new boolean[] { true, true, true, false });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.Long[] longArray0 = null;
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        org.junit.Assert.assertNull(longArray1);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        char[] charArray3 = new char[] { 'a', 'a', '4' };
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(charArray3, 'a');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { 'a', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        float[] floatArray12 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray17 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray17, (int) (byte) 10, 100);
        float[] floatArray24 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray20, floatArray24);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray12, floatArray20);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray7, floatArray20);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray20, (float) '4');
        java.lang.Float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray29);
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray30, (float) 2);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray32);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertArrayEquals(floatArray29, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new java.lang.Float[] {});
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertArrayEquals(floatArray32, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        byte[] byteArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        boolean[] booleanArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray9);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (byte) 1, 100);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.Byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray22);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.remove(byteArray22, 2);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray17, byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.remove(byteArray17, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new java.lang.Byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        double[] doubleArray4 = new double[] { 10.0f, 100.0f, (short) 10, (-1) };
        double[] doubleArray9 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray10 = new double[] {};
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray9, doubleArray10);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, 1.0d, (int) 'a', (double) (-1));
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray10);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray10);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray18, (double) (short) 1);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.add(doubleArray20, (double) (short) 0);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray20, 0.0d, (int) '#', (-1.0d));
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray10, doubleArray20);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, 10.0d, (-1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) 0);
        java.lang.String str4 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) shortArray2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.add(shortArray2, 3, (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0);
        boolean[] booleanArray7 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray14 = new boolean[] { true, false, false, true, false, true };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray7, booleanArray14);
        boolean[] booleanArray21 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray28 = new boolean[] { true, false, false, true, false, true };
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray21, booleanArray28);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray7, booleanArray28);
        boolean[] booleanArray36 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray43 = new boolean[] { true, false, false, true, false, true };
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray36, booleanArray43);
        boolean[] booleanArray50 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray57 = new boolean[] { true, false, false, true, false, true };
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray50, booleanArray57);
        boolean[] booleanArray59 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray36, booleanArray57);
        boolean[] booleanArray61 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray36, (int) (short) 1);
        boolean[] booleanArray62 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray61);
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray28, booleanArray62);
        boolean[] booleanArray69 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray76 = new boolean[] { true, false, false, true, false, true };
        boolean boolean77 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray69, booleanArray76);
        boolean[] booleanArray83 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray90 = new boolean[] { true, false, false, true, false, true };
        boolean boolean91 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray83, booleanArray90);
        boolean[] booleanArray92 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray69, booleanArray90);
        boolean[] booleanArray94 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray69, (int) (short) 1);
        boolean[] booleanArray95 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray94);
        boolean boolean96 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray95);
        boolean[] booleanArray97 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray62, booleanArray95);
        int int99 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray0, (java.lang.Object) booleanArray62, (int) '#');
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new java.lang.Byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(booleanArray7);
        assertBooleanArrayEquals(booleanArray7, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanArray30);
        assertBooleanArrayEquals(booleanArray30, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray36);
        assertBooleanArrayEquals(booleanArray36, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray43);
        assertBooleanArrayEquals(booleanArray43, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(booleanArray50);
        assertBooleanArrayEquals(booleanArray50, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray57);
        assertBooleanArrayEquals(booleanArray57, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(booleanArray59);
        assertBooleanArrayEquals(booleanArray59, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray61);
        assertBooleanArrayEquals(booleanArray61, new boolean[] { true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray62);
        assertBooleanArrayEquals(booleanArray62, new boolean[] { true, true, true, false });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(booleanArray69);
        assertBooleanArrayEquals(booleanArray69, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray76);
        assertBooleanArrayEquals(booleanArray76, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(booleanArray83);
        assertBooleanArrayEquals(booleanArray83, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray90);
        assertBooleanArrayEquals(booleanArray90, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(booleanArray92);
        assertBooleanArrayEquals(booleanArray92, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray94);
        assertBooleanArrayEquals(booleanArray94, new boolean[] { true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray95);
        assertBooleanArrayEquals(booleanArray95, new boolean[] { true, true, true, false });
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(booleanArray97);
        assertBooleanArrayEquals(booleanArray97, new boolean[] { true, true, true, false, true, true, true, false });
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int[] intArray6 = new int[] { (-1) };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, 100, 0);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, 0, (int) (byte) 1);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray6, (int) ' ');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray1, intArray14);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(intArray1, (int) (byte) -1);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.subarray(intArray1, 6, (int) (short) 10);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = org.apache.commons.lang3.ArrayUtils.add(charArray2, 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        char[] charArray0 = null;
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.subarray(charArray0, (int) (byte) 1, 1);
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) 0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        boolean[] booleanArray19 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray26 = new boolean[] { true, false, false, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray26);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray5, (int) (short) 1);
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray30);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray31);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray31);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray31, false, 100);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray30);
        assertBooleanArrayEquals(booleanArray30, new boolean[] { true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray31);
        assertBooleanArrayEquals(booleanArray31, new boolean[] { true, true, true, false });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(booleanArray33);
        assertBooleanArrayEquals(booleanArray33, new boolean[] { true, true, true, false });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, false };
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { true, false };
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { true, false };
        java.lang.Boolean[] booleanArray11 = new java.lang.Boolean[] { true, false };
        java.lang.Boolean[] booleanArray14 = new java.lang.Boolean[] { true, false };
        java.lang.Boolean[][] booleanArray15 = new java.lang.Boolean[][] { booleanArray2, booleanArray5, booleanArray8, booleanArray11, booleanArray14 };
        java.lang.Boolean[][] booleanArray18 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray15, 3, (int) 'a');
        java.lang.Float[] floatArray21 = new java.lang.Float[] { 10.0f, 0.0f };
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray21);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray18, (java.lang.Object) floatArray22, (int) (byte) -1);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertArrayEquals(booleanArray2, new java.lang.Boolean[] { true, false });
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertArrayEquals(booleanArray5, new java.lang.Boolean[] { true, false });
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertArrayEquals(booleanArray8, new java.lang.Boolean[] { true, false });
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertArrayEquals(booleanArray11, new java.lang.Boolean[] { true, false });
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertArrayEquals(booleanArray14, new java.lang.Boolean[] { true, false });
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new java.lang.Float[] { 10.0f, 0.0f });
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 10.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4, 'a');
        char[] charArray8 = new char[] { '#' };
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, 'a');
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray4, (java.lang.Object) int10);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.subarray(charArray12, 3, (int) (short) -1);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray12, '#');
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.addAll(charArray2, charArray12);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 0, 5 };
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray4, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = org.apache.commons.lang3.ArrayUtils.remove(intArray4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 1, 0, 5 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 5 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, 0, 5 });
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.add(longArray6, 4, 100L);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray11);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray11, (long) 10);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { (-1L), 32L, 100L, (-1L), 0L, 10L, 32L });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        double[][][] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[] doubleArray14 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[] doubleArray21 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[] doubleArray28 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[] doubleArray35 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[][] doubleArray36 = new double[][] { doubleArray7, doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        double[][] doubleArray37 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray36);
        double[][][] doubleArray38 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, doubleArray36);
        double[] doubleArray43 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray44 = new double[] {};
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray43, doubleArray44);
        int int49 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray44, 1.0d, (int) 'a', (double) (-1));
        int int50 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray0, (java.lang.Object) 1.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        long[] longArray4 = new long[] { 0L, (short) -1, 10, 1 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, (long) (short) 0);
        long[] longArray11 = new long[] { 0L, (short) -1, 10, 1 };
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray11, (long) (short) 0);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray6, longArray11);
        int[] intArray16 = new int[] { (-1) };
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray16, 100, 0);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray16, 0, (int) (byte) 1);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray16, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray16);
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.add(intArray16, 3);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray16, 4);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) longArray11, (java.lang.Object) int29);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 0L, (-1L), 10L, 1L });
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { (-1L), 10L, 1L });
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 0L, (-1L), 10L, 1L });
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { (-1L), 10L, 1L });
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { (-1L), 10L, 1L, 0L, (-1L), 10L, 1L });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1), 3 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, (long) 4);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray6, (int) (short) 0, (-1));
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, 0L);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.remove(longArray15, 1);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) 1, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] {});
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 32L, 10L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 32L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray0, (long) 3);
        org.junit.Assert.assertNull(longArray2);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        long[] longArray4 = new long[] { 0L, (short) -1, 10, 1 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, (long) (short) 0);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.add(longArray4, (long) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray4, (long) 2);
        java.lang.String str12 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) int10, "");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 0L, (-1L), 10L, 1L });
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { (-1L), 10L, 1L });
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 0L, (-1L), 10L, 1L, 0L });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.lang.Float[] floatArray0 = new java.lang.Float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, (float) 3);
        float[] floatArray7 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray12 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray12, (int) (byte) 10, 100);
        float[] floatArray19 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray15, floatArray19);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray7, floatArray15);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray21);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.clone(floatArray21);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) floatArray0, (java.lang.Object) floatArray23);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        short[] shortArray31 = new short[] { (byte) 100, (byte) -1, (short) 10, (short) 10, (short) -1 };
        java.lang.Short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray31);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) floatArray0, (java.lang.Object[]) shortArray32);
        java.lang.String str35 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) boolean33, "hi!");
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertArrayEquals(floatArray0, new java.lang.Float[] {});
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray31, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray32, new java.lang.Short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "false" + "'", str35, "false");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray2, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = org.apache.commons.lang3.ArrayUtils.remove(charArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { 'a' });
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1, true);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray3, true);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertArrayEquals(booleanArray1, new java.lang.Boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] { false });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.clone(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        boolean[] booleanArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray0, false, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1, true);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1, false);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        java.lang.Boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray5, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertArrayEquals(booleanArray1, new java.lang.Boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { false });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertArrayEquals(booleanArray7, new java.lang.Boolean[] { false });
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) '4', 1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (-1), (int) '#', 0.0d);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray7);
        java.util.Map<java.lang.Object, java.lang.Object> objMap9 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray8);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray8, (double) 100);
        java.lang.Class<?> wildcardClass12 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(objMap9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 6, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, (-1) });
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        char[] charArray0 = null;
        char[] charArray1 = org.apache.commons.lang3.ArrayUtils.clone(charArray0);
        org.junit.Assert.assertNull(charArray1);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray2, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray2, (int) (byte) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { 'a' });
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) 0);
        java.lang.String str4 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) shortArray2, "hi!");
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(shortArray2, (short) (byte) -1);
        java.lang.String str8 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) boolean6, "1");
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false" + "'", str8, "false");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { false, false, false, false, true };
        java.lang.Boolean[][] booleanArray6 = new java.lang.Boolean[][] { booleanArray5 };
        java.lang.Boolean[] booleanArray12 = new java.lang.Boolean[] { false, false, false, false, true };
        java.lang.Boolean[][] booleanArray13 = new java.lang.Boolean[][] { booleanArray12 };
        java.lang.Boolean[] booleanArray19 = new java.lang.Boolean[] { false, false, false, false, true };
        java.lang.Boolean[][] booleanArray20 = new java.lang.Boolean[][] { booleanArray19 };
        java.lang.Boolean[][][] booleanArray21 = new java.lang.Boolean[][][] { booleanArray6, booleanArray13, booleanArray20 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean[][][] booleanArray23 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray21, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertArrayEquals(booleanArray5, new java.lang.Boolean[] { false, false, false, false, true });
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertArrayEquals(booleanArray12, new java.lang.Boolean[] { false, false, false, false, true });
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertArrayEquals(booleanArray19, new java.lang.Boolean[] { false, false, false, false, true });
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray21);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (-1), (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray0);
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) 0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] {});
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray12, true);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray12, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray2);
        char[] charArray6 = new char[] { ' ', ' ' };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray2, charArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, ' ', (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray1);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (byte) 1, 100);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.Byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray22);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.remove(byteArray22, 2);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray17, byteArray22);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray26, (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new java.lang.Byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.lang.String[] strArray4 = new java.lang.String[] { "{}", "", "{}", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "{}", "", "{}", "" };
        java.lang.String[][] strArray10 = new java.lang.String[][] { strArray4, strArray9 };
        java.lang.String[][] strArray13 = org.apache.commons.lang3.ArrayUtils.subarray(strArray10, 100, (int) (byte) 1);
        short[] shortArray17 = new short[] { (byte) 1, (short) 1, (short) 1 };
        short[] shortArray21 = new short[] { (byte) 1, (short) 1, (short) 1 };
        short[] shortArray25 = new short[] { (byte) 1, (short) 1, (short) 1 };
        short[][] shortArray26 = new short[][] { shortArray17, shortArray21, shortArray25 };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray26);
        java.lang.String[][] strArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(strArray13, (java.lang.Object) shortArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][] objArray30 = org.apache.commons.lang3.ArrayUtils.remove((java.lang.Object[][]) strArray13, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "{}", "", "{}", "" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "{}", "", "{}", "" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) 1, (short) 1, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] { (short) 1, (short) 1, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new short[] { (short) 1, (short) 1, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[][] {});
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        int[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, 1);
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, true, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        char[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = org.apache.commons.lang3.ArrayUtils.remove(charArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray0, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertNull(booleanArray3);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.Object[] objArray0 = null;
        double[] doubleArray5 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray6 = new double[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray5, doubleArray6);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.add(doubleArray6, (double) 100);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(objArray0, (java.lang.Object) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        char[] charArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(charArray0, '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray0);
        short[] shortArray4 = new short[] { (short) 100, (byte) 100 };
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray0, shortArray4);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.remove(shortArray4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 100, (short) 100 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        boolean[] booleanArray19 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray26 = new boolean[] { true, false, false, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray26);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray5, (int) (short) 1);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) booleanArray30, (java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.add(booleanArray30, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray30);
        assertBooleanArrayEquals(booleanArray30, new boolean[] { true, true, true, false });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        int[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, 10, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 2 });
        org.junit.Assert.assertNull(intArray5);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        long[] longArray4 = new long[] { 0L, (short) -1, 10, 1 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, (long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray8 = org.apache.commons.lang3.ArrayUtils.remove(longArray6, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 0L, (-1L), 10L, 1L });
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { (-1L), 10L, 1L });
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        boolean[] booleanArray19 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray26 = new boolean[] { true, false, false, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray26);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.add(booleanArray26, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        char[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray0, '#');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4, 'a');
        char[] charArray8 = new char[] { '#' };
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, 'a');
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray4, (java.lang.Object) int10);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.subarray(charArray12, 3, (int) (short) -1);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray12, '#');
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.addAll(charArray2, charArray12);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.add(charArray2, ' ');
        java.lang.Character[] charArray21 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray21, 'a');
        char[] charArray25 = new char[] { '#' };
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray25, 'a');
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray21, (java.lang.Object) int27);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray21);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.addAll(charArray2, charArray29);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray30, '4', (int) (short) 10);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ' });
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.lang.Byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.lang.Class<?>[] wildcardClassArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        int[] intArray3 = new int[] { (-1) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray3, 100, 0);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        int[] intArray9 = new int[] { (-1) };
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray9, 100, 0);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        int[] intArray15 = new int[] { (-1) };
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray15, 100, 0);
        java.lang.Class<?> wildcardClass19 = intArray15.getClass();
        int[] intArray21 = new int[] { (-1) };
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray21, 100, 0);
        java.lang.Class<?> wildcardClass25 = intArray21.getClass();
        int[] intArray27 = new int[] { (-1) };
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray27, 100, 0);
        java.lang.Class<?> wildcardClass31 = intArray27.getClass();
        java.lang.reflect.Type[] typeArray32 = new java.lang.reflect.Type[] { wildcardClass7, wildcardClass13, wildcardClass19, wildcardClass25, wildcardClass31 };
        int[] intArray34 = new int[] { (-1) };
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray34, 100, 0);
        java.lang.Class<?> wildcardClass38 = intArray34.getClass();
        java.lang.reflect.Type[] typeArray39 = org.apache.commons.lang3.ArrayUtils.add(typeArray32, (java.lang.reflect.Type) wildcardClass38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement[] annotatedElementArray40 = org.apache.commons.lang3.ArrayUtils.add((java.lang.reflect.AnnotatedElement[]) wildcardClassArray0, 4, (java.lang.reflect.AnnotatedElement) wildcardClass38);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassArray0);
        org.junit.Assert.assertArrayEquals(wildcardClassArray0, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(typeArray39);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        float[] floatArray2 = new float[] { (-1.0f), 100.0f };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.remove(floatArray2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new float[] { (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        double[] doubleArray4 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray4);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.add(doubleArray4, (double) (-1));
        double[] doubleArray12 = new double[] { 100L, (byte) 100 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray12);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, (double) 0, 10, (double) 10L);
        double[] doubleArray22 = new double[] { 10.0f, 100.0f, (short) 10, (-1) };
        double[] doubleArray27 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray28 = new double[] {};
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray27, doubleArray28);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray28, 1.0d, (int) 'a', (double) (-1));
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray28);
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray22, doubleArray28);
        double[] doubleArray40 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray41 = new double[] {};
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray40, doubleArray41);
        int int46 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray41, 1.0d, (int) 'a', (double) (-1));
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray41);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray22, doubleArray41);
        double[] doubleArray49 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray41);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray12, doubleArray49);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray49, (double) '4');
        java.lang.Class<?> wildcardClass53 = doubleArray49.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 35.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 35.0d, (-1.0d), 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (-1), (int) '#', 0.0d);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 1.0f, (int) (byte) 1, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (int) (short) 1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        short[] shortArray5 = new short[] { (short) 0, (short) 0, (byte) -1, (byte) 100, (byte) 10 };
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray5, (short) 1, (int) (byte) 0);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray5, (short) 0);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray5, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.remove(shortArray12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 0, (short) 0, (short) -1, (short) 100, (short) 10 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 0, (short) -1, (short) 100, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 0, (short) 0, (short) -1, (short) 100 });
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.Double[] doubleArray5 = new java.lang.Double[] { 10.0d, (-1.0d), (-1.0d), 1.0d, 1.0d };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new java.lang.Double[] { 10.0d, (-1.0d), (-1.0d), 1.0d, 1.0d });
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), (-1.0d), 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (-1), (int) '#', 0.0d);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) (-1.0f));
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (int) (short) 100, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        short[] shortArray0 = null;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) (byte) 10);
        org.junit.Assert.assertNull(shortArray2);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 1.0f, 10.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1, true);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray3, true);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray3, true, (int) (byte) 10);
        boolean[] booleanArray14 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray21 = new boolean[] { true, false, false, true, false, true };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray14, booleanArray21);
        boolean[] booleanArray28 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray35 = new boolean[] { true, false, false, true, false, true };
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray28, booleanArray35);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray14, booleanArray35);
        boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray3, booleanArray14);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray3, false, 100);
        java.lang.String str43 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray3, "{}");
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertArrayEquals(booleanArray1, new java.lang.Boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] { false });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray35);
        assertBooleanArrayEquals(booleanArray35, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(booleanArray37);
        assertBooleanArrayEquals(booleanArray37, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray38);
        assertBooleanArrayEquals(booleanArray38, new boolean[] { false, true, true, true, true, false });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "{false}" + "'", str43, "{false}");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) 0);
        java.lang.String str4 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) shortArray2, "hi!");
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.clone(shortArray2);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.add(shortArray2, (int) (byte) 0, (short) -1);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray2, (short) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] {});
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] { (short) -1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 0, 5 };
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray4, (int) 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray6);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 1, 0, 5 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 5 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 5, 0, 1 });
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        double[] doubleArray4 = new double[] { 10.0f, 100.0f, (short) 10, (-1) };
        double[] doubleArray9 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray10 = new double[] {};
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray9, doubleArray10);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, 1.0d, (int) 'a', (double) (-1));
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray10);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray10);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        short[] shortArray5 = new short[] { (byte) 100, (byte) -1, (short) 10, (short) 10, (short) -1 };
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray5);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6, (short) (byte) 0);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6);
        short[] shortArray16 = new short[] { (short) 0, (short) 0, (byte) -1, (byte) 100, (byte) 10 };
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray16, (short) 1, (int) (byte) 0);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray20, (short) 0);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray16, shortArray20);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray10, shortArray16);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.add(shortArray10, (int) (short) 10, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new java.lang.Short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 0, (short) 0, (short) -1, (short) 100, (short) 10 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] {});
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        boolean[] booleanArray19 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray26 = new boolean[] { true, false, false, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray26);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, false);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray5, 4);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray30);
        assertBooleanArrayEquals(booleanArray30, new boolean[] { true, true, true, true, false, false });
        org.junit.Assert.assertNotNull(booleanArray32);
        assertBooleanArrayEquals(booleanArray32, new boolean[] { true, true, true, true });
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) 0);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray2, (short) 10, 3);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.add(shortArray2, (int) (byte) -1, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.Byte[] byteArray3 = new java.lang.Byte[] { (byte) 0, (byte) 1, (byte) 100 };
        java.lang.Byte[][] byteArray4 = new java.lang.Byte[][] { byteArray3 };
        java.lang.Byte[][] byteArray5 = org.apache.commons.lang3.ArrayUtils.toArray(byteArray4);
        float[] floatArray10 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray15 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray15, (int) (byte) 10, 100);
        float[] floatArray22 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray18, floatArray22);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray10, floatArray18);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray5, (java.lang.Object) floatArray10);
        java.lang.Character[] charArray26 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray26, 'a');
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.clone(charArray28);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray5, (java.lang.Object) charArray28, (-1));
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray33 = org.apache.commons.lang3.ArrayUtils.remove(charArray28, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new java.lang.Byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) 0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) (byte) 10);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray4, (short) (byte) 10);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        double[] doubleArray4 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray5);
        double[] doubleArray11 = new double[] { 10.0f, 100.0f, (short) 10, (-1) };
        double[] doubleArray16 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray17 = new double[] {};
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray16, doubleArray17);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray17, 1.0d, (int) 'a', (double) (-1));
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray17);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray11, doubleArray17);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray25, (double) (short) 1);
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.add(doubleArray27, (double) (short) 0);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray27, 0.0d, (int) '#', (-1.0d));
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray17, doubleArray27);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray5, doubleArray27);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray27, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.lang.Float[] floatArray0 = new java.lang.Float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, (float) 3);
        float[] floatArray7 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray12 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray12, (int) (byte) 10, 100);
        float[] floatArray19 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray15, floatArray19);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray7, floatArray15);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray21);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.clone(floatArray21);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) floatArray0, (java.lang.Object) floatArray23);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray23, (float) ' ');
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray23);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertArrayEquals(floatArray0, new java.lang.Float[] {});
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.lang.Object[] objArray0 = null;
        java.lang.Object[] objArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isSameLength(objArray0, objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        float[] floatArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, (float) 0L, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray1, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 6, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, (-1) });
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        double[] doubleArray4 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray5);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.add(doubleArray5, (double) 100);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 5, (double) 5);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        int[] intArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 0);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray7, (float) 100L, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray7, 2, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        short[] shortArray5 = new short[] { (byte) 100, (byte) -1, (short) 10, (short) 10, (short) -1 };
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray5);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray7);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray8);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, (int) (short) 0, (short) 10);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray5, shortArray12);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.remove(shortArray12, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new java.lang.Short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] {});
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] {});
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 10 });
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1, (short) 10 });
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        char[] charArray4 = new char[] { '#', ' ', '#', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 1, '#');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(charArray7, '4');
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, ' ');
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(charArray7, 'a');
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        double[] doubleArray4 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, 1.0d, (int) 'a', (double) (-1));
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) 100.0f);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (byte) 1, 100);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        float[] floatArray0 = null;
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray0, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertNull(floatArray3);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        float[] floatArray2 = new float[] { (-1.0f), 100.0f };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray2);
        float[] floatArray8 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray13 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray13, (int) (byte) 10, 100);
        float[] floatArray20 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray16, floatArray20);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray8, floatArray16);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray22);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.clone(floatArray22);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray24);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.add(floatArray25, (int) ' ', (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new float[] { (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { (-1.0f), 100.0f, 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        double[] doubleArray4 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray4);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.add(doubleArray4, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.add(doubleArray9, (int) (byte) -1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 35.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 35.0d, (-1.0d), 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1, true);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray3, true);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray3, true, (int) (byte) 10);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.add(booleanArray3, (int) (short) 1, false);
        boolean[] booleanArray17 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray24 = new boolean[] { true, false, false, true, false, true };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray17, booleanArray24);
        boolean[] booleanArray31 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray38 = new boolean[] { true, false, false, true, false, true };
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray31, booleanArray38);
        boolean[] booleanArray45 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray52 = new boolean[] { true, false, false, true, false, true };
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray45, booleanArray52);
        boolean[] booleanArray54 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray31, booleanArray52);
        boolean[] booleanArray55 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray17, booleanArray54);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray11, booleanArray54);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray59 = org.apache.commons.lang3.ArrayUtils.add(booleanArray54, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 11");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertArrayEquals(booleanArray1, new java.lang.Boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] { false });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] { false, false });
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray24);
        assertBooleanArrayEquals(booleanArray24, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(booleanArray31);
        assertBooleanArrayEquals(booleanArray31, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray38);
        assertBooleanArrayEquals(booleanArray38, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(booleanArray45);
        assertBooleanArrayEquals(booleanArray45, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray52);
        assertBooleanArrayEquals(booleanArray52, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(booleanArray54);
        assertBooleanArrayEquals(booleanArray54, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray55);
        assertBooleanArrayEquals(booleanArray55, new boolean[] { true, true, true, true, false, true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        float[] floatArray2 = new float[] { (-1.0f), 100.0f };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray2);
        java.lang.Float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray2);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (short) 1, (float) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) 'a', (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new float[] { (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new java.lang.Float[] { (-1.0f), 100.0f });
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { (-1.0f), (-1.0f), 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        double[] doubleArray0 = null;
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, (int) (byte) 100, 10);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), 2, 0, 2, 100, 2 };
        java.lang.Integer[][] intArray7 = new java.lang.Integer[][] { intArray6 };
        java.lang.Integer[][] intArray8 = org.apache.commons.lang3.ArrayUtils.toArray(intArray7);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) intArray8, (java.lang.Object) "{}");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer[][] intArray12 = org.apache.commons.lang3.ArrayUtils.remove(intArray8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), 2, 0, 2, 100, 2 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, (long) 4);
        long[] longArray17 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray17, 100L);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray17, 4, 100L);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray10, longArray22);
        java.lang.Long[] longArray24 = org.apache.commons.lang3.ArrayUtils.toObject(longArray22);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { 32L, 10L, 0L, (-1L), 100L, 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L), 32L, 10L, 0L, (-1L), 100L, 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new java.lang.Long[] { 32L, 10L, 0L, (-1L), 100L, 32L, (-1L) });
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        char[] charArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray0, ' ', 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.add(longArray6, 4, 100L);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray11);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 32L, 10L, 0L, (-1L), 100L, 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4, 'a');
        char[] charArray8 = new char[] { '#' };
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, 'a');
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray4, (java.lang.Object) int10);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.subarray(charArray12, 3, (int) (short) -1);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray12, '#');
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.addAll(charArray2, charArray12);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.add(charArray2, ' ');
        java.lang.Character[] charArray21 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray21, 'a');
        char[] charArray25 = new char[] { '#' };
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray25, 'a');
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray21, (java.lang.Object) int27);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray21);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.addAll(charArray2, charArray29);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.add(charArray29, '4');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ' });
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4' });
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        short[] shortArray5 = new short[] { (byte) 100, (byte) -1, (short) 10, (short) 10, (short) -1 };
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray5);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6, (short) (byte) 0);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) 0);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray8, shortArray9);
        short[] shortArray18 = new short[] { (short) 0, (short) 0, (byte) -1, (byte) 100, (byte) 10 };
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray18, (short) 1, (int) (byte) 0);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray18, (short) 0);
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray18, (short) 10);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray25, (short) 100);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray12, shortArray25);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray12, (short) (byte) -1);
        java.lang.Double[] doubleArray33 = new java.lang.Double[] { 100.0d, 0.0d };
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray33);
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray33, (-1.0d));
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) (byte) -1, (java.lang.Object) doubleArray33);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new java.lang.Short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] { (short) 0, (short) 0, (short) -1, (short) 100, (short) 10 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray23, new short[] { (short) 0, (short) -1, (short) 100, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new short[] { (short) 0, (short) 0, (short) -1, (short) 100 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new java.lang.Double[] { 100.0d, 0.0d });
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        short[] shortArray5 = new short[] { (short) 0, (short) 0, (byte) -1, (byte) 100, (byte) 10 };
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray5, (short) 1, (int) (byte) 0);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray5, (short) 0);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray5, (short) 10, 2);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray5, (short) 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 0, (short) 0, (short) -1, (short) 100, (short) 10 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 0, (short) -1, (short) 100, (short) 10 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (-1), (int) '#', 0.0d);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) (short) 0);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (-1.0d), 3, (double) 1);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        double[] doubleArray4 = new double[] { 10.0f, 100.0f, (short) 10, (-1) };
        double[] doubleArray9 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray10 = new double[] {};
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray9, doubleArray10);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, 1.0d, (int) 'a', (double) (-1));
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray10);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray10);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, 10.0d, (double) (-1L));
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray10, (double) 10.0f);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray22);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        boolean[] booleanArray19 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray26 = new boolean[] { true, false, false, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray26);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.add(booleanArray30, 8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray30);
        assertBooleanArrayEquals(booleanArray30, new boolean[] { true, true, true, false });
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray4, (int) (short) 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new java.lang.Character[] { '#', '#' });
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', '#' });
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, (int) (byte) -1);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 2);
        int[] intArray10 = new int[] { (-1) };
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, 100, 0);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, 0, (int) (byte) 1);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray10, (int) ' ');
        int[] intArray20 = new int[] { (-1) };
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray20, 100, 0);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray20, 0, (int) (byte) 1);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray20, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray20);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.subarray(intArray20, (-1), (int) (short) 1);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray10, intArray20);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray1, intArray20);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray38 = org.apache.commons.lang3.ArrayUtils.add(intArray20, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 0.0d };
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (-1.0d));
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new java.lang.Double[] { 100.0d, 0.0d });
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        double[] doubleArray4 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray4);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.add(doubleArray4, (double) (-1));
        double[] doubleArray12 = new double[] { 100L, (byte) 100 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray12);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, (double) 0, 10, (double) 10L);
        double[] doubleArray22 = new double[] { 10.0f, 100.0f, (short) 10, (-1) };
        double[] doubleArray27 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray28 = new double[] {};
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray27, doubleArray28);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray28, 1.0d, (int) 'a', (double) (-1));
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray28);
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray22, doubleArray28);
        double[] doubleArray40 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray41 = new double[] {};
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray40, doubleArray41);
        int int46 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray41, 1.0d, (int) 'a', (double) (-1));
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray41);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray22, doubleArray41);
        double[] doubleArray49 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray41);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray12, doubleArray49);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray49, (double) '4');
        int int56 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray49, (double) 10L, (int) (short) 100, (double) 0L);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 35.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 35.0d, (-1.0d), 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, 2, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        double[] doubleArray4 = new double[] { 10.0f, 100.0f, (short) 10, (-1) };
        double[] doubleArray9 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray10 = new double[] {};
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray9, doubleArray10);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, 1.0d, (int) 'a', (double) (-1));
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray10);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray10);
        double[] doubleArray22 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray23 = new double[] {};
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray22, doubleArray23);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, 1.0d, (int) 'a', (double) (-1));
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray23);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray23);
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray23);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray23, (double) (-1), (double) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        char[] charArray0 = null;
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray1, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray3);
        char[] charArray7 = new char[] { ' ', ' ' };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray3, charArray7);
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray11);
        char[] charArray15 = new char[] { ' ', ' ' };
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray11, charArray15);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.add(charArray11, 'a');
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray7, charArray11);
        java.lang.Character[] charArray20 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray20, 'a');
        char[] charArray24 = new char[] { '#' };
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray24, 'a');
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray20, (java.lang.Object) int26);
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray20);
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.subarray(charArray28, 3, (int) (short) -1);
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray28, '#');
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray28, '4');
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.addAll(charArray11, charArray28);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray0, charArray28);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        short[] shortArray0 = null;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        org.junit.Assert.assertNull(shortArray1);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        double[] doubleArray4 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray5);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.add(doubleArray5, (double) 100);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 8, (int) '#', (double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.Float[] floatArray0 = new java.lang.Float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, (float) 3);
        float[] floatArray7 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray12 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray12, (int) (byte) 10, 100);
        float[] floatArray19 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray15, floatArray19);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray7, floatArray15);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray21);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.clone(floatArray21);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) floatArray0, (java.lang.Object) floatArray23);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.clone(floatArray23);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.remove(floatArray25, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertArrayEquals(floatArray0, new java.lang.Float[] {});
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (short) 1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.add(doubleArray2, (double) (short) 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray2, (double) 3, 100.0d);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) (byte) -1, 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray2, 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray2);
        char[] charArray6 = new char[] { ' ', ' ' };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray2, charArray6);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray2, 'a');
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray10, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray12);
        char[] charArray16 = new char[] { ' ', ' ' };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray12, charArray16);
        java.lang.Character[] charArray18 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray18, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray20);
        char[] charArray24 = new char[] { ' ', ' ' };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray20, charArray24);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.add(charArray20, 'a');
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray16, charArray20);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.addAll(charArray2, charArray20);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray32 = org.apache.commons.lang3.ArrayUtils.add(charArray2, 100, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray12, (int) 'a', 10);
        java.lang.Byte[] byteArray22 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray22);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.add(byteArray23, (byte) 1);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray23);
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray33, (byte) 1, (int) (byte) 1);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray33, (-1), (int) (short) 10);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray33, (byte) 10);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray33);
        float[] floatArray45 = new float[] { (-1.0f), 100.0f };
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray45);
        float[] floatArray51 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray56 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray59 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray56, (int) (byte) 10, 100);
        float[] floatArray63 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray59, floatArray63);
        float[] floatArray65 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray51, floatArray59);
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray65);
        float[] floatArray67 = org.apache.commons.lang3.ArrayUtils.clone(floatArray65);
        float[] floatArray68 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray45, floatArray67);
        java.lang.Float[] floatArray69 = new java.lang.Float[] {};
        float[] floatArray71 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray69, (float) 3);
        float[] floatArray76 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray81 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray84 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray81, (int) (byte) 10, 100);
        float[] floatArray88 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean89 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray84, floatArray88);
        float[] floatArray90 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray76, floatArray84);
        boolean boolean91 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray90);
        float[] floatArray92 = org.apache.commons.lang3.ArrayUtils.clone(floatArray90);
        int int93 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) floatArray69, (java.lang.Object) floatArray92);
        float[] floatArray94 = org.apache.commons.lang3.ArrayUtils.clone(floatArray92);
        boolean boolean95 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray67, floatArray92);
        boolean boolean96 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) byteArray33, (java.lang.Object) boolean95);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertArrayEquals(floatArray45, new float[] { (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertArrayEquals(floatArray51, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray56);
        org.junit.Assert.assertArrayEquals(floatArray56, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertArrayEquals(floatArray59, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertArrayEquals(floatArray63, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertArrayEquals(floatArray65, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertArrayEquals(floatArray67, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertArrayEquals(floatArray68, new float[] { (-1.0f), 100.0f, 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray69);
        org.junit.Assert.assertArrayEquals(floatArray69, new java.lang.Float[] {});
        org.junit.Assert.assertNotNull(floatArray71);
        org.junit.Assert.assertArrayEquals(floatArray71, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray76);
        org.junit.Assert.assertArrayEquals(floatArray76, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray81);
        org.junit.Assert.assertArrayEquals(floatArray81, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray84);
        org.junit.Assert.assertArrayEquals(floatArray84, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray88);
        org.junit.Assert.assertArrayEquals(floatArray88, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(floatArray90);
        org.junit.Assert.assertArrayEquals(floatArray90, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(floatArray92);
        org.junit.Assert.assertArrayEquals(floatArray92, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertNotNull(floatArray94);
        org.junit.Assert.assertArrayEquals(floatArray94, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray12, true);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (int) '4', (int) (short) 1);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray19, false);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray19, true, (int) (byte) -1);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) (byte) 1);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.remove(shortArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray1);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 3);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.clone(intArray12);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1), 3 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 3 });
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        long[] longArray0 = new long[] {};
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        long[][] longArray4 = new long[][] { longArray0, longArray1, longArray2, longArray3 };
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        long[][] longArray9 = new long[][] { longArray5, longArray6, longArray7, longArray8 };
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        long[][] longArray14 = new long[][] { longArray10, longArray11, longArray12, longArray13 };
        long[][][] longArray15 = new long[][][] { longArray4, longArray9, longArray14 };
        // The following exception was thrown during execution in test generation
        try {
            long[][][] longArray17 = org.apache.commons.lang3.ArrayUtils.remove(longArray15, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] {});
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] {});
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertArrayEquals(longArray3, new long[] {});
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] {});
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] {});
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] {});
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] {});
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] {});
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] {});
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] {});
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] {});
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertNotNull(longArray15);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = org.apache.commons.lang3.ArrayUtils.remove(intArray2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = org.apache.commons.lang3.ArrayUtils.add(intArray1, (int) (byte) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray1, (-1), (int) (short) 1);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.clone(intArray13);
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.subarray(intArray13, 3, (int) '#');
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.subarray(intArray13, (int) 'a', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = org.apache.commons.lang3.ArrayUtils.remove(intArray13, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        float[] floatArray0 = null;
        java.lang.Float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray0);
        org.junit.Assert.assertNull(floatArray1);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = org.apache.commons.lang3.ArrayUtils.remove(charArray0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        boolean[] booleanArray19 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray26 = new boolean[] { true, false, false, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray33 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray40 = new boolean[] { true, false, false, true, false, true };
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray33, booleanArray40);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray19, booleanArray40);
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray42);
        boolean[] booleanArray49 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray56 = new boolean[] { true, false, false, true, false, true };
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray49, booleanArray56);
        boolean[] booleanArray63 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray70 = new boolean[] { true, false, false, true, false, true };
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray63, booleanArray70);
        boolean[] booleanArray72 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray49, booleanArray70);
        boolean[] booleanArray74 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray49, (int) (short) 1);
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray43, booleanArray74);
        int int77 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray74, false);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray33);
        assertBooleanArrayEquals(booleanArray33, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray40);
        assertBooleanArrayEquals(booleanArray40, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(booleanArray42);
        assertBooleanArrayEquals(booleanArray42, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray43);
        assertBooleanArrayEquals(booleanArray43, new boolean[] { true, true, true, true, false, true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray49);
        assertBooleanArrayEquals(booleanArray49, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray56);
        assertBooleanArrayEquals(booleanArray56, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(booleanArray63);
        assertBooleanArrayEquals(booleanArray63, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray70);
        assertBooleanArrayEquals(booleanArray70, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(booleanArray72);
        assertBooleanArrayEquals(booleanArray72, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray74);
        assertBooleanArrayEquals(booleanArray74, new boolean[] { true, true, true, false });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 3 + "'", int77 == 3);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (-1), (int) '#', 0.0d);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) (-1.0f));
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, (double) 2, 0);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, (double) 'a', (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (-1), (int) '#', 0.0d);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 1.0f, (int) (byte) 1, (double) 100.0f);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(intArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = org.apache.commons.lang3.ArrayUtils.remove(intArray1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, (long) 4);
        long[] longArray17 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray17, 100L);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray17, 4, 100L);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray10, longArray22);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.clone(longArray22);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray24, (long) (byte) -1, 10);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { 32L, 10L, 0L, (-1L), 100L, 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L), 32L, 10L, 0L, (-1L), 100L, 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] { 32L, 10L, 0L, (-1L), 100L, 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (-1), (int) '#', 0.0d);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray7);
        java.util.Map<java.lang.Object, java.lang.Object> objMap9 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray8);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray8, (double) 100);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray11, (double) (short) 0);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray11, (double) 5);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray11, (double) 1L, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.add(doubleArray11, 1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(objMap9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1, true);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray3, true);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray3, true, (int) (byte) 10);
        boolean[] booleanArray14 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray21 = new boolean[] { true, false, false, true, false, true };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray14, booleanArray21);
        boolean[] booleanArray28 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray35 = new boolean[] { true, false, false, true, false, true };
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray28, booleanArray35);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray14, booleanArray35);
        boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray3, booleanArray14);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray38, true, (int) (byte) 1);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertArrayEquals(booleanArray1, new java.lang.Boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] { false });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray35);
        assertBooleanArrayEquals(booleanArray35, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(booleanArray37);
        assertBooleanArrayEquals(booleanArray37, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray38);
        assertBooleanArrayEquals(booleanArray38, new boolean[] { false, true, true, true, true, false });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.lang.Long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) 5);
        org.junit.Assert.assertNull(longArray2);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        short[] shortArray5 = new short[] { (byte) 100, (byte) -1, (short) 10, (short) 10, (short) -1 };
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray5);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6, (short) (byte) 0);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) 0);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray8, shortArray9);
        java.lang.Short[] shortArray14 = new java.lang.Short[] { (short) -1 };
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray14, (short) (byte) 100);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray8, shortArray16);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray17, (short) (byte) -1);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray17, (short) (byte) -1);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new java.lang.Short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new java.lang.Short[] { (short) -1 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) -1 });
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1, (short) -1 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 1);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.remove(byteArray7, 0);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(byteArray7, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.lang.Byte[] byteArray3 = new java.lang.Byte[] { (byte) 0, (byte) 1, (byte) 100 };
        java.lang.Byte[][] byteArray4 = new java.lang.Byte[][] { byteArray3 };
        java.lang.Byte[][] byteArray5 = org.apache.commons.lang3.ArrayUtils.toArray(byteArray4);
        float[] floatArray10 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray15 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray15, (int) (byte) 10, 100);
        float[] floatArray22 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray18, floatArray22);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray10, floatArray18);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray5, (java.lang.Object) floatArray10);
        java.util.Map<java.lang.Object, java.lang.Object> objMap26 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) byteArray5);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new java.lang.Byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objMap26);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 10, 5, 0, 5 };
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap7 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '100', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 100, 10, 5, 0, 5 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 10, 5, 0, 5 });
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        boolean[] booleanArray19 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray26 = new boolean[] { true, false, false, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray33 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray40 = new boolean[] { true, false, false, true, false, true };
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray33, booleanArray40);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray19, booleanArray40);
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray42);
        boolean[] booleanArray49 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray56 = new boolean[] { true, false, false, true, false, true };
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray49, booleanArray56);
        boolean[] booleanArray63 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray70 = new boolean[] { true, false, false, true, false, true };
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray63, booleanArray70);
        boolean[] booleanArray72 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray49, booleanArray70);
        boolean[] booleanArray74 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray49, (int) (short) 1);
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray43, booleanArray74);
        boolean[] booleanArray77 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray74, true);
        int int79 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray77, false);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray33);
        assertBooleanArrayEquals(booleanArray33, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray40);
        assertBooleanArrayEquals(booleanArray40, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(booleanArray42);
        assertBooleanArrayEquals(booleanArray42, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray43);
        assertBooleanArrayEquals(booleanArray43, new boolean[] { true, true, true, true, false, true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray49);
        assertBooleanArrayEquals(booleanArray49, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray56);
        assertBooleanArrayEquals(booleanArray56, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(booleanArray63);
        assertBooleanArrayEquals(booleanArray63, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray70);
        assertBooleanArrayEquals(booleanArray70, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(booleanArray72);
        assertBooleanArrayEquals(booleanArray72, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray74);
        assertBooleanArrayEquals(booleanArray74, new boolean[] { true, true, true, false });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(booleanArray77);
        assertBooleanArrayEquals(booleanArray77, new boolean[] { true, true, false });
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2 + "'", int79 == 2);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.subarray(charArray2, (int) (short) -1, (int) '4');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        short[] shortArray5 = new short[] { (byte) 100, (byte) -1, (short) 10, (short) 10, (short) -1 };
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray5);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6, (short) (byte) 0);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6, (short) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray10);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new java.lang.Short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) -1, (short) 10, (short) 10, (short) -1, (short) 100 });
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 10L, 10L, 0L, 1L };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray5);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray7, (double) (short) 1);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray9, (double) (short) 0);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) 3, 100.0d);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) longArray5, (java.lang.Object) 3);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray5, 0L);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray17);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new java.lang.Long[] { 100L, 10L, 10L, 0L, 1L });
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 100L, 10L, 10L, 0L, 1L });
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 100L, 10L, 10L, 0L, 1L });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[][] byteArray35 = new byte[][] { byteArray6, byteArray13, byteArray20, byteArray27, byteArray34 };
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int46 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray43, (byte) 1, (int) (byte) 1);
        byte[] byteArray49 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray43, (-1), (int) (short) 10);
        byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.remove(byteArray43, 0);
        byte[][] byteArray52 = org.apache.commons.lang3.ArrayUtils.add(byteArray35, 3, byteArray51);
        java.lang.Object obj53 = null;
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray52, obj53);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray1);
        java.lang.Integer[] intArray11 = org.apache.commons.lang3.ArrayUtils.toObject(intArray1);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        char[] charArray4 = new char[] { '#', ' ', '#', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 1, '#');
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.toObject(charArray4);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8, 'a');
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray10, '#');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new java.lang.Character[] { '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', '#', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray2);
        char[] charArray6 = new char[] { ' ', ' ' };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray2, charArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray2, 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray2, 6, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 3, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray7, (byte) 100, (-1));
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.clone(byteArray7);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray11);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        int[] intArray0 = null;
        java.lang.Integer[] intArray1 = org.apache.commons.lang3.ArrayUtils.toObject(intArray0);
        org.junit.Assert.assertNull(intArray1);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, 0);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray14, (byte) 0);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray14);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.add(longArray6, 4, 100L);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.subarray(longArray6, 100, (int) (short) 0);
        java.lang.Long[] longArray15 = org.apache.commons.lang3.ArrayUtils.toObject(longArray14);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray18 = org.apache.commons.lang3.ArrayUtils.add(longArray14, (int) (short) 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 32L, 10L, 0L, (-1L), 100L, 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] {});
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new java.lang.Long[] {});
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (short) 1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.add(doubleArray2, (double) (short) 0);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray2, (double) (short) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray2, (double) 10);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (byte) 1, 100);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray2);
        char[] charArray6 = new char[] { ' ', ' ' };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray2, charArray6);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray2, 'a');
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray9, ' ', (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.Byte[] byteArray0 = null;
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0, (byte) 1);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = org.apache.commons.lang3.ArrayUtils.remove(charArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        byte[] byteArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) 100, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        long[] longArray2 = new long[] { 2, (-1) };
        long[] longArray5 = new long[] { 2, (-1) };
        long[][] longArray6 = new long[][] { longArray2, longArray5 };
        java.lang.Float[] floatArray7 = new java.lang.Float[] {};
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray7, (float) 3);
        float[] floatArray14 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray19 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray19, (int) (byte) 10, 100);
        float[] floatArray26 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray22, floatArray26);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray14, floatArray22);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray28);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.clone(floatArray28);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) floatArray7, (java.lang.Object) floatArray30);
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.clone(floatArray30);
        long[][] longArray33 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, (java.lang.Object) floatArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap34 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) longArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '[J@418d911a', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { 2L, (-1L) });
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] { 2L, (-1L) });
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new java.lang.Float[] {});
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertArrayEquals(floatArray32, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(longArray33);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        short[] shortArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        char[] charArray4 = new char[] { '#', ' ', '#', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 1, '#');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.subarray(charArray4, (int) ' ', (int) (byte) 10);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray12, '#');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = org.apache.commons.lang3.ArrayUtils.remove(charArray14, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        short[] shortArray5 = new short[] { (byte) 100, (byte) -1, (short) 10, (short) 10, (short) -1 };
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new java.lang.Short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        char[] charArray4 = new char[] { '#', ' ', '#', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 1, '#');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(charArray7, '4');
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, ' ');
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = org.apache.commons.lang3.ArrayUtils.remove(charArray7, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        float[] floatArray4 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray9 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray9, (int) (byte) 10, 100);
        float[] floatArray16 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray12, floatArray16);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray12);
        java.lang.Float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray4);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray19);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray20, (float) '#', 6);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.remove(floatArray20, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new java.lang.Float[] { 2.0f, 10.0f, 97.0f, 2.0f });
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) -1 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 100);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray3, (short) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.remove(shortArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new java.lang.Short[] { (short) -1 });
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] { (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (short) 1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.add(doubleArray2, (double) (short) 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray2, 0.0d, (int) '#', (-1.0d));
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray2);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) 10L, (double) 1L);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 10L, 10L, 0L, 1L };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray5);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray7, (long) 3, 0);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new java.lang.Long[] { 100L, 10L, 10L, 0L, 1L });
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 100L, 10L, 10L, 0L, 1L });
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] { 100L, 10L, 10L, 0L, 1L });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray7, (byte) 100, (-1));
        java.lang.String str12 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) (byte) 100, "{true,true,true,false}");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100" + "'", str12, "100");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        float[] floatArray4 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray9 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray9, (int) (byte) 10, 100);
        float[] floatArray16 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray12, floatArray16);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray12);
        java.lang.Float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray4);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray19);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray20, (float) '#', 6);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.remove(floatArray20, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new java.lang.Float[] { 2.0f, 10.0f, 97.0f, 2.0f });
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.add(longArray6, 4, 100L);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray6, longArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) 'a');
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.remove(longArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray20 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (int) (byte) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 32L, 10L, 0L, (-1L), 100L, 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 10L, 0L, (-1L), 32L, (-1L) });
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray2);
        char[] charArray6 = new char[] { ' ', ' ' };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray2, charArray6);
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray10);
        char[] charArray14 = new char[] { ' ', ' ' };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray10, charArray14);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.add(charArray10, 'a');
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray6, charArray10);
        java.lang.Character[] charArray19 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray21 = org.apache.commons.lang3.ArrayUtils.remove(charArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new java.lang.Character[] { ' ', ' ' });
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        long[] longArray4 = new long[] { 0L, (short) -1, 10, 1 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, (long) (short) 0);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.add(longArray4, (long) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray4, (long) 2);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray4, 4, (long) ' ');
        java.lang.Class<?> wildcardClass14 = longArray13.getClass();
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 0L, (-1L), 10L, 1L });
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { (-1L), 10L, 1L });
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 0L, (-1L), 10L, 1L, 0L });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 0L, (-1L), 10L, 1L, 32L });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 0);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray0, (float) '#');
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, (float) (-1L));
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertArrayEquals(floatArray0, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.lang.Byte[] byteArray0 = null;
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0, (byte) -1);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (short) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray2);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = org.apache.commons.lang3.ArrayUtils.remove(intArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        float[] floatArray4 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray9 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray9, (int) (byte) 10, 100);
        float[] floatArray16 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray12, floatArray16);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray12);
        float[] floatArray23 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray23, (int) (byte) 10, 100);
        float[] floatArray30 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray26, floatArray30);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray12, floatArray26);
        java.lang.Float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray26);
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray26, 1.0f);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertArrayEquals(floatArray33, new java.lang.Float[] {});
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertArrayEquals(floatArray35, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        char[] charArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray0, '4', 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) (byte) 1);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(shortArray0, (short) (byte) 0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] {});
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        char[] charArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.lang.Short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0, (short) (byte) 100);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY;
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, false, (int) '#');
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray0, (java.lang.Object) int7, 8);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] {});
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] {});
        org.junit.Assert.assertNotNull(booleanArray4);
        assertBooleanArrayEquals(booleanArray4, new boolean[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        long[] longArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) 2, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (byte) 1, 100);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        java.lang.Byte[] byteArray25 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray25);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray26, (byte) 100, (-1));
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray26);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        int[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 2);
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 2 });
        org.junit.Assert.assertNull(intArray3);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (short) 1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.add(doubleArray2, (double) (short) 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray2, 0.0d, (int) '#', (-1.0d));
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray2);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray2, (double) (short) 0, 3, (double) 0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 0.0d };
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (-1.0f));
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray6, 0.0d, (double) 0L);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new java.lang.Double[] { 100.0d, 0.0d });
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        float[] floatArray12 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray17 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray17, (int) (byte) 10, 100);
        float[] floatArray24 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray20, floatArray24);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray12, floatArray20);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray7, floatArray20);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray20, (float) '4');
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.add(floatArray20, (float) (short) 1);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray31, (float) (byte) 10, (int) (byte) -1);
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.clone(floatArray31);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray31, (float) 0L);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray39 = org.apache.commons.lang3.ArrayUtils.remove(floatArray31, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertArrayEquals(floatArray29, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertArrayEquals(floatArray31, new float[] { 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertArrayEquals(floatArray35, new float[] { 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (byte) 1, 100);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) -1, 1);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        double[] doubleArray4 = new double[] { 10.0f, 100.0f, (short) 10, (-1) };
        double[] doubleArray9 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray10 = new double[] {};
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray9, doubleArray10);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, 1.0d, (int) 'a', (double) (-1));
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray10);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray10);
        double[] doubleArray22 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray23 = new double[] {};
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray22, doubleArray23);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, 1.0d, (int) 'a', (double) (-1));
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray23);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray23);
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray23);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, (double) 1, 4, (double) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray2);
        char[] charArray6 = new char[] { ' ', ' ' };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray2, charArray6);
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray10);
        char[] charArray14 = new char[] { ' ', ' ' };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray10, charArray14);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.add(charArray10, 'a');
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray6, charArray10);
        java.lang.Character[] charArray19 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        char[] charArray20 = null;
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray20);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray24 = org.apache.commons.lang3.ArrayUtils.add(charArray6, (int) (short) 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new java.lang.Character[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { ' ', ' ' });
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, (int) (byte) -1);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 2);
        int[] intArray10 = new int[] { (-1) };
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, 100, 0);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, 0, (int) (byte) 1);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray10, (int) ' ');
        int[] intArray20 = new int[] { (-1) };
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray20, 100, 0);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray20, 0, (int) (byte) 1);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray20, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray20);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.subarray(intArray20, (-1), (int) (short) 1);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray10, intArray20);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray1, intArray20);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray4);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) 1);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray8, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new java.lang.Byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1, true);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray3, true);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray3, true, (int) (byte) 10);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.add(booleanArray3, (int) (short) 1, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray3);
        java.lang.Boolean[] booleanArray14 = new java.lang.Boolean[] { false };
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray14, true);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray16, true);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray16, true, (int) (byte) 10);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray3, booleanArray16);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray3, true, 4);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertArrayEquals(booleanArray1, new java.lang.Boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] { false });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] { false, false });
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertArrayEquals(booleanArray14, new java.lang.Boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] { false });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(booleanArray22);
        assertBooleanArrayEquals(booleanArray22, new boolean[] { false, false });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) (byte) 1);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) 1);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(shortArray0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, 2, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray4, (byte) 0);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray4, 0, 6);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray10, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new java.lang.Byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.String[] strArray6 = new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" };
        java.lang.String[] strArray13 = new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" };
        java.lang.String[][] strArray14 = new java.lang.String[][] { strArray6, strArray13 };
        java.lang.String[][][] strArray15 = new java.lang.String[][][] { strArray14 };
        java.lang.String[] strArray22 = new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" };
        java.lang.String[] strArray29 = new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" };
        java.lang.String[][] strArray30 = new java.lang.String[][] { strArray22, strArray29 };
        java.lang.String[][][] strArray31 = new java.lang.String[][][] { strArray30 };
        java.lang.String[] strArray38 = new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" };
        java.lang.String[] strArray45 = new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" };
        java.lang.String[][] strArray46 = new java.lang.String[][] { strArray38, strArray45 };
        java.lang.String[][][] strArray47 = new java.lang.String[][][] { strArray46 };
        java.lang.String[] strArray54 = new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" };
        java.lang.String[] strArray61 = new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" };
        java.lang.String[][] strArray62 = new java.lang.String[][] { strArray54, strArray61 };
        java.lang.String[][][] strArray63 = new java.lang.String[][][] { strArray62 };
        java.lang.String[] strArray70 = new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" };
        java.lang.String[] strArray77 = new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" };
        java.lang.String[][] strArray78 = new java.lang.String[][] { strArray70, strArray77 };
        java.lang.String[][][] strArray79 = new java.lang.String[][][] { strArray78 };
        java.lang.String[][][][] strArray80 = new java.lang.String[][][][] { strArray15, strArray31, strArray47, strArray63, strArray79 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[][][][] strArray82 = org.apache.commons.lang3.ArrayUtils.remove(strArray80, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" });
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "{false}", "false", "{}", "hi!", "{true,true,true,true,false,true,false,false,true,false,true}", "100" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) 0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray3, (short) (byte) 0, 5);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { 100.0f };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray1, (float) '4');
        java.lang.Float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap7 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) floatArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '100.0', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new java.lang.Float[] { 100.0f });
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new java.lang.Float[] { 100.0f });
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray2);
        char[] charArray6 = new char[] { ' ', ' ' };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray2, charArray6);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray2, 'a');
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray10, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray12);
        char[] charArray16 = new char[] { ' ', ' ' };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray12, charArray16);
        java.lang.Character[] charArray18 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray18, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray20);
        char[] charArray24 = new char[] { ' ', ' ' };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray20, charArray24);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.add(charArray20, 'a');
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray16, charArray20);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.addAll(charArray2, charArray20);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray32 = org.apache.commons.lang3.ArrayUtils.add(charArray2, (int) ' ', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (byte) 1, 100);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) -1, 1);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray28, (byte) 1, (int) (byte) 1);
        byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray28, (-1), (int) (short) 10);
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray34, (int) 'a', 10);
        java.lang.Byte[] byteArray44 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray44);
        byte[] byteArray47 = org.apache.commons.lang3.ArrayUtils.add(byteArray45, (byte) 1);
        byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray34, byteArray45);
        byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray48, 0, 5);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.contains(byteArray51, (byte) 1);
        byte[] byteArray56 = org.apache.commons.lang3.ArrayUtils.add(byteArray51, (int) (short) 0, (byte) -1);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray56);
        int int59 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (-1), (int) '#', 0.0d);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray7);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray8);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.add(doubleArray9, 100, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, (long) 4);
        long[] longArray17 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray17, 100L);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray17, 4, 100L);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray10, longArray22);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray22);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { 32L, 10L, 0L, (-1L), 100L, 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L), 32L, 10L, 0L, (-1L), 100L, 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.add(longArray6, 4, 100L);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray6, longArray12);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) (short) 1, 13);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 32L, 10L, 0L, (-1L), 100L, 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray9);
        java.lang.Integer[] intArray11 = org.apache.commons.lang3.ArrayUtils.toObject(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = org.apache.commons.lang3.ArrayUtils.add(intArray9, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { (-1) });
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray7 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray7, 100L);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray7, (long) 4);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.subarray(longArray7, (int) (short) 0, (-1));
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray14, (long) (short) 0);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.addAll(longArray0, longArray14);
        java.lang.Long[] longArray18 = org.apache.commons.lang3.ArrayUtils.toObject(longArray17);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray21 = org.apache.commons.lang3.ArrayUtils.add(longArray17, (int) ' ', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] {});
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new java.lang.Long[] {});
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        float[] floatArray11 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray7, floatArray11);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray11, (int) (byte) 10, (int) ' ');
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.clone(floatArray15);
        float[] floatArray19 = new float[] { (-1.0f), 100.0f };
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray19);
        java.lang.Float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray19);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.add(floatArray19, (int) (short) 1, (float) (byte) -1);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.clone(floatArray24);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray16, floatArray25);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray16, (float) 10, 1);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new java.lang.Float[] { (-1.0f), 100.0f });
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { (-1.0f), (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { (-1.0f), (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (-1), (int) '#', 0.0d);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) (-1.0f));
        double[] doubleArray14 = new double[] { 10.0f, 100.0f, (short) 10, (-1) };
        double[] doubleArray19 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray20 = new double[] {};
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray19, doubleArray20);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray20, 1.0d, (int) 'a', (double) (-1));
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray20);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray14, doubleArray20);
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.add(doubleArray20, (double) 6);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray20, (double) (short) 10, (int) (short) 1);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray20);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray20, (double) (short) 0, 4, (double) 0.0f);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray20, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 6.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.lang.Float[] floatArray0 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, (float) (short) -1);
        org.junit.Assert.assertNull(floatArray2);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray1 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray2 = new java.lang.String[][][] {};
        java.lang.String[][][] strArray3 = new java.lang.String[][][] {};
        java.lang.String[][][][] strArray4 = new java.lang.String[][][][] { strArray0, strArray1, strArray2, strArray3 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[][][][] strArray6 = org.apache.commons.lang3.ArrayUtils.remove(strArray4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.remove(byteArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (short) 1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.add(doubleArray2, (double) (short) 0);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray4, (double) ' ');
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) (short) 1);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray4, (double) (-1.0f));
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.add(doubleArray4, (double) '#');
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) ' ', (int) (short) 100);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) 6, (double) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        int[] intArray11 = new int[] { (-1) };
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray11, 100, 0);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray11, 0, (int) (byte) 1);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray11, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray11);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.subarray(intArray11, (-1), (int) (short) 1);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray1, intArray11);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.remove(intArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = org.apache.commons.lang3.ArrayUtils.remove(intArray1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] {});
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        boolean[] booleanArray19 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray26 = new boolean[] { true, false, false, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray26);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray5, (int) (short) 1);
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray30);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray30, 2);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray33, false, 4);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray30);
        assertBooleanArrayEquals(booleanArray30, new boolean[] { true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray31);
        assertBooleanArrayEquals(booleanArray31, new boolean[] { true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray33);
        assertBooleanArrayEquals(booleanArray33, new boolean[] { true, true, false });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 0, 5 };
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, 4);
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.toObject(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap8 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '1', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 1, 0, 5 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 5 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 1, 0, 5 });
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, (long) 4);
        long[] longArray17 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray17, 100L);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray17, 4, 100L);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray10, longArray22);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray22);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray22, (long) (byte) 100);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { (-1L), 32L, 100L, (-1L), 0L, 10L, 32L });
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L), 32L, 10L, 0L, (-1L), 100L, 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray12, true);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (-1), (int) (byte) 100);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray12, true);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 0.0d };
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.add(doubleArray3, (int) '#', 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new java.lang.Double[] { 100.0d, 0.0d });
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        double[] doubleArray4 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray5);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray4);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 10, (double) (byte) 1);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray4, (int) (byte) 0, (int) (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) (byte) 10, 3, (double) 3);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) (-1), (int) '#', 0.0d);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (double) 100);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray18);
        java.lang.Double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray25);
        java.util.Map<java.lang.Object, java.lang.Object> objMap27 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray26);
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray26, (double) 100);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray26);
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray13, doubleArray30);
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray30);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray32, (double) 6, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.add(doubleArray32, (int) (short) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(objMap27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6);
        char[] charArray11 = new char[] { 'a', 'a', '4' };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(charArray11, 'a');
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray6, (java.lang.Object) charArray11);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = org.apache.commons.lang3.ArrayUtils.remove(charArray11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.lang.String[] strArray4 = new java.lang.String[] { "{}", "", "{}", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "{}", "", "{}", "" };
        java.lang.String[][] strArray10 = new java.lang.String[][] { strArray4, strArray9 };
        java.lang.String[][] strArray13 = org.apache.commons.lang3.ArrayUtils.subarray(strArray10, 100, (int) (byte) 1);
        short[] shortArray17 = new short[] { (byte) 1, (short) 1, (short) 1 };
        short[] shortArray21 = new short[] { (byte) 1, (short) 1, (short) 1 };
        short[] shortArray25 = new short[] { (byte) 1, (short) 1, (short) 1 };
        short[][] shortArray26 = new short[][] { shortArray17, shortArray21, shortArray25 };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray26);
        java.lang.String[][] strArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(strArray13, (java.lang.Object) shortArray26);
        char[] charArray33 = new char[] { '#', ' ', '#', '#' };
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.add(charArray33, 1, '#');
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.add(charArray33, 'a');
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.subarray(charArray33, (int) ' ', (int) (byte) 10);
        int int44 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray41, 'a', (int) ' ');
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.contains(charArray41, 'a');
        java.lang.Class<?> wildcardClass47 = charArray41.getClass();
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray28, (java.lang.Object) wildcardClass47);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "{}", "", "{}", "" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "{}", "", "{}", "" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) 1, (short) 1, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] { (short) 1, (short) 1, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new short[] { (short) 1, (short) 1, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6, (byte) 1);
        java.lang.Byte[] byteArray13 = new java.lang.Byte[] { (byte) 0, (byte) 1, (byte) 100 };
        java.lang.Byte[][] byteArray14 = new java.lang.Byte[][] { byteArray13 };
        java.lang.Byte[][] byteArray15 = org.apache.commons.lang3.ArrayUtils.toArray(byteArray14);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray15);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray6, (java.lang.Object) byteArray15, (int) (short) 0);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6, (byte) -1);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray21, (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new java.lang.Byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray1, (byte) 0, (int) (short) 0);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new java.lang.Byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 0);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray7, (float) 100L, (int) '#');
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(floatArray7, (float) (byte) 1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray7);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray0);
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) 1);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray0, shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.remove(shortArray7, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] {});
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] {});
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray2);
        char[] charArray6 = new char[] { ' ', ' ' };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray2, charArray6);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray2, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray2, '4');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4' });
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray7 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray7, 100L);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray7, (long) 4);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.subarray(longArray7, (int) (short) 0, (-1));
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray14, (long) (short) 0);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.addAll(longArray0, longArray14);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray17, (long) '4', (int) (short) 10);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (-1), (int) '#', 0.0d);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray0);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 2, (double) 100L);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        double[] doubleArray4 = new double[] { 10.0f, 100.0f, (short) 10, (-1) };
        double[] doubleArray9 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray10 = new double[] {};
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray9, doubleArray10);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, 1.0d, (int) 'a', (double) (-1));
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray10);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray10);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, 10.0d, (double) (-1L));
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray10, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, (long) 4);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray6, (int) (short) 0, (-1));
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray13, 0L);
        java.lang.Long[] longArray16 = org.apache.commons.lang3.ArrayUtils.toObject(longArray13);
        double[] doubleArray19 = new double[] { (-1.0f), 5 };
        double[] doubleArray22 = new double[] { (-1.0f), 5 };
        double[] doubleArray25 = new double[] { (-1.0f), 5 };
        double[] doubleArray28 = new double[] { (-1.0f), 5 };
        double[][] doubleArray29 = new double[][] { doubleArray19, doubleArray22, doubleArray25, doubleArray28 };
        double[] doubleArray36 = new double[] { 1.0f, (short) 100, 100.0f, (-1.0f), (short) 0, ' ' };
        double[] doubleArray43 = new double[] { 1.0f, (short) 100, 100.0f, (-1.0f), (short) 0, ' ' };
        double[] doubleArray50 = new double[] { 1.0f, (short) 100, 100.0f, (-1.0f), (short) 0, ' ' };
        double[] doubleArray57 = new double[] { 1.0f, (short) 100, 100.0f, (-1.0f), (short) 0, ' ' };
        double[] doubleArray64 = new double[] { 1.0f, (short) 100, 100.0f, (-1.0f), (short) 0, ' ' };
        double[] doubleArray71 = new double[] { 1.0f, (short) 100, 100.0f, (-1.0f), (short) 0, ' ' };
        double[][] doubleArray72 = new double[][] { doubleArray36, doubleArray43, doubleArray50, doubleArray57, doubleArray64, doubleArray71 };
        double[][] doubleArray73 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray29, doubleArray72);
        boolean boolean74 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) longArray16, (java.lang.Object[]) doubleArray73);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new java.lang.Long[] {});
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d), 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { (-1.0d), 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { (-1.0d), 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 1.0d, 100.0d, 100.0d, (-1.0d), 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 1.0d, 100.0d, 100.0d, (-1.0d), 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 100.0d, 100.0d, (-1.0d), 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, 100.0d, 100.0d, (-1.0d), 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 1.0d, 100.0d, 100.0d, (-1.0d), 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 1.0d, 100.0d, 100.0d, (-1.0d), 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        long[] longArray2 = new long[] { 13, 100L };
        long[] longArray5 = new long[] { 13, 100L };
        long[] longArray8 = new long[] { 13, 100L };
        long[] longArray11 = new long[] { 13, 100L };
        long[][] longArray12 = new long[][] { longArray2, longArray5, longArray8, longArray11 };
        long[] longArray15 = new long[] { 13, 100L };
        long[] longArray18 = new long[] { 13, 100L };
        long[] longArray21 = new long[] { 13, 100L };
        long[] longArray24 = new long[] { 13, 100L };
        long[][] longArray25 = new long[][] { longArray15, longArray18, longArray21, longArray24 };
        long[] longArray28 = new long[] { 13, 100L };
        long[] longArray31 = new long[] { 13, 100L };
        long[] longArray34 = new long[] { 13, 100L };
        long[] longArray37 = new long[] { 13, 100L };
        long[][] longArray38 = new long[][] { longArray28, longArray31, longArray34, longArray37 };
        long[] longArray41 = new long[] { 13, 100L };
        long[] longArray44 = new long[] { 13, 100L };
        long[] longArray47 = new long[] { 13, 100L };
        long[] longArray50 = new long[] { 13, 100L };
        long[][] longArray51 = new long[][] { longArray41, longArray44, longArray47, longArray50 };
        long[][][] longArray52 = new long[][][] { longArray12, longArray25, longArray38, longArray51 };
        long[][] longArray54 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[][][] longArray55 = org.apache.commons.lang3.ArrayUtils.add(longArray52, (int) (short) -1, longArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { 13L, 100L });
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] { 13L, 100L });
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 13L, 100L });
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 13L, 100L });
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 13L, 100L });
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 13L, 100L });
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { 13L, 100L });
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] { 13L, 100L });
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertArrayEquals(longArray28, new long[] { 13L, 100L });
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] { 13L, 100L });
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertArrayEquals(longArray34, new long[] { 13L, 100L });
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertArrayEquals(longArray37, new long[] { 13L, 100L });
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertArrayEquals(longArray41, new long[] { 13L, 100L });
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertArrayEquals(longArray44, new long[] { 13L, 100L });
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertArrayEquals(longArray47, new long[] { 13L, 100L });
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertArrayEquals(longArray50, new long[] { 13L, 100L });
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertNotNull(longArray52);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 0, (int) '#');
        float[] floatArray16 = new float[] { (-1.0f), 100.0f };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray16);
        java.lang.Float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray16);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, (int) (short) 1, (float) (byte) -1);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.clone(floatArray21);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) intArray13, (java.lang.Object) floatArray22);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray13, (int) (short) 0);
        int[] intArray26 = null;
        int[] intArray30 = new int[] { '#', (short) 10, 4 };
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray30, (int) '#', (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray30);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray26, intArray30);
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.addAll(intArray13, intArray30);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = org.apache.commons.lang3.ArrayUtils.add(intArray30, (int) (byte) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, (-1) });
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new java.lang.Float[] { (-1.0f), 100.0f });
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { (-1.0f), (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { (-1.0f), (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 35, (-1) });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 4, 10, 35 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 35, (-1), 4, 10, 35 });
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray14, 'a');
        char[] charArray18 = new char[] { '#' };
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray18, 'a');
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray14, (java.lang.Object) int20);
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray14);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.subarray(charArray22, 3, (int) (short) -1);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray22, '#');
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.subarray(charArray27, (int) ' ', (int) (byte) 100);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) boolean13, (java.lang.Object) charArray27);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(charArray2, ' ');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.add(longArray6, 4, 100L);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.subarray(longArray6, 100, (int) (short) 0);
        java.lang.Long[] longArray15 = org.apache.commons.lang3.ArrayUtils.toObject(longArray14);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray14, 10L);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 32L, 10L, 0L, (-1L), 100L, 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] {});
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new java.lang.Long[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4, 'a');
        char[] charArray8 = new char[] { '#' };
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, 'a');
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray4, (java.lang.Object) int10);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.subarray(charArray12, 3, (int) (short) -1);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray12, '#');
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.addAll(charArray2, charArray12);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.add(charArray2, ' ');
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray20, '4');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.clone(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 10L, 10L, 0L, 1L };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray5);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray5);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.remove(longArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (int) (byte) -1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new java.lang.Long[] { 100L, 10L, 10L, 0L, 1L });
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 100L, 10L, 10L, 0L, 1L });
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] { 100L, 10L, 10L, 0L, 1L });
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertArrayEquals(longArray9, new long[] { 10L, 10L, 0L, 1L });
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        double[] doubleArray4 = new double[] { 10.0f, 100.0f, (short) 10, (-1) };
        double[] doubleArray9 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray10 = new double[] {};
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray9, doubleArray10);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, 1.0d, (int) 'a', (double) (-1));
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray10);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray10);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.add(doubleArray10, (double) 6);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, (double) (short) 10, (int) (short) 1);
        java.lang.String str24 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) doubleArray10, "100");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.add(doubleArray10, 100, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 6.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, true, (int) (byte) 0);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, false, 4);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, false, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (-1), (int) '#', 0.0d);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray7);
        double[] doubleArray13 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray14 = new double[] {};
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray13, doubleArray14);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray13);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) 10, (double) (byte) 1);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray13, (int) (byte) 0, (int) (short) 100);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray22, (double) (byte) 10, 3, (double) 3);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray7, doubleArray22);
        java.lang.Double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new java.lang.Double[] { 10.0d, (-1.0d), 35.0d, 1.0d });
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray9);
        java.lang.Integer[] intArray11 = org.apache.commons.lang3.ArrayUtils.toObject(intArray9);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray11, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap14 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '-1', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1) });
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.lang.Float[] floatArray0 = null;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        org.junit.Assert.assertNull(floatArray1);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        boolean[] booleanArray19 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray26 = new boolean[] { true, false, false, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray33 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray40 = new boolean[] { true, false, false, true, false, true };
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray33, booleanArray40);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray19, booleanArray40);
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray42);
        boolean[] booleanArray49 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray56 = new boolean[] { true, false, false, true, false, true };
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray49, booleanArray56);
        boolean[] booleanArray63 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray70 = new boolean[] { true, false, false, true, false, true };
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray63, booleanArray70);
        boolean[] booleanArray77 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray84 = new boolean[] { true, false, false, true, false, true };
        boolean boolean85 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray77, booleanArray84);
        boolean[] booleanArray86 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray63, booleanArray84);
        boolean[] booleanArray87 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray49, booleanArray86);
        boolean[] booleanArray89 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray87, 6);
        boolean boolean90 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray43, booleanArray89);
        boolean[] booleanArray93 = org.apache.commons.lang3.ArrayUtils.add(booleanArray89, 4, true);
        int int95 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray93, false);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray33);
        assertBooleanArrayEquals(booleanArray33, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray40);
        assertBooleanArrayEquals(booleanArray40, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(booleanArray42);
        assertBooleanArrayEquals(booleanArray42, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray43);
        assertBooleanArrayEquals(booleanArray43, new boolean[] { true, true, true, true, false, true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray49);
        assertBooleanArrayEquals(booleanArray49, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray56);
        assertBooleanArrayEquals(booleanArray56, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(booleanArray63);
        assertBooleanArrayEquals(booleanArray63, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray70);
        assertBooleanArrayEquals(booleanArray70, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(booleanArray77);
        assertBooleanArrayEquals(booleanArray77, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray84);
        assertBooleanArrayEquals(booleanArray84, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(booleanArray86);
        assertBooleanArrayEquals(booleanArray86, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray87);
        assertBooleanArrayEquals(booleanArray87, new boolean[] { true, true, true, true, false, true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray89);
        assertBooleanArrayEquals(booleanArray89, new boolean[] { true, true, true, true, false, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(booleanArray93);
        assertBooleanArrayEquals(booleanArray93, new boolean[] { true, true, true, true, true, false, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 14 + "'", int95 == 14);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        short[] shortArray5 = new short[] { (byte) 100, (byte) -1, (short) 10, (short) 10, (short) -1 };
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray5);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6, (short) (byte) 0);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) 0);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray8, shortArray9);
        short[] shortArray18 = new short[] { (short) 0, (short) 0, (byte) -1, (byte) 100, (byte) 10 };
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray18, (short) 1, (int) (byte) 0);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray18, (short) 0);
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray18, (short) 10);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray25, (short) 100);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray12, shortArray25);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray25, (short) (byte) -1);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new java.lang.Short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] { (short) 0, (short) 0, (short) -1, (short) 100, (short) 10 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray23, new short[] { (short) 0, (short) -1, (short) 100, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new short[] { (short) 0, (short) 0, (short) -1, (short) 100 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray1);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(intArray1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = org.apache.commons.lang3.ArrayUtils.remove(intArray1, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int[] intArray6 = new int[] { (-1) };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, 100, 0);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, 0, (int) (byte) 1);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray6, (int) ' ');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray1, intArray14);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.clone(intArray14);
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int[] intArray21 = new int[] { '#', (short) 10, 4 };
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray21, (int) '#', (int) ' ');
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray17, intArray21);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.subarray(intArray17, 3, 1);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray16, intArray28);
        java.lang.Integer[] intArray30 = org.apache.commons.lang3.ArrayUtils.toObject(intArray16);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = org.apache.commons.lang3.ArrayUtils.add(intArray16, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] {});
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 35, 10, 4 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new java.lang.Integer[] { (-1) });
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        float[] floatArray4 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray9 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray9, (int) (byte) 10, 100);
        float[] floatArray16 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray12, floatArray16);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray12);
        java.lang.Float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray4);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray19);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray19);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray21, (float) 100L, 1);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new java.lang.Float[] { 2.0f, 10.0f, 97.0f, 2.0f });
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray1);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 3);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(intArray1, 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.lang.Double[] doubleArray0 = null;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) 0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        short[] shortArray9 = new short[] { (short) 0, (short) 0, (byte) -1, (byte) 100, (byte) 10 };
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray9, (short) 1, (int) (byte) 0);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray9, (short) 0);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray14);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.remove(shortArray15, 0);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray15);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] {});
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] { (short) 0, (short) 0, (short) -1, (short) 100, (short) 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 0, (short) -1, (short) 100, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 0, (short) -1, (short) 100, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) -1, (short) 100, (short) 10 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray0);
        java.lang.Comparable<java.lang.String>[] strComparableArray2 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Comparable<java.lang.String>[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strComparableArray2);
        org.junit.Assert.assertArrayEquals(strComparableArray2, new java.lang.String[] {});
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 0, 5 };
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray5, (int) (short) -1);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray8, (int) (byte) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 1, 0, 5 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 5 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 0, 5 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1, 0, 5 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1, 0, 5 });
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, 0);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray9);
        java.lang.Integer[] intArray11 = org.apache.commons.lang3.ArrayUtils.toObject(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap12 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '-1', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { (-1) });
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        double[] doubleArray4 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray4);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.add(doubleArray4, (double) (-1));
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray9, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 35.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 35.0d, (-1.0d), 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 35.0d, (-1.0d), 10.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        double[][][] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[] doubleArray14 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[] doubleArray21 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[] doubleArray28 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[] doubleArray35 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[][] doubleArray36 = new double[][] { doubleArray7, doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        double[][] doubleArray37 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray36);
        double[][][] doubleArray38 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, doubleArray36);
        double[][][] doubleArray39 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        short[] shortArray5 = new short[] { (short) 0, (short) 0, (byte) -1, (byte) 100, (byte) 10 };
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray5, (short) 1, (int) (byte) 0);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray5, (short) 0);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.clone(shortArray10);
        short[] shortArray17 = new short[] { (byte) 100, (byte) -1, (short) 10, (short) 10, (short) -1 };
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray17);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18, (short) (byte) 0);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray20, (int) '4', (int) 'a');
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray11, shortArray23);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray23, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.remove(shortArray23, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 0, (short) 0, (short) -1, (short) 100, (short) 10 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 0, (short) -1, (short) 100, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) -1, (short) 100, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new java.lang.Short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray23, new short[] {});
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] { (short) 0, (short) -1, (short) 100, (short) 10 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        long[] longArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 0);
        java.lang.Byte[] byteArray13 = new java.lang.Byte[] { (byte) 0, (byte) 1, (byte) 100 };
        java.lang.Byte[][] byteArray14 = new java.lang.Byte[][] { byteArray13 };
        java.lang.Byte[][] byteArray15 = org.apache.commons.lang3.ArrayUtils.toArray(byteArray14);
        float[] floatArray20 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray25 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray25, (int) (byte) 10, 100);
        float[] floatArray32 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray28, floatArray32);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray20, floatArray28);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray15, (java.lang.Object) floatArray20);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray7, floatArray20);
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.clone(floatArray36);
        java.lang.Float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray37);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new java.lang.Byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertArrayEquals(floatArray32, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertArrayEquals(floatArray34, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertArrayEquals(floatArray36, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertArrayEquals(floatArray37, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertArrayEquals(floatArray38, new java.lang.Float[] { 2.0f, 10.0f, 97.0f, 2.0f });
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, false };
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { true, false };
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { true, false };
        java.lang.Boolean[] booleanArray11 = new java.lang.Boolean[] { true, false };
        java.lang.Boolean[] booleanArray14 = new java.lang.Boolean[] { true, false };
        java.lang.Boolean[][] booleanArray15 = new java.lang.Boolean[][] { booleanArray2, booleanArray5, booleanArray8, booleanArray11, booleanArray14 };
        java.lang.Boolean[][] booleanArray18 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray15, 3, (int) 'a');
        java.util.Map<java.lang.Object, java.lang.Object> objMap19 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) booleanArray18);
        long[] longArray27 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray27, 100L);
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.add(longArray27, 4, 100L);
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray27, longArray33);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray27, (long) (short) 1, 13);
        java.lang.Long[] longArray38 = org.apache.commons.lang3.ArrayUtils.toObject(longArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[][] serializableArray39 = org.apache.commons.lang3.ArrayUtils.add((java.io.Serializable[][]) booleanArray18, 10, (java.io.Serializable[]) longArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertArrayEquals(booleanArray2, new java.lang.Boolean[] { true, false });
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertArrayEquals(booleanArray5, new java.lang.Boolean[] { true, false });
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertArrayEquals(booleanArray8, new java.lang.Boolean[] { true, false });
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertArrayEquals(booleanArray11, new java.lang.Boolean[] { true, false });
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertArrayEquals(booleanArray14, new java.lang.Boolean[] { true, false });
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(objMap19);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertArrayEquals(longArray32, new long[] { 32L, 10L, 0L, (-1L), 100L, 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertArrayEquals(longArray38, new java.lang.Long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 10);
        java.lang.Byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new java.lang.Byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) 0);
        java.lang.String str4 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) shortArray2, "hi!");
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.clone(shortArray2);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray2, (short) (byte) 100);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray2, (short) 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray2, (int) (byte) 1, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        float[] floatArray4 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray9 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray9, (int) (byte) 10, 100);
        float[] floatArray16 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray12, floatArray16);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray12);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray18, (float) (byte) 10, (int) '4');
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray18, (float) 13, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.remove(floatArray18, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        char[] charArray4 = new char[] { '#', ' ', '#', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 1, '#');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.subarray(charArray4, (int) ' ', (int) (byte) 10);
        char[] charArray17 = new char[] { '#', ' ', '#', '#' };
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.add(charArray17, 1, '#');
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.add(charArray17, 'a');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray4, charArray22);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray25 = org.apache.commons.lang3.ArrayUtils.remove(charArray4, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 14, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        char[] charArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray0, 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, (long) 4);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) (short) 0);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray6, (int) '#', 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray15, (long) '4', 0);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray15, 0L);
        java.lang.Class<?> wildcardClass21 = longArray15.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1, true);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.add(booleanArray3, false);
        boolean[] booleanArray11 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray18 = new boolean[] { true, false, false, true, false, true };
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray11, booleanArray18);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray18, false);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray18, false);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray3, booleanArray23);
        java.lang.Boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray3);
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray25, true);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray25, false);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertArrayEquals(booleanArray1, new java.lang.Boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { false, false });
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray18);
        assertBooleanArrayEquals(booleanArray18, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(booleanArray23);
        assertBooleanArrayEquals(booleanArray23, new boolean[] { true, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertArrayEquals(booleanArray25, new java.lang.Boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray27);
        assertBooleanArrayEquals(booleanArray27, new boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray29);
        assertBooleanArrayEquals(booleanArray29, new boolean[] { false });
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray6 = new double[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray5, doubleArray6);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, 1.0d, (int) 'a', (double) (-1));
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray6, (double) 100.0f);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 5, (-1), (double) 6);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray6);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray6, 0.0d, 13, (double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 1);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray7, (byte) 100);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray7, (byte) 100);
        java.lang.Class<?> wildcardClass14 = byteArray13.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, (long) 4);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray6, (int) (short) 0, (-1));
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, 0L);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.remove(longArray15, 1);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(longArray15, (long) 2);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray15);
        long[] longArray27 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray27, 100L);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray27, (long) 4);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(longArray27, (long) 10);
        long[] longArray36 = org.apache.commons.lang3.ArrayUtils.add(longArray27, (int) (byte) 1, (long) (byte) 1);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray15, longArray36);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.subarray(longArray15, 3, 1);
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray15, (long) 10, 13);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] {});
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { (-1L), 32L, (-1L), 10L, 32L });
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 32L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertArrayEquals(longArray36, new long[] { 32L, 1L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertArrayEquals(longArray40, new long[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, (long) 4);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray6, (int) (short) 0, (-1));
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, 0L);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.remove(longArray15, 1);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(longArray15, (long) 2);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray15);
        long[] longArray27 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray27, 100L);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray27, (long) 4);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(longArray27, (long) 10);
        long[] longArray36 = org.apache.commons.lang3.ArrayUtils.add(longArray27, (int) (byte) 1, (long) (byte) 1);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray15, longArray36);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.subarray(longArray15, 3, 1);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray43 = org.apache.commons.lang3.ArrayUtils.add(longArray40, (int) (short) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] {});
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { (-1L), 32L, (-1L), 10L, 32L });
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 32L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertArrayEquals(longArray36, new long[] { 32L, 1L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertArrayEquals(longArray40, new long[] {});
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (short) 1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.add(doubleArray2, (double) (short) 0);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray4, (double) ' ');
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) (short) 1);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray4, (double) (-1.0f));
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.add(doubleArray4, (double) '#');
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) ' ', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.add(doubleArray4, (int) (byte) 10, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        float[] floatArray2 = new float[] { (-1.0f), 100.0f };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray2);
        java.lang.Float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray2);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (short) 1, (float) (byte) -1);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray7, (float) 4);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.remove(floatArray9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new float[] { (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new java.lang.Float[] { (-1.0f), 100.0f });
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { (-1.0f), (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { (-1.0f), (-1.0f), 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 0);
        java.lang.Byte[] byteArray13 = new java.lang.Byte[] { (byte) 0, (byte) 1, (byte) 100 };
        java.lang.Byte[][] byteArray14 = new java.lang.Byte[][] { byteArray13 };
        java.lang.Byte[][] byteArray15 = org.apache.commons.lang3.ArrayUtils.toArray(byteArray14);
        float[] floatArray20 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray25 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray25, (int) (byte) 10, 100);
        float[] floatArray32 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray28, floatArray32);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray20, floatArray28);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray15, (java.lang.Object) floatArray20);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray7, floatArray20);
        float[] floatArray38 = new float[] { 1 };
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray38);
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray36, floatArray38);
        float[] floatArray42 = org.apache.commons.lang3.ArrayUtils.add(floatArray38, (float) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray45 = org.apache.commons.lang3.ArrayUtils.add(floatArray42, (int) (short) 100, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new java.lang.Byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertArrayEquals(floatArray32, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertArrayEquals(floatArray34, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertArrayEquals(floatArray36, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertArrayEquals(floatArray38, new float[] { 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertArrayEquals(floatArray40, new float[] { 2.0f, 10.0f, 97.0f, 2.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertArrayEquals(floatArray42, new float[] { 1.0f, 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.lang.Object obj0 = null;
        java.lang.String str1 = org.apache.commons.lang3.ArrayUtils.toString(obj0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        float[] floatArray4 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray9 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray9, (int) (byte) 10, 100);
        float[] floatArray16 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray12, floatArray16);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray12);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray18);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.clone(floatArray18);
        float[] floatArray23 = new float[] { (-1.0f), 100.0f };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray23);
        float[] floatArray29 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray34 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray34, (int) (byte) 10, 100);
        float[] floatArray41 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray37, floatArray41);
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray29, floatArray37);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray43);
        float[] floatArray45 = org.apache.commons.lang3.ArrayUtils.clone(floatArray43);
        float[] floatArray46 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray23, floatArray45);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray20, floatArray46);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.contains(floatArray46, (float) (byte) -1);
        float[] floatArray51 = org.apache.commons.lang3.ArrayUtils.remove(floatArray46, 0);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new float[] { (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertArrayEquals(floatArray29, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertArrayEquals(floatArray34, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertArrayEquals(floatArray37, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertArrayEquals(floatArray41, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertArrayEquals(floatArray43, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertArrayEquals(floatArray45, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertArrayEquals(floatArray46, new float[] { (-1.0f), 100.0f, 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertArrayEquals(floatArray51, new float[] { 100.0f, 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (byte) 1, 100);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray17, (byte) -1, (int) '#');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        long[] longArray4 = new long[] { 0L, (short) -1, 10, 1 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, (long) (short) 0);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.add(longArray4, (long) 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray4, (long) (byte) 10, (-1));
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.clone(longArray4);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray12, (long) 1);
        long[] longArray21 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray21, 100L);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray21, (long) 4);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray21, (long) (short) 0);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.subarray(longArray21, (int) '#', 0);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray14, longArray21);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray14, (long) (short) -1);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 0L, (-1L), 10L, 1L });
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { (-1L), 10L, 1L });
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 0L, (-1L), 10L, 1L, 0L });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 0L, (-1L), 10L, 1L });
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 0L, (-1L), 10L });
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertArrayEquals(longArray30, new long[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        short[] shortArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 0);
        java.lang.Byte[] byteArray13 = new java.lang.Byte[] { (byte) 0, (byte) 1, (byte) 100 };
        java.lang.Byte[][] byteArray14 = new java.lang.Byte[][] { byteArray13 };
        java.lang.Byte[][] byteArray15 = org.apache.commons.lang3.ArrayUtils.toArray(byteArray14);
        float[] floatArray20 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray25 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray25, (int) (byte) 10, 100);
        float[] floatArray32 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray28, floatArray32);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray20, floatArray28);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray15, (java.lang.Object) floatArray20);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray7, floatArray20);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray39 = org.apache.commons.lang3.ArrayUtils.add(floatArray36, (int) '4', (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new java.lang.Byte[] { (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertArrayEquals(floatArray32, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertArrayEquals(floatArray34, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertArrayEquals(floatArray36, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray7 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray7, 100L);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray7, (long) 4);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.subarray(longArray7, (int) (short) 0, (-1));
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray14, (long) (short) 0);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.addAll(longArray0, longArray14);
        java.lang.Long[] longArray18 = org.apache.commons.lang3.ArrayUtils.toObject(longArray0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] {});
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new java.lang.Long[] {});
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        char[] charArray4 = new char[] { '#' };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray4, 'a');
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray0, (java.lang.Object) int6);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray8, (short) 0);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray8, (short) 10, 4);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray8, (short) 1);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray0, (java.lang.Object) shortArray8);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray12, (int) 'a', 10);
        java.lang.Byte[] byteArray22 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray22);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.add(byteArray23, (byte) 1);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray23);
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray33, (byte) 1, (int) (byte) 1);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray33, (-1), (int) (short) 10);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray33, (byte) 10);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray33);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.contains(byteArray33, (byte) -1);
        byte[] byteArray51 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int54 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray51, (byte) 1, (int) (byte) 1);
        byte[] byteArray57 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray51, (-1), (int) (short) 10);
        byte[] byteArray59 = org.apache.commons.lang3.ArrayUtils.add(byteArray51, (byte) 100);
        byte[] byteArray62 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray51, (int) (byte) 1, 100);
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray51);
        byte[] byteArray65 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray51, (byte) -1);
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray33, byteArray51);
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray51);
        java.lang.String str68 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) boolean67);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "false" + "'", str68, "false");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) 8);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new java.lang.Long[] {});
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] {});
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertArrayEquals(longArray3, new long[] {});
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) -1);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        double[] doubleArray2 = new double[] { 3, 1L };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray2, (double) 10.0f, (double) 100);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray2);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) 0L);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 1.0f, (double) 3);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 3.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 3.0d, 1.0d });
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 3.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int[] intArray6 = new int[] { (-1) };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, 100, 0);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, 0, (int) (byte) 1);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray6, (int) ' ');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray1, intArray14);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.clone(intArray14);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray14, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        boolean[] booleanArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray0, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        float[] floatArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, (float) 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        double[] doubleArray4 = new double[] { 10.0f, 100.0f, (short) 10, (-1) };
        double[] doubleArray9 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray10 = new double[] {};
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray9, doubleArray10);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, 1.0d, (int) 'a', (double) (-1));
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray10);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray10);
        double[] doubleArray22 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray23 = new double[] {};
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray22, doubleArray23);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, 1.0d, (int) 'a', (double) (-1));
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray23);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray23);
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray23, (double) (byte) -1);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray32);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray32, (double) 0, 1, (double) 3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, (long) 4);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray6, (int) (short) 0, (-1));
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray13, 0L);
        java.lang.Long[] longArray16 = org.apache.commons.lang3.ArrayUtils.toObject(longArray13);
        java.lang.Short[] shortArray18 = new java.lang.Short[] { (short) -1 };
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18, (short) (byte) 100);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) longArray16, (java.lang.Object) shortArray18);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.remove(shortArray23, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 16, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new java.lang.Long[] {});
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new java.lang.Short[] { (short) -1 });
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] { (short) -1 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray23, new short[] { (short) -1 });
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        int[] intArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 10L, 10L, 0L, 1L };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray5);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray5);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.remove(longArray7, 0);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray9);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray9, (-1L));
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new java.lang.Long[] { 100L, 10L, 10L, 0L, 1L });
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 100L, 10L, 10L, 0L, 1L });
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] { 100L, 10L, 10L, 0L, 1L });
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertArrayEquals(longArray9, new long[] { 10L, 10L, 0L, 1L });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        boolean[] booleanArray19 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray26 = new boolean[] { true, false, false, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray33 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray40 = new boolean[] { true, false, false, true, false, true };
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray33, booleanArray40);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray19, booleanArray40);
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray42);
        boolean[] booleanArray49 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray56 = new boolean[] { true, false, false, true, false, true };
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray49, booleanArray56);
        boolean[] booleanArray63 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray70 = new boolean[] { true, false, false, true, false, true };
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray63, booleanArray70);
        boolean[] booleanArray77 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray84 = new boolean[] { true, false, false, true, false, true };
        boolean boolean85 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray77, booleanArray84);
        boolean[] booleanArray86 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray63, booleanArray84);
        boolean[] booleanArray87 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray49, booleanArray86);
        boolean[] booleanArray89 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray87, 6);
        boolean boolean90 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray43, booleanArray89);
        boolean boolean91 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray89);
        int int93 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray89, true);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray33);
        assertBooleanArrayEquals(booleanArray33, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray40);
        assertBooleanArrayEquals(booleanArray40, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(booleanArray42);
        assertBooleanArrayEquals(booleanArray42, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray43);
        assertBooleanArrayEquals(booleanArray43, new boolean[] { true, true, true, true, false, true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray49);
        assertBooleanArrayEquals(booleanArray49, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray56);
        assertBooleanArrayEquals(booleanArray56, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(booleanArray63);
        assertBooleanArrayEquals(booleanArray63, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray70);
        assertBooleanArrayEquals(booleanArray70, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(booleanArray77);
        assertBooleanArrayEquals(booleanArray77, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray84);
        assertBooleanArrayEquals(booleanArray84, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(booleanArray86);
        assertBooleanArrayEquals(booleanArray86, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray87);
        assertBooleanArrayEquals(booleanArray87, new boolean[] { true, true, true, true, false, true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray89);
        assertBooleanArrayEquals(booleanArray89, new boolean[] { true, true, true, true, false, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        double[] doubleArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (short) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        char[] charArray4 = new char[] { '#', ' ', '#', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 1, '#');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.subarray(charArray4, (int) ' ', (int) (byte) 10);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray12, '#');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = org.apache.commons.lang3.ArrayUtils.remove(charArray14, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 14, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        int[] intArray0 = null;
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, (int) '#', (int) (short) -1);
        org.junit.Assert.assertNull(intArray3);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray7 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray7, 100L);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray7, (long) 4);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.subarray(longArray7, (int) (short) 0, (-1));
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray14, (long) (short) 0);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.addAll(longArray0, longArray14);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray14, (long) 2, (int) (byte) 10);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray14, (long) 6);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1, true);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray3, true);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray3, true, (int) (byte) 10);
        boolean[] booleanArray14 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray21 = new boolean[] { true, false, false, true, false, true };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray14, booleanArray21);
        boolean[] booleanArray28 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray35 = new boolean[] { true, false, false, true, false, true };
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray28, booleanArray35);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray14, booleanArray35);
        boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray3, booleanArray14);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray3, false, 100);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertArrayEquals(booleanArray1, new java.lang.Boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] { false });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray35);
        assertBooleanArrayEquals(booleanArray35, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(booleanArray37);
        assertBooleanArrayEquals(booleanArray37, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray38);
        assertBooleanArrayEquals(booleanArray38, new boolean[] { false, true, true, true, true, false });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        float[] floatArray12 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray17 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray17, (int) (byte) 10, 100);
        float[] floatArray24 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray20, floatArray24);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray12, floatArray20);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray7, floatArray20);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray20, (float) '4');
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.add(floatArray20, (float) 2);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.remove(floatArray31, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertArrayEquals(floatArray29, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertArrayEquals(floatArray31, new float[] { 2.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (short) 1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.add(doubleArray2, (double) (short) 0);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray4, (double) ' ');
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) (short) 1);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray4, (double) (-1.0f));
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.add(doubleArray4, (double) '#');
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray4);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, 0.0d, 0, (double) '4');
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) (short) 1);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray2, 0L, 0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new java.lang.Long[] {});
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) (byte) 1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) 10, 0);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(shortArray0, (short) (byte) 1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(shortArray0, (short) 0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        char[] charArray4 = new char[] { '#', ' ', '#', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 1, '#');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(charArray7, '4');
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, ' ');
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a');
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, '#', 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, ' ');
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray7, 'a', (int) '4');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.Byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray19);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.remove(byteArray19, 2);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray19, (int) (byte) 1, (int) (byte) 100);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray25);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray25);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray25, (byte) 10);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray25, (byte) 1, 4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new java.lang.Byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 1, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 1, (byte) -1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 0);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray7, (float) 100L, (int) '#');
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray7, (float) 100);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        int[] intArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray2);
        char[] charArray6 = new char[] { ' ', ' ' };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray2, charArray6);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray2, 'a');
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray10, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray12);
        char[] charArray16 = new char[] { ' ', ' ' };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray12, charArray16);
        java.lang.Character[] charArray18 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray18, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray20);
        char[] charArray24 = new char[] { ' ', ' ' };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray20, charArray24);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.add(charArray20, 'a');
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray16, charArray20);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.addAll(charArray2, charArray20);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray29, '4', 5);
        long[] longArray39 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray39, 100L);
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray39, (long) 4);
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.subarray(longArray39, (int) (short) 0, (-1));
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray46, 0L);
        java.lang.Long[] longArray49 = org.apache.commons.lang3.ArrayUtils.toObject(longArray46);
        long[] longArray50 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray49);
        long[] longArray57 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int59 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray57, 100L);
        long[] longArray61 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray57, (long) 4);
        long[] longArray64 = org.apache.commons.lang3.ArrayUtils.subarray(longArray57, (int) (short) 0, (-1));
        int int66 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray64, (long) (short) 0);
        long[] longArray67 = org.apache.commons.lang3.ArrayUtils.addAll(longArray50, longArray64);
        float[] floatArray68 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        boolean boolean69 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray50, (java.lang.Object) floatArray68);
        boolean boolean70 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) int32, (java.lang.Object) boolean69);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertArrayEquals(longArray39, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertArrayEquals(longArray43, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertArrayEquals(longArray46, new long[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertArrayEquals(longArray49, new java.lang.Long[] {});
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertArrayEquals(longArray50, new long[] {});
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertArrayEquals(longArray57, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertArrayEquals(longArray61, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertArrayEquals(longArray64, new long[] {});
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertArrayEquals(longArray67, new long[] {});
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertArrayEquals(floatArray68, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.Boolean[] booleanArray0 = null;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, true);
        org.junit.Assert.assertNull(booleanArray2);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 13, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        double[] doubleArray4 = new double[] { 10.0f, 100.0f, (short) 10, (-1) };
        double[] doubleArray9 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray10 = new double[] {};
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray9, doubleArray10);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, 1.0d, (int) 'a', (double) (-1));
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray10);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray10);
        double[] doubleArray22 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray23 = new double[] {};
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray22, doubleArray23);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, 1.0d, (int) 'a', (double) (-1));
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray23);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray23);
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray23, (double) (byte) -1);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray32);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray33, 10.0d, 3, (double) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = org.apache.commons.lang3.ArrayUtils.remove(intArray1, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 16, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, (-1) });
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        double[] doubleArray4 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray5);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.add(doubleArray5, (double) 100);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray9, (double) (-1), (int) '#', 0.0d);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) 100);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray9);
        java.lang.Double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray16);
        java.util.Map<java.lang.Object, java.lang.Object> objMap18 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray17);
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray17, (double) 100);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray20, (double) (short) 0);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray8, doubleArray22);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.add(doubleArray22, (int) '#', (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(objMap18);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        float[] floatArray11 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray7, floatArray11);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray11, (int) (byte) 10, (int) ' ');
        java.lang.Float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray11);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new java.lang.Float[] { 1.0f, 3.0f, 0.0f });
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.lang.Short[] shortArray0 = null;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0);
        org.junit.Assert.assertNull(shortArray1);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray0);
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray4);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5, (short) (byte) 10);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray9);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray3, (short) 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray12, (short) (byte) 1, (int) ' ');
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] {});
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] {});
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] {});
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] {});
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] {});
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) 0);
        java.lang.String str4 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) shortArray2, "hi!");
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.clone(shortArray2);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.add(shortArray2, (int) (byte) 0, (short) -1);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray9, (short) 0);
        java.lang.String str13 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) shortArray11, "hi!");
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray8, shortArray11);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray11, 3, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.add(shortArray11, (int) (short) 100, (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] {});
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] { (short) -1 });
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] {});
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] {});
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.Long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) (short) -1);
        org.junit.Assert.assertNull(longArray2);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        char[] charArray4 = new char[] { '#', ' ', '#', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 1, '#');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray4);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray4, ' ');
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray4);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray4, '4', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = org.apache.commons.lang3.ArrayUtils.remove(charArray4, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', '#', ' ', '#' });
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) (byte) 1);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 0);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) (byte) 1);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(shortArray7, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.add(shortArray7, (int) (short) 10, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] {});
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 0 });
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        float[] floatArray2 = new float[] { (-1.0f), 100.0f };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray2);
        java.lang.Float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray2);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (short) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray8, (float) 100, (int) 'a');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new float[] { (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new java.lang.Float[] { (-1.0f), 100.0f });
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { (-1.0f), (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new float[] { (-1.0f), (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        double[][][] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[] doubleArray14 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[] doubleArray21 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[] doubleArray28 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[] doubleArray35 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[][] doubleArray36 = new double[][] { doubleArray7, doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        double[][] doubleArray37 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray36);
        double[][][] doubleArray38 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, doubleArray36);
        java.lang.Character[] charArray39 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray39, 'a');
        char[] charArray42 = org.apache.commons.lang3.ArrayUtils.clone(charArray41);
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.add(charArray41, 'a');
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) doubleArray0, (java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] {});
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 0, 5 };
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, 4);
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.toObject(intArray4);
        java.lang.String str9 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray4, "");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 1, 0, 5 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 5 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 1, 0, 5 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{1,0,5}" + "'", str9, "{1,0,5}");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray0);
        short[] shortArray4 = new short[] { (short) 100, (byte) 100 };
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray0, shortArray4);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray6);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 0);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray9);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 100, (short) 100 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] { (short) 0 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        boolean[] booleanArray19 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray26 = new boolean[] { true, false, false, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray26);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray28, true);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray28, 13, (int) (short) 0);
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.add(booleanArray28, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray35);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(booleanArray33);
        assertBooleanArrayEquals(booleanArray33, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray35);
        assertBooleanArrayEquals(booleanArray35, new boolean[] { false, true, false, true, false, false, true, false, true, true, true, true });
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (byte) 1, 100);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray26, (byte) 1, (int) (byte) 1);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray26, (-1), (int) (short) 10);
        byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.add(byteArray26, (byte) 100);
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray26, (int) (byte) 1, 100);
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int47 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray44, (byte) 1, (int) (byte) 1);
        byte[] byteArray50 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray44, (-1), (int) (short) 10);
        byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray50, (int) 'a', 10);
        java.lang.Byte[] byteArray60 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray61 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray60);
        byte[] byteArray63 = org.apache.commons.lang3.ArrayUtils.add(byteArray61, (byte) 1);
        byte[] byteArray64 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray50, byteArray61);
        byte[] byteArray65 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray37, byteArray64);
        byte[] byteArray67 = org.apache.commons.lang3.ArrayUtils.remove(byteArray65, 2);
        byte[] byteArray68 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray65);
        int int70 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray68, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 20 + "'", int70 == 20);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 0, 5 };
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, 4);
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.toObject(intArray4);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, (int) (short) 100);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 5, 5);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 1, 0, 5 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 5 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 1, 0, 5 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        short[] shortArray5 = new short[] { (byte) 100, (byte) -1, (short) 10, (short) 10, (short) -1 };
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray5);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray7);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray8);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, (int) (short) 0, (short) 10);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray5, shortArray12);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray13, 4, 2);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray17);
        short[] shortArray21 = new short[] { (short) 100, (byte) 100 };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray17, shortArray21);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray13, shortArray17);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new java.lang.Short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] {});
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] {});
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 10 });
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] {});
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] {});
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] { (short) 100, (short) 100 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.lang.Integer[][][][] intArray0 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray1 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray2 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray3 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray4 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][][] intArray5 = new java.lang.Integer[][][][][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        java.lang.Integer[][][][] intArray6 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray7 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray8 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray9 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray10 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][][] intArray11 = new java.lang.Integer[][][][][] { intArray6, intArray7, intArray8, intArray9, intArray10 };
        java.lang.Integer[][][][] intArray12 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray13 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray14 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray15 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray16 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][][] intArray17 = new java.lang.Integer[][][][][] { intArray12, intArray13, intArray14, intArray15, intArray16 };
        java.lang.Integer[][][][] intArray18 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray19 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray20 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray21 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray22 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][][] intArray23 = new java.lang.Integer[][][][][] { intArray18, intArray19, intArray20, intArray21, intArray22 };
        java.lang.Integer[][][][][][] intArray24 = new java.lang.Integer[][][][][][] { intArray5, intArray11, intArray17, intArray23 };
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.Byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray29);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.remove(byteArray29, 2);
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray29, (int) (byte) 1, (int) (byte) 100);
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.clone(byteArray29);
        byte[] byteArray41 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.Byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray41);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray42);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray42);
        byte[] byteArray51 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int54 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray51, (byte) 1, (int) (byte) 1);
        byte[] byteArray57 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray51, (-1), (int) (short) 10);
        byte[] byteArray59 = org.apache.commons.lang3.ArrayUtils.add(byteArray51, (byte) 100);
        byte[] byteArray62 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray51, (int) (byte) 1, 100);
        byte[] byteArray69 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int72 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray69, (byte) 1, (int) (byte) 1);
        byte[] byteArray75 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray69, (-1), (int) (short) 10);
        byte[] byteArray78 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray75, (int) 'a', 10);
        java.lang.Byte[] byteArray85 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray86 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray85);
        byte[] byteArray88 = org.apache.commons.lang3.ArrayUtils.add(byteArray86, (byte) 1);
        byte[] byteArray89 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray75, byteArray86);
        byte[] byteArray90 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray62, byteArray89);
        byte[] byteArray91 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray44, byteArray90);
        byte[] byteArray92 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray36, byteArray44);
        java.lang.Integer[][][][][][] intArray93 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray24, (java.lang.Object) byteArray92);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new java.lang.Integer[][][][] {});
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new java.lang.Byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new java.lang.Byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(intArray93);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray12, (int) 'a', 10);
        java.lang.Byte[] byteArray22 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray22);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.add(byteArray23, (byte) 1);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray23);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray26, 0, 5);
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray36, (byte) 1, (int) (byte) 1);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray36, (-1), (int) (short) 10);
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray42, (int) 'a', 10);
        java.lang.Byte[] byteArray52 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray52);
        byte[] byteArray55 = org.apache.commons.lang3.ArrayUtils.add(byteArray53, (byte) 1);
        byte[] byteArray56 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray42, byteArray53);
        byte[] byteArray63 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int66 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray63, (byte) 1, (int) (byte) 1);
        byte[] byteArray69 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray63, (-1), (int) (short) 10);
        int int71 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray63, (byte) 10);
        byte[] byteArray72 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray42, byteArray63);
        java.lang.Byte[] byteArray73 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray42);
        byte[] byteArray74 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray29, byteArray42);
        int int76 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray74, (byte) 100);
        java.lang.Object obj77 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) int76, obj77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new java.lang.Byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.lang.Byte[] byteArray1 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[] byteArray3 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[][] byteArray4 = new java.lang.Byte[][] { byteArray1, byteArray3 };
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[] byteArray8 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[][] byteArray9 = new java.lang.Byte[][] { byteArray6, byteArray8 };
        java.lang.Byte[] byteArray11 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[] byteArray13 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[][] byteArray14 = new java.lang.Byte[][] { byteArray11, byteArray13 };
        java.lang.Byte[] byteArray16 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[] byteArray18 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[][] byteArray19 = new java.lang.Byte[][] { byteArray16, byteArray18 };
        java.lang.Byte[] byteArray21 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[] byteArray23 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[][] byteArray24 = new java.lang.Byte[][] { byteArray21, byteArray23 };
        java.lang.Byte[][][] byteArray25 = new java.lang.Byte[][][] { byteArray4, byteArray9, byteArray14, byteArray19, byteArray24 };
        java.lang.Byte[][][] byteArray28 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray25, (int) '#', 1);
        java.lang.Byte[] byteArray30 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[] byteArray32 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[][] byteArray33 = new java.lang.Byte[][] { byteArray30, byteArray32 };
        java.lang.Byte[] byteArray35 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[] byteArray37 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[][] byteArray38 = new java.lang.Byte[][] { byteArray35, byteArray37 };
        java.lang.Byte[] byteArray40 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[] byteArray42 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[][] byteArray43 = new java.lang.Byte[][] { byteArray40, byteArray42 };
        java.lang.Byte[] byteArray45 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[] byteArray47 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[][] byteArray48 = new java.lang.Byte[][] { byteArray45, byteArray47 };
        java.lang.Byte[] byteArray50 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[] byteArray52 = new java.lang.Byte[] { (byte) 10 };
        java.lang.Byte[][] byteArray53 = new java.lang.Byte[][] { byteArray50, byteArray52 };
        java.lang.Byte[][][] byteArray54 = new java.lang.Byte[][][] { byteArray33, byteArray38, byteArray43, byteArray48, byteArray53 };
        java.lang.Byte[][][] byteArray57 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray54, (int) '#', 1);
        java.lang.Byte[][][] byteArray58 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray28, byteArray57);
        double[] doubleArray65 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[] doubleArray72 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[] doubleArray79 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[] doubleArray86 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[] doubleArray93 = new double[] { 1.0f, ' ', 0.0f, 1L, (short) 1, (short) 10 };
        double[][] doubleArray94 = new double[][] { doubleArray65, doubleArray72, doubleArray79, doubleArray86, doubleArray93 };
        double[][] doubleArray95 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray94);
        boolean boolean96 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray57, (java.lang.Object[]) doubleArray95);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new java.lang.Byte[][][] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new java.lang.Byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new java.lang.Byte[][][] {});
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new java.lang.Byte[][][] {});
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertArrayEquals(doubleArray93, new double[] { 1.0d, 32.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, (long) 4);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray10, 0, 6);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray15 = org.apache.commons.lang3.ArrayUtils.remove(longArray10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        short[] shortArray5 = new short[] { (byte) 100, (byte) -1, (short) 10, (short) 10, (short) -1 };
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray5);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray7);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray8);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, (int) (short) 0, (short) 10);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray5, shortArray12);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.add(shortArray13, (int) (short) 10, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new java.lang.Short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] {});
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] {});
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 10 });
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 100, (short) -1, (short) 10, (short) 10, (short) -1, (short) 10 });
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.Object obj0 = null;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray1, (double) (short) 1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.add(doubleArray3, (double) (short) 0);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) ' ');
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) (short) 1);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray5, (double) (-1.0f));
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray5, (double) '#');
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameType(obj0, (java.lang.Object) doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray0, (long) 0);
        org.junit.Assert.assertNull(longArray2);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.lang.Character[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, '4');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        float[] floatArray2 = new float[] { (-1.0f), 100.0f };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray2);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray2, 1, 6);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new float[] { (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] { 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) (byte) 1);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 0);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) (byte) 1);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray7, (short) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] {});
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 0 });
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1, true);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray7, (double) (short) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray9);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray9, (double) (short) -1);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray1, (java.lang.Object) doubleArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1, false);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertArrayEquals(booleanArray1, new java.lang.Boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray4);
        assertBooleanArrayEquals(booleanArray4, new boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] { false });
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { false });
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        char[] charArray4 = new char[] { '#' };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray4, 'a');
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray0, (java.lang.Object) int6);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.subarray(charArray8, 3, (int) (short) -1);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, '#');
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray13, 'a');
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.toObject(charArray13);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray18 = org.apache.commons.lang3.ArrayUtils.remove(charArray13, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new java.lang.Character[] {});
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        float[] floatArray2 = new float[] { (-1.0f), 100.0f };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray2);
        float[] floatArray8 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray13 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray13, (int) (byte) 10, 100);
        float[] floatArray20 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray16, floatArray20);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray8, floatArray16);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray22);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.clone(floatArray22);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray24);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray25, (float) 1L, 4);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.clone(floatArray25);
        float[] floatArray34 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray34, (int) (byte) 10, 100);
        float[] floatArray42 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray47 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray50 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray47, (int) (byte) 10, 100);
        float[] floatArray54 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray50, floatArray54);
        float[] floatArray56 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray42, floatArray50);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray37, floatArray50);
        float[] floatArray59 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray50, (float) '4');
        float[] floatArray61 = org.apache.commons.lang3.ArrayUtils.add(floatArray50, (float) (short) 1);
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.contains(floatArray61, (float) '4');
        float[] floatArray65 = org.apache.commons.lang3.ArrayUtils.add(floatArray61, (float) 6);
        float[] floatArray68 = new float[] { (-1.0f), 100.0f };
        boolean boolean69 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray68);
        float[] floatArray74 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray79 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray82 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray79, (int) (byte) 10, 100);
        float[] floatArray86 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean87 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray82, floatArray86);
        float[] floatArray88 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray74, floatArray82);
        boolean boolean89 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray88);
        float[] floatArray90 = org.apache.commons.lang3.ArrayUtils.clone(floatArray88);
        float[] floatArray91 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray68, floatArray90);
        boolean boolean92 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray65, floatArray68);
        boolean boolean93 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray29, floatArray68);
        int int96 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray68, (float) (-1), (int) (byte) -1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new float[] { (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { (-1.0f), 100.0f, 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertArrayEquals(floatArray29, new float[] { (-1.0f), 100.0f, 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertArrayEquals(floatArray34, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertArrayEquals(floatArray37, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertArrayEquals(floatArray42, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertArrayEquals(floatArray47, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertArrayEquals(floatArray50, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertArrayEquals(floatArray54, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(floatArray56);
        org.junit.Assert.assertArrayEquals(floatArray56, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertArrayEquals(floatArray59, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertArrayEquals(floatArray61, new float[] { 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertArrayEquals(floatArray65, new float[] { 1.0f, 6.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertArrayEquals(floatArray68, new float[] { (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(floatArray74);
        org.junit.Assert.assertArrayEquals(floatArray74, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray79);
        org.junit.Assert.assertArrayEquals(floatArray79, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray82);
        org.junit.Assert.assertArrayEquals(floatArray82, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray86);
        org.junit.Assert.assertArrayEquals(floatArray86, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(floatArray88);
        org.junit.Assert.assertArrayEquals(floatArray88, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(floatArray90);
        org.junit.Assert.assertArrayEquals(floatArray90, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray91);
        org.junit.Assert.assertArrayEquals(floatArray91, new float[] { (-1.0f), 100.0f, 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, (int) '#');
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray4);
        assertBooleanArrayEquals(booleanArray4, new boolean[] {});
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.Byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray19);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.remove(byteArray19, 2);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray19, (int) (byte) 1, (int) (byte) 100);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray25);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray26, (byte) 1, (int) ' ');
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray26, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new java.lang.Byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 'a' };
        int[] intArray5 = new int[] { 'a' };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        int[][] intArray7 = org.apache.commons.lang3.ArrayUtils.toArray(intArray6);
        java.lang.Byte[] byteArray14 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray14);
        char[] charArray19 = new char[] { 'a', 'a', '4' };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(charArray19, 'a');
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray14, (java.lang.Object) charArray19);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) intArray6, (java.lang.Object) byteArray14);
        float[] floatArray28 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray28, (int) (byte) 10, 100);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray31, (float) 0);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray14, (java.lang.Object) int33, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 97 });
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 97 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'a', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertArrayEquals(floatArray31, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, 0);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.remove(byteArray14, 0);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (int) (short) 0, (byte) -1);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray16, (byte) -1, 8);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.remove(byteArray4, 2);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray4, (int) (byte) 1, (int) (byte) 100);
        java.lang.Byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray4, 10, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new java.lang.Byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new java.lang.Byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        byte[][] byteArray5 = new byte[][] { byteArray4 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        byte[][] byteArray11 = new byte[][] { byteArray10 };
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        byte[][] byteArray17 = new byte[][] { byteArray16 };
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        byte[][] byteArray23 = new byte[][] { byteArray22 };
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        byte[][] byteArray29 = new byte[][] { byteArray28 };
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        byte[][] byteArray35 = new byte[][] { byteArray34 };
        byte[][][] byteArray36 = new byte[][][] { byteArray5, byteArray11, byteArray17, byteArray23, byteArray29, byteArray35 };
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray57 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray64 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray71 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[][] byteArray72 = new byte[][] { byteArray43, byteArray50, byteArray57, byteArray64, byteArray71 };
        byte[] byteArray80 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int83 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray80, (byte) 1, (int) (byte) 1);
        byte[] byteArray86 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray80, (-1), (int) (short) 10);
        byte[] byteArray88 = org.apache.commons.lang3.ArrayUtils.remove(byteArray80, 0);
        byte[][] byteArray89 = org.apache.commons.lang3.ArrayUtils.add(byteArray72, 3, byteArray88);
        byte[][][] byteArray90 = org.apache.commons.lang3.ArrayUtils.add(byteArray36, byteArray72);
        // The following exception was thrown during execution in test generation
        try {
            byte[][][] byteArray92 = org.apache.commons.lang3.ArrayUtils.remove(byteArray90, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2 + "'", int83 == 2);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertNotNull(byteArray90);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) 0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.remove(shortArray3, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] {});
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (short) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray2);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray4);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray4, (double) ' ');
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, 0);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.remove(byteArray14, 0);
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.Byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray21);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.remove(byteArray21, 2);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray21, (int) (byte) 1, (int) (byte) 100);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray14, byteArray21);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray21, (byte) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new java.lang.Byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (short) 10, (byte) 1, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(shortArray6, (short) 0);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray6, (int) (short) 100, 6);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) 10, (int) 'a');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 100, (short) 0, (short) 10, (short) 1, (short) 0, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        char[] charArray1 = new char[] { '#' };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray1, 'a');
        char[] charArray8 = new char[] { '#', ' ', '#', '#' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 1, '#');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.addAll(charArray1, charArray8);
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray15, 'a');
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.clone(charArray17);
        java.lang.Character[] charArray19 = org.apache.commons.lang3.ArrayUtils.toObject(charArray17);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray19);
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray19, '4');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray19);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.addAll(charArray1, charArray23);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray26 = org.apache.commons.lang3.ArrayUtils.remove(charArray23, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '#' });
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) (byte) 1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) 10, 0);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray7, (short) 0);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray0, shortArray9);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(shortArray10, (short) 10);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray10, (short) 10, 3);
        java.lang.String str17 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) int15, "{true,true,true,true,false,true,false,false,true,false,true}");
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] {});
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] {});
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray1, (-1), (int) (short) 1);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.clone(intArray13);
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.subarray(intArray13, 3, (int) '#');
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray13);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray13);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 1, 0, 5 };
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray23);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray23, 10);
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray23);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray13, intArray27);
        java.lang.String str30 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) boolean28, "{false}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new java.lang.Integer[] { 1, 0, 5 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 0, 5 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 0, 5 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 0, 5 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "false" + "'", str30, "false");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        float[] floatArray2 = new float[] { (-1.0f), 100.0f };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray2);
        java.lang.Float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray2);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (short) 1, (float) (byte) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray7);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new float[] { (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new java.lang.Float[] { (-1.0f), 100.0f });
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 100.0f, (-1.0f), (-1.0f) }, (float) 1.0E-15);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        double[] doubleArray0 = null;
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 0, (int) 'a');
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 10, 2 };
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap7 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '100', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 100, 10, 2 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 10, 2 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 10, 2 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 10, 2 });
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { 100.0f };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray1, (float) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray5);
        java.lang.Float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray5);
        java.lang.Object obj8 = null;
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) floatArray7, obj8);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new java.lang.Float[] { 100.0f });
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new java.lang.Float[] { 100.0f });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray4, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 10);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.clone(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.remove(byteArray9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new java.lang.Byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1 });
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.lang.Character[] charArray0 = null;
        char[] charArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0);
        org.junit.Assert.assertNull(charArray1);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (byte) 1, 100);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray17);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.clone(byteArray17);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray17, (byte) 100, 6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray1, (-1), (int) (short) 1);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.clone(intArray13);
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.subarray(intArray13, 3, (int) '#');
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(intArray17, 20);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        char[] charArray4 = new char[] { '#', ' ', '#', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 1, '#');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(charArray7, '4');
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, ' ');
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a');
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray14, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray16);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray7, charArray16);
        int int19 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) charArray7);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#', ' ', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        float[] floatArray0 = null;
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray0, (int) '#', 0);
        org.junit.Assert.assertNull(floatArray3);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        double[] doubleArray2 = new double[] { 3, 1L };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray2, (double) 10.0f, (double) 100);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray2);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) 0L);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.add(doubleArray8, (double) 3);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, (double) (byte) 10, (double) 16);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 3.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new java.lang.Double[] { 3.0d, 1.0d });
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 3.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 3.0d, 1.0d, 3.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray12, (int) 'a', 10);
        java.lang.Byte[] byteArray22 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray22);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.add(byteArray23, (byte) 1);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray23);
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray33, (byte) 1, (int) (byte) 1);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray33, (-1), (int) (short) 10);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray33, (byte) 10);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray33);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.contains(byteArray33, (byte) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray33);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        double[] doubleArray4 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray5 = new double[] {};
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray5);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray4);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 10, (double) (byte) 1);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 1L, (double) 3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        char[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.clone(charArray0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray2, 8, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new java.lang.Character[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        float[] floatArray12 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray17 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray17, (int) (byte) 10, 100);
        float[] floatArray24 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray20, floatArray24);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray12, floatArray20);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray7, floatArray20);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray20, (float) '4');
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.add(floatArray20, (float) (short) 1);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray31, (float) (byte) 10, (int) (byte) -1);
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.clone(floatArray31);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray31);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertArrayEquals(floatArray29, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertArrayEquals(floatArray31, new float[] { 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertArrayEquals(floatArray35, new float[] { 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 5, (float) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        boolean[] booleanArray19 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray26 = new boolean[] { true, false, false, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray26);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray5, (int) (short) 1);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) booleanArray30, (java.lang.Object) "hi!");
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.add(booleanArray30, true);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray30);
        assertBooleanArrayEquals(booleanArray30, new boolean[] { true, true, true, false });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(booleanArray34);
        assertBooleanArrayEquals(booleanArray34, new boolean[] { true, true, true, false, true });
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        long[] longArray6 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 100L);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, (long) 4);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(longArray6, (long) 10);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (int) (byte) 1, (long) (byte) 1);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray15, (long) 1);
        long[] longArray24 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray24, 100L);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray24, (long) 4);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.subarray(longArray24, (int) (short) 0, (-1));
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray31, 0L);
        java.lang.Long[] longArray34 = org.apache.commons.lang3.ArrayUtils.toObject(longArray31);
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray34);
        long[] longArray42 = new long[] { ' ', 10, 0, (-1), ' ', (byte) -1 };
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray42, 100L);
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray42, (long) 4);
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.subarray(longArray42, (int) (short) 0, (-1));
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray49, (long) (short) 0);
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.addAll(longArray35, longArray49);
        float[] floatArray53 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray35, (java.lang.Object) floatArray53);
        long[] longArray55 = org.apache.commons.lang3.ArrayUtils.addAll(longArray17, longArray35);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray57 = org.apache.commons.lang3.ArrayUtils.remove(longArray35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 32L, 1L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertArrayEquals(longArray28, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertArrayEquals(longArray34, new java.lang.Long[] {});
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertArrayEquals(longArray35, new long[] {});
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertArrayEquals(longArray42, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertArrayEquals(longArray46, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertArrayEquals(longArray49, new long[] {});
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertArrayEquals(longArray52, new long[] {});
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertArrayEquals(floatArray53, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertArrayEquals(longArray55, new long[] { 32L, 10L, 0L, (-1L), 32L, (-1L) });
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        float[] floatArray12 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray17 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray17, (int) (byte) 10, 100);
        float[] floatArray24 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray20, floatArray24);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray12, floatArray20);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray7, floatArray20);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray20);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.add(floatArray20, (float) (short) -1);
        float[] floatArray35 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray35, (int) (byte) 10, 100);
        float[] floatArray39 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray30, floatArray38);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray39, (float) (byte) -1);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] { (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertArrayEquals(floatArray35, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertArrayEquals(floatArray38, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertArrayEquals(floatArray39, new float[] { (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray12 = new boolean[] { true, false, false, true, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray12);
        boolean[] booleanArray19 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray26 = new boolean[] { true, false, false, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray26);
        boolean[] booleanArray34 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray41 = new boolean[] { true, false, false, true, false, true };
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray34, booleanArray41);
        boolean[] booleanArray48 = new boolean[] { true, true, true, true, false };
        boolean[] booleanArray55 = new boolean[] { true, false, false, true, false, true };
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray48, booleanArray55);
        boolean[] booleanArray57 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray34, booleanArray55);
        boolean[] booleanArray59 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray34, (int) (short) 1);
        boolean[] booleanArray60 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray59);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray26, booleanArray60);
        java.lang.Boolean[] booleanArray62 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray26);
        boolean[] booleanArray64 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray62, false);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray34);
        assertBooleanArrayEquals(booleanArray34, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray41);
        assertBooleanArrayEquals(booleanArray41, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(booleanArray48);
        assertBooleanArrayEquals(booleanArray48, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray55);
        assertBooleanArrayEquals(booleanArray55, new boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(booleanArray57);
        assertBooleanArrayEquals(booleanArray57, new boolean[] { true, true, true, true, false, true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray59);
        assertBooleanArrayEquals(booleanArray59, new boolean[] { true, true, true, false });
        org.junit.Assert.assertNotNull(booleanArray60);
        assertBooleanArrayEquals(booleanArray60, new boolean[] { true, true, true, false });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(booleanArray62);
        org.junit.Assert.assertArrayEquals(booleanArray62, new java.lang.Boolean[] { true, false, false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray64);
        assertBooleanArrayEquals(booleanArray64, new boolean[] { true, false, false, true, false, true });
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (byte) 1, 100);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (byte) 10, 0);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        int[] intArray1 = new int[] { (-1) };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 100, 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, 0, (int) (byte) 1);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) ' ');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray9);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray9);
        java.lang.Integer[] intArray12 = org.apache.commons.lang3.ArrayUtils.toObject(intArray9);
        int int13 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) intArray9);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = org.apache.commons.lang3.ArrayUtils.remove(charArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        float[] floatArray4 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray4, (int) (byte) 10, 100);
        float[] floatArray12 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray17 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray17, (int) (byte) 10, 100);
        float[] floatArray24 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray20, floatArray24);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray12, floatArray20);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray7, floatArray20);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.add(floatArray7, (int) (short) -1, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (-1), (int) '#', 0.0d);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (double) '#');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) 10, (double) 13);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, 1.0d);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.Short[] shortArray0 = null;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0, (short) 10);
        org.junit.Assert.assertNull(shortArray2);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray12, (int) 'a', 10);
        java.lang.Byte[] byteArray22 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray22);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.add(byteArray23, (byte) 1);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray23);
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray33, (byte) 1, (int) (byte) 1);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray33, (-1), (int) (short) 10);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray33, (byte) 10);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray33);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.remove(byteArray12, 1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        float[] floatArray2 = new float[] { (-1.0f), 100.0f };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray2);
        float[] floatArray8 = new float[] { 2, (byte) 10, 'a', 2 };
        float[] floatArray13 = new float[] { (byte) 100, '#', (byte) 100, 0.0f };
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray13, (int) (byte) 10, 100);
        float[] floatArray20 = new float[] { 1.0f, 3, (byte) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray16, floatArray20);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray8, floatArray16);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray22);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.clone(floatArray22);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray24);
        java.lang.Class<?> wildcardClass26 = floatArray24.getClass();
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new float[] { (-1.0f), 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { 100.0f, 35.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 1.0f, 3.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { (-1.0f), 100.0f, 2.0f, 10.0f, 97.0f, 2.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1, (int) (byte) 1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (-1), (int) (short) 10);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray12, (int) 'a', 10);
        java.lang.Byte[] byteArray22 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray22);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.add(byteArray23, (byte) 1);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray23);
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray33, (byte) 1, (int) (byte) 1);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray33, (-1), (int) (short) 10);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray33, (byte) 10);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray33);
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (int) (short) 0, (byte) 10);
        int int47 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray45, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.lang.Double[] doubleArray0 = null;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0, (double) '4');
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (short) 1);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, 100.0d, 0.0d);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 1, (int) 'a');
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 10L };
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 10L };
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 10L };
        java.lang.Long[] longArray11 = new java.lang.Long[] { 0L, 10L };
        java.lang.Long[][] longArray12 = new java.lang.Long[][] { longArray2, longArray5, longArray8, longArray11 };
        java.lang.Long[][] longArray13 = org.apache.commons.lang3.ArrayUtils.toArray(longArray12);
        java.lang.Long[][] longArray14 = org.apache.commons.lang3.ArrayUtils.clone(longArray12);
        java.util.Map<java.lang.Object, java.lang.Object> objMap15 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) longArray14);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new java.lang.Long[] { 0L, 10L });
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new java.lang.Long[] { 0L, 10L });
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new java.lang.Long[] { 0L, 10L });
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new java.lang.Long[] { 0L, 10L });
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertNotNull(objMap15);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        double[] doubleArray4 = new double[] { 10.0f, 100.0f, (short) 10, (-1) };
        double[] doubleArray9 = new double[] { 10.0d, (-1.0d), '#', 1L };
        double[] doubleArray10 = new double[] {};
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray9, doubleArray10);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, 1.0d, (int) 'a', (double) (-1));
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray10);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray10);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.add(doubleArray10, (double) 6);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, (double) (short) 10, (int) (short) 1);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, (double) 0L, (double) (short) -1);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, (double) 10L, 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 6.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }
}

