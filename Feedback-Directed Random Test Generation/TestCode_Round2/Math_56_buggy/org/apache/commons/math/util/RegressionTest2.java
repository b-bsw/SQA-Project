package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int[] intArray8 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        int[] intArray11 = multidimensionalCounter7.getCounts((int) (short) 100);
        int int12 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter7.iterator();
        int[] intArray14 = multidimensionalCounter7.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator15 = multidimensionalCounter7.spliterator();
        int int16 = multidimensionalCounter7.getDimension();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1188250000 + "'", int12 == 1188250000);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intSpliterator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) (short) 100);
        int int21 = multidimensionalCounter7.getCount(intArray20);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter7.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator23 = multidimensionalCounter7.spliterator();
        int int24 = multidimensionalCounter7.getDimension();
        int int25 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter7.iterator();
        int[] intArray27 = iterator26.getCounts();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 78 + "'", int21 == 78);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(intSpliterator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1188250000 + "'", int25 == 1188250000);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 0, 0, 0, 0, 0, (-1) });
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) '4');
        int int11 = multidimensionalCounter7.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter7.spliterator();
        int[] intArray13 = multidimensionalCounter7.getSizes();
        int int14 = multidimensionalCounter7.getSize();
        int[] intArray15 = multidimensionalCounter7.getSizes();
        int[] intArray16 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int[] intArray19 = multidimensionalCounter17.getCounts(35);
        int int20 = multidimensionalCounter17.getDimension();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 1, 6 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1188250000 + "'", int11 == 1188250000);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1188250000 + "'", int14 == 1188250000);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0, 0, 0, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.new Iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        int int10 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter7.iterator();
        int int12 = multidimensionalCounter7.getDimension();
        int int13 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.new Iterator();
        int[] intArray15 = multidimensionalCounter7.getSizes();
        int[] intArray16 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1188250000 + "'", int10 == 1188250000);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1188250000 + "'", int13 == 1188250000);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.new Iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        int[] intArray10 = multidimensionalCounter7.getSizes();
        int[] intArray12 = multidimensionalCounter7.getCounts((int) (short) 100);
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter7.spliterator();
        int[] intArray15 = multidimensionalCounter7.getCounts(0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter7.iterator();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) (short) 0);
        int[] intArray11 = multidimensionalCounter7.getSizes();
        int int12 = multidimensionalCounter7.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.new Iterator();
        int int15 = multidimensionalCounter7.getDimension();
        int[] intArray16 = multidimensionalCounter7.getSizes();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int int9 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter7.iterator();
        boolean boolean11 = iterator10.hasNext();
        int int13 = iterator10.getCount(0);
        int[] intArray14 = iterator10.getCounts();
        int[] intArray15 = iterator10.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = iterator10.getCount((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1188250000 + "'", int9 == 1188250000);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0, 0, 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0, 0, 0, 0, 0, (-1) });
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) (short) 100);
        int[] intArray11 = multidimensionalCounter7.getSizes();
        int[] intArray13 = multidimensionalCounter7.getCounts((int) (byte) 100);
        int[] intArray15 = multidimensionalCounter7.getCounts(100);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter7.iterator();
        int int18 = iterator16.getCount(3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) '4');
        int int21 = multidimensionalCounter7.getCount(intArray20);
        int[] intArray28 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter29 = new org.apache.commons.math.util.MultidimensionalCounter(intArray28);
        int int30 = multidimensionalCounter29.getDimension();
        int int31 = multidimensionalCounter29.getSize();
        int[] intArray33 = multidimensionalCounter29.getCounts(10);
        int int34 = multidimensionalCounter7.getCount(intArray33);
        int[] intArray36 = multidimensionalCounter7.getCounts(6);
        int int37 = multidimensionalCounter7.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator38 = multidimensionalCounter7.spliterator();
        int[] intArray40 = multidimensionalCounter7.getCounts(10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 1, 6 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 41 + "'", int21 == 41);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1188250000 + "'", int31 == 1188250000);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 0, 0, 0, 0, 0, 4 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0, 0, 0, 0, 0, 3 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1188250000 + "'", int37 == 1188250000);
        org.junit.Assert.assertNotNull(intSpliterator38);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 0, 0, 0, 0, 0, 4 });
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int int9 = multidimensionalCounter7.getSize();
        int[] intArray11 = multidimensionalCounter7.getCounts(10);
        int[] intArray13 = multidimensionalCounter7.getCounts((int) (short) 100);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter7.new Iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter7.new Iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter7.iterator();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1188250000 + "'", int9 == 1188250000);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 0, 0, 0, 0, 4 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) (short) 100);
        int[] intArray11 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int14 = multidimensionalCounter13.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter13.iterator();
        java.lang.Class<?> wildcardClass16 = iterator15.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1188250000 + "'", int14 == 1188250000);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) (short) 100);
        int int21 = multidimensionalCounter7.getCount(intArray20);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter7.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator23 = multidimensionalCounter7.spliterator();
        int int24 = multidimensionalCounter7.getDimension();
        int int25 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter7.iterator();
        int int27 = multidimensionalCounter7.getSize();
        int[] intArray28 = multidimensionalCounter7.getSizes();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 78 + "'", int21 == 78);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(intSpliterator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1188250000 + "'", int25 == 1188250000);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1188250000 + "'", int27 == 1188250000);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 97, 35, 100, 10, 10, 35 });
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int[] intArray8 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        int[] intArray11 = multidimensionalCounter7.getCounts((int) (short) 100);
        int int12 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter7.iterator();
        int[] intArray14 = multidimensionalCounter7.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator15 = multidimensionalCounter7.spliterator();
        int[] intArray17 = multidimensionalCounter7.getCounts(1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1188250000 + "'", int12 == 1188250000);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intSpliterator15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 0, 0, 0, 0, 1 });
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) '#');
        int int11 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter7.new Iterator();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1188250000 + "'", int11 == 1188250000);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.new Iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.new Iterator();
        int[] intArray11 = multidimensionalCounter7.getCounts(78);
        int[] intArray13 = multidimensionalCounter7.getCounts((int) (short) 10);
        int int14 = multidimensionalCounter7.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter7.iterator();
        java.lang.Integer int16 = iterator15.next();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 0, 0, 0, 2, 4 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, 0, 0, 0, 4 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int[] intArray8 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        int[] intArray11 = multidimensionalCounter7.getCounts((int) (short) 100);
        int int12 = multidimensionalCounter7.getSize();
        int[] intArray14 = multidimensionalCounter7.getCounts((int) 'a');
        java.util.Spliterator<java.lang.Integer> intSpliterator15 = multidimensionalCounter7.spliterator();
        int[] intArray22 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int[] intArray24 = multidimensionalCounter23.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter23.iterator();
        int[] intArray27 = multidimensionalCounter23.getCounts((int) '#');
        int int28 = multidimensionalCounter7.getCount(intArray27);
        java.util.Spliterator<java.lang.Integer> intSpliterator29 = multidimensionalCounter7.spliterator();
        int int30 = multidimensionalCounter7.getDimension();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1188250000 + "'", int12 == 1188250000);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0, 0, 0, 0, 2, 7 });
        org.junit.Assert.assertNotNull(intSpliterator15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 0, 0, 0, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertNotNull(intSpliterator29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int int9 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter7.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter7.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter7.spliterator();
        int[] intArray14 = multidimensionalCounter7.getCounts((int) (byte) 1);
        java.util.Spliterator<java.lang.Integer> intSpliterator15 = multidimensionalCounter7.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator16 = multidimensionalCounter7.spliterator();
        int[] intArray17 = multidimensionalCounter7.getSizes();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1188250000 + "'", int9 == 1188250000);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0, 0, 0, 0, 0, 1 });
        org.junit.Assert.assertNotNull(intSpliterator15);
        org.junit.Assert.assertNotNull(intSpliterator16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 97, 35, 100, 10, 10, 35 });
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int[] intArray8 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator10 = multidimensionalCounter7.spliterator();
        int int11 = multidimensionalCounter7.getSize();
        int int12 = multidimensionalCounter7.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter7.spliterator();
        int[] intArray14 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter7.new Iterator();
        boolean boolean16 = iterator15.hasNext();
        int int17 = iterator15.getCount();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1188250000 + "'", int11 == 1188250000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) (short) 100);
        int int21 = multidimensionalCounter7.getCount(intArray20);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter7.new Iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator24 = multidimensionalCounter7.spliterator();
        int[] intArray26 = multidimensionalCounter7.getCounts(77);
        int[] intArray27 = multidimensionalCounter7.getSizes();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 78 + "'", int21 == 78);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(intSpliterator24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 0, 0, 0, 2, 4 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 97, 35, 100, 10, 10, 35 });
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) (short) 0);
        int[] intArray11 = multidimensionalCounter7.getSizes();
        int int12 = multidimensionalCounter7.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.iterator();
        int[] intArray16 = multidimensionalCounter7.getCounts(78);
        int[] intArray17 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter7.new Iterator();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0, 0, 0, 0, 2, 4 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 97, 35, 100, 10, 10, 35 });
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) (short) 100);
        int int21 = multidimensionalCounter7.getCount(intArray20);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter7.iterator();
        int[] intArray29 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter30 = new org.apache.commons.math.util.MultidimensionalCounter(intArray29);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator31 = multidimensionalCounter30.new Iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator32 = multidimensionalCounter30.new Iterator();
        int[] intArray34 = multidimensionalCounter30.getCounts(78);
        int int35 = multidimensionalCounter7.getCount(intArray34);
        java.util.Spliterator<java.lang.Integer> intSpliterator36 = multidimensionalCounter7.spliterator();
        int[] intArray38 = multidimensionalCounter7.getCounts((int) (byte) 1);
        java.lang.Class<?> wildcardClass39 = intArray38.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 78 + "'", int21 == 78);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 0, 0, 0, 0, 2, 4 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 74 + "'", int35 == 74);
        org.junit.Assert.assertNotNull(intSpliterator36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 0, 0, 0, 0, 0, 1 });
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) (short) 100);
        int int21 = multidimensionalCounter7.getCount(intArray20);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter7.new Iterator();
        boolean boolean24 = iterator23.hasNext();
        boolean boolean25 = iterator23.hasNext();
        int[] intArray26 = iterator23.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter27 = new org.apache.commons.math.util.MultidimensionalCounter(intArray26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 78 + "'", int21 == 78);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 0, 0, 0, 0, (-1) });
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int int9 = multidimensionalCounter7.getSize();
        int[] intArray11 = multidimensionalCounter7.getCounts(10);
        int[] intArray13 = multidimensionalCounter7.getCounts((int) (short) 100);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter7.new Iterator();
        int[] intArray22 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter23 = new org.apache.commons.math.util.MultidimensionalCounter(intArray22);
        int int24 = multidimensionalCounter23.getSize();
        int[] intArray25 = multidimensionalCounter23.getSizes();
        int[] intArray32 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter33 = new org.apache.commons.math.util.MultidimensionalCounter(intArray32);
        int int34 = multidimensionalCounter33.getDimension();
        int int35 = multidimensionalCounter33.getSize();
        int[] intArray37 = multidimensionalCounter33.getCounts(10);
        int int38 = multidimensionalCounter23.getCount(intArray37);
        int int39 = multidimensionalCounter7.getCount(intArray37);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator40 = multidimensionalCounter7.iterator();
        int int41 = iterator40.getCount();
        int int42 = iterator40.getCount();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1188250000 + "'", int9 == 1188250000);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 0, 0, 0, 0, 4 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1188250000 + "'", int24 == 1188250000);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 6 + "'", int34 == 6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1188250000 + "'", int35 == 1188250000);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 0, 0, 0, 0, 0, 4 });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) (short) 0);
        int[] intArray11 = multidimensionalCounter7.getSizes();
        int int12 = multidimensionalCounter7.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.iterator();
        int int15 = multidimensionalCounter7.getSize();
        int int16 = multidimensionalCounter7.getDimension();
        int[] intArray18 = multidimensionalCounter7.getCounts((int) (short) 10);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter7.iterator();
        int[] intArray20 = multidimensionalCounter7.getSizes();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1188250000 + "'", int15 == 1188250000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 0, 0, 0, 0, 0, 4 });
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 97, 35, 100, 10, 10, 35 });
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) '#');
        int int11 = multidimensionalCounter7.getSize();
        int[] intArray12 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray12);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter13.new Iterator();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1188250000 + "'", int11 == 1188250000);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 97, 35, 100, 10, 10, 35 });
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) (short) 100);
        int[] intArray11 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter13 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        int int14 = multidimensionalCounter13.getSize();
        int[] intArray16 = multidimensionalCounter13.getCounts(6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter13.iterator();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1188250000 + "'", int14 == 1188250000);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0, 0, 0, 0, 0, 3 });
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int[] intArray8 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        int[] intArray11 = multidimensionalCounter7.getCounts((int) '#');
        int int12 = multidimensionalCounter7.getDimension();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 0, 0, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.new Iterator();
        int[] intArray10 = multidimensionalCounter7.getSizes();
        int int11 = multidimensionalCounter7.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter7.new Iterator();
        int int13 = multidimensionalCounter7.getSize();
        int[] intArray14 = multidimensionalCounter7.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator15 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter7.iterator();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1188250000 + "'", int13 == 1188250000);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intSpliterator15);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.new Iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.new Iterator();
        int[] intArray11 = multidimensionalCounter7.getCounts(78);
        int[] intArray13 = multidimensionalCounter7.getCounts((int) (short) 10);
        int int14 = multidimensionalCounter7.getDimension();
        int int15 = multidimensionalCounter7.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter7.new Iterator();
        int[] intArray17 = multidimensionalCounter7.getSizes();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 0, 0, 0, 2, 4 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, 0, 0, 0, 4 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 97, 35, 100, 10, 10, 35 });
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int int9 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter7.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter7.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter7.spliterator();
        int[] intArray14 = multidimensionalCounter7.getCounts((int) (byte) 1);
        java.util.Spliterator<java.lang.Integer> intSpliterator15 = multidimensionalCounter7.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator16 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter7.iterator();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1188250000 + "'", int9 == 1188250000);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0, 0, 0, 0, 0, 1 });
        org.junit.Assert.assertNotNull(intSpliterator15);
        org.junit.Assert.assertNotNull(intSpliterator16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.iterator();
        int int9 = multidimensionalCounter7.getDimension();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = multidimensionalCounter7.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.new Iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        int[] intArray10 = multidimensionalCounter7.getSizes();
        int[] intArray12 = multidimensionalCounter7.getCounts((int) (short) 100);
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.new Iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter7.new Iterator();
        int[] intArray16 = iterator15.getCounts();
        boolean boolean17 = iterator15.hasNext();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0, 0, 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) (short) 0);
        int[] intArray11 = multidimensionalCounter7.getSizes();
        int int12 = multidimensionalCounter7.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.new Iterator();
        int int15 = multidimensionalCounter7.getSize();
        int int16 = multidimensionalCounter7.getDimension();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1188250000 + "'", int15 == 1188250000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) '#');
        int int11 = multidimensionalCounter7.getSize();
        int[] intArray12 = multidimensionalCounter7.getSizes();
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter7.spliterator();
        int int14 = multidimensionalCounter7.getDimension();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1188250000 + "'", int11 == 1188250000);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) (short) 100);
        int int21 = multidimensionalCounter7.getCount(intArray20);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter7.new Iterator();
        int[] intArray24 = iterator23.getCounts();
        int[] intArray25 = iterator23.getCounts();
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 78 + "'", int21 == 78);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0, 0, 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 0, 0, 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) (short) 100);
        int[] intArray11 = multidimensionalCounter7.getSizes();
        int[] intArray13 = multidimensionalCounter7.getCounts((int) (byte) 100);
        int[] intArray15 = multidimensionalCounter7.getCounts(100);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter7.iterator();
        int int17 = iterator16.getCount();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.new Iterator();
        boolean boolean10 = iterator9.hasNext();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) '4');
        int int11 = multidimensionalCounter7.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter7.spliterator();
        int[] intArray13 = multidimensionalCounter7.getSizes();
        int int14 = multidimensionalCounter7.getSize();
        int[] intArray16 = multidimensionalCounter7.getCounts(0);
        java.util.Spliterator<java.lang.Integer> intSpliterator17 = multidimensionalCounter7.spliterator();
        int int18 = multidimensionalCounter7.getSize();
        int int19 = multidimensionalCounter7.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator20 = multidimensionalCounter7.new Iterator();
        java.lang.Integer int21 = iterator20.next();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 1, 6 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1188250000 + "'", int11 == 1188250000);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1188250000 + "'", int14 == 1188250000);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intSpliterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1188250000 + "'", int18 == 1188250000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) '4');
        int int11 = multidimensionalCounter7.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter7.spliterator();
        int[] intArray13 = multidimensionalCounter7.getSizes();
        int int14 = multidimensionalCounter7.getSize();
        int[] intArray15 = multidimensionalCounter7.getSizes();
        int[] intArray16 = multidimensionalCounter7.getSizes();
        int[] intArray18 = multidimensionalCounter7.getCounts((int) (byte) 1);
        java.util.Spliterator<java.lang.Integer> intSpliterator19 = multidimensionalCounter7.spliterator();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 1, 6 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1188250000 + "'", int11 == 1188250000);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1188250000 + "'", int14 == 1188250000);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 0, 0, 0, 0, 0, 1 });
        org.junit.Assert.assertNotNull(intSpliterator19);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int int9 = multidimensionalCounter7.getSize();
        int[] intArray11 = multidimensionalCounter7.getCounts(10);
        int[] intArray13 = multidimensionalCounter7.getCounts((int) (short) 100);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter7.new Iterator();
        int[] intArray16 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        java.util.Spliterator<java.lang.Integer> intSpliterator18 = multidimensionalCounter17.spliterator();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1188250000 + "'", int9 == 1188250000);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 0, 0, 0, 0, 4 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intSpliterator18);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int int10 = multidimensionalCounter7.getSize();
        int[] intArray11 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter12.iterator();
        int[] intArray14 = multidimensionalCounter12.getSizes();
        int[] intArray16 = multidimensionalCounter12.getCounts(35);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1188250000 + "'", int10 == 1188250000);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0, 0, 0, 0, 1, 0 });
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int int9 = multidimensionalCounter7.getSize();
        int[] intArray11 = multidimensionalCounter7.getCounts(10);
        int[] intArray13 = multidimensionalCounter7.getCounts((int) (short) 100);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter7.new Iterator();
        int[] intArray16 = multidimensionalCounter7.getSizes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = multidimensionalCounter7.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1188250000 + "'", int9 == 1188250000);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 0, 0, 0, 0, 4 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.new Iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.new Iterator();
        java.lang.Class<?> wildcardClass10 = multidimensionalCounter7.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int int9 = multidimensionalCounter7.getSize();
        int[] intArray11 = multidimensionalCounter7.getCounts(10);
        int[] intArray13 = multidimensionalCounter7.getCounts((int) (short) 100);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter7.iterator();
        int int16 = multidimensionalCounter7.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator17 = multidimensionalCounter7.spliterator();
        int[] intArray18 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter7.iterator();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1188250000 + "'", int9 == 1188250000);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 0, 0, 0, 0, 4 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1188250000 + "'", int16 == 1188250000);
        org.junit.Assert.assertNotNull(intSpliterator17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int int10 = multidimensionalCounter7.getSize();
        int[] intArray12 = multidimensionalCounter7.getCounts((int) (byte) 0);
        int[] intArray14 = multidimensionalCounter7.getCounts(77);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter7.iterator();
        java.lang.Integer int16 = iterator15.next();
        int[] intArray17 = iterator15.getCounts();
        java.lang.Integer int18 = iterator15.next();
        int int20 = iterator15.getCount((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1188250000 + "'", int10 == 1188250000);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0, 0, 0, 0, 2, 4 });
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.new Iterator();
        int int10 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter7.new Iterator();
        int[] intArray12 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter7.iterator();
        int int14 = multidimensionalCounter7.getDimension();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1188250000 + "'", int10 == 1188250000);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.new Iterator();
        int[] intArray9 = iterator8.getCounts();
        int int10 = iterator8.getCount();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = iterator8.getCount((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0, 0, 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) (short) 100);
        int int21 = multidimensionalCounter7.getCount(intArray20);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter7.iterator();
        boolean boolean23 = iterator22.hasNext();
        int[] intArray24 = iterator22.getCounts();
        int int25 = iterator22.getCount();
        int[] intArray26 = iterator22.getCounts();
        int int27 = iterator22.getCount();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 78 + "'", int21 == 78);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0, 0, 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 0, 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter17.new Iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator19 = multidimensionalCounter17.new Iterator();
        int[] intArray20 = iterator19.getCounts();
        java.lang.Integer int21 = iterator19.next();
        int[] intArray22 = iterator19.getCounts();
        int[] intArray23 = iterator19.getCounts();
        int int24 = multidimensionalCounter7.getCount(intArray23);
        int int25 = multidimensionalCounter7.getDimension();
        int int26 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator27 = multidimensionalCounter7.iterator();
        java.lang.Integer int28 = iterator27.next();
        int[] intArray29 = iterator27.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            int int31 = iterator27.getCount(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1188250000 + "'", int26 == 1188250000);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) (short) 100);
        int int21 = multidimensionalCounter7.getCount(intArray20);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator24 = multidimensionalCounter7.iterator();
        int int25 = multidimensionalCounter7.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter7.new Iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator27 = multidimensionalCounter7.spliterator();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 78 + "'", int21 == 78);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertNotNull(intSpliterator27);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) (short) 100);
        int int21 = multidimensionalCounter7.getCount(intArray20);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter7.iterator();
        int[] intArray23 = multidimensionalCounter7.getSizes();
        int[] intArray30 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter31 = new org.apache.commons.math.util.MultidimensionalCounter(intArray30);
        int int32 = multidimensionalCounter31.getSize();
        int[] intArray33 = multidimensionalCounter31.getSizes();
        int[] intArray40 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter41 = new org.apache.commons.math.util.MultidimensionalCounter(intArray40);
        int int42 = multidimensionalCounter41.getDimension();
        int[] intArray44 = multidimensionalCounter41.getCounts((int) (short) 100);
        int int45 = multidimensionalCounter31.getCount(intArray44);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator46 = multidimensionalCounter31.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator47 = multidimensionalCounter31.new Iterator();
        int[] intArray49 = multidimensionalCounter31.getCounts(10);
        int int50 = multidimensionalCounter7.getCount(intArray49);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator51 = multidimensionalCounter7.new Iterator();
        int int52 = multidimensionalCounter7.getDimension();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 78 + "'", int21 == 78);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1188250000 + "'", int32 == 1188250000);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 6 + "'", int42 == 6);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 78 + "'", int45 == 78);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 0, 0, 0, 0, 0, 4 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4 + "'", int50 == 4);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 6 + "'", int52 == 6);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.new Iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter7.new Iterator();
        int[] intArray11 = multidimensionalCounter7.getSizes();
        int int12 = multidimensionalCounter7.getDimension();
        int int13 = multidimensionalCounter7.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1188250000 + "'", int13 == 1188250000);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) '4');
        int int11 = multidimensionalCounter7.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter7.spliterator();
        int[] intArray13 = multidimensionalCounter7.getSizes();
        int int14 = multidimensionalCounter7.getSize();
        int[] intArray15 = multidimensionalCounter7.getSizes();
        int[] intArray16 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter17.new Iterator();
        java.lang.Integer int19 = iterator18.next();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 1, 6 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1188250000 + "'", int11 == 1188250000);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1188250000 + "'", int14 == 1188250000);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.new Iterator();
        int int10 = multidimensionalCounter7.getSize();
        int[] intArray11 = multidimensionalCounter7.getSizes();
        int[] intArray12 = multidimensionalCounter7.getSizes();
        int int13 = multidimensionalCounter7.getSize();
        int int14 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter7.iterator();
        int int16 = multidimensionalCounter7.getDimension();
        int[] intArray18 = multidimensionalCounter7.getCounts(41);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1188250000 + "'", int10 == 1188250000);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1188250000 + "'", int13 == 1188250000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1188250000 + "'", int14 == 1188250000);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 0, 0, 0, 0, 1, 3 });
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.new Iterator();
        int[] intArray10 = multidimensionalCounter7.getSizes();
        int int11 = multidimensionalCounter7.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter7.new Iterator();
        int int13 = multidimensionalCounter7.getSize();
        int[] intArray14 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter15 = new org.apache.commons.math.util.MultidimensionalCounter(intArray14);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter15.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter15.iterator();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1188250000 + "'", int13 == 1188250000);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.new Iterator();
        int[] intArray10 = multidimensionalCounter7.getSizes();
        int[] intArray17 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter18 = new org.apache.commons.math.util.MultidimensionalCounter(intArray17);
        int int19 = multidimensionalCounter18.getDimension();
        int[] intArray21 = multidimensionalCounter18.getCounts((int) '#');
        int int22 = multidimensionalCounter18.getSize();
        int[] intArray23 = multidimensionalCounter18.getSizes();
        int int24 = multidimensionalCounter18.getDimension();
        int[] intArray31 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter32 = new org.apache.commons.math.util.MultidimensionalCounter(intArray31);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator33 = multidimensionalCounter32.new Iterator();
        int int34 = iterator33.getCount();
        java.lang.Integer int35 = iterator33.next();
        int[] intArray36 = iterator33.getCounts();
        int int37 = multidimensionalCounter18.getCount(intArray36);
        int int38 = multidimensionalCounter7.getCount(intArray36);
        java.util.Spliterator<java.lang.Integer> intSpliterator39 = multidimensionalCounter7.spliterator();
        int[] intArray46 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter47 = new org.apache.commons.math.util.MultidimensionalCounter(intArray46);
        int int48 = multidimensionalCounter47.getSize();
        int[] intArray49 = multidimensionalCounter47.getSizes();
        int[] intArray56 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter57 = new org.apache.commons.math.util.MultidimensionalCounter(intArray56);
        int int58 = multidimensionalCounter57.getDimension();
        int int59 = multidimensionalCounter57.getSize();
        int[] intArray61 = multidimensionalCounter57.getCounts(10);
        int int62 = multidimensionalCounter47.getCount(intArray61);
        int int63 = multidimensionalCounter47.getSize();
        int[] intArray65 = multidimensionalCounter47.getCounts((int) (short) 10);
        int int66 = multidimensionalCounter7.getCount(intArray65);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator67 = multidimensionalCounter7.iterator();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 0, 0, 0, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1188250000 + "'", int22 == 1188250000);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intSpliterator39);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1188250000 + "'", int48 == 1188250000);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 6 + "'", int58 == 6);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1188250000 + "'", int59 == 1188250000);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 0, 0, 0, 0, 0, 4 });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 4 + "'", int62 == 4);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1188250000 + "'", int63 == 1188250000);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 0, 0, 0, 0, 0, 4 });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 4 + "'", int66 == 4);
        org.junit.Assert.assertNotNull(iterator67);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) '4');
        int int11 = multidimensionalCounter7.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter7.spliterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter7.spliterator();
        int int14 = multidimensionalCounter7.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter7.iterator();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 1, 6 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1188250000 + "'", int11 == 1188250000);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) '4');
        int int21 = multidimensionalCounter7.getCount(intArray20);
        int[] intArray28 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter29 = new org.apache.commons.math.util.MultidimensionalCounter(intArray28);
        int int30 = multidimensionalCounter29.getDimension();
        int int31 = multidimensionalCounter29.getSize();
        int[] intArray33 = multidimensionalCounter29.getCounts(10);
        int int34 = multidimensionalCounter7.getCount(intArray33);
        int[] intArray36 = multidimensionalCounter7.getCounts(6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator37 = multidimensionalCounter7.iterator();
        java.lang.Class<?> wildcardClass38 = iterator37.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 1, 6 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 41 + "'", int21 == 41);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1188250000 + "'", int31 == 1188250000);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 0, 0, 0, 0, 0, 4 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0, 0, 0, 0, 0, 3 });
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) (short) 100);
        int int21 = multidimensionalCounter7.getCount(intArray20);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter7.iterator();
        int[] intArray29 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter30 = new org.apache.commons.math.util.MultidimensionalCounter(intArray29);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator31 = multidimensionalCounter30.new Iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator32 = multidimensionalCounter30.new Iterator();
        int[] intArray34 = multidimensionalCounter30.getCounts(78);
        int int35 = multidimensionalCounter7.getCount(intArray34);
        int int36 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator37 = multidimensionalCounter7.new Iterator();
        int int39 = iterator37.getCount((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 78 + "'", int21 == 78);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 0, 0, 0, 0, 2, 4 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 74 + "'", int35 == 74);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1188250000 + "'", int36 == 1188250000);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) (short) 100);
        int int21 = multidimensionalCounter7.getCount(intArray20);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter7.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator23 = multidimensionalCounter7.spliterator();
        int int24 = multidimensionalCounter7.getDimension();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter7.new Iterator();
        // The following exception was thrown during execution in test generation
        try {
            iterator25.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 78 + "'", int21 == 78);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(intSpliterator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) '4');
        int int21 = multidimensionalCounter7.getCount(intArray20);
        int int22 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter7.iterator();
        java.lang.Class<?> wildcardClass24 = multidimensionalCounter7.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 1, 6 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 41 + "'", int21 == 41);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1188250000 + "'", int22 == 1188250000);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int int10 = multidimensionalCounter7.getSize();
        int[] intArray11 = multidimensionalCounter7.getSizes();
        int[] intArray13 = multidimensionalCounter7.getCounts(4);
        int int14 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator15 = multidimensionalCounter7.iterator();
        int[] intArray16 = multidimensionalCounter7.getSizes();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1188250000 + "'", int10 == 1188250000);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, 0, 0, 0, 3 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1188250000 + "'", int14 == 1188250000);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int int10 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter7.new Iterator();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1188250000 + "'", int10 == 1188250000);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) (short) 0);
        int[] intArray11 = multidimensionalCounter7.getSizes();
        int int12 = multidimensionalCounter7.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.new Iterator();
        int int15 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter7.new Iterator();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1188250000 + "'", int15 == 1188250000);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) (short) 100);
        int int21 = multidimensionalCounter7.getCount(intArray20);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter7.new Iterator();
        int[] intArray25 = multidimensionalCounter7.getCounts(78);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter7.iterator();
        int int27 = iterator26.getCount();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 78 + "'", int21 == 78);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 0, 0, 0, 0, 2, 4 });
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) '4');
        int int11 = multidimensionalCounter7.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter7.spliterator();
        int[] intArray13 = multidimensionalCounter7.getSizes();
        int int14 = multidimensionalCounter7.getSize();
        int[] intArray15 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter7.iterator();
        java.lang.Integer int17 = iterator16.next();
        int[] intArray18 = iterator16.getCounts();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 1, 6 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1188250000 + "'", int11 == 1188250000);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1188250000 + "'", int14 == 1188250000);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) '4');
        int int11 = multidimensionalCounter7.getSize();
        java.util.Spliterator<java.lang.Integer> intSpliterator12 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter7.new Iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.iterator();
        int[] intArray15 = iterator14.getCounts();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 1, 6 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1188250000 + "'", int11 == 1188250000);
        org.junit.Assert.assertNotNull(intSpliterator12);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0, 0, 0, 0, 0, (-1) });
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int int9 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter7.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator11 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator12 = multidimensionalCounter7.iterator();
        java.lang.Integer int13 = iterator12.next();
        boolean boolean14 = iterator12.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            iterator12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1188250000 + "'", int9 == 1188250000);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(intSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int int9 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator10 = multidimensionalCounter7.iterator();
        boolean boolean11 = iterator10.hasNext();
        int int13 = iterator10.getCount(0);
        int[] intArray14 = iterator10.getCounts();
        int[] intArray15 = iterator10.getCounts();
        boolean boolean16 = iterator10.hasNext();
        int[] intArray17 = iterator10.getCounts();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1188250000 + "'", int9 == 1188250000);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0, 0, 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0, 0, 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 0, 0, 0, 0, (-1) });
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        int[] intArray4 = new int[] { (byte) -1, 'a', (byte) 1, (-1) };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter5 = new org.apache.commons.math.util.MultidimensionalCounter(intArray4);
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter6 = new org.apache.commons.math.util.MultidimensionalCounter(intArray4);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator7 = multidimensionalCounter6.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter6.iterator();
        boolean boolean9 = iterator8.hasNext();
        java.lang.Integer int10 = iterator8.next();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 97, 1, (-1) });
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) (short) 100);
        int int21 = multidimensionalCounter7.getCount(intArray20);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter7.iterator();
        int int23 = multidimensionalCounter7.getSize();
        int[] intArray24 = multidimensionalCounter7.getSizes();
        int[] intArray26 = multidimensionalCounter7.getCounts((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 78 + "'", int21 == 78);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1188250000 + "'", int23 == 1188250000);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 0, 0, 0, 0, 1 });
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) (short) 100);
        int int21 = multidimensionalCounter7.getCount(intArray20);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter7.iterator();
        int[] intArray23 = multidimensionalCounter7.getSizes();
        int[] intArray25 = multidimensionalCounter7.getCounts((int) (short) 0);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator26 = multidimensionalCounter7.new Iterator();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 78 + "'", int21 == 78);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int int9 = multidimensionalCounter7.getSize();
        int[] intArray11 = multidimensionalCounter7.getCounts(10);
        int[] intArray13 = multidimensionalCounter7.getCounts((int) (short) 100);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.iterator();
        int int15 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator16 = multidimensionalCounter7.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = multidimensionalCounter7.toString();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1188250000 + "'", int9 == 1188250000);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 0, 0, 0, 0, 4 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1188250000 + "'", int15 == 1188250000);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.new Iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        int[] intArray10 = iterator9.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter11 = new org.apache.commons.math.util.MultidimensionalCounter(intArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, (-1) });
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) (short) 0);
        int[] intArray11 = multidimensionalCounter7.getSizes();
        int int12 = multidimensionalCounter7.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.iterator();
        int[] intArray16 = multidimensionalCounter7.getCounts(78);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator17 = multidimensionalCounter7.new Iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator18 = multidimensionalCounter7.iterator();
        int[] intArray19 = iterator18.getCounts();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0, 0, 0, 0, 2, 4 });
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0, 0, 0, 0, 0, (-1) });
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getDimension();
        int[] intArray10 = multidimensionalCounter7.getCounts((int) (short) 0);
        int[] intArray11 = multidimensionalCounter7.getSizes();
        int int12 = multidimensionalCounter7.getDimension();
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter7.spliterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.new Iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = iterator14.getCount(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(intSpliterator13);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int[] intArray8 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        int[] intArray11 = multidimensionalCounter7.getCounts((int) (short) 100);
        int int12 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator13 = multidimensionalCounter7.iterator();
        java.lang.Class<?> wildcardClass14 = iterator13.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1188250000 + "'", int12 == 1188250000);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.new Iterator();
        int int10 = multidimensionalCounter7.getSize();
        int[] intArray11 = multidimensionalCounter7.getSizes();
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter12 = new org.apache.commons.math.util.MultidimensionalCounter(intArray11);
        java.util.Spliterator<java.lang.Integer> intSpliterator13 = multidimensionalCounter12.spliterator();
        int int14 = multidimensionalCounter12.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1188250000 + "'", int10 == 1188250000);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1188250000 + "'", int14 == 1188250000);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.new Iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.new Iterator();
        int[] intArray10 = iterator9.getCounts();
        java.lang.Integer int11 = iterator9.next();
        int[] intArray12 = iterator9.getCounts();
        int[] intArray13 = iterator9.getCounts();
        int int15 = iterator9.getCount((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = iterator9.getCount((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) (short) 100);
        int int21 = multidimensionalCounter7.getCount(intArray20);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter7.new Iterator();
        int int24 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator25 = multidimensionalCounter7.iterator();
        boolean boolean26 = iterator25.hasNext();
        int[] intArray27 = iterator25.getCounts();
        // The following exception was thrown during execution in test generation
        try {
            iterator25.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 78 + "'", int21 == 78);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1188250000 + "'", int24 == 1188250000);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 0, 0, 0, 0, 0, (-1) });
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        int int8 = multidimensionalCounter7.getSize();
        int[] intArray9 = multidimensionalCounter7.getSizes();
        int[] intArray16 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter17 = new org.apache.commons.math.util.MultidimensionalCounter(intArray16);
        int int18 = multidimensionalCounter17.getDimension();
        int[] intArray20 = multidimensionalCounter17.getCounts((int) (short) 100);
        int int21 = multidimensionalCounter7.getCount(intArray20);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator22 = multidimensionalCounter7.iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator23 = multidimensionalCounter7.new Iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator24 = multidimensionalCounter7.spliterator();
        int[] intArray25 = multidimensionalCounter7.getSizes();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1188250000 + "'", int8 == 1188250000);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, 0, 0, 2, 8 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 78 + "'", int21 == 78);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(intSpliterator24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 97, 35, 100, 10, 10, 35 });
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        int[] intArray6 = new int[] { 'a', '#', (byte) 100, 10, (byte) 10, '#' };
        org.apache.commons.math.util.MultidimensionalCounter multidimensionalCounter7 = new org.apache.commons.math.util.MultidimensionalCounter(intArray6);
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator8 = multidimensionalCounter7.new Iterator();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator9 = multidimensionalCounter7.iterator();
        int int10 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator11 = multidimensionalCounter7.iterator();
        int int12 = multidimensionalCounter7.getDimension();
        int int13 = multidimensionalCounter7.getSize();
        org.apache.commons.math.util.MultidimensionalCounter.Iterator iterator14 = multidimensionalCounter7.new Iterator();
        int[] intArray15 = multidimensionalCounter7.getSizes();
        int[] intArray16 = multidimensionalCounter7.getSizes();
        int[] intArray17 = multidimensionalCounter7.getSizes();
        int int18 = multidimensionalCounter7.getDimension();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1188250000 + "'", int10 == 1188250000);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1188250000 + "'", int13 == 1188250000);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 97, 35, 100, 10, 10, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }
}

